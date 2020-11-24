package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactContent extends js.Object {
  
  /**
    * MIME Base64-encoded content from a binary artifact, or from a text artifact in its original encoding.
    */
  var binary: js.UndefOr[String] = js.native
  
  /**
    * Key/value pairs that provide additional information about the artifact content.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * An alternate rendered representation of the artifact (e.g., a decompiled representation of a binary region).
    */
  var rendered: js.UndefOr[MultiformatMessageString] = js.native
  
  /**
    * UTF-8-encoded content from a text artifact.
    */
  var text: js.UndefOr[String] = js.native
}
object ArtifactContent {
  
  @scala.inline
  def apply(): ArtifactContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactContent]
  }
  
  @scala.inline
  implicit class ArtifactContentOps[Self <: ArtifactContent] (val x: Self) extends AnyVal {
    
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
    def setBinary(value: String): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setRendered(value: MultiformatMessageString): Self = this.set("rendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRendered: Self = this.set("rendered", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
