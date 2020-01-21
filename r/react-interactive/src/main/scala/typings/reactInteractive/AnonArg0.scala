package typings.reactInteractive

import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.reactInteractive.mod.ClickType
import typings.reactInteractive.mod.State
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArg0 extends js.Object {
  // as: string | Component | ReactElement;
  var as: js.Any
  var className: js.UndefOr[String] = js.undefined
  var extraTouchNoTap: js.UndefOr[Boolean] = js.undefined
   // Not sure about this type
  var focusToggleOff: js.UndefOr[Boolean] = js.undefined
  var forceState: js.UndefOr[State] = js.undefined
  var hover: js.UndefOr[CSSProperties] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var interactiveChild: js.UndefOr[Boolean] = js.undefined
  var mutableProps: js.UndefOr[Boolean] = js.undefined
  var nonContainedChild: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Element, Event_], /* clickType */ ClickType, Unit]
  ] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onStateChange: js.UndefOr[js.Function1[/* arg0 */ AnonEvent, Unit]] = js.undefined
  var onTapFour: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onTapThree: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onTapTwo: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var refDOMNode: js.UndefOr[js.Function1[/* node */ js.Any, _]] = js.undefined
  var setStateCallback: js.UndefOr[js.Function1[/* arg0 */ AnonNextState, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var styleProperty: js.UndefOr[js.Object] = js.undefined
  var tapTimeCutoff: js.UndefOr[Double] = js.undefined
  var touchActiveTapOnly: js.UndefOr[Boolean] = js.undefined
  var wrapperClassName: js.UndefOr[String] = js.undefined
  var wrapperStyle: js.UndefOr[CSSProperties] = js.undefined
}

object AnonArg0 {
  @scala.inline
  def apply(
    as: js.Any,
    className: String = null,
    extraTouchNoTap: js.UndefOr[Boolean] = js.undefined,
    focusToggleOff: js.UndefOr[Boolean] = js.undefined,
    forceState: State = null,
    hover: CSSProperties = null,
    initialState: State = null,
    interactiveChild: js.UndefOr[Boolean] = js.undefined,
    mutableProps: js.UndefOr[Boolean] = js.undefined,
    nonContainedChild: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ SyntheticEvent[Element, Event_], /* clickType */ ClickType) => Unit = null,
    onLongPress: /* event */ Event_ => Unit = null,
    onStateChange: /* arg0 */ AnonEvent => Unit = null,
    onTapFour: /* event */ Event_ => Unit = null,
    onTapThree: /* event */ Event_ => Unit = null,
    onTapTwo: /* event */ Event_ => Unit = null,
    refDOMNode: /* node */ js.Any => _ = null,
    setStateCallback: /* arg0 */ AnonNextState => Unit = null,
    style: CSSProperties = null,
    styleProperty: js.Object = null,
    tapTimeCutoff: Int | Double = null,
    touchActiveTapOnly: js.UndefOr[Boolean] = js.undefined,
    wrapperClassName: String = null,
    wrapperStyle: CSSProperties = null
  ): AnonArg0 = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(extraTouchNoTap)) __obj.updateDynamic("extraTouchNoTap")(extraTouchNoTap.asInstanceOf[js.Any])
    if (!js.isUndefined(focusToggleOff)) __obj.updateDynamic("focusToggleOff")(focusToggleOff.asInstanceOf[js.Any])
    if (forceState != null) __obj.updateDynamic("forceState")(forceState.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (!js.isUndefined(interactiveChild)) __obj.updateDynamic("interactiveChild")(interactiveChild.asInstanceOf[js.Any])
    if (!js.isUndefined(mutableProps)) __obj.updateDynamic("mutableProps")(mutableProps.asInstanceOf[js.Any])
    if (!js.isUndefined(nonContainedChild)) __obj.updateDynamic("nonContainedChild")(nonContainedChild.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (onTapFour != null) __obj.updateDynamic("onTapFour")(js.Any.fromFunction1(onTapFour))
    if (onTapThree != null) __obj.updateDynamic("onTapThree")(js.Any.fromFunction1(onTapThree))
    if (onTapTwo != null) __obj.updateDynamic("onTapTwo")(js.Any.fromFunction1(onTapTwo))
    if (refDOMNode != null) __obj.updateDynamic("refDOMNode")(js.Any.fromFunction1(refDOMNode))
    if (setStateCallback != null) __obj.updateDynamic("setStateCallback")(js.Any.fromFunction1(setStateCallback))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styleProperty != null) __obj.updateDynamic("styleProperty")(styleProperty.asInstanceOf[js.Any])
    if (tapTimeCutoff != null) __obj.updateDynamic("tapTimeCutoff")(tapTimeCutoff.asInstanceOf[js.Any])
    if (!js.isUndefined(touchActiveTapOnly)) __obj.updateDynamic("touchActiveTapOnly")(touchActiveTapOnly.asInstanceOf[js.Any])
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArg0]
  }
}

