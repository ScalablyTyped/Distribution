package typings.rmcDialog.idialogproptypesMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogPropTypes extends js.Object {
  
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var animation: js.UndefOr[js.Any] = js.native
  
  var bodyStyle: js.UndefOr[js.Object] = js.native
  
  var children: js.UndefOr[js.Any] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var closable: js.UndefOr[Boolean] = js.native
  
  var footer: js.UndefOr[ReactNode] = js.native
  
  var mask: js.UndefOr[Boolean] = js.native
  
  var maskAnimation: js.UndefOr[js.Any] = js.native
  
  var maskClosable: js.UndefOr[Boolean] = js.native
  
  var maskProps: js.UndefOr[js.Any] = js.native
  
  var maskStyle: js.UndefOr[js.Object] = js.native
  
  var maskTransitionName: js.UndefOr[String] = js.native
  
  var onAnimateLeave: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var title: js.UndefOr[ReactNode] = js.native
  
  var transitionName: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var wrapClassName: js.UndefOr[String] = js.native
  
  var wrapProps: js.UndefOr[js.Any] = js.native
  
  var wrapStyle: js.UndefOr[js.Object] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object IDialogPropTypes {
  
  @scala.inline
  def apply(): IDialogPropTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogPropTypes]
  }
  
  @scala.inline
  implicit class IDialogPropTypesOps[Self <: IDialogPropTypes] (val x: Self) extends AnyVal {
    
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
    def setAfterClose(value: () => Unit): Self = this.set("afterClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAfterClose: Self = this.set("afterClose", js.undefined)
    
    @scala.inline
    def setAnimation(value: js.Any): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setBodyStyle(value: js.Object): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    
    @scala.inline
    def setFooter(value: ReactNode): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMaskAnimation(value: js.Any): Self = this.set("maskAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskAnimation: Self = this.set("maskAnimation", js.undefined)
    
    @scala.inline
    def setMaskClosable(value: Boolean): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskClosable: Self = this.set("maskClosable", js.undefined)
    
    @scala.inline
    def setMaskProps(value: js.Any): Self = this.set("maskProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskProps: Self = this.set("maskProps", js.undefined)
    
    @scala.inline
    def setMaskStyle(value: js.Object): Self = this.set("maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskStyle: Self = this.set("maskStyle", js.undefined)
    
    @scala.inline
    def setMaskTransitionName(value: String): Self = this.set("maskTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskTransitionName: Self = this.set("maskTransitionName", js.undefined)
    
    @scala.inline
    def setOnAnimateLeave(value: () => Unit): Self = this.set("onAnimateLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAnimateLeave: Self = this.set("onAnimateLeave", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* e */ js.Any => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWrapClassName(value: String): Self = this.set("wrapClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapClassName: Self = this.set("wrapClassName", js.undefined)
    
    @scala.inline
    def setWrapProps(value: js.Any): Self = this.set("wrapProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapProps: Self = this.set("wrapProps", js.undefined)
    
    @scala.inline
    def setWrapStyle(value: js.Object): Self = this.set("wrapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapStyle: Self = this.set("wrapStyle", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
