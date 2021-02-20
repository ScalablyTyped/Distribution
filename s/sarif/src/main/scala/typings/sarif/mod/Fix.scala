package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fix extends StObject {
  
  /**
    * One or more artifact changes that comprise a fix for a result.
    */
  var artifactChanges: js.Array[ArtifactChange] = js.native
  
  /**
    * A message that describes the proposed fix, enabling viewers to present the proposed change to an end user.
    */
  var description: js.UndefOr[Message] = js.native
  
  /**
    * Key/value pairs that provide additional information about the fix.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}
object Fix {
  
  @scala.inline
  def apply(artifactChanges: js.Array[ArtifactChange]): Fix = {
    val __obj = js.Dynamic.literal(artifactChanges = artifactChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fix]
  }
  
  @scala.inline
  implicit class FixMutableBuilder[Self <: Fix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactChanges(value: js.Array[ArtifactChange]): Self = StObject.set(x, "artifactChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactChangesVarargs(value: ArtifactChange*): Self = StObject.set(x, "artifactChanges", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
