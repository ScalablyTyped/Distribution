package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attrs1 extends js.Object {
  var attrs1: String
  var attrs2: js.UndefOr[String] = js.undefined
  var dir1: String
  var dir2: js.UndefOr[String] = js.undefined
  var pt: Double | String
}

object Attrs1 {
  @scala.inline
  def apply(attrs1: String, dir1: String, pt: Double | String, attrs2: String = null, dir2: String = null): Attrs1 = {
    val __obj = js.Dynamic.literal(attrs1 = attrs1.asInstanceOf[js.Any], dir1 = dir1.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any])
    if (attrs2 != null) __obj.updateDynamic("attrs2")(attrs2.asInstanceOf[js.Any])
    if (dir2 != null) __obj.updateDynamic("dir2")(dir2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs1]
  }
}

