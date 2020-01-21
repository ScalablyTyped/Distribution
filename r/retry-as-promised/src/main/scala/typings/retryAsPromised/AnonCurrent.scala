package typings.retryAsPromised

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent extends js.Object {
  var current: js.UndefOr[Double] = js.undefined
}

object AnonCurrent {
  @scala.inline
  def apply(current: Int | Double = null): AnonCurrent = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrent]
  }
}

