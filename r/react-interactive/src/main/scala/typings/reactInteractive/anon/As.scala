package typings.reactInteractive.anon

import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.reactInteractive.mod.ClickType
import typings.reactInteractive.mod.State
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait As extends js.Object {
  // as: string | Component | ReactElement;
  var as: js.Any = js.native
  var className: js.UndefOr[String] = js.native
  var extraTouchNoTap: js.UndefOr[Boolean] = js.native
   // Not sure about this type
  var focusToggleOff: js.UndefOr[Boolean] = js.native
  var forceState: js.UndefOr[State] = js.native
  var hover: js.UndefOr[CSSProperties] = js.native
  var initialState: js.UndefOr[State] = js.native
  var interactiveChild: js.UndefOr[Boolean] = js.native
  var mutableProps: js.UndefOr[Boolean] = js.native
  var nonContainedChild: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ SyntheticEvent[Element, typings.std.Event], 
      /* clickType */ ClickType, 
      Unit
    ]
  ] = js.native
  var onLongPress: js.UndefOr[js.Function1[/* event */ typings.std.Event, Unit]] = js.native
  var onStateChange: js.UndefOr[js.Function1[/* arg0 */ Event, Unit]] = js.native
  var onTapFour: js.UndefOr[js.Function1[/* event */ typings.std.Event, Unit]] = js.native
  var onTapThree: js.UndefOr[js.Function1[/* event */ typings.std.Event, Unit]] = js.native
  var onTapTwo: js.UndefOr[js.Function1[/* event */ typings.std.Event, Unit]] = js.native
  var refDOMNode: js.UndefOr[js.Function1[/* node */ js.Any, _]] = js.native
  var setStateCallback: js.UndefOr[js.Function1[/* arg0 */ NextState, Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var styleProperty: js.UndefOr[js.Object] = js.native
  var tapTimeCutoff: js.UndefOr[Double] = js.native
  var touchActiveTapOnly: js.UndefOr[Boolean] = js.native
  var wrapperClassName: js.UndefOr[String] = js.native
  var wrapperStyle: js.UndefOr[CSSProperties] = js.native
}

object As {
  @scala.inline
  def apply(as: js.Any): As = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[As]
  }
  @scala.inline
  implicit class AsOps[Self <: As] (val x: Self) extends AnyVal {
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setExtraTouchNoTap(value: Boolean): Self = this.set("extraTouchNoTap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraTouchNoTap: Self = this.set("extraTouchNoTap", js.undefined)
    @scala.inline
    def setFocusToggleOff(value: Boolean): Self = this.set("focusToggleOff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusToggleOff: Self = this.set("focusToggleOff", js.undefined)
    @scala.inline
    def setForceState(value: State): Self = this.set("forceState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceState: Self = this.set("forceState", js.undefined)
    @scala.inline
    def setHover(value: CSSProperties): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setInitialState(value: State): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setInteractiveChild(value: Boolean): Self = this.set("interactiveChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractiveChild: Self = this.set("interactiveChild", js.undefined)
    @scala.inline
    def setMutableProps(value: Boolean): Self = this.set("mutableProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutableProps: Self = this.set("mutableProps", js.undefined)
    @scala.inline
    def setNonContainedChild(value: Boolean): Self = this.set("nonContainedChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonContainedChild: Self = this.set("nonContainedChild", js.undefined)
    @scala.inline
    def setOnClick(value: (/* event */ SyntheticEvent[Element, typings.std.Event], /* clickType */ ClickType) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnLongPress(value: /* event */ typings.std.Event => Unit): Self = this.set("onLongPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    @scala.inline
    def setOnStateChange(value: /* arg0 */ Event => Unit): Self = this.set("onStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
    @scala.inline
    def setOnTapFour(value: /* event */ typings.std.Event => Unit): Self = this.set("onTapFour", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTapFour: Self = this.set("onTapFour", js.undefined)
    @scala.inline
    def setOnTapThree(value: /* event */ typings.std.Event => Unit): Self = this.set("onTapThree", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTapThree: Self = this.set("onTapThree", js.undefined)
    @scala.inline
    def setOnTapTwo(value: /* event */ typings.std.Event => Unit): Self = this.set("onTapTwo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTapTwo: Self = this.set("onTapTwo", js.undefined)
    @scala.inline
    def setRefDOMNode(value: /* node */ js.Any => _): Self = this.set("refDOMNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRefDOMNode: Self = this.set("refDOMNode", js.undefined)
    @scala.inline
    def setSetStateCallback(value: /* arg0 */ NextState => Unit): Self = this.set("setStateCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStateCallback: Self = this.set("setStateCallback", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleProperty(value: js.Object): Self = this.set("styleProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleProperty: Self = this.set("styleProperty", js.undefined)
    @scala.inline
    def setTapTimeCutoff(value: Double): Self = this.set("tapTimeCutoff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapTimeCutoff: Self = this.set("tapTimeCutoff", js.undefined)
    @scala.inline
    def setTouchActiveTapOnly(value: Boolean): Self = this.set("touchActiveTapOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchActiveTapOnly: Self = this.set("touchActiveTapOnly", js.undefined)
    @scala.inline
    def setWrapperClassName(value: String): Self = this.set("wrapperClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperClassName: Self = this.set("wrapperClassName", js.undefined)
    @scala.inline
    def setWrapperStyle(value: CSSProperties): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
  }
  
}

