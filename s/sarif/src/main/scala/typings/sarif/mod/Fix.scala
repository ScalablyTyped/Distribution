package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fix extends js.Object {
  
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
  implicit class FixOps[Self <: Fix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArtifactChangesVarargs(value: ArtifactChange*): Self = this.set("artifactChanges", js.Array(value :_*))
    
    @scala.inline
    def setArtifactChanges(value: js.Array[ArtifactChange]): Self = this.set("artifactChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Message): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
