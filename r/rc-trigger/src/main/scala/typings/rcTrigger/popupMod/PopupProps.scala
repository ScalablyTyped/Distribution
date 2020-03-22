package typings.rcTrigger.popupMod

import typings.rcTrigger.interfaceMod.AlignType
import typings.rcTrigger.interfaceMod.AnimationType
import typings.rcTrigger.interfaceMod.MotionType
import typings.rcTrigger.interfaceMod.Point
import typings.rcTrigger.interfaceMod.StretchType
import typings.rcTrigger.interfaceMod.TransitionNameType
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupProps extends js.Object {
  var align: js.UndefOr[AlignType] = js.undefined
  var animation: AnimationType
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined
  var getClassNameFromAlign: js.UndefOr[js.Function1[/* align */ AlignType, String]] = js.undefined
  var getRootDomNode: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var maskAnimation: AnimationType
  var maskMotion: MotionType
  var maskTransitionName: TransitionNameType
  var motion: MotionType
  var onAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  var point: js.UndefOr[Point] = js.undefined
  var prefixCls: String
  var stretch: js.UndefOr[StretchType] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionName: TransitionNameType
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PopupProps {
  @scala.inline
  def apply(
    animation: AnimationType,
    maskAnimation: AnimationType,
    maskMotion: MotionType,
    maskTransitionName: TransitionNameType,
    motion: MotionType,
    prefixCls: String,
    transitionName: TransitionNameType,
    align: AlignType = null,
    children: ReactNode = null,
    className: String = null,
    destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined,
    getClassNameFromAlign: /* align */ AlignType => String = null,
    getRootDomNode: () => HTMLElement = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    onAlign: (/* element */ HTMLElement, /* align */ AlignType) => Unit = null,
    onMouseDown: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onTouchStart: TouchEvent[HTMLElement] => Unit = null,
    point: Point = null,
    stretch: StretchType = null,
    style: CSSProperties = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): PopupProps = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], maskAnimation = maskAnimation.asInstanceOf[js.Any], maskMotion = maskMotion.asInstanceOf[js.Any], maskTransitionName = maskTransitionName.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyPopupOnHide)) __obj.updateDynamic("destroyPopupOnHide")(destroyPopupOnHide.asInstanceOf[js.Any])
    if (getClassNameFromAlign != null) __obj.updateDynamic("getClassNameFromAlign")(js.Any.fromFunction1(getClassNameFromAlign))
    if (getRootDomNode != null) __obj.updateDynamic("getRootDomNode")(js.Any.fromFunction0(getRootDomNode))
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onAlign != null) __obj.updateDynamic("onAlign")(js.Any.fromFunction2(onAlign))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (stretch != null) __obj.updateDynamic("stretch")(stretch.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupProps]
  }
}

