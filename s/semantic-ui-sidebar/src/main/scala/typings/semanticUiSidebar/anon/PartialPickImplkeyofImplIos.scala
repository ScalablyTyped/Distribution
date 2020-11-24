package typings.semanticUiSidebar.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplIos extends js.Object {
  
  var ios: js.UndefOr[RegExp] = js.native
  
  var mobile: js.UndefOr[RegExp] = js.native
}
object PartialPickImplkeyofImplIos {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplIos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplIos]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplIosOps[Self <: PartialPickImplkeyofImplIos] (val x: Self) extends AnyVal {
    
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
    def setIos(value: RegExp): Self = this.set("ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
    
    @scala.inline
    def setMobile(value: RegExp): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
  }
}
