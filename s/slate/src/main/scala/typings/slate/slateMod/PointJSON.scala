package typings.slate.slateMod

import typings.slate.slateStrings.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointJSON extends js.Object {
  var key: js.UndefOr[String | Null] = js.undefined
  var `object`: point
  var offset: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[Path | Null] = js.undefined
}

object PointJSON {
  @scala.inline
  def apply(`object`: point, key: String = null, offset: Int | Double = null, path: Path = null): PointJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`)
    if (key != null) __obj.updateDynamic("key")(key)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointJSON]
  }
}

