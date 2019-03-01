package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dir1 extends js.Object {
  var dir1: java.lang.String
  var dir2: js.UndefOr[java.lang.String] = js.undefined
  var list1: java.lang.String
  var list2: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Dir1 {
  @scala.inline
  def apply(
    dir1: java.lang.String,
    list1: java.lang.String,
    dir2: java.lang.String = null,
    list2: java.lang.String = null
  ): Anon_Dir1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dir1")(dir1)
    __obj.updateDynamic("list1")(list1)
    if (dir2 != null) __obj.updateDynamic("dir2")(dir2)
    if (list2 != null) __obj.updateDynamic("list2")(list2)
    __obj.asInstanceOf[Anon_Dir1]
  }
}

