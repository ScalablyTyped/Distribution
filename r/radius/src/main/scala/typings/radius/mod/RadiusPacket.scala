package typings.radius.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadiusPacket extends js.Object {
  var attributes: js.Any = js.native
  var code: String = js.native
  var identifier: Double = js.native
  var length: Double = js.native
  var raw_attributes: js.Array[js.Array[_]] = js.native
}

object RadiusPacket {
  @scala.inline
  def apply(
    attributes: js.Any,
    code: String,
    identifier: Double,
    length: Double,
    raw_attributes: js.Array[js.Array[_]]
  ): RadiusPacket = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], raw_attributes = raw_attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadiusPacket]
  }
  @scala.inline
  implicit class RadiusPacketOps[Self <: RadiusPacket] (val x: Self) extends AnyVal {
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
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: Double): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw_attributesVarargs(value: js.Array[js.Any]*): Self = this.set("raw_attributes", js.Array(value :_*))
    @scala.inline
    def setRaw_attributes(value: js.Array[js.Array[_]]): Self = this.set("raw_attributes", value.asInstanceOf[js.Any])
  }
  
}

