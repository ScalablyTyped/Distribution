package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLRedrawOptions extends js.Object {
  var height: scala.Double
  var width: scala.Double
  def project(lnglat: js.Array[scala.Double]): js.Array[scala.Double]
  def unproject(xy: js.Array[scala.Double]): js.Array[scala.Double]
}

object HTMLRedrawOptions {
  @scala.inline
  def apply(
    height: scala.Double,
    project: js.Array[scala.Double] => js.Array[scala.Double],
    unproject: js.Array[scala.Double] => js.Array[scala.Double],
    width: scala.Double
  ): HTMLRedrawOptions = {
    val __obj = js.Dynamic.literal(height = height, project = js.Any.fromFunction1(project), unproject = js.Any.fromFunction1(unproject), width = width)
  
    __obj.asInstanceOf[HTMLRedrawOptions]
  }
}

