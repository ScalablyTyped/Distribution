package typings
package smoothieLib.smoothieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRange extends js.Object {
  var max: scala.Double
  var min: scala.Double
}

object IRange {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double): IRange = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[IRange]
  }
}

