package typings.rcTrigger.mod

import typings.rcTrigger.interfaceMod.ActionType
import typings.rcTrigger.interfaceMod.AlignType
import typings.rcTrigger.interfaceMod.AnimationType
import typings.rcTrigger.interfaceMod.BuildInPlacements
import typings.rcTrigger.interfaceMod.MotionType
import typings.rcTrigger.interfaceMod.TransitionNameType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerProps extends js.Object {
  var action: js.UndefOr[ActionType | js.Array[ActionType]] = js.undefined
  var afterPopupVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var alignPoint: js.UndefOr[Boolean] = js.undefined
  var blurDelay: js.UndefOr[Double] = js.undefined
  var builtinPlacements: js.UndefOr[BuildInPlacements] = js.undefined
  var children: ReactElement
  var className: js.UndefOr[String] = js.undefined
  var defaultPopupVisible: js.UndefOr[Boolean] = js.undefined
  var destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined
  var focusDelay: js.UndefOr[Double] = js.undefined
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var getDocument: js.UndefOr[js.Function0[HTMLDocument]] = js.undefined
  var getPopupClassNameFromAlign: js.UndefOr[js.Function1[/* align */ AlignType, String]] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
  /**
    * @private Get trigger DOM node.
    * Used for some component is function component which can not access by `findDOMNode`
    */
  var getTriggerDOMNode: js.UndefOr[js.Function1[/* node */ ReactInstance, HTMLElement]] = js.undefined
  var hideAction: js.UndefOr[js.Array[ActionType]] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Please us `maskMotion` instead. */
  var maskAnimation: js.UndefOr[String] = js.undefined
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  /** Set mask motion. You can ref `rc-animate` for more info. */
  var maskMotion: js.UndefOr[MotionType] = js.undefined
  /** @deprecated Please us `maskMotion` instead. */
  var maskTransitionName: js.UndefOr[TransitionNameType] = js.undefined
  var mouseEnterDelay: js.UndefOr[Double] = js.undefined
  var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
  var onPopupAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.undefined
  var onPopupVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var popup: ReactNode | js.Function0[ReactNode]
  var popupAlign: js.UndefOr[AlignType] = js.undefined
  /** @deprecated Please us `popupMotion` instead. */
  var popupAnimation: js.UndefOr[AnimationType] = js.undefined
  var popupClassName: js.UndefOr[String] = js.undefined
  /** Set popup motion. You can ref `rc-animate` for more info. */
  var popupMotion: js.UndefOr[MotionType] = js.undefined
  var popupPlacement: js.UndefOr[String] = js.undefined
  var popupStyle: js.UndefOr[CSSProperties] = js.undefined
  /** @deprecated Please us `popupMotion` instead. */
  var popupTransitionName: js.UndefOr[TransitionNameType] = js.undefined
  var popupVisible: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showAction: js.UndefOr[js.Array[ActionType]] = js.undefined
  var stretch: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object TriggerProps {
  @scala.inline
  def apply(
    children: ReactElement,
    action: ActionType | js.Array[ActionType] = null,
    afterPopupVisibleChange: /* visible */ Boolean => Unit = null,
    alignPoint: js.UndefOr[Boolean] = js.undefined,
    blurDelay: Int | Double = null,
    builtinPlacements: BuildInPlacements = null,
    className: String = null,
    defaultPopupVisible: js.UndefOr[Boolean] = js.undefined,
    destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined,
    focusDelay: Int | Double = null,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    getDocument: () => HTMLDocument = null,
    getPopupClassNameFromAlign: /* align */ AlignType => String = null,
    getPopupContainer: /* node */ HTMLElement => HTMLElement = null,
    getTriggerDOMNode: /* node */ ReactInstance => HTMLElement = null,
    hideAction: js.Array[ActionType] = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskAnimation: String = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskMotion: MotionType = null,
    maskTransitionName: TransitionNameType = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    onPopupAlign: (/* element */ HTMLElement, /* align */ AlignType) => Unit = null,
    onPopupVisibleChange: /* visible */ Boolean => Unit = null,
    popup: ReactNode | js.Function0[ReactNode] = null,
    popupAlign: AlignType = null,
    popupAnimation: AnimationType = null,
    popupClassName: String = null,
    popupMotion: MotionType = null,
    popupPlacement: String = null,
    popupStyle: CSSProperties = null,
    popupTransitionName: TransitionNameType = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    showAction: js.Array[ActionType] = null,
    stretch: String = null,
    zIndex: Int | Double = null
  ): TriggerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (afterPopupVisibleChange != null) __obj.updateDynamic("afterPopupVisibleChange")(js.Any.fromFunction1(afterPopupVisibleChange))
    if (!js.isUndefined(alignPoint)) __obj.updateDynamic("alignPoint")(alignPoint.asInstanceOf[js.Any])
    if (blurDelay != null) __obj.updateDynamic("blurDelay")(blurDelay.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultPopupVisible)) __obj.updateDynamic("defaultPopupVisible")(defaultPopupVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyPopupOnHide)) __obj.updateDynamic("destroyPopupOnHide")(destroyPopupOnHide.asInstanceOf[js.Any])
    if (focusDelay != null) __obj.updateDynamic("focusDelay")(focusDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender.asInstanceOf[js.Any])
    if (getDocument != null) __obj.updateDynamic("getDocument")(js.Any.fromFunction0(getDocument))
    if (getPopupClassNameFromAlign != null) __obj.updateDynamic("getPopupClassNameFromAlign")(js.Any.fromFunction1(getPopupClassNameFromAlign))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (getTriggerDOMNode != null) __obj.updateDynamic("getTriggerDOMNode")(js.Any.fromFunction1(getTriggerDOMNode))
    if (hideAction != null) __obj.updateDynamic("hideAction")(hideAction.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskAnimation != null) __obj.updateDynamic("maskAnimation")(maskAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskMotion != null) __obj.updateDynamic("maskMotion")(maskMotion.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onPopupAlign != null) __obj.updateDynamic("onPopupAlign")(js.Any.fromFunction2(onPopupAlign))
    if (onPopupVisibleChange != null) __obj.updateDynamic("onPopupVisibleChange")(js.Any.fromFunction1(onPopupVisibleChange))
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (popupAlign != null) __obj.updateDynamic("popupAlign")(popupAlign.asInstanceOf[js.Any])
    if (popupAnimation != null) __obj.updateDynamic("popupAnimation")(popupAnimation.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupMotion != null) __obj.updateDynamic("popupMotion")(popupMotion.asInstanceOf[js.Any])
    if (popupPlacement != null) __obj.updateDynamic("popupPlacement")(popupPlacement.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (popupTransitionName != null) __obj.updateDynamic("popupTransitionName")(popupTransitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (stretch != null) __obj.updateDynamic("stretch")(stretch.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerProps]
  }
}

