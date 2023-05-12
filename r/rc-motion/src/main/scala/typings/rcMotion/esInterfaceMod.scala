package typings.rcMotion

import typings.rcMotion.rcMotionStrings.active
import typings.rcMotion.rcMotionStrings.appear
import typings.rcMotion.rcMotionStrings.end
import typings.rcMotion.rcMotionStrings.enter
import typings.rcMotion.rcMotionStrings.leave
import typings.rcMotion.rcMotionStrings.none
import typings.rcMotion.rcMotionStrings.prepare
import typings.rcMotion.rcMotionStrings.prepared
import typings.rcMotion.rcMotionStrings.start
import typings.react.mod.CSSProperties
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  @JSImport("rc-motion/es/interface", "STATUS_APPEAR")
  @js.native
  val STATUS_APPEAR: appear = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_ENTER")
  @js.native
  val STATUS_ENTER: enter = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_LEAVE")
  @js.native
  val STATUS_LEAVE: leave = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_NONE")
  @js.native
  val STATUS_NONE: none = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_ACTIVATED")
  @js.native
  val STEP_ACTIVATED: end = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_ACTIVE")
  @js.native
  val STEP_ACTIVE: active = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_NONE")
  @js.native
  val STEP_NONE: none = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_PREPARE")
  @js.native
  val STEP_PREPARE: prepare = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_PREPARED")
  @js.native
  val STEP_PREPARED: prepared = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_START")
  @js.native
  val STEP_START: start = js.native
  
  type MotionEndEventHandler = js.Function2[/* element */ HTMLElement, /* event */ MotionEvent, Boolean | Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcMotion.anon.TransitionEventdeadlinebo
    - typings.rcMotion.anon.AnimationEventdeadlineboo
  */
  trait MotionEvent extends StObject
  
  type MotionEventHandler = js.Function2[/* element */ HTMLElement, /* event */ MotionEvent, CSSProperties | Unit]
  
  type MotionPrepareEventHandler = js.Function1[/* element */ HTMLElement, js.Promise[Any] | Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcMotion.rcMotionStrings.none
    - typings.rcMotion.rcMotionStrings.appear
    - typings.rcMotion.rcMotionStrings.enter
    - typings.rcMotion.rcMotionStrings.leave
  */
  trait MotionStatus extends StObject
  object MotionStatus {
    
    inline def appear: typings.rcMotion.rcMotionStrings.appear = "appear".asInstanceOf[typings.rcMotion.rcMotionStrings.appear]
    
    inline def enter: typings.rcMotion.rcMotionStrings.enter = "enter".asInstanceOf[typings.rcMotion.rcMotionStrings.enter]
    
    inline def leave: typings.rcMotion.rcMotionStrings.leave = "leave".asInstanceOf[typings.rcMotion.rcMotionStrings.leave]
    
    inline def none: typings.rcMotion.rcMotionStrings.none = "none".asInstanceOf[typings.rcMotion.rcMotionStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcMotion.rcMotionStrings.none
    - typings.rcMotion.rcMotionStrings.prepare
    - typings.rcMotion.rcMotionStrings.start
    - typings.rcMotion.rcMotionStrings.active
    - typings.rcMotion.rcMotionStrings.end
    - typings.rcMotion.rcMotionStrings.prepared
  */
  trait StepStatus extends StObject
  object StepStatus {
    
    inline def active: typings.rcMotion.rcMotionStrings.active = "active".asInstanceOf[typings.rcMotion.rcMotionStrings.active]
    
    inline def end: typings.rcMotion.rcMotionStrings.end = "end".asInstanceOf[typings.rcMotion.rcMotionStrings.end]
    
    inline def none: typings.rcMotion.rcMotionStrings.none = "none".asInstanceOf[typings.rcMotion.rcMotionStrings.none]
    
    inline def prepare: typings.rcMotion.rcMotionStrings.prepare = "prepare".asInstanceOf[typings.rcMotion.rcMotionStrings.prepare]
    
    inline def prepared: typings.rcMotion.rcMotionStrings.prepared = "prepared".asInstanceOf[typings.rcMotion.rcMotionStrings.prepared]
    
    inline def start: typings.rcMotion.rcMotionStrings.start = "start".asInstanceOf[typings.rcMotion.rcMotionStrings.start]
  }
}
