package typings
package proj4Lib.proj4Mod.proj4Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceDatum extends js.Object {
  var a: scala.Double
  var b: scala.Double
  var datum_type: scala.Double
  var ep2: scala.Double
  var es: scala.Double
}

object InterfaceDatum {
  @scala.inline
  def apply(a: scala.Double, b: scala.Double, datum_type: scala.Double, ep2: scala.Double, es: scala.Double): InterfaceDatum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a)
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("datum_type")(datum_type)
    __obj.updateDynamic("ep2")(ep2)
    __obj.updateDynamic("es")(es)
    __obj.asInstanceOf[InterfaceDatum]
  }
}

