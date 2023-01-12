package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Publications extends StObject {
  
  var publications: Confirm
  
  var redeliveries: Counters
  
  var subscriptions: DeferCloseChannel
  
  var vhosts: Bindings
}
object Publications {
  
  inline def apply(publications: Confirm, redeliveries: Counters, subscriptions: DeferCloseChannel, vhosts: Bindings): Publications = {
    val __obj = js.Dynamic.literal(publications = publications.asInstanceOf[js.Any], redeliveries = redeliveries.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], vhosts = vhosts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Publications]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Publications] (val x: Self) extends AnyVal {
    
    inline def setPublications(value: Confirm): Self = StObject.set(x, "publications", value.asInstanceOf[js.Any])
    
    inline def setRedeliveries(value: Counters): Self = StObject.set(x, "redeliveries", value.asInstanceOf[js.Any])
    
    inline def setSubscriptions(value: DeferCloseChannel): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setVhosts(value: Bindings): Self = StObject.set(x, "vhosts", value.asInstanceOf[js.Any])
  }
}
