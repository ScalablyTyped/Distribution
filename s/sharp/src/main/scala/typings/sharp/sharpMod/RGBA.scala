package typings.sharp.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBA extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var b: js.UndefOr[Double] = js.undefined
  var g: js.UndefOr[Double] = js.undefined
  var r: js.UndefOr[Double] = js.undefined
}

object RGBA {
  @scala.inline
  def apply(alpha: Int | Double = null, b: Int | Double = null, g: Int | Double = null, r: Int | Double = null): RGBA = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (g != null) __obj.updateDynamic("g")(g.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBA]
  }
}

