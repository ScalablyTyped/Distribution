package typings.rrule.distEsmSrcIterresultMod

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
    val __obj = js.Dynamic.literal(after = after, before = before, dt = dt, inc = inc)
    if (_value != null) __obj.updateDynamic("_value")(_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterArgs]
  }
}

