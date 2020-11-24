package typings.rmcTrigger.propsTypeMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITriggerProps extends js.Object {
  
  var afterPopupVisibleChange: js.UndefOr[js.Function] = js.native
  
  var builtinPlacements: js.UndefOr[js.Any] = js.native
  
  var defaultPopupVisible: js.UndefOr[Boolean] = js.native
  
  var destroyPopupOnHide: js.UndefOr[Boolean] = js.native
  
  var getDocument: js.UndefOr[js.Function] = js.native
  
  var getPopupClassNameFromAlign: js.UndefOr[js.Any] = js.native
  
  var getPopupContainer: js.UndefOr[js.Function] = js.native
  
  var mask: js.UndefOr[Boolean] = js.native
  
  var maskAnimation: js.UndefOr[String] = js.native
  
  var maskClosable: js.UndefOr[Boolean] = js.native
  
  var maskTransitionName: js.UndefOr[String | js.Object] = js.native
  
  var onPopupAlign: js.UndefOr[js.Function] = js.native
  
  var onPopupVisibleChange: js.UndefOr[js.Function] = js.native
  
  var popup: ReactNode | js.Function = js.native
  
  var popupAlign: js.UndefOr[js.Any] = js.native
  
  var popupAnimation: js.UndefOr[js.Any] = js.native
  
  var popupClassName: js.UndefOr[String] = js.native
  
  var popupPlacement: js.UndefOr[String] = js.native
  
  var popupStyle: js.UndefOr[js.Any] = js.native
  
  var popupTransitionName: js.UndefOr[String | js.Object] = js.native
  
  var popupVisible: js.UndefOr[Boolean] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object ITriggerProps {
  
  @scala.inline
  def apply(): ITriggerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITriggerProps]
  }
  
  @scala.inline
  implicit class ITriggerPropsOps[Self <: ITriggerProps] (val x: Self) extends AnyVal {
    
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
    def setAfterPopupVisibleChange(value: js.Function): Self = this.set("afterPopupVisibleChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterPopupVisibleChange: Self = this.set("afterPopupVisibleChange", js.undefined)
    
    @scala.inline
    def setBuiltinPlacements(value: js.Any): Self = this.set("builtinPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuiltinPlacements: Self = this.set("builtinPlacements", js.undefined)
    
    @scala.inline
    def setDefaultPopupVisible(value: Boolean): Self = this.set("defaultPopupVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPopupVisible: Self = this.set("defaultPopupVisible", js.undefined)
    
    @scala.inline
    def setDestroyPopupOnHide(value: Boolean): Self = this.set("destroyPopupOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyPopupOnHide: Self = this.set("destroyPopupOnHide", js.undefined)
    
    @scala.inline
    def setGetDocument(value: js.Function): Self = this.set("getDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetDocument: Self = this.set("getDocument", js.undefined)
    
    @scala.inline
    def setGetPopupClassNameFromAlign(value: js.Any): Self = this.set("getPopupClassNameFromAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetPopupClassNameFromAlign: Self = this.set("getPopupClassNameFromAlign", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: js.Function): Self = this.set("getPopupContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMaskAnimation(value: String): Self = this.set("maskAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskAnimation: Self = this.set("maskAnimation", js.undefined)
    
    @scala.inline
    def setMaskClosable(value: Boolean): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskClosable: Self = this.set("maskClosable", js.undefined)
    
    @scala.inline
    def setMaskTransitionName(value: String | js.Object): Self = this.set("maskTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskTransitionName: Self = this.set("maskTransitionName", js.undefined)
    
    @scala.inline
    def setOnPopupAlign(value: js.Function): Self = this.set("onPopupAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPopupAlign: Self = this.set("onPopupAlign", js.undefined)
    
    @scala.inline
    def setOnPopupVisibleChange(value: js.Function): Self = this.set("onPopupVisibleChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPopupVisibleChange: Self = this.set("onPopupVisibleChange", js.undefined)
    
    @scala.inline
    def setPopup(value: ReactNode | js.Function): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    
    @scala.inline
    def setPopupAlign(value: js.Any): Self = this.set("popupAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupAlign: Self = this.set("popupAlign", js.undefined)
    
    @scala.inline
    def setPopupAnimation(value: js.Any): Self = this.set("popupAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupAnimation: Self = this.set("popupAnimation", js.undefined)
    
    @scala.inline
    def setPopupClassName(value: String): Self = this.set("popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupClassName: Self = this.set("popupClassName", js.undefined)
    
    @scala.inline
    def setPopupPlacement(value: String): Self = this.set("popupPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupPlacement: Self = this.set("popupPlacement", js.undefined)
    
    @scala.inline
    def setPopupStyle(value: js.Any): Self = this.set("popupStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupStyle: Self = this.set("popupStyle", js.undefined)
    
    @scala.inline
    def setPopupTransitionName(value: String | js.Object): Self = this.set("popupTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupTransitionName: Self = this.set("popupTransitionName", js.undefined)
    
    @scala.inline
    def setPopupVisible(value: Boolean): Self = this.set("popupVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupVisible: Self = this.set("popupVisible", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
