package typings.reactRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticContext extends js.Object {
  var statusCode: js.UndefOr[Double] = js.undefined
}

object StaticContext {
  @scala.inline
  def apply(statusCode: Int | Double = null): StaticContext = {
    val __obj = js.Dynamic.literal()
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticContext]
  }
}

