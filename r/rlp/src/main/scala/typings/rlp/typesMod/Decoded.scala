package typings.rlp.typesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decoded extends js.Object {
  var data: Buffer | js.Array[Buffer] = js.native
  var remainder: Buffer = js.native
}

object Decoded {
  @scala.inline
  def apply(data: Buffer | js.Array[Buffer], remainder: Buffer): Decoded = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], remainder = remainder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decoded]
  }
  @scala.inline
  implicit class DecodedOps[Self <: Decoded] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: Buffer*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: Buffer | js.Array[Buffer]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemainder(value: Buffer): Self = this.set("remainder", value.asInstanceOf[js.Any])
  }
  
}

