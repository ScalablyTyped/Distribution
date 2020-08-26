package typings.rcDropdown.dropdownMod

import typings.rcTrigger.interfaceMod.ActionType
import typings.rcTrigger.interfaceMod.AlignType
import typings.rcTrigger.interfaceMod.AnimationType
import typings.rcTrigger.interfaceMod.BuildInPlacements
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<rc-trigger.rc-trigger.TriggerProps, 'getPopupContainer' | 'children'> */
@js.native
trait DropdownProps extends js.Object {
  var align: js.UndefOr[AlignType] = js.native
  var alignPoint: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[AnimationType] = js.native
  var arrow: js.UndefOr[Boolean] = js.native
  var children: ReactElement = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
  var hideAction: js.UndefOr[js.Array[ActionType]] = js.native
  var minOverlayWidthMatchTrigger: js.UndefOr[Boolean] = js.native
  var onOverlayClick: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  var openClassName: js.UndefOr[String] = js.native
  var overlay: js.UndefOr[js.Function0[ReactElement] | ReactElement] = js.native
  var overlayClassName: js.UndefOr[String] = js.native
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  var placement: js.UndefOr[String] = js.native
  var placements: js.UndefOr[BuildInPlacements] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var showAction: js.UndefOr[js.Array[ActionType]] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var trigger: js.UndefOr[ActionType | js.Array[ActionType]] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object DropdownProps {
  @scala.inline
  def apply(children: ReactElement): DropdownProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownProps]
  }
  @scala.inline
  implicit class DropdownPropsOps[Self <: DropdownProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: AlignType): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAlignPoint(value: Boolean): Self = this.set("alignPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignPoint: Self = this.set("alignPoint", js.undefined)
    @scala.inline
    def setAnimation(value: AnimationType): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setArrow(value: Boolean): Self = this.set("arrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setHideActionVarargs(value: ActionType*): Self = this.set("hideAction", js.Array(value :_*))
    @scala.inline
    def setHideAction(value: js.Array[ActionType]): Self = this.set("hideAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideAction: Self = this.set("hideAction", js.undefined)
    @scala.inline
    def setMinOverlayWidthMatchTrigger(value: Boolean): Self = this.set("minOverlayWidthMatchTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinOverlayWidthMatchTrigger: Self = this.set("minOverlayWidthMatchTrigger", js.undefined)
    @scala.inline
    def setOnOverlayClick(value: /* e */ Event => Unit): Self = this.set("onOverlayClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOverlayClick: Self = this.set("onOverlayClick", js.undefined)
    @scala.inline
    def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("onVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVisibleChange: Self = this.set("onVisibleChange", js.undefined)
    @scala.inline
    def setOpenClassName(value: String): Self = this.set("openClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenClassName: Self = this.set("openClassName", js.undefined)
    @scala.inline
    def setOverlayFunction0(value: () => ReactElement): Self = this.set("overlay", js.Any.fromFunction0(value))
    @scala.inline
    def setOverlay(value: js.Function0[ReactElement] | ReactElement): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setOverlayClassName(value: String): Self = this.set("overlayClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayClassName: Self = this.set("overlayClassName", js.undefined)
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPlacements(value: BuildInPlacements): Self = this.set("placements", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacements: Self = this.set("placements", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setShowActionVarargs(value: ActionType*): Self = this.set("showAction", js.Array(value :_*))
    @scala.inline
    def setShowAction(value: js.Array[ActionType]): Self = this.set("showAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAction: Self = this.set("showAction", js.undefined)
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

