package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fix extends StObject {
  
  /**
    * One or more artifact changes that comprise a fix for a result.
    */
  var artifactChanges: js.Array[ArtifactChange]
  
  /**
    * A message that describes the proposed fix, enabling viewers to present the proposed change to an end user.
    */
  var description: js.UndefOr[Message] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the fix.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}
object Fix {
  
  inline def apply(artifactChanges: js.Array[ArtifactChange]): Fix = {
    val __obj = js.Dynamic.literal(artifactChanges = artifactChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fix]
  }
  
  extension [Self <: Fix](x: Self) {
    
    inline def setArtifactChanges(value: js.Array[ArtifactChange]): Self = StObject.set(x, "artifactChanges", value.asInstanceOf[js.Any])
    
    inline def setArtifactChangesVarargs(value: ArtifactChange*): Self = StObject.set(x, "artifactChanges", js.Array(value :_*))
    
    inline def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
