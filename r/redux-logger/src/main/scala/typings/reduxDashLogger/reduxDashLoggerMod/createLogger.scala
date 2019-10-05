package typings.reduxDashLogger.reduxDashLoggerMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-logger", "createLogger")
@js.native
object createLogger extends js.Object {
  def apply(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(options: ReduxLoggerOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

