package typings
package proj4Lib.proj4Mod.proj4Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InterfaceProjection extends js.Object {
  var b: scala.Double
  var datum: java.lang.String
  var e: scala.Double
  var ep2: scala.Double
  var es: scala.Double
  var rf: scala.Double
  var sphere: scala.Double
  def forward(coordinates: TemplateCoordinates): js.Array[scala.Double]
  def inverse(coordinates: TemplateCoordinates): js.Array[scala.Double]
}

