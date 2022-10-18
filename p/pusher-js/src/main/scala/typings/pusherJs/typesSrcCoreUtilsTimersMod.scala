package typings.pusherJs

import typings.pusherJs.typesSrcCoreUtilsTimersAbstractTimerMod.default
import typings.pusherJs.typesSrcCoreUtilsTimersSchedulingMod.Delay
import typings.pusherJs.typesSrcCoreUtilsTimersTimedCallbackMod.TimedCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreUtilsTimersMod {
  
  @JSImport("pusher-js/types/src/core/utils/timers", "OneOffTimer")
  @js.native
  open class OneOffTimer protected () extends default {
    def this(delay: Delay, callback: TimedCallback) = this()
  }
  
  @JSImport("pusher-js/types/src/core/utils/timers", "PeriodicTimer")
  @js.native
  open class PeriodicTimer protected () extends default {
    def this(delay: Delay, callback: TimedCallback) = this()
  }
}
