package typings.reactInputMask.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  var end: Double
  var start: Double
}

object Selection {
  @scala.inline
  def apply(end: Double, start: Double): Selection = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Selection]
  }
}

