package typings.slate.mod

import typings.immutable.Immutable.List
import typings.slate.slateStrings.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointProperties extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var `object`: js.UndefOr[point] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[List[Double]] = js.undefined
}

object PointProperties {
  @scala.inline
  def apply(key: String = null, `object`: point = null, offset: Int | Double = null, path: List[Double] = null): PointProperties = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointProperties]
  }
}

