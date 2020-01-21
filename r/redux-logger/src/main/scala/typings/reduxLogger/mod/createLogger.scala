package typings.reduxLogger.mod

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-logger", "createLogger")
@js.native
object createLogger extends js.Object {
  def apply(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(options: ReduxLoggerOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

