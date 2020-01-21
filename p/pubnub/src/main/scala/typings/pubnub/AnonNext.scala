package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNext extends js.Object {
  var next: js.UndefOr[String] = js.undefined
  var prev: js.UndefOr[String] = js.undefined
}

object AnonNext {
  @scala.inline
  def apply(next: String = null, prev: String = null): AnonNext = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNext]
  }
}

