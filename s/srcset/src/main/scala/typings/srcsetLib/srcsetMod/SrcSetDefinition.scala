package typings
package srcsetLib.srcsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SrcSetDefinition extends js.Object {
  var density: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var url: java.lang.String
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SrcSetDefinition {
  @scala.inline
  def apply(
    url: java.lang.String,
    density: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): SrcSetDefinition = {
    val __obj = js.Dynamic.literal(url = url)
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SrcSetDefinition]
  }
}

