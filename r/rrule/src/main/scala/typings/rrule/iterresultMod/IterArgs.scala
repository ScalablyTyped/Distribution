package typings.rrule.iterresultMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterArgs extends js.Object {
  var _value: Date | js.Array[Date] | Null
  var after: Date
  var before: Date
  var dt: Date
  var inc: Boolean
}

object IterArgs {
  @scala.inline
  def apply(after: Date, before: Date, dt: Date, inc: Boolean, _value: Date | js.Array[Date] = null): IterArgs = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], inc = inc.asInstanceOf[js.Any], _value = _value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterArgs]
  }
}

