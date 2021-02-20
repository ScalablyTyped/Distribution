package typings.rascal.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerConfig extends StObject {
  
  var defaults: js.UndefOr[VhostConfig] = js.native
  
  var encryption: js.UndefOr[StringDictionary[Encryption]] = js.native
  
  var publications: js.UndefOr[StringDictionary[PublicationConfig]] = js.native
  
  var recovery: js.UndefOr[StringDictionary[Recovery | js.Array[Recovery]]] = js.native
  
  var redeliveries: js.UndefOr[Redelivery] = js.native
  
  var subscriptions: js.UndefOr[StringDictionary[SubscriptionConfig]] = js.native
  
  var vhosts: js.UndefOr[StringDictionary[VhostConfig]] = js.native
}
object BrokerConfig {
  
  @scala.inline
  def apply(): BrokerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerConfig]
  }
  
  @scala.inline
  implicit class BrokerConfigMutableBuilder[Self <: BrokerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaults(value: VhostConfig): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    @scala.inline
    def setEncryption(value: StringDictionary[Encryption]): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    @scala.inline
    def setPublications(value: StringDictionary[PublicationConfig]): Self = StObject.set(x, "publications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicationsUndefined: Self = StObject.set(x, "publications", js.undefined)
    
    @scala.inline
    def setRecovery(value: StringDictionary[Recovery | js.Array[Recovery]]): Self = StObject.set(x, "recovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryUndefined: Self = StObject.set(x, "recovery", js.undefined)
    
    @scala.inline
    def setRedeliveries(value: Redelivery): Self = StObject.set(x, "redeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedeliveriesUndefined: Self = StObject.set(x, "redeliveries", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: StringDictionary[SubscriptionConfig]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    @scala.inline
    def setVhosts(value: StringDictionary[VhostConfig]): Self = StObject.set(x, "vhosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhostsUndefined: Self = StObject.set(x, "vhosts", js.undefined)
  }
}
