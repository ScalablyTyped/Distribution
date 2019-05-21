package typings
package rechartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    offset: js.Object = null,
    width: scala.Int | scala.Double = null,
    yAxis: js.Object = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis)
    __obj.asInstanceOf[Anon_Height]
  }
}

