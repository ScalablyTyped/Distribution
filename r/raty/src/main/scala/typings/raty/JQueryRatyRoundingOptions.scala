package typings.raty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryRatyRoundingOptions extends js.Object {
  var down: Double
  var full: Double
  var up: Double
}

object JQueryRatyRoundingOptions {
  @scala.inline
  def apply(down: Double, full: Double, up: Double): JQueryRatyRoundingOptions = {
    val __obj = js.Dynamic.literal(down = down, full = full, up = up)
  
    __obj.asInstanceOf[JQueryRatyRoundingOptions]
  }
}

