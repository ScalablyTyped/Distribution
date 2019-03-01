package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attrs1 extends js.Object {
  var attrs1: java.lang.String
  var attrs2: js.UndefOr[java.lang.String] = js.undefined
  var dir1: java.lang.String
  var dir2: js.UndefOr[java.lang.String] = js.undefined
  var pt: scala.Double | java.lang.String
}

object Anon_Attrs1 {
  @scala.inline
  def apply(
    attrs1: java.lang.String,
    dir1: java.lang.String,
    pt: scala.Double | java.lang.String,
    attrs2: java.lang.String = null,
    dir2: java.lang.String = null
  ): Anon_Attrs1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attrs1")(attrs1)
    __obj.updateDynamic("dir1")(dir1)
    __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (attrs2 != null) __obj.updateDynamic("attrs2")(attrs2)
    if (dir2 != null) __obj.updateDynamic("dir2")(dir2)
    __obj.asInstanceOf[Anon_Attrs1]
  }
}

