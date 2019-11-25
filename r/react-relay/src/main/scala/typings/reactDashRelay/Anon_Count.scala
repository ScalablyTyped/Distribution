package typings.reactDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: Double
  var cursor: js.UndefOr[String | Null] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(count: Double, cursor: String = null): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Count]
  }
}

