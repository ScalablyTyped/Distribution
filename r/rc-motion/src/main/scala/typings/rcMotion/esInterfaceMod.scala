package typings.rcMotion

import typings.rcMotion.anon.AnimationEventdeadlineboo
import typings.rcMotion.anon.TransitionEventdeadlinebo
import typings.react.mod.CSSProperties
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  @JSImport("rc-motion/es/interface", "STATUS_APPEAR")
  @js.native
  val STATUS_APPEAR: "appear" = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_ENTER")
  @js.native
  val STATUS_ENTER: "enter" = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_LEAVE")
  @js.native
  val STATUS_LEAVE: "leave" = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_NONE")
  @js.native
  val STATUS_NONE: "none" = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_ACTIVATED")
  @js.native
  val STEP_ACTIVATED: "end" = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_ACTIVE")
  @js.native
  val STEP_ACTIVE: "active" = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_NONE")
  @js.native
  val STEP_NONE: "none" = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_PREPARE")
  @js.native
  val STEP_PREPARE: "prepare" = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_START")
  @js.native
  val STEP_START: "start" = js.native
  
  type MotionEndEventHandler = js.Function2[/* element */ HTMLElement, /* event */ MotionEvent, Boolean | Unit]
  
  type MotionEvent = TransitionEventdeadlinebo | AnimationEventdeadlineboo
  
  type MotionEventHandler = js.Function2[/* element */ HTMLElement, /* event */ MotionEvent, CSSProperties | Unit]
  
  type MotionPrepareEventHandler = js.Function1[/* element */ HTMLElement, js.Promise[Any] | Unit]
  
  object MotionStatus {
    
    inline def appear: "appear" = "appear".asInstanceOf["appear"]
    
    inline def enter: "enter" = "enter".asInstanceOf["enter"]
    
    inline def leave: "leave" = "leave".asInstanceOf["leave"]
    
    inline def none: "none" = "none".asInstanceOf["none"]
  }
  type MotionStatus = "none" | "appear" | "enter" | "leave"
  
  object StepStatus {
    
    inline def active: "active" = "active".asInstanceOf["active"]
    
    inline def end: "end" = "end".asInstanceOf["end"]
    
    inline def none: "none" = "none".asInstanceOf["none"]
    
    inline def prepare: "prepare" = "prepare".asInstanceOf["prepare"]
    
    inline def start: "start" = "start".asInstanceOf["start"]
  }
  type StepStatus = "none" | "prepare" | "start" | "active" | "end"
}
