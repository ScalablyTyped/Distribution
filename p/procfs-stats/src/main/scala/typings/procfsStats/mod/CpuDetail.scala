package typings.procfsStats.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpuDetail extends StObject {
  
  var guest: String
  
  var guest_nice: String
  
  var idle: String
  
  var iowait: String
  
  var irq: String
  
  var nice: String
  
  var softirq: String
  
  var steal: String
  
  var system: String
  
  var user: String
}
object CpuDetail {
  
  @scala.inline
  def apply(
    guest: String,
    guest_nice: String,
    idle: String,
    iowait: String,
    irq: String,
    nice: String,
    softirq: String,
    steal: String,
    system: String,
    user: String
  ): CpuDetail = {
    val __obj = js.Dynamic.literal(guest = guest.asInstanceOf[js.Any], guest_nice = guest_nice.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], iowait = iowait.asInstanceOf[js.Any], irq = irq.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], softirq = softirq.asInstanceOf[js.Any], steal = steal.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuDetail]
  }
  
  @scala.inline
  implicit class CpuDetailMutableBuilder[Self <: CpuDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuest(value: String): Self = StObject.set(x, "guest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuest_nice(value: String): Self = StObject.set(x, "guest_nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdle(value: String): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIowait(value: String): Self = StObject.set(x, "iowait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIrq(value: String): Self = StObject.set(x, "irq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNice(value: String): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftirq(value: String): Self = StObject.set(x, "softirq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteal(value: String): Self = StObject.set(x, "steal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
