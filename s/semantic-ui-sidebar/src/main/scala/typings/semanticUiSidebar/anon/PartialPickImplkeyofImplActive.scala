package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplActive extends js.Object {
  
  var active: js.UndefOr[String] = js.native
  
  var animating: js.UndefOr[String] = js.native
  
  var bottom: js.UndefOr[String] = js.native
  
  var dimmed: js.UndefOr[String] = js.native
  
  var ios: js.UndefOr[String] = js.native
  
  var left: js.UndefOr[String] = js.native
  
  var pushable: js.UndefOr[String] = js.native
  
  var pushed: js.UndefOr[String] = js.native
  
  var right: js.UndefOr[String] = js.native
  
  var top: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[String] = js.native
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
    def setAnimating(value: String): Self = this.set("animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimating: Self = this.set("animating", js.undefined)
    
    @scala.inline
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setDimmed(value: String): Self = this.set("dimmed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimmed: Self = this.set("dimmed", js.undefined)
    
    @scala.inline
    def setIos(value: String): Self = this.set("ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
    
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setPushable(value: String): Self = this.set("pushable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushable: Self = this.set("pushable", js.undefined)
    
    @scala.inline
    def setPushed(value: String): Self = this.set("pushed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushed: Self = this.set("pushed", js.undefined)
    
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
