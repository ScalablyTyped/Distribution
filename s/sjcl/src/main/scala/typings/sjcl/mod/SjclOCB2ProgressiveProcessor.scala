package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclOCB2ProgressiveProcessor extends js.Object {
  def process(data: BitArray_): BitArray_ = js.native
}

object SjclOCB2ProgressiveProcessor {
  @scala.inline
  def apply(process: BitArray_ => BitArray_): SjclOCB2ProgressiveProcessor = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[SjclOCB2ProgressiveProcessor]
  }
  @scala.inline
  implicit class SjclOCB2ProgressiveProcessorOps[Self <: SjclOCB2ProgressiveProcessor] (val x: Self) extends AnyVal {
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
    def setProcess(value: BitArray_ => BitArray_): Self = this.set("process", js.Any.fromFunction1(value))
  }
  
}

