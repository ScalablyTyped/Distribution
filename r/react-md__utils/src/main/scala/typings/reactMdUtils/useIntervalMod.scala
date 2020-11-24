package typings.reactMdUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/useInterval", JSImport.Namespace)
@js.native
object useIntervalMod extends js.Object {
  
  def useInterval(callback: js.Function1[/* stop */ js.Function0[Unit], Unit], delay: Double): ReturnValue = js.native
  def useInterval(
    callback: js.Function1[/* stop */ js.Function0[Unit], Unit],
    delay: Double,
    defaultRunning: Boolean
  ): ReturnValue = js.native
  
  type ReturnValue = js.Tuple3[Running, StartInterval, StopInterval]
  
  type Running = Boolean
  
  type StartInterval = js.Function0[Unit]
  
  type StopInterval = js.Function0[Unit]
}
