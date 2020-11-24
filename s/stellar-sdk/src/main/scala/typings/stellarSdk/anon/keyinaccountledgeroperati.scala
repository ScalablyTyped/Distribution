package typings.stellarSdk.anon

import typings.stellarSdk.horizonApiMod.Horizon.ResponseLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in 'account' | 'ledger' | 'operations' | 'effects' | 'succeeds' | 'precedes' | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink} */
@js.native
trait keyinaccountledgeroperati extends js.Object {
  
  var account: ResponseLink = js.native
  
  var effects: ResponseLink = js.native
  
  var ledger: ResponseLink = js.native
  
  var operations: ResponseLink = js.native
  
  var precedes: ResponseLink = js.native
  
  var self: ResponseLink = js.native
  
  var succeeds: ResponseLink = js.native
}
object keyinaccountledgeroperati {
  
  @scala.inline
  def apply(
    account: ResponseLink,
    effects: ResponseLink,
    ledger: ResponseLink,
    operations: ResponseLink,
    precedes: ResponseLink,
    self: ResponseLink,
    succeeds: ResponseLink
  ): keyinaccountledgeroperati = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], ledger = ledger.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], precedes = precedes.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], succeeds = succeeds.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinaccountledgeroperati]
  }
  
  @scala.inline
  implicit class keyinaccountledgeroperatiOps[Self <: keyinaccountledgeroperati] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: ResponseLink): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffects(value: ResponseLink): Self = this.set("effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedger(value: ResponseLink): Self = this.set("ledger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: ResponseLink): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecedes(value: ResponseLink): Self = this.set("precedes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: ResponseLink): Self = this.set("self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeds(value: ResponseLink): Self = this.set("succeeds", value.asInstanceOf[js.Any])
  }
}
