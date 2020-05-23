package typings.reactDndMultiBackend.anon

import typings.reactDndMultiBackend.mod.Backends
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var debugMode: js.UndefOr[Boolean] = js.undefined
  var options: Backends
}

object Context {
  @scala.inline
  def apply(options: Backends, context: js.Any = null, debugMode: js.UndefOr[Boolean] = js.undefined): Context = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

