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

