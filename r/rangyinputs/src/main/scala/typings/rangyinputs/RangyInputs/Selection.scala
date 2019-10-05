package typings.rangyinputs.RangyInputs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  /**  The character index of the end position of the selection */
  var end: Double
  /** The number of characters selected */
  var length: Double
  /** The character index of the start position of the selection */
  var start: Double
  /** The selected Text */
  var text: String
}

object Selection {
  @scala.inline
  def apply(end: Double, length: Double, start: Double, text: String): Selection = {
    val __obj = js.Dynamic.literal(end = end, length = length, start = start, text = text)
  
    __obj.asInstanceOf[Selection]
  }
}

