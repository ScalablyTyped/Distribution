package typings.sharp.mod

import typings.sharp.anon.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailableFormatInfo extends js.Object {
  var id: String = js.native
  var input: Buffer = js.native
  var output: Buffer = js.native
}

object AvailableFormatInfo {
  @scala.inline
  def apply(id: String, input: Buffer, output: Buffer): AvailableFormatInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableFormatInfo]
  }
  @scala.inline
  implicit class AvailableFormatInfoOps[Self <: AvailableFormatInfo] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: Buffer): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: Buffer): Self = this.set("output", value.asInstanceOf[js.Any])
  }
  
}

