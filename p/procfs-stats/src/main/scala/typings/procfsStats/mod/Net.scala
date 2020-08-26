package typings.procfsStats.mod

import typings.procfsStats.anon.Receive
import typings.procfsStats.anon.ReceiveString
import typings.procfsStats.anon.Transmit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Net extends js.Object {
  var Interface: String = js.native
  var bytes: Receive = js.native
  var carrier: Transmit = js.native
  var colls: Transmit = js.native
  var compressed: Receive = js.native
  var drop: Receive = js.native
  var errs: Receive = js.native
  var fifo: Receive = js.native
  var frame: ReceiveString = js.native
  var multicast: ReceiveString = js.native
  var packets: Receive = js.native
}

object Net {
  @scala.inline
  def apply(
    Interface: String,
    bytes: Receive,
    carrier: Transmit,
    colls: Transmit,
    compressed: Receive,
    drop: Receive,
    errs: Receive,
    fifo: Receive,
    frame: ReceiveString,
    multicast: ReceiveString,
    packets: Receive
  ): Net = {
    val __obj = js.Dynamic.literal(Interface = Interface.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], carrier = carrier.asInstanceOf[js.Any], colls = colls.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], errs = errs.asInstanceOf[js.Any], fifo = fifo.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], multicast = multicast.asInstanceOf[js.Any], packets = packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Net]
  }
  @scala.inline
  implicit class NetOps[Self <: Net] (val x: Self) extends AnyVal {
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
    def setInterface(value: String): Self = this.set("Interface", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytes(value: Receive): Self = this.set("bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCarrier(value: Transmit): Self = this.set("carrier", value.asInstanceOf[js.Any])
    @scala.inline
    def setColls(value: Transmit): Self = this.set("colls", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompressed(value: Receive): Self = this.set("compressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrop(value: Receive): Self = this.set("drop", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrs(value: Receive): Self = this.set("errs", value.asInstanceOf[js.Any])
    @scala.inline
    def setFifo(value: Receive): Self = this.set("fifo", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrame(value: ReceiveString): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def setMulticast(value: ReceiveString): Self = this.set("multicast", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackets(value: Receive): Self = this.set("packets", value.asInstanceOf[js.Any])
  }
  
}

