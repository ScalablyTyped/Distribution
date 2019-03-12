package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointJSON extends js.Object {
  var key: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var `object`: slateLib.slateLibStrings.point
  var offset: js.UndefOr[scala.Double] = js.undefined
  var path: js.UndefOr[Path | scala.Null] = js.undefined
}

object PointJSON {
  @scala.inline
  def apply(
    `object`: slateLib.slateLibStrings.point,
    key: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    path: Path = null
  ): PointJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`)
    if (key != null) __obj.updateDynamic("key")(key)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointJSON]
  }
}

