package typings.routeRecognizer.mod

import typings.routeRecognizer.dslMod.Opaque
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var handler: Opaque
  var isDynamic: Boolean
  var params: Params
}

object Result {
  @scala.inline
  def apply(isDynamic: Boolean, params: Params, handler: js.UndefOr[Null | Opaque] = js.undefined): Result = {
    val __obj = js.Dynamic.literal(isDynamic = isDynamic.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    if (!js.isUndefined(handler)) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

