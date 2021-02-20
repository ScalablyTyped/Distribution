package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Redeliveries extends StObject {
  
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
  implicit class RedeliveriesMutableBuilder[Self <: Redeliveries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublications(value: Confirm): Self = StObject.set(x, "publications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedeliveries(value: Counters): Self = StObject.set(x, "redeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptions(value: DeferCloseChannel): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhosts(value: Connection): Self = StObject.set(x, "vhosts", value.asInstanceOf[js.Any])
  }
}
