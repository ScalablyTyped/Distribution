package typings.sentryReplay

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilThrottleMod {
  
  @JSImport("@sentry/replay/types/util/throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/replay/types/util/throttle", "SKIPPED")
  @js.native
  val SKIPPED: /* "__SKIPPED" */ String = js.native
  
  @JSImport("@sentry/replay/types/util/throttle", "THROTTLED")
  @js.native
  val THROTTLED: /* "__THROTTLED" */ String = js.native
  
  inline def throttle[T /* <: js.Function1[/* repeated */ Any, Any] */](fn: T, maxCount: Double, durationSeconds: Double): js.Function1[/* rest */ Parameters[T], ReturnType[T] | (/* "__THROTTLED" */ String)] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(fn.asInstanceOf[js.Any], maxCount.asInstanceOf[js.Any], durationSeconds.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* rest */ Parameters[T], ReturnType[T] | (/* "__THROTTLED" */ String)]]
}
