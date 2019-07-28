package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attrs1 extends js.Object {
  var attrs1: String
  var attrs2: js.UndefOr[String] = js.undefined
  var dir1: String
  var dir2: js.UndefOr[String] = js.undefined
  var pt: Double | String
}

object Anon_Attrs1 {
  @scala.inline
  def apply(attrs1: String, dir1: String, pt: Double | String, attrs2: String = null, dir2: String = null): Anon_Attrs1 = {
    val __obj = js.Dynamic.literal(attrs1 = attrs1, dir1 = dir1, pt = pt.asInstanceOf[js.Any])
    if (attrs2 != null) __obj.updateDynamic("attrs2")(attrs2)
    if (dir2 != null) __obj.updateDynamic("dir2")(dir2)
    __obj.asInstanceOf[Anon_Attrs1]
  }
}

