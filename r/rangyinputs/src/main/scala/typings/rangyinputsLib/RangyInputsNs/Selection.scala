package typings
package rangyinputsLib.RangyInputsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  /**  The character index of the end position of the selection */
  var end: scala.Double
  /** The number of characters selected */
  var length: scala.Double
  /** The character index of the start position of the selection */
  var start: scala.Double
  /** The selected Text */
  var text: java.lang.String
}

object Selection {
  @scala.inline
  def apply(end: scala.Double, length: scala.Double, start: scala.Double, text: java.lang.String): Selection = {
    val __obj = js.Dynamic.literal(end = end, length = length, start = start, text = text)
  
    __obj.asInstanceOf[Selection]
  }
}

