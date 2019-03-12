package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointProperties extends js.Object {
  var key: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var path: js.UndefOr[Path | scala.Null] = js.undefined
}

object PointProperties {
  @scala.inline
  def apply(key: java.lang.String = null, offset: scala.Int | scala.Double = null, path: Path = null): PointProperties = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointProperties]
  }
}

