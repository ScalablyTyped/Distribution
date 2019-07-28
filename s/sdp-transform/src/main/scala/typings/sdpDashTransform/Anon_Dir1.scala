package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dir1 extends js.Object {
  var dir1: String
  var dir2: js.UndefOr[String] = js.undefined
  var list1: String
  var list2: js.UndefOr[String] = js.undefined
}

object Anon_Dir1 {
  @scala.inline
  def apply(dir1: String, list1: String, dir2: String = null, list2: String = null): Anon_Dir1 = {
    val __obj = js.Dynamic.literal(dir1 = dir1, list1 = list1)
    if (dir2 != null) __obj.updateDynamic("dir2")(dir2)
    if (list2 != null) __obj.updateDynamic("list2")(list2)
    __obj.asInstanceOf[Anon_Dir1]
  }
}

