package typings.slate.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointProperties extends js.Object {
  var key: js.UndefOr[String | Null] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[Path | Null] = js.undefined
}

object PointProperties {
  @scala.inline
  def apply(key: String = null, offset: Int | Double = null, path: Path = null): PointProperties = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointProperties]
  }
}

