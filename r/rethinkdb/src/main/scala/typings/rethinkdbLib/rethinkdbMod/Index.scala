package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: java.lang.String
  var left_bound: js.UndefOr[java.lang.String] = js.undefined
   // 'closed'
  var right_bound: js.UndefOr[java.lang.String] = js.undefined
}

object Index {
  @scala.inline
  def apply(index: java.lang.String, left_bound: java.lang.String = null, right_bound: java.lang.String = null): Index = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    if (left_bound != null) __obj.updateDynamic("left_bound")(left_bound)
    if (right_bound != null) __obj.updateDynamic("right_bound")(right_bound)
    __obj.asInstanceOf[Index]
  }
}

