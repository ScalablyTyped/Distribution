package typings.proj4.mod

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
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], datum_type = datum_type.asInstanceOf[js.Any], ep2 = ep2.asInstanceOf[js.Any], es = es.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceDatum]
  }
}

