package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Next extends js.Object {
  var next: js.UndefOr[String] = js.undefined
  var prev: js.UndefOr[String] = js.undefined
}

object Next {
  @scala.inline
  def apply(next: String = null, prev: String = null): Next = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
}

