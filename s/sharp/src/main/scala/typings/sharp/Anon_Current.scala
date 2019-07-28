package typings.sharp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: Double
  var high: Double
  var max: Double
}

object Anon_Current {
  @scala.inline
  def apply(current: Double, high: Double, max: Double): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current, high = high, max = max)
  
    __obj.asInstanceOf[Anon_Current]
  }
}

