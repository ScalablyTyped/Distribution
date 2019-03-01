package typings
package rruleLib.distEsmSrcIterresultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterArgs extends js.Object {
  var _value: stdLib.Date | js.Array[stdLib.Date] | scala.Null
  var after: stdLib.Date
  var before: stdLib.Date
  var dt: stdLib.Date
  var inc: scala.Boolean
}

object IterArgs {
  @scala.inline
  def apply(
    after: stdLib.Date,
    before: stdLib.Date,
    dt: stdLib.Date,
    inc: scala.Boolean,
    _value: stdLib.Date | js.Array[stdLib.Date] = null
  ): IterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(after)
    __obj.updateDynamic("before")(before)
    __obj.updateDynamic("dt")(dt)
    __obj.updateDynamic("inc")(inc)
    if (_value != null) __obj.updateDynamic("_value")(_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterArgs]
  }
}

