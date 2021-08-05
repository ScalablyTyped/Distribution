package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTimeoutMod {
  
  @JSImport("@react-md/utils/types/useTimeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTimeout(cb: js.Function0[Unit], delay: Double): ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(cb.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[ReturnValue]
  inline def useTimeout(cb: js.Function0[Unit], delay: Double, defaultStarted: js.Function0[Boolean]): ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(cb.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], defaultStarted.asInstanceOf[js.Any])).asInstanceOf[ReturnValue]
  inline def useTimeout(cb: js.Function0[Unit], delay: Double, defaultStarted: Boolean): ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(cb.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], defaultStarted.asInstanceOf[js.Any])).asInstanceOf[ReturnValue]
  
  type RestartTimeout = js.Function0[Unit]
  
  type ReturnValue = js.Tuple3[StartTimeout, StopTimeout, RestartTimeout]
  
  type StartTimeout = js.Function0[Unit]
  
  type StopTimeout = js.Function0[Unit]
}
