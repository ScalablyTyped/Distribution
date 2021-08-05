package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionControlDetails extends StObject {
  
  /**
    * A Coordinated Universal Time (UTC) date and time that can be used to synchronize an enlistment to the state of
    * the repository at that time.
    */
  var asOfTimeUtc: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a branch containing the revision.
    */
  var branch: js.UndefOr[String] = js.undefined
  
  /**
    * The location in the local file system to which the root of the repository was mapped at the time of the
    * analysis.
    */
  var mappedTo: js.UndefOr[ArtifactLocation] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the version control details.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * The absolute URI of the repository.
    */
  var repositoryUri: String
  
  /**
    * A string that uniquely and permanently identifies the revision within the repository.
    */
  var revisionId: js.UndefOr[String] = js.undefined
  
  /**
    * A tag that has been applied to the revision.
    */
  var revisionTag: js.UndefOr[String] = js.undefined
}
object VersionControlDetails {
  
  inline def apply(repositoryUri: String): VersionControlDetails = {
    val __obj = js.Dynamic.literal(repositoryUri = repositoryUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionControlDetails]
  }
  
  extension [Self <: VersionControlDetails](x: Self) {
    
    inline def setAsOfTimeUtc(value: String): Self = StObject.set(x, "asOfTimeUtc", value.asInstanceOf[js.Any])
    
    inline def setAsOfTimeUtcUndefined: Self = StObject.set(x, "asOfTimeUtc", js.undefined)
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setMappedTo(value: ArtifactLocation): Self = StObject.set(x, "mappedTo", value.asInstanceOf[js.Any])
    
    inline def setMappedToUndefined: Self = StObject.set(x, "mappedTo", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRepositoryUri(value: String): Self = StObject.set(x, "repositoryUri", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setRevisionTag(value: String): Self = StObject.set(x, "revisionTag", value.asInstanceOf[js.Any])
    
    inline def setRevisionTagUndefined: Self = StObject.set(x, "revisionTag", js.undefined)
  }
}
