package typings.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: Double
  var cursor: js.UndefOr[String | Null] = js.undefined
}

object AnonCount {
  @scala.inline
  def apply(count: Double, cursor: String = null): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

