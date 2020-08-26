package typings.rmcTooltip.tooltipMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipProps extends js.Object {
  var afterVisibleChange: js.UndefOr[js.Function] = js.native
  var align: js.UndefOr[js.Object] = js.native
  var animation: js.UndefOr[js.Any] = js.native
  var arrowContent: js.UndefOr[js.Any] = js.native
  var defaultVisible: js.UndefOr[Boolean] = js.native
  var destroyTooltipOnHide: js.UndefOr[Boolean] = js.native
  var getTooltipContainer: js.UndefOr[js.Function] = js.native
  var onVisibleChange: js.UndefOr[js.Function] = js.native
  var overlay: ReactNode | js.Function = js.native
  var overlayClassName: js.UndefOr[String] = js.native
  var overlayStyle: js.UndefOr[js.Object] = js.native
  var placement: js.UndefOr[String] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var trigger: js.UndefOr[js.Any] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object ITooltipProps {
  @scala.inline
  def apply(): ITooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITooltipProps]
  }
  @scala.inline
  implicit class ITooltipPropsOps[Self <: ITooltipProps] (val x: Self) extends AnyVal {
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
    def setAfterVisibleChange(value: js.Function): Self = this.set("afterVisibleChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterVisibleChange: Self = this.set("afterVisibleChange", js.undefined)
    @scala.inline
    def setAlign(value: js.Object): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAnimation(value: js.Any): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setArrowContent(value: js.Any): Self = this.set("arrowContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowContent: Self = this.set("arrowContent", js.undefined)
    @scala.inline
    def setDefaultVisible(value: Boolean): Self = this.set("defaultVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVisible: Self = this.set("defaultVisible", js.undefined)
    @scala.inline
    def setDestroyTooltipOnHide(value: Boolean): Self = this.set("destroyTooltipOnHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyTooltipOnHide: Self = this.set("destroyTooltipOnHide", js.undefined)
    @scala.inline
    def setGetTooltipContainer(value: js.Function): Self = this.set("getTooltipContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetTooltipContainer: Self = this.set("getTooltipContainer", js.undefined)
    @scala.inline
    def setOnVisibleChange(value: js.Function): Self = this.set("onVisibleChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnVisibleChange: Self = this.set("onVisibleChange", js.undefined)
    @scala.inline
    def setOverlay(value: ReactNode | js.Function): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setOverlayClassName(value: String): Self = this.set("overlayClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayClassName: Self = this.set("overlayClassName", js.undefined)
    @scala.inline
    def setOverlayStyle(value: js.Object): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setTrigger(value: js.Any): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

