package typings.smoothie.smoothieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRange extends js.Object {
  var max: Double
  var min: Double
}

object IRange {
  @scala.inline
  def apply(max: Double, min: Double): IRange = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[IRange]
  }
}

