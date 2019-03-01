package typings
package raphaelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bez1 extends js.Object {
  var bez1: js.Array[_]
  var bez2: js.Array[_]
  var segment1: scala.Double
  var segment2: scala.Double
  var t1: scala.Double
  var t2: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Anon_Bez1 {
  @scala.inline
  def apply(
    bez1: js.Array[_],
    bez2: js.Array[_],
    segment1: scala.Double,
    segment2: scala.Double,
    t1: scala.Double,
    t2: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): Anon_Bez1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bez1")(bez1)
    __obj.updateDynamic("bez2")(bez2)
    __obj.updateDynamic("segment1")(segment1)
    __obj.updateDynamic("segment2")(segment2)
    __obj.updateDynamic("t1")(t1)
    __obj.updateDynamic("t2")(t2)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_Bez1]
  }
}

