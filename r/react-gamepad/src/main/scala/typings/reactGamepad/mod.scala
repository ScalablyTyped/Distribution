package typings.reactGamepad

import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-gamepad", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  object default {
    
    /* static member */
    /* was `typeof layouts` */
    object layouts {
      
      @JSImport("react-gamepad", "default.layouts")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-gamepad", "default.layouts.XBOX")
      @js.native
      def XBOX: Layout = js.native
      inline def XBOX_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XBOX")(x.asInstanceOf[js.Any])
    }
  }
  
  object layouts {
    
    @JSImport("react-gamepad", "layouts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-gamepad", "layouts.XBOX")
    @js.native
    def XBOX: Layout = js.native
    inline def XBOX_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XBOX")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGamepad.reactGamepadStrings.LeftStickX
    - typings.reactGamepad.reactGamepadStrings.LeftStickY
    - typings.reactGamepad.reactGamepadStrings.RightStickX
    - typings.reactGamepad.reactGamepadStrings.RightStickY
    - typings.reactGamepad.reactGamepadStrings.LeftTrigger
    - typings.reactGamepad.reactGamepadStrings.RightTrigger
  */
  trait Axis extends StObject
  object Axis {
    
    inline def LeftStickX: typings.reactGamepad.reactGamepadStrings.LeftStickX = "LeftStickX".asInstanceOf[typings.reactGamepad.reactGamepadStrings.LeftStickX]
    
    inline def LeftStickY: typings.reactGamepad.reactGamepadStrings.LeftStickY = "LeftStickY".asInstanceOf[typings.reactGamepad.reactGamepadStrings.LeftStickY]
    
    inline def LeftTrigger: typings.reactGamepad.reactGamepadStrings.LeftTrigger = "LeftTrigger".asInstanceOf[typings.reactGamepad.reactGamepadStrings.LeftTrigger]
    
    inline def RightStickX: typings.reactGamepad.reactGamepadStrings.RightStickX = "RightStickX".asInstanceOf[typings.reactGamepad.reactGamepadStrings.RightStickX]
    
    inline def RightStickY: typings.reactGamepad.reactGamepadStrings.RightStickY = "RightStickY".asInstanceOf[typings.reactGamepad.reactGamepadStrings.RightStickY]
    
    inline def RightTrigger: typings.reactGamepad.reactGamepadStrings.RightTrigger = "RightTrigger".asInstanceOf[typings.reactGamepad.reactGamepadStrings.RightTrigger]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGamepad.reactGamepadStrings.A
    - typings.reactGamepad.reactGamepadStrings.B
    - typings.reactGamepad.reactGamepadStrings.X
    - typings.reactGamepad.reactGamepadStrings.Y
    - typings.reactGamepad.reactGamepadStrings.Start
    - typings.reactGamepad.reactGamepadStrings.Back
    - typings.reactGamepad.reactGamepadStrings.LT
    - typings.reactGamepad.reactGamepadStrings.RT
    - typings.reactGamepad.reactGamepadStrings.LB
    - typings.reactGamepad.reactGamepadStrings.RB
    - typings.reactGamepad.reactGamepadStrings.LS
    - typings.reactGamepad.reactGamepadStrings.RS
    - typings.reactGamepad.reactGamepadStrings.DPadUp
    - typings.reactGamepad.reactGamepadStrings.DPadDown
    - typings.reactGamepad.reactGamepadStrings.DPadLeft
    - typings.reactGamepad.reactGamepadStrings.DPadRight
  */
  trait Button extends StObject
  object Button {
    
    inline def A: typings.reactGamepad.reactGamepadStrings.A = "A".asInstanceOf[typings.reactGamepad.reactGamepadStrings.A]
    
    inline def B: typings.reactGamepad.reactGamepadStrings.B = "B".asInstanceOf[typings.reactGamepad.reactGamepadStrings.B]
    
    inline def Back: typings.reactGamepad.reactGamepadStrings.Back = "Back".asInstanceOf[typings.reactGamepad.reactGamepadStrings.Back]
    
    inline def DPadDown: typings.reactGamepad.reactGamepadStrings.DPadDown = "DPadDown".asInstanceOf[typings.reactGamepad.reactGamepadStrings.DPadDown]
    
    inline def DPadLeft: typings.reactGamepad.reactGamepadStrings.DPadLeft = "DPadLeft".asInstanceOf[typings.reactGamepad.reactGamepadStrings.DPadLeft]
    
    inline def DPadRight: typings.reactGamepad.reactGamepadStrings.DPadRight = "DPadRight".asInstanceOf[typings.reactGamepad.reactGamepadStrings.DPadRight]
    
    inline def DPadUp: typings.reactGamepad.reactGamepadStrings.DPadUp = "DPadUp".asInstanceOf[typings.reactGamepad.reactGamepadStrings.DPadUp]
    
    inline def LB: typings.reactGamepad.reactGamepadStrings.LB = "LB".asInstanceOf[typings.reactGamepad.reactGamepadStrings.LB]
    
    inline def LS: typings.reactGamepad.reactGamepadStrings.LS = "LS".asInstanceOf[typings.reactGamepad.reactGamepadStrings.LS]
    
    inline def LT: typings.reactGamepad.reactGamepadStrings.LT = "LT".asInstanceOf[typings.reactGamepad.reactGamepadStrings.LT]
    
    inline def RB: typings.reactGamepad.reactGamepadStrings.RB = "RB".asInstanceOf[typings.reactGamepad.reactGamepadStrings.RB]
    
    inline def RS: typings.reactGamepad.reactGamepadStrings.RS = "RS".asInstanceOf[typings.reactGamepad.reactGamepadStrings.RS]
    
    inline def RT: typings.reactGamepad.reactGamepadStrings.RT = "RT".asInstanceOf[typings.reactGamepad.reactGamepadStrings.RT]
    
    inline def Start: typings.reactGamepad.reactGamepadStrings.Start = "Start".asInstanceOf[typings.reactGamepad.reactGamepadStrings.Start]
    
    inline def X: typings.reactGamepad.reactGamepadStrings.X = "X".asInstanceOf[typings.reactGamepad.reactGamepadStrings.X]
    
    inline def Y: typings.reactGamepad.reactGamepadStrings.Y = "Y".asInstanceOf[typings.reactGamepad.reactGamepadStrings.Y]
  }
  
  type Gamepad = Component[Props, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGamepad.reactGamepadStrings.`-LeftStickX`
    - typings.reactGamepad.reactGamepadStrings.`-LeftStickY`
    - typings.reactGamepad.reactGamepadStrings.`-RightStickX`
    - typings.reactGamepad.reactGamepadStrings.`-RightStickY`
    - typings.reactGamepad.reactGamepadStrings.`-LeftTrigger`
    - typings.reactGamepad.reactGamepadStrings.`-RightTrigger`
  */
  trait InvertedAxis extends StObject
  object InvertedAxis {
    
    inline def `-LeftStickX`: typings.reactGamepad.reactGamepadStrings.`-LeftStickX` = "-LeftStickX".asInstanceOf[typings.reactGamepad.reactGamepadStrings.`-LeftStickX`]
    
    inline def `-LeftStickY`: typings.reactGamepad.reactGamepadStrings.`-LeftStickY` = "-LeftStickY".asInstanceOf[typings.reactGamepad.reactGamepadStrings.`-LeftStickY`]
    
    inline def `-LeftTrigger`: typings.reactGamepad.reactGamepadStrings.`-LeftTrigger` = "-LeftTrigger".asInstanceOf[typings.reactGamepad.reactGamepadStrings.`-LeftTrigger`]
    
    inline def `-RightStickX`: typings.reactGamepad.reactGamepadStrings.`-RightStickX` = "-RightStickX".asInstanceOf[typings.reactGamepad.reactGamepadStrings.`-RightStickX`]
    
    inline def `-RightStickY`: typings.reactGamepad.reactGamepadStrings.`-RightStickY` = "-RightStickY".asInstanceOf[typings.reactGamepad.reactGamepadStrings.`-RightStickY`]
    
    inline def `-RightTrigger`: typings.reactGamepad.reactGamepadStrings.`-RightTrigger` = "-RightTrigger".asInstanceOf[typings.reactGamepad.reactGamepadStrings.`-RightTrigger`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGamepad.reactGamepadStrings.LeftStickX
    - typings.reactGamepad.reactGamepadStrings.LeftStickY
    - typings.reactGamepad.reactGamepadStrings.RightStickX
    - typings.reactGamepad.reactGamepadStrings.RightStickY
    - typings.reactGamepad.reactGamepadStrings.LeftTrigger
    - typings.reactGamepad.reactGamepadStrings.RightTrigger
    - typings.reactGamepad.reactGamepadStrings.`-LeftStickX`
    - typings.reactGamepad.reactGamepadStrings.`-LeftStickY`
    - typings.reactGamepad.reactGamepadStrings.`-RightStickX`
    - typings.reactGamepad.reactGamepadStrings.`-RightStickY`
    - typings.reactGamepad.reactGamepadStrings.`-LeftTrigger`
    - typings.reactGamepad.reactGamepadStrings.`-RightTrigger`
  */
  trait InvertibleAxis extends StObject
  object InvertibleAxis {
    
    inline def `-LeftStickX`: typings.reactGamepad.reactGamepadStrings.`-LeftStickX` = "-LeftStickX".asInstanceOf[typings.reactGamepad.reactGamepadStrings.`-LeftStickX`]
    
    inline def `-LeftStickY`: typings.reactGamepad.reactGamepadStrings.`-LeftStickY` = "-LeftStickY".asInstanceOf[typings.reactGamepad.reactGamepadStrings.`-LeftStickY`]
    
    inline def `-LeftTrigger`: typings.reactGamepad.reactGamepadStrings.`-LeftTrigger` = "-LeftTrigger".asInstanceOf[typings.reactGamepad.reactGamepadStrings.`-LeftTrigger`]
    
    inline def `-RightStickX`: typings.reactGamepad.reactGamepadStrings.`-RightStickX` = "-RightStickX".asInstanceOf[typings.reactGamepad.reactGamepadStrings.`-RightStickX`]
    
    inline def `-RightStickY`: typings.reactGamepad.reactGamepadStrings.`-RightStickY` = "-RightStickY".asInstanceOf[typings.reactGamepad.reactGamepadStrings.`-RightStickY`]
    
    inline def `-RightTrigger`: typings.reactGamepad.reactGamepadStrings.`-RightTrigger` = "-RightTrigger".asInstanceOf[typings.reactGamepad.reactGamepadStrings.`-RightTrigger`]
    
    inline def LeftStickX: typings.reactGamepad.reactGamepadStrings.LeftStickX = "LeftStickX".asInstanceOf[typings.reactGamepad.reactGamepadStrings.LeftStickX]
    
    inline def LeftStickY: typings.reactGamepad.reactGamepadStrings.LeftStickY = "LeftStickY".asInstanceOf[typings.reactGamepad.reactGamepadStrings.LeftStickY]
    
    inline def LeftTrigger: typings.reactGamepad.reactGamepadStrings.LeftTrigger = "LeftTrigger".asInstanceOf[typings.reactGamepad.reactGamepadStrings.LeftTrigger]
    
    inline def RightStickX: typings.reactGamepad.reactGamepadStrings.RightStickX = "RightStickX".asInstanceOf[typings.reactGamepad.reactGamepadStrings.RightStickX]
    
    inline def RightStickY: typings.reactGamepad.reactGamepadStrings.RightStickY = "RightStickY".asInstanceOf[typings.reactGamepad.reactGamepadStrings.RightStickY]
    
    inline def RightTrigger: typings.reactGamepad.reactGamepadStrings.RightTrigger = "RightTrigger".asInstanceOf[typings.reactGamepad.reactGamepadStrings.RightTrigger]
  }
  
  trait Layout extends StObject {
    
    var axis: js.Array[InvertibleAxis | Null]
    
    var buttonAxis: js.Array[InvertibleAxis | Null]
    
    var buttons: js.Array[Button | Null]
  }
  object Layout {
    
    inline def apply(
      axis: js.Array[InvertibleAxis | Null],
      buttonAxis: js.Array[InvertibleAxis | Null],
      buttons: js.Array[Button | Null]
    ): Layout = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], buttonAxis = buttonAxis.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
      
      inline def setAxis(value: js.Array[InvertibleAxis | Null]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisVarargs(value: (InvertibleAxis | Null)*): Self = StObject.set(x, "axis", js.Array(value*))
      
      inline def setButtonAxis(value: js.Array[InvertibleAxis | Null]): Self = StObject.set(x, "buttonAxis", value.asInstanceOf[js.Any])
      
      inline def setButtonAxisVarargs(value: (InvertibleAxis | Null)*): Self = StObject.set(x, "buttonAxis", js.Array(value*))
      
      inline def setButtons(value: js.Array[Button | Null]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsVarargs(value: (Button | Null)*): Self = StObject.set(x, "buttons", js.Array(value*))
    }
  }
  
  trait Props extends StObject {
    
    var children: ReactElement
    
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
      * Triggered when the Back button is pressed.
      */
    var onBack: js.UndefOr[js.Function0[Unit]] = js.undefined
    
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
      * Triggered when the Start button is pressed.
      */
    var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
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
    
    inline def apply(children: ReactElement): Props = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setDeadZone(value: Double): Self = StObject.set(x, "deadZone", value.asInstanceOf[js.Any])
      
      inline def setDeadZoneUndefined: Self = StObject.set(x, "deadZone", js.undefined)
      
      inline def setGamepadIndex(value: Double): Self = StObject.set(x, "gamepadIndex", value.asInstanceOf[js.Any])
      
      inline def setGamepadIndexUndefined: Self = StObject.set(x, "gamepadIndex", js.undefined)
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setOnA(value: () => Unit): Self = StObject.set(x, "onA", js.Any.fromFunction0(value))
      
      inline def setOnAUndefined: Self = StObject.set(x, "onA", js.undefined)
      
      inline def setOnAxisChange(value: (/* axisName */ Axis, /* value */ Double, /* previousValue */ Double) => Unit): Self = StObject.set(x, "onAxisChange", js.Any.fromFunction3(value))
      
      inline def setOnAxisChangeUndefined: Self = StObject.set(x, "onAxisChange", js.undefined)
      
      inline def setOnB(value: () => Unit): Self = StObject.set(x, "onB", js.Any.fromFunction0(value))
      
      inline def setOnBUndefined: Self = StObject.set(x, "onB", js.undefined)
      
      inline def setOnBack(value: () => Unit): Self = StObject.set(x, "onBack", js.Any.fromFunction0(value))
      
      inline def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
      
      inline def setOnButtonChange(value: (/* buttonName */ Button, /* pressed */ Boolean) => Unit): Self = StObject.set(x, "onButtonChange", js.Any.fromFunction2(value))
      
      inline def setOnButtonChangeUndefined: Self = StObject.set(x, "onButtonChange", js.undefined)
      
      inline def setOnButtonDown(value: /* buttonName */ Button => Unit): Self = StObject.set(x, "onButtonDown", js.Any.fromFunction1(value))
      
      inline def setOnButtonDownUndefined: Self = StObject.set(x, "onButtonDown", js.undefined)
      
      inline def setOnButtonUp(value: /* buttonName */ Button => Unit): Self = StObject.set(x, "onButtonUp", js.Any.fromFunction1(value))
      
      inline def setOnButtonUpUndefined: Self = StObject.set(x, "onButtonUp", js.undefined)
      
      inline def setOnConnect(value: /* gamepadIndex */ Double => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction1(value))
      
      inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      inline def setOnDisconnect(value: /* gamepadIndex */ Double => Unit): Self = StObject.set(x, "onDisconnect", js.Any.fromFunction1(value))
      
      inline def setOnDisconnectUndefined: Self = StObject.set(x, "onDisconnect", js.undefined)
      
      inline def setOnDown(value: () => Unit): Self = StObject.set(x, "onDown", js.Any.fromFunction0(value))
      
      inline def setOnDownUndefined: Self = StObject.set(x, "onDown", js.undefined)
      
      inline def setOnLB(value: () => Unit): Self = StObject.set(x, "onLB", js.Any.fromFunction0(value))
      
      inline def setOnLBUndefined: Self = StObject.set(x, "onLB", js.undefined)
      
      inline def setOnLS(value: () => Unit): Self = StObject.set(x, "onLS", js.Any.fromFunction0(value))
      
      inline def setOnLSUndefined: Self = StObject.set(x, "onLS", js.undefined)
      
      inline def setOnLT(value: () => Unit): Self = StObject.set(x, "onLT", js.Any.fromFunction0(value))
      
      inline def setOnLTUndefined: Self = StObject.set(x, "onLT", js.undefined)
      
      inline def setOnLeft(value: () => Unit): Self = StObject.set(x, "onLeft", js.Any.fromFunction0(value))
      
      inline def setOnLeftUndefined: Self = StObject.set(x, "onLeft", js.undefined)
      
      inline def setOnRB(value: () => Unit): Self = StObject.set(x, "onRB", js.Any.fromFunction0(value))
      
      inline def setOnRBUndefined: Self = StObject.set(x, "onRB", js.undefined)
      
      inline def setOnRS(value: () => Unit): Self = StObject.set(x, "onRS", js.Any.fromFunction0(value))
      
      inline def setOnRSUndefined: Self = StObject.set(x, "onRS", js.undefined)
      
      inline def setOnRT(value: () => Unit): Self = StObject.set(x, "onRT", js.Any.fromFunction0(value))
      
      inline def setOnRTUndefined: Self = StObject.set(x, "onRT", js.undefined)
      
      inline def setOnRight(value: () => Unit): Self = StObject.set(x, "onRight", js.Any.fromFunction0(value))
      
      inline def setOnRightUndefined: Self = StObject.set(x, "onRight", js.undefined)
      
      inline def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnUp(value: () => Unit): Self = StObject.set(x, "onUp", js.Any.fromFunction0(value))
      
      inline def setOnUpUndefined: Self = StObject.set(x, "onUp", js.undefined)
      
      inline def setOnX(value: () => Unit): Self = StObject.set(x, "onX", js.Any.fromFunction0(value))
      
      inline def setOnXUndefined: Self = StObject.set(x, "onX", js.undefined)
      
      inline def setOnY(value: () => Unit): Self = StObject.set(x, "onY", js.Any.fromFunction0(value))
      
      inline def setOnYUndefined: Self = StObject.set(x, "onY", js.undefined)
      
      inline def setStickThreshold(value: Double): Self = StObject.set(x, "stickThreshold", value.asInstanceOf[js.Any])
      
      inline def setStickThresholdUndefined: Self = StObject.set(x, "stickThreshold", js.undefined)
    }
  }
}
