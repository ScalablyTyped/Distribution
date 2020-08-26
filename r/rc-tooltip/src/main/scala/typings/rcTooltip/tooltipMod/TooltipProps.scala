package typings.rcTooltip.tooltipMod

import typings.rcTooltip.anon.KeepParent
import typings.rcTrigger.interfaceMod.ActionType
import typings.rcTrigger.interfaceMod.AlignType
import typings.rcTrigger.interfaceMod.AnimationType
import typings.rcTrigger.interfaceMod.BuildInPlacements
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<rc-trigger.rc-trigger.TriggerProps, 'onPopupAlign' | 'builtinPlacements'> */
@js.native
trait TooltipProps extends js.Object {
  var afterVisibleChange: js.UndefOr[js.Function0[Unit]] = js.native
  var align: js.UndefOr[AlignType] = js.native
  var animation: js.UndefOr[AnimationType] = js.native
  var arrowContent: js.UndefOr[ReactNode] = js.native
  var builtinPlacements: js.UndefOr[BuildInPlacements] = js.native
  var children: js.UndefOr[ReactElement] = js.native
  var defaultVisible: js.UndefOr[Boolean] = js.native
  var destroyTooltipOnHide: js.UndefOr[Boolean | KeepParent] = js.native
  var getTooltipContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
  var id: js.UndefOr[String] = js.native
  var mouseEnterDelay: js.UndefOr[Double] = js.native
  var mouseLeaveDelay: js.UndefOr[Double] = js.native
  var onPopupAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.native
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  var overlay: js.Function0[ReactNode] | ReactNode = js.native
  var overlayClassName: js.UndefOr[String] = js.native
  var overlayInnerStyle: js.UndefOr[CSSProperties] = js.native
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  var placement: js.UndefOr[String] = js.native
  var popupVisible: js.UndefOr[Boolean] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var trigger: js.UndefOr[ActionType | js.Array[ActionType]] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object TooltipProps {
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
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
    def setAfterVisibleChange(value: () => Unit): Self = this.set("afterVisibleChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterVisibleChange: Self = this.set("afterVisibleChange", js.undefined)
    @scala.inline
    def setAlign(value: AlignType): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAnimation(value: AnimationType): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setArrowContent(value: ReactNode): Self = this.set("arrowContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowContent: Self = this.set("arrowContent", js.undefined)
    @scala.inline
    def setBuiltinPlacements(value: BuildInPlacements): Self = this.set("builtinPlacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuiltinPlacements: Self = this.set("builtinPlacements", js.undefined)
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDefaultVisible(value: Boolean): Self = this.set("defaultVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVisible: Self = this.set("defaultVisible", js.undefined)
    @scala.inline
    def setDestroyTooltipOnHide(value: Boolean | KeepParent): Self = this.set("destroyTooltipOnHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyTooltipOnHide: Self = this.set("destroyTooltipOnHide", js.undefined)
    @scala.inline
    def setGetTooltipContainer(value: /* node */ HTMLElement => HTMLElement): Self = this.set("getTooltipContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetTooltipContainer: Self = this.set("getTooltipContainer", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMouseEnterDelay(value: Double): Self = this.set("mouseEnterDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseEnterDelay: Self = this.set("mouseEnterDelay", js.undefined)
    @scala.inline
    def setMouseLeaveDelay(value: Double): Self = this.set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseLeaveDelay: Self = this.set("mouseLeaveDelay", js.undefined)
    @scala.inline
    def setOnPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): Self = this.set("onPopupAlign", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPopupAlign: Self = this.set("onPopupAlign", js.undefined)
    @scala.inline
    def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("onVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVisibleChange: Self = this.set("onVisibleChange", js.undefined)
    @scala.inline
    def setOverlayFunction0(value: () => ReactNode): Self = this.set("overlay", js.Any.fromFunction0(value))
    @scala.inline
    def setOverlay(value: js.Function0[ReactNode] | ReactNode): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setOverlayClassName(value: String): Self = this.set("overlayClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayClassName: Self = this.set("overlayClassName", js.undefined)
    @scala.inline
    def setOverlayInnerStyle(value: CSSProperties): Self = this.set("overlayInnerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayInnerStyle: Self = this.set("overlayInnerStyle", js.undefined)
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPopupVisible(value: Boolean): Self = this.set("popupVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupVisible: Self = this.set("popupVisible", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setTriggerVarargs(value: ActionType*): Self = this.set("trigger", js.Array(value :_*))
    @scala.inline
    def setTrigger(value: ActionType | js.Array[ActionType]): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

