package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Redeliveries extends js.Object {
  
  var publications: Confirm = js.native
  
  var redeliveries: Counters = js.native
  
  var subscriptions: DeferCloseChannel = js.native
  
  var vhosts: Connection = js.native
}
object Redeliveries {
  
  @scala.inline
  def apply(
    publications: Confirm,
    redeliveries: Counters,
    subscriptions: DeferCloseChannel,
    vhosts: Connection
  ): Redeliveries = {
    val __obj = js.Dynamic.literal(publications = publications.asInstanceOf[js.Any], redeliveries = redeliveries.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], vhosts = vhosts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redeliveries]
  }
  
  @scala.inline
  implicit class RedeliveriesOps[Self <: Redeliveries] (val x: Self) extends AnyVal {
    
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
    def setPublications(value: Confirm): Self = this.set("publications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedeliveries(value: Counters): Self = this.set("redeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptions(value: DeferCloseChannel): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhosts(value: Connection): Self = this.set("vhosts", value.asInstanceOf[js.Any])
  }
}
