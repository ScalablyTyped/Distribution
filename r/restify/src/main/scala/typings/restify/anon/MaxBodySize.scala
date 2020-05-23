package typings.restify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxBodySize extends js.Object {
  var maxBodySize: js.UndefOr[Double] = js.undefined
}

object MaxBodySize {
  @scala.inline
  def apply(maxBodySize: js.UndefOr[Double] = js.undefined): MaxBodySize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxBodySize)) __obj.updateDynamic("maxBodySize")(maxBodySize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxBodySize]
  }
}

