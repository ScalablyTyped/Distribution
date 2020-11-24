package typings.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CpuDetail extends js.Object {
  
  var guest: String = js.native
  
  var guest_nice: String = js.native
  
  var idle: String = js.native
  
  var iowait: String = js.native
  
  var irq: String = js.native
  
  var nice: String = js.native
  
  var softirq: String = js.native
  
  var steal: String = js.native
  
  var system: String = js.native
  
  var user: String = js.native
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
  implicit class CpuDetailOps[Self <: CpuDetail] (val x: Self) extends AnyVal {
    
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
    def setGuest(value: String): Self = this.set("guest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuest_nice(value: String): Self = this.set("guest_nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdle(value: String): Self = this.set("idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIowait(value: String): Self = this.set("iowait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIrq(value: String): Self = this.set("irq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNice(value: String): Self = this.set("nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftirq(value: String): Self = this.set("softirq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteal(value: String): Self = this.set("steal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: String): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
