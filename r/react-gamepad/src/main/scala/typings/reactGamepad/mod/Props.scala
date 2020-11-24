package typings.reactGamepad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  /**
    * Threshold below which the axis values will be rounded to 0.0 Default: 0.08
    */
  var deadZone: js.UndefOr[Double] = js.native
  
  /**
    * The index of the gamepad to use, from 0 to 4 Default: 0
    */
  var gamepadIndex: js.UndefOr[Double] = js.native
  
  /**
    * Layout to use, from Gamepad.layouts. For now, only Gamepad.layouts.XBOX exists Default: Gamepad.layouts.XBOX
    */
  var layout: js.UndefOr[Layout] = js.native
  
  /**
    * triggered when the A button is pressed.
    */
  var onA: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * triggered when an axis is changed.
    */
  var onAxisChange: js.UndefOr[
    js.Function3[/* axisName */ Axis, /* value */ Double, /* previousValue */ Double, Unit]
  ] = js.native
  
  /**
    * triggered when the B button is pressed.
    */
  var onB: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * triggered when a button is pushed or released.
    */
  var onButtonChange: js.UndefOr[js.Function2[/* buttonName */ Button, /* pressed */ Boolean, Unit]] = js.native
  
  /**
    * triggered when a button is pushed.
    */
  var onButtonDown: js.UndefOr[js.Function1[/* buttonName */ Button, Unit]] = js.native
  
  /**
    * triggered when a button is released.
    */
  var onButtonUp: js.UndefOr[js.Function1[/* buttonName */ Button, Unit]] = js.native
  
  /**
    * triggered when the gamepad connects. Will be Triggered at least once after the Gamepad component is mounted.
    */
  var onConnect: js.UndefOr[js.Function1[/* gamepadIndex */ Double, Unit]] = js.native
  
  /**
    * triggered when the gamepad disconnects.
    */
  var onDisconnect: js.UndefOr[js.Function1[/* gamepadIndex */ Double, Unit]] = js.native
  
  /**
    * Triggered when the D Pad Down button is pressed or the Left Stick is pushed down (above stickThreshold).
    */
  var onDown: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Triggered when the LB button is pressed.
    */
  var onLB: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Triggered when the LS button is pressed.
    */
  var onLS: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Triggered when the LT button is pressed.
    */
  var onLT: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Triggered when the D Pad Left button is pressed or the Left Stick is pushed left (above stickThreshold).
    */
  var onLeft: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Triggered when the RB button is pressed.
    */
  var onRB: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Triggered when the RS button is pressed.
    */
  var onRS: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Triggered when the RT button is pressed.
    */
  var onRT: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Triggered when the D Pad Right button is pressed or the Left Stick is pushed right (above stickThreshold).
    */
  var onRight: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Triggered when the D Pad Up button is pressed or the Left Stick is pushed up (above stickThreshold).
    */
  var onUp: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * triggered when the X button is pressed.
    */
  var onX: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Triggered when the Y button is pressed.
    */
  var onY: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Threshold above which onUp, onDown,onLeft,onRight are Triggered for the left stick Default: 0.75
    */
  var stickThreshold: js.UndefOr[Double] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setDeadZone(value: Double): Self = this.set("deadZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadZone: Self = this.set("deadZone", js.undefined)
    
    @scala.inline
    def setGamepadIndex(value: Double): Self = this.set("gamepadIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGamepadIndex: Self = this.set("gamepadIndex", js.undefined)
    
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setOnA(value: () => Unit): Self = this.set("onA", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnA: Self = this.set("onA", js.undefined)
    
    @scala.inline
    def setOnAxisChange(value: (/* axisName */ Axis, /* value */ Double, /* previousValue */ Double) => Unit): Self = this.set("onAxisChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnAxisChange: Self = this.set("onAxisChange", js.undefined)
    
    @scala.inline
    def setOnB(value: () => Unit): Self = this.set("onB", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnB: Self = this.set("onB", js.undefined)
    
    @scala.inline
    def setOnButtonChange(value: (/* buttonName */ Button, /* pressed */ Boolean) => Unit): Self = this.set("onButtonChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnButtonChange: Self = this.set("onButtonChange", js.undefined)
    
    @scala.inline
    def setOnButtonDown(value: /* buttonName */ Button => Unit): Self = this.set("onButtonDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnButtonDown: Self = this.set("onButtonDown", js.undefined)
    
    @scala.inline
    def setOnButtonUp(value: /* buttonName */ Button => Unit): Self = this.set("onButtonUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnButtonUp: Self = this.set("onButtonUp", js.undefined)
    
    @scala.inline
    def setOnConnect(value: /* gamepadIndex */ Double => Unit): Self = this.set("onConnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnConnect: Self = this.set("onConnect", js.undefined)
    
    @scala.inline
    def setOnDisconnect(value: /* gamepadIndex */ Double => Unit): Self = this.set("onDisconnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDisconnect: Self = this.set("onDisconnect", js.undefined)
    
    @scala.inline
    def setOnDown(value: () => Unit): Self = this.set("onDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDown: Self = this.set("onDown", js.undefined)
    
    @scala.inline
    def setOnLB(value: () => Unit): Self = this.set("onLB", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLB: Self = this.set("onLB", js.undefined)
    
    @scala.inline
    def setOnLS(value: () => Unit): Self = this.set("onLS", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLS: Self = this.set("onLS", js.undefined)
    
    @scala.inline
    def setOnLT(value: () => Unit): Self = this.set("onLT", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLT: Self = this.set("onLT", js.undefined)
    
    @scala.inline
    def setOnLeft(value: () => Unit): Self = this.set("onLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLeft: Self = this.set("onLeft", js.undefined)
    
    @scala.inline
    def setOnRB(value: () => Unit): Self = this.set("onRB", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRB: Self = this.set("onRB", js.undefined)
    
    @scala.inline
    def setOnRS(value: () => Unit): Self = this.set("onRS", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRS: Self = this.set("onRS", js.undefined)
    
    @scala.inline
    def setOnRT(value: () => Unit): Self = this.set("onRT", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRT: Self = this.set("onRT", js.undefined)
    
    @scala.inline
    def setOnRight(value: () => Unit): Self = this.set("onRight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRight: Self = this.set("onRight", js.undefined)
    
    @scala.inline
    def setOnUp(value: () => Unit): Self = this.set("onUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnUp: Self = this.set("onUp", js.undefined)
    
    @scala.inline
    def setOnX(value: () => Unit): Self = this.set("onX", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnX: Self = this.set("onX", js.undefined)
    
    @scala.inline
    def setOnY(value: () => Unit): Self = this.set("onY", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnY: Self = this.set("onY", js.undefined)
    
    @scala.inline
    def setStickThreshold(value: Double): Self = this.set("stickThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickThreshold: Self = this.set("stickThreshold", js.undefined)
  }
}
