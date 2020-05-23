package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: String
  var left_bound: js.UndefOr[String] = js.undefined
   // 'closed'
  var right_bound: js.UndefOr[String] = js.undefined
}

object Index {
  @scala.inline
  def apply(index: String, left_bound: String = null, right_bound: String = null): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (left_bound != null) __obj.updateDynamic("left_bound")(left_bound.asInstanceOf[js.Any])
    if (right_bound != null) __obj.updateDynamic("right_bound")(right_bound.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

