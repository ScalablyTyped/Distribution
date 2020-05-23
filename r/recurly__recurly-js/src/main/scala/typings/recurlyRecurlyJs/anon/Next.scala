package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Next extends js.Object {
  var next: js.UndefOr[String] = js.undefined
  var now: js.UndefOr[String] = js.undefined
}

object Next {
  @scala.inline
  def apply(next: String = null, now: String = null): Next = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
}

