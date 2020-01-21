package typings.restify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxBodySize extends js.Object {
  var maxBodySize: js.UndefOr[Double] = js.undefined
}

object AnonMaxBodySize {
  @scala.inline
  def apply(maxBodySize: Int | Double = null): AnonMaxBodySize = {
    val __obj = js.Dynamic.literal()
    if (maxBodySize != null) __obj.updateDynamic("maxBodySize")(maxBodySize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxBodySize]
  }
}

