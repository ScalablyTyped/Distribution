package typings
package reactDashMdLib.libHelpersLayoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoverAnchor extends js.Object {
  var x: HorizontalAnchors
  var y: VerticalAnchors
}

object LayoverAnchor {
  @scala.inline
  def apply(x: HorizontalAnchors, y: VerticalAnchors): LayoverAnchor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[LayoverAnchor]
  }
}

