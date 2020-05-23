package typings.reactGamepad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Threshold below which the axis values will be rounded to 0.0 Default: 0.08
    */
  var deadZone: js.UndefOr[Double] = js.undefined
  /**
    * The index of the gamepad to use, from 0 to 4 Default: 0
    */
  var gamepadIndex: js.UndefOr[Double] = js.undefined
  /**
    * Layout to use, from Gamepad.layouts. For now, only Gamepad.layouts.XBOX exists Default: Gamepad.layouts.XBOX
    */
  var layout: js.UndefOr[Layout] = js.undefined
  /**
    * triggered when the A button is pressed.
    */
  var onA: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * triggered when an axis is changed.
    */
  var onAxisChange: js.UndefOr[
    js.Function3[/* axisName */ Axis, /* value */ Double, /* previousValue */ Double, Unit]
  ] = js.undefined
  /**
    * triggered when the B button is pressed.
    */
  var onB: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * triggered when a button is pushed or released.
    */
  var onButtonChange: js.UndefOr[js.Function2[/* buttonName */ Button, /* pressed */ Boolean, Unit]] = js.undefined
  /**
    * triggered when a button is pushed.
    */
  var onButtonDown: js.UndefOr[js.Function1[/* buttonName */ Button, Unit]] = js.undefined
  /**
    * triggered when a button is released.
    */
  var onButtonUp: js.UndefOr[js.Function1[/* buttonName */ Button, Unit]] = js.undefined
  /**
    * triggered when the gamepad connects. Will be Triggered at least once after the Gamepad component is mounted.
    */
  var onConnect: js.UndefOr[js.Function1[/* gamepadIndex */ Double, Unit]] = js.undefined
  /**
    * triggered when the gamepad disconnects.
    */
  var onDisconnect: js.UndefOr[js.Function1[/* gamepadIndex */ Double, Unit]] = js.undefined
  /**
    * Triggered when the D Pad Down button is pressed or the Left Stick is pushed down (above stickThreshold).
    */
  var onDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the LB button is pressed.
    */
  var onLB: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the LS button is pressed.
    */
  var onLS: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the LT button is pressed.
    */
  var onLT: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the D Pad Left button is pressed or the Left Stick is pushed left (above stickThreshold).
    */
  var onLeft: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the RB button is pressed.
    */
  var onRB: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the RS button is pressed.
    */
  var onRS: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the RT button is pressed.
    */
  var onRT: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the D Pad Right button is pressed or the Left Stick is pushed right (above stickThreshold).
    */
  var onRight: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the D Pad Up button is pressed or the Left Stick is pushed up (above stickThreshold).
    */
  var onUp: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * triggered when the X button is pressed.
    */
  var onX: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Triggered when the Y button is pressed.
    */
  var onY: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Threshold above which onUp, onDown,onLeft,onRight are Triggered for the left stick Default: 0.75
    */
  var stickThreshold: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    deadZone: js.UndefOr[Double] = js.undefined,
    gamepadIndex: js.UndefOr[Double] = js.undefined,
    layout: Layout = null,
    onA: () => Unit = null,
    onAxisChange: (/* axisName */ Axis, /* value */ Double, /* previousValue */ Double) => Unit = null,
    onB: () => Unit = null,
    onButtonChange: (/* buttonName */ Button, /* pressed */ Boolean) => Unit = null,
    onButtonDown: /* buttonName */ Button => Unit = null,
    onButtonUp: /* buttonName */ Button => Unit = null,
    onConnect: /* gamepadIndex */ Double => Unit = null,
    onDisconnect: /* gamepadIndex */ Double => Unit = null,
    onDown: () => Unit = null,
    onLB: () => Unit = null,
    onLS: () => Unit = null,
    onLT: () => Unit = null,
    onLeft: () => Unit = null,
    onRB: () => Unit = null,
    onRS: () => Unit = null,
    onRT: () => Unit = null,
    onRight: () => Unit = null,
    onUp: () => Unit = null,
    onX: () => Unit = null,
    onY: () => Unit = null,
    stickThreshold: js.UndefOr[Double] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deadZone)) __obj.updateDynamic("deadZone")(deadZone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gamepadIndex)) __obj.updateDynamic("gamepadIndex")(gamepadIndex.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (onA != null) __obj.updateDynamic("onA")(js.Any.fromFunction0(onA))
    if (onAxisChange != null) __obj.updateDynamic("onAxisChange")(js.Any.fromFunction3(onAxisChange))
    if (onB != null) __obj.updateDynamic("onB")(js.Any.fromFunction0(onB))
    if (onButtonChange != null) __obj.updateDynamic("onButtonChange")(js.Any.fromFunction2(onButtonChange))
    if (onButtonDown != null) __obj.updateDynamic("onButtonDown")(js.Any.fromFunction1(onButtonDown))
    if (onButtonUp != null) __obj.updateDynamic("onButtonUp")(js.Any.fromFunction1(onButtonUp))
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction1(onConnect))
    if (onDisconnect != null) __obj.updateDynamic("onDisconnect")(js.Any.fromFunction1(onDisconnect))
    if (onDown != null) __obj.updateDynamic("onDown")(js.Any.fromFunction0(onDown))
    if (onLB != null) __obj.updateDynamic("onLB")(js.Any.fromFunction0(onLB))
    if (onLS != null) __obj.updateDynamic("onLS")(js.Any.fromFunction0(onLS))
    if (onLT != null) __obj.updateDynamic("onLT")(js.Any.fromFunction0(onLT))
    if (onLeft != null) __obj.updateDynamic("onLeft")(js.Any.fromFunction0(onLeft))
    if (onRB != null) __obj.updateDynamic("onRB")(js.Any.fromFunction0(onRB))
    if (onRS != null) __obj.updateDynamic("onRS")(js.Any.fromFunction0(onRS))
    if (onRT != null) __obj.updateDynamic("onRT")(js.Any.fromFunction0(onRT))
    if (onRight != null) __obj.updateDynamic("onRight")(js.Any.fromFunction0(onRight))
    if (onUp != null) __obj.updateDynamic("onUp")(js.Any.fromFunction0(onUp))
    if (onX != null) __obj.updateDynamic("onX")(js.Any.fromFunction0(onX))
    if (onY != null) __obj.updateDynamic("onY")(js.Any.fromFunction0(onY))
    if (!js.isUndefined(stickThreshold)) __obj.updateDynamic("stickThreshold")(stickThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

