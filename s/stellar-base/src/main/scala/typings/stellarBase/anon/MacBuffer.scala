package typings.stellarBase.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MacBuffer extends js.Object {
  var mac: Buffer = js.native
}

object MacBuffer {
  @scala.inline
  def apply(mac: Buffer): MacBuffer = {
    val __obj = js.Dynamic.literal(mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacBuffer]
  }
  @scala.inline
  implicit class MacBufferOps[Self <: MacBuffer] (val x: Self) extends AnyVal {
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
    def setMac(value: Buffer): Self = this.set("mac", value.asInstanceOf[js.Any])
  }
  
}

