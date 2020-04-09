package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNext extends js.Object {
  var next: js.UndefOr[String] = js.undefined
  var now: js.UndefOr[String] = js.undefined
}

object AnonNext {
  @scala.inline
  def apply(next: String = null, now: String = null): AnonNext = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNext]
  }
}

