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

object InterfaceProjection {
  @scala.inline
  def apply(
    b: scala.Double,
    datum: java.lang.String,
    e: scala.Double,
    ep2: scala.Double,
    es: scala.Double,
    forward: TemplateCoordinates => js.Array[scala.Double],
    inverse: TemplateCoordinates => js.Array[scala.Double],
    rf: scala.Double,
    sphere: scala.Double
  ): InterfaceProjection = {
    val __obj = js.Dynamic.literal(b = b, datum = datum, e = e, ep2 = ep2, es = es, forward = js.Any.fromFunction1(forward), inverse = js.Any.fromFunction1(inverse), rf = rf, sphere = sphere)
  
    __obj.asInstanceOf[InterfaceProjection]
  }
}

