package typings
package reactDashVirtualizedLib.distEsAutoSizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object Size {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): Size = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Size]
  }
}

