package typings.rrule.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Div extends js.Object {
  var div: Double
  var mod: Double
}

object Div {
  @scala.inline
  def apply(div: Double, mod: Double): Div = {
    val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Div]
  }
}

