package typings.rangyinputs.RangyInputs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selection extends js.Object {
  /**  The character index of the end position of the selection */
  var end: Double = js.native
  /** The number of characters selected */
  var length: Double = js.native
  /** The character index of the start position of the selection */
  var start: Double = js.native
  /** The selected Text */
  var text: String = js.native
}

object Selection {
  @scala.inline
  def apply(end: Double, length: Double, start: Double, text: String): Selection = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  @scala.inline
  implicit class SelectionOps[Self <: Selection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

