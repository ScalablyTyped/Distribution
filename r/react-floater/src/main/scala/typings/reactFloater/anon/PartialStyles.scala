package typings.reactFloater.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-floater.react-floater.Styles> */
@js.native
trait PartialStyles extends js.Object {
  
  var arrow: js.UndefOr[CSSPropertieslengthnumber] = js.native
  
  var close: js.UndefOr[CSSProperties] = js.native
  
  var container: js.UndefOr[CSSProperties] = js.native
  
  var content: js.UndefOr[CSSProperties] = js.native
  
  var floater: js.UndefOr[CSSProperties] = js.native
  
  var floaterCentered: js.UndefOr[CSSProperties] = js.native
  
  var floaterClosing: js.UndefOr[CSSProperties] = js.native
  
  var floaterOpening: js.UndefOr[CSSProperties] = js.native
  
  var floaterWithAnimation: js.UndefOr[CSSProperties] = js.native
  
  var floaterWithComponent: js.UndefOr[CSSProperties] = js.native
  
  var footer: js.UndefOr[CSSProperties] = js.native
  
  var options: js.UndefOr[ZIndex] = js.native
  
  var title: js.UndefOr[CSSProperties] = js.native
  
  var wrapper: js.UndefOr[CSSProperties] = js.native
  
  var wrapperPosition: js.UndefOr[CSSProperties] = js.native
}
object PartialStyles {
  
  @scala.inline
  def apply(): PartialStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyles]
  }
  
  @scala.inline
  implicit class PartialStylesOps[Self <: PartialStyles] (val x: Self) extends AnyVal {
    
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
    def setArrow(value: CSSPropertieslengthnumber): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    
    @scala.inline
    def setClose(value: CSSProperties): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setContainer(value: CSSProperties): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContent(value: CSSProperties): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFloater(value: CSSProperties): Self = this.set("floater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloater: Self = this.set("floater", js.undefined)
    
    @scala.inline
    def setFloaterCentered(value: CSSProperties): Self = this.set("floaterCentered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloaterCentered: Self = this.set("floaterCentered", js.undefined)
    
    @scala.inline
    def setFloaterClosing(value: CSSProperties): Self = this.set("floaterClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloaterClosing: Self = this.set("floaterClosing", js.undefined)
    
    @scala.inline
    def setFloaterOpening(value: CSSProperties): Self = this.set("floaterOpening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloaterOpening: Self = this.set("floaterOpening", js.undefined)
    
    @scala.inline
    def setFloaterWithAnimation(value: CSSProperties): Self = this.set("floaterWithAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloaterWithAnimation: Self = this.set("floaterWithAnimation", js.undefined)
    
    @scala.inline
    def setFloaterWithComponent(value: CSSProperties): Self = this.set("floaterWithComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloaterWithComponent: Self = this.set("floaterWithComponent", js.undefined)
    
    @scala.inline
    def setFooter(value: CSSProperties): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setOptions(value: ZIndex): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setTitle(value: CSSProperties): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWrapper(value: CSSProperties): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
    
    @scala.inline
    def setWrapperPosition(value: CSSProperties): Self = this.set("wrapperPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperPosition: Self = this.set("wrapperPosition", js.undefined)
  }
}
