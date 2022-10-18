package typings.rcGesture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigMod {
  
  @JSImport("rc-gesture/lib/config", "DIRECTION_ALL")
  @js.native
  val DIRECTION_ALL: Double = js.native
  
  @JSImport("rc-gesture/lib/config", "DIRECTION_DOWN")
  @js.native
  val DIRECTION_DOWN: /* 16 */ Double = js.native
  
  @JSImport("rc-gesture/lib/config", "DIRECTION_HORIZONTAL")
  @js.native
  val DIRECTION_HORIZONTAL: Double = js.native
  
  @JSImport("rc-gesture/lib/config", "DIRECTION_LEFT")
  @js.native
  val DIRECTION_LEFT: /* 2 */ Double = js.native
  
  @JSImport("rc-gesture/lib/config", "DIRECTION_NONE")
  @js.native
  val DIRECTION_NONE: /* 1 */ Double = js.native
  
  @JSImport("rc-gesture/lib/config", "DIRECTION_RIGHT")
  @js.native
  val DIRECTION_RIGHT: /* 4 */ Double = js.native
  
  @JSImport("rc-gesture/lib/config", "DIRECTION_UP")
  @js.native
  val DIRECTION_UP: /* 8 */ Double = js.native
  
  @JSImport("rc-gesture/lib/config", "DIRECTION_VERTICAL")
  @js.native
  val DIRECTION_VERTICAL: Double = js.native
  
  object PRESS {
    
    @JSImport("rc-gesture/lib/config", "PRESS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-gesture/lib/config", "PRESS.time")
    @js.native
    def time: Double = js.native
    inline def time_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
  }
  
  object SWIPE {
    
    @JSImport("rc-gesture/lib/config", "SWIPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-gesture/lib/config", "SWIPE.threshold")
    @js.native
    def threshold: Double = js.native
    inline def threshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("threshold")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-gesture/lib/config", "SWIPE.velocity")
    @js.native
    def velocity: Double = js.native
    inline def velocity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("velocity")(x.asInstanceOf[js.Any])
  }
}
