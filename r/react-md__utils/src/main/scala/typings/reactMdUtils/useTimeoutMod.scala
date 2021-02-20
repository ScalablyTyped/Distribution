package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTimeoutMod {
  
  @JSImport("@react-md/utils/types/useTimeout", "useTimeout")
  @js.native
  def useTimeout(cb: js.Function0[Unit], delay: Double): ReturnValue = js.native
  @JSImport("@react-md/utils/types/useTimeout", "useTimeout")
  @js.native
  def useTimeout(cb: js.Function0[Unit], delay: Double, defaultStarted: js.Function0[Boolean]): ReturnValue = js.native
  @JSImport("@react-md/utils/types/useTimeout", "useTimeout")
  @js.native
  def useTimeout(cb: js.Function0[Unit], delay: Double, defaultStarted: Boolean): ReturnValue = js.native
  
  type RestartTimeout = js.Function0[Unit]
  
  type ReturnValue = js.Tuple3[StartTimeout, StopTimeout, RestartTimeout]
  
  type StartTimeout = js.Function0[Unit]
  
  type StopTimeout = js.Function0[Unit]
}
