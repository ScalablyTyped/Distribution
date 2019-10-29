package typings.reDashResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightWidth extends js.Object {
  var height: js.UndefOr[String | Double] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object Anon_HeightWidth {
  @scala.inline
  def apply(height: String | Double = null, width: String | Double = null): Anon_HeightWidth = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeightWidth]
  }
}

