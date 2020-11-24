package typings.semanticUiEmbed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.ClassNameSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.ClassNameSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplActive extends js.Object {
  
  var active: js.UndefOr[String] = js.native
  
  var embed: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplActive {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplActive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplActive]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplActiveOps[Self <: PartialPickImplkeyofImplActive] (val x: Self) extends AnyVal {
    
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setEmbed(value: String): Self = this.set("embed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbed: Self = this.set("embed", js.undefined)
  }
}
