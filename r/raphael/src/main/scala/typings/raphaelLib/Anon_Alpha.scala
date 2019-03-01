package typings
package raphaelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alpha extends js.Object {
  var alpha: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Anon_Alpha {
  @scala.inline
  def apply(alpha: scala.Double, x: scala.Double, y: scala.Double): Anon_Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alpha")(alpha)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_Alpha]
  }
}

