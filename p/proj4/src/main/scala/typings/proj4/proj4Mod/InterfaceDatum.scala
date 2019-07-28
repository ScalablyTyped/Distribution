package typings.proj4.proj4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceDatum extends js.Object {
  var a: Double
  var b: Double
  var datum_type: Double
  var ep2: Double
  var es: Double
}

object InterfaceDatum {
  @scala.inline
  def apply(a: Double, b: Double, datum_type: Double, ep2: Double, es: Double): InterfaceDatum = {
    val __obj = js.Dynamic.literal(a = a, b = b, datum_type = datum_type, ep2 = ep2, es = es)
  
    __obj.asInstanceOf[InterfaceDatum]
  }
}

