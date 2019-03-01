package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var clip: js.UndefOr[scala.Double] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Image {
  @scala.inline
  def apply(
    clip: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Image = {
    val __obj = js.Dynamic.literal()
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

