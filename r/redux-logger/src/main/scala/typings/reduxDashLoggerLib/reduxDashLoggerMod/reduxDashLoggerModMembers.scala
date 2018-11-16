package typings
package reduxDashLoggerLib.reduxDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-logger", JSImport.Namespace)
@js.native
object reduxDashLoggerModMembers extends js.Object {
  val default: reduxLib.reduxMod.Middleware[js.Object, js.Any, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  val logger: reduxLib.reduxMod.Middleware[js.Object, js.Any, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  def createLogger(): reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  def createLogger(options: ReduxLoggerOptions): reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
}

