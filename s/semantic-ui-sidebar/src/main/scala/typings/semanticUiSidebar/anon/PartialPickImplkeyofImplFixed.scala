package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplFixed extends js.Object {
  
  var fixed: js.UndefOr[String] = js.native
  
  var omitted: js.UndefOr[String] = js.native
  
  var pusher: js.UndefOr[String] = js.native
  
  var sidebar: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplFixed {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplFixed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplFixed]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplFixedOps[Self <: PartialPickImplkeyofImplFixed] (val x: Self) extends AnyVal {
    
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
    def setFixed(value: String): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    
    @scala.inline
    def setOmitted(value: String): Self = this.set("omitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitted: Self = this.set("omitted", js.undefined)
    
    @scala.inline
    def setPusher(value: String): Self = this.set("pusher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePusher: Self = this.set("pusher", js.undefined)
    
    @scala.inline
    def setSidebar(value: String): Self = this.set("sidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSidebar: Self = this.set("sidebar", js.undefined)
  }
}
