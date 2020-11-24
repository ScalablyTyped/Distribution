package typings.rascal.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerConfig extends js.Object {
  
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
  implicit class BrokerConfigOps[Self <: BrokerConfig] (val x: Self) extends AnyVal {
    
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
    def setDefaults(value: VhostConfig): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setEncryption(value: StringDictionary[Encryption]): Self = this.set("encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("encryption", js.undefined)
    
    @scala.inline
    def setPublications(value: StringDictionary[PublicationConfig]): Self = this.set("publications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublications: Self = this.set("publications", js.undefined)
    
    @scala.inline
    def setRecovery(value: StringDictionary[Recovery | js.Array[Recovery]]): Self = this.set("recovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecovery: Self = this.set("recovery", js.undefined)
    
    @scala.inline
    def setRedeliveries(value: Redelivery): Self = this.set("redeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedeliveries: Self = this.set("redeliveries", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: StringDictionary[SubscriptionConfig]): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptions: Self = this.set("subscriptions", js.undefined)
    
    @scala.inline
    def setVhosts(value: StringDictionary[VhostConfig]): Self = this.set("vhosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVhosts: Self = this.set("vhosts", js.undefined)
  }
}
