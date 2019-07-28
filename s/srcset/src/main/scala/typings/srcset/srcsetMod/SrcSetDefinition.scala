package typings.srcset.srcsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SrcSetDefinition extends js.Object {
  var density: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var url: String
  var width: js.UndefOr[Double] = js.undefined
}

object SrcSetDefinition {
  @scala.inline
  def apply(url: String, density: Int | Double = null, height: Int | Double = null, width: Int | Double = null): SrcSetDefinition = {
    val __obj = js.Dynamic.literal(url = url)
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SrcSetDefinition]
  }
}

