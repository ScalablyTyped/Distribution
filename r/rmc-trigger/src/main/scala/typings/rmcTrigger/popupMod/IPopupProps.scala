package typings.rmcTrigger.popupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopupProps extends js.Object {
  var align: js.UndefOr[js.Any] = js.native
  var animation: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var destroyPopupOnHide: js.UndefOr[Boolean] = js.native
  var getClassNameFromAlign: js.UndefOr[js.Function] = js.native
  var getRootDomNode: js.UndefOr[js.Function] = js.native
  var mask: js.UndefOr[Boolean] = js.native
  var maskAnimation: js.UndefOr[String] = js.native
  var maskTransitionName: js.UndefOr[String | js.Object] = js.native
  var onAlign: js.UndefOr[js.Function] = js.native
  var onAnimateLeave: js.UndefOr[js.Function] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var style: js.UndefOr[js.Any] = js.native
  var transitionName: js.UndefOr[String | js.Object] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object IPopupProps {
  @scala.inline
  def apply(): IPopupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopupProps]
  }
  @scala.inline
  implicit class IPopupPropsOps[Self <: IPopupProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: js.Any): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDestroyPopupOnHide(value: Boolean): Self = this.set("destroyPopupOnHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyPopupOnHide: Self = this.set("destroyPopupOnHide", js.undefined)
    @scala.inline
    def setGetClassNameFromAlign(value: js.Function): Self = this.set("getClassNameFromAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetClassNameFromAlign: Self = this.set("getClassNameFromAlign", js.undefined)
    @scala.inline
    def setGetRootDomNode(value: js.Function): Self = this.set("getRootDomNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetRootDomNode: Self = this.set("getRootDomNode", js.undefined)
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMaskAnimation(value: String): Self = this.set("maskAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskAnimation: Self = this.set("maskAnimation", js.undefined)
    @scala.inline
    def setMaskTransitionName(value: String | js.Object): Self = this.set("maskTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskTransitionName: Self = this.set("maskTransitionName", js.undefined)
    @scala.inline
    def setOnAlign(value: js.Function): Self = this.set("onAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAlign: Self = this.set("onAlign", js.undefined)
    @scala.inline
    def setOnAnimateLeave(value: js.Function): Self = this.set("onAnimateLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAnimateLeave: Self = this.set("onAnimateLeave", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTransitionName(value: String | js.Object): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

