package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  var next: js.UndefOr[String] = js.undefined
  var prev: js.UndefOr[String] = js.undefined
}

object Anon_Next {
  @scala.inline
  def apply(next: String = null, prev: String = null): Anon_Next = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Anon_Next]
  }
}

