package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclOCB2ProgressiveProcessor extends js.Object {
  def process(data: BitArray_): BitArray_
}

object SjclOCB2ProgressiveProcessor {
  @scala.inline
  def apply(process: BitArray_ => BitArray_): SjclOCB2ProgressiveProcessor = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[SjclOCB2ProgressiveProcessor]
  }
}

