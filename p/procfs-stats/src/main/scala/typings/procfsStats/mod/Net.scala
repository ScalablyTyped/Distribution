package typings.procfsStats.mod

import typings.procfsStats.anon.Receive
import typings.procfsStats.anon.ReceiveString
import typings.procfsStats.anon.Transmit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Net extends StObject {
  
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
  implicit class NetMutableBuilder[Self <: Net] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytes(value: Receive): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrier(value: Transmit): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColls(value: Transmit): Self = StObject.set(x, "colls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressed(value: Receive): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrop(value: Receive): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrs(value: Receive): Self = StObject.set(x, "errs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFifo(value: Receive): Self = StObject.set(x, "fifo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: ReceiveString): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterface(value: String): Self = StObject.set(x, "Interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulticast(value: ReceiveString): Self = StObject.set(x, "multicast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackets(value: Receive): Self = StObject.set(x, "packets", value.asInstanceOf[js.Any])
  }
}
