package typings.reactRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticContext extends js.Object {
  var statusCode: js.UndefOr[Double] = js.undefined
}

object StaticContext {
  @scala.inline
  def apply(statusCode: js.UndefOr[Double] = js.undefined): StaticContext = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticContext]
  }
}

