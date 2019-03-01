package typings
package raphaelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlphaEnd extends js.Object {
  var alpha: scala.Double
  var end: Anon_X
  var m: Anon_X
  var n: Anon_X
  var start: Anon_X
  var x: scala.Double
  var y: scala.Double
}

object Anon_AlphaEnd {
  @scala.inline
  def apply(
    alpha: scala.Double,
    end: Anon_X,
    m: Anon_X,
    n: Anon_X,
    start: Anon_X,
    x: scala.Double,
    y: scala.Double
  ): Anon_AlphaEnd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alpha")(alpha)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("m")(m)
    __obj.updateDynamic("n")(n)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_AlphaEnd]
  }
}

