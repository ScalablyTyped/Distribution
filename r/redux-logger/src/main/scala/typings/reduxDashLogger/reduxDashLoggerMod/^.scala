package typings.reduxDashLogger.reduxDashLoggerMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: Middleware[js.Object, js.Any, Dispatch[AnyAction]] = js.native
  val logger: Middleware[js.Object, js.Any, Dispatch[AnyAction]] = js.native
  def createLogger(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def createLogger(options: ReduxLoggerOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

