package typings.procfsStats.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Udp extends StObject {
  
  var drops: String
  
  var inode: String
  
  var local_address: String
  
  var pointer: String
  
  var ref: String
  
  var rem_address: String
  
  var retrnsmt: String
  
  var rx_queue: String
  
  var sl: String
  
  var st: String
  
  var timeout: String
  
  @JSName("tm->when")
  var `tm-Greaterthansignwhen`: String
  
  var tr: String
  
  var tx_queue: String
  
  var uid: String
}
object Udp {
  
  @scala.inline
  def apply(
    drops: String,
    inode: String,
    local_address: String,
    pointer: String,
    ref: String,
    rem_address: String,
    retrnsmt: String,
    rx_queue: String,
    sl: String,
    st: String,
    timeout: String,
    `tm-Greaterthansignwhen`: String,
    tr: String,
    tx_queue: String,
    uid: String
  ): Udp = {
    val __obj = js.Dynamic.literal(drops = drops.asInstanceOf[js.Any], inode = inode.asInstanceOf[js.Any], local_address = local_address.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], rem_address = rem_address.asInstanceOf[js.Any], retrnsmt = retrnsmt.asInstanceOf[js.Any], rx_queue = rx_queue.asInstanceOf[js.Any], sl = sl.asInstanceOf[js.Any], st = st.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], tx_queue = tx_queue.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("tm->when")(`tm-Greaterthansignwhen`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Udp]
  }
  
  @scala.inline
  implicit class UdpMutableBuilder[Self <: Udp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrops(value: String): Self = StObject.set(x, "drops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInode(value: String): Self = StObject.set(x, "inode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal_address(value: String): Self = StObject.set(x, "local_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointer(value: String): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRem_address(value: String): Self = StObject.set(x, "rem_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrnsmt(value: String): Self = StObject.set(x, "retrnsmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRx_queue(value: String): Self = StObject.set(x, "rx_queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSl(value: String): Self = StObject.set(x, "sl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSt(value: String): Self = StObject.set(x, "st", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTm-Greaterthansignwhen`(value: String): Self = StObject.set(x, "tm->when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTr(value: String): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTx_queue(value: String): Self = StObject.set(x, "tx_queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
