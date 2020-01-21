package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDir1 extends js.Object {
  var dir1: String
  var dir2: js.UndefOr[String] = js.undefined
  var list1: String
  var list2: js.UndefOr[String] = js.undefined
}

object AnonDir1 {
  @scala.inline
  def apply(dir1: String, list1: String, dir2: String = null, list2: String = null): AnonDir1 = {
    val __obj = js.Dynamic.literal(dir1 = dir1.asInstanceOf[js.Any], list1 = list1.asInstanceOf[js.Any])
    if (dir2 != null) __obj.updateDynamic("dir2")(dir2.asInstanceOf[js.Any])
    if (list2 != null) __obj.updateDynamic("list2")(list2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDir1]
  }
}

