package typings.rascal.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerConfig extends StObject {
  
  var defaults: js.UndefOr[VhostConfig] = js.undefined
  
  var encryption: js.UndefOr[StringDictionary[Encryption]] = js.undefined
  
  var publications: js.UndefOr[StringDictionary[PublicationConfig]] = js.undefined
  
  var recovery: js.UndefOr[StringDictionary[Recovery | js.Array[Recovery]]] = js.undefined
  
  var redeliveries: js.UndefOr[Redelivery] = js.undefined
  
  var subscriptions: js.UndefOr[StringDictionary[SubscriptionConfig]] = js.undefined
  
  var vhosts: js.UndefOr[StringDictionary[VhostConfig]] = js.undefined
}
object BrokerConfig {
  
  inline def apply(): BrokerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrokerConfig] (val x: Self) extends AnyVal {
    
    inline def setDefaults(value: VhostConfig): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setEncryption(value: StringDictionary[Encryption]): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    inline def setPublications(value: StringDictionary[PublicationConfig]): Self = StObject.set(x, "publications", value.asInstanceOf[js.Any])
    
    inline def setPublicationsUndefined: Self = StObject.set(x, "publications", js.undefined)
    
    inline def setRecovery(value: StringDictionary[Recovery | js.Array[Recovery]]): Self = StObject.set(x, "recovery", value.asInstanceOf[js.Any])
    
    inline def setRecoveryUndefined: Self = StObject.set(x, "recovery", js.undefined)
    
    inline def setRedeliveries(value: Redelivery): Self = StObject.set(x, "redeliveries", value.asInstanceOf[js.Any])
    
    inline def setRedeliveriesUndefined: Self = StObject.set(x, "redeliveries", js.undefined)
    
    inline def setSubscriptions(value: StringDictionary[SubscriptionConfig]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    inline def setVhosts(value: StringDictionary[VhostConfig]): Self = StObject.set(x, "vhosts", value.asInstanceOf[js.Any])
    
    inline def setVhostsUndefined: Self = StObject.set(x, "vhosts", js.undefined)
  }
}
