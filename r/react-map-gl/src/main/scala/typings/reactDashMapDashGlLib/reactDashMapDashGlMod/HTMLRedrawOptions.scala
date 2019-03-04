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
    project: js.Function1[js.Array[scala.Double], js.Array[scala.Double]],
    unproject: js.Function1[js.Array[scala.Double], js.Array[scala.Double]],
    width: scala.Double
  ): HTMLRedrawOptions = {
    val __obj = js.Dynamic.literal(height = height, project = project, unproject = unproject, width = width)
  
    __obj.asInstanceOf[HTMLRedrawOptions]
  }
}

