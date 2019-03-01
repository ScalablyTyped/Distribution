package typings
package reactDashResizableLib.reactDashResizableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableBoxState extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object ResizableBoxState {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): ResizableBoxState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ResizableBoxState]
  }
}

