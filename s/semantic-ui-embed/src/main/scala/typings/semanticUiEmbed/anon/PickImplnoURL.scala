package typings.semanticUiEmbed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl, 'noURL'> */
@js.native
trait PickImplnoURL extends js.Object {
  
  var noURL: String = js.native
}
object PickImplnoURL {
  
  @scala.inline
  def apply(noURL: String): PickImplnoURL = {
    val __obj = js.Dynamic.literal(noURL = noURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoURL]
  }
  
  @scala.inline
  implicit class PickImplnoURLOps[Self <: PickImplnoURL] (val x: Self) extends AnyVal {
    
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
    def setNoURL(value: String): Self = this.set("noURL", value.asInstanceOf[js.Any])
  }
}
