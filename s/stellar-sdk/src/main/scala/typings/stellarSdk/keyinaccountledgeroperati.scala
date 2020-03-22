package typings.stellarSdk

import typings.stellarSdk.horizonApiMod.Horizon.ResponseLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in 'account' | 'ledger' | 'operations' | 'effects' | 'succeeds' | 'precedes' | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink} */
trait keyinaccountledgeroperati extends js.Object {
  var account: ResponseLink
  var effects: ResponseLink
  var ledger: ResponseLink
  var operations: ResponseLink
  var precedes: ResponseLink
  var self: ResponseLink
  var succeeds: ResponseLink
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
}

