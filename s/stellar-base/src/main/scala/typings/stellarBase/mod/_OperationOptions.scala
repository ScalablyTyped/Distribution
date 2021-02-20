package typings.stellarBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _OperationOptions extends StObject
object _OperationOptions {
  
  @scala.inline
  def AccountMerge(destination: String): typings.stellarBase.mod.OperationOptions.AccountMerge = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.AccountMerge]
  }
  
  @scala.inline
  def AllowTrust(assetCode: String, trustor: String): typings.stellarBase.mod.OperationOptions.AllowTrust = {
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.AllowTrust]
  }
  
  @scala.inline
  def BeginSponsoringFutureReserves(sponsoredId: String): typings.stellarBase.mod.OperationOptions.BeginSponsoringFutureReserves = {
    val __obj = js.Dynamic.literal(sponsoredId = sponsoredId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.BeginSponsoringFutureReserves]
  }
  
  @scala.inline
  def BumpSequence(bumpTo: String): typings.stellarBase.mod.OperationOptions.BumpSequence = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.BumpSequence]
  }
  
  @scala.inline
  def ChangeTrust(asset: Asset): typings.stellarBase.mod.OperationOptions.ChangeTrust = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.ChangeTrust]
  }
  
  @scala.inline
  def ClaimClaimableBalance(balanceId: String): typings.stellarBase.mod.OperationOptions.ClaimClaimableBalance = {
    val __obj = js.Dynamic.literal(balanceId = balanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.ClaimClaimableBalance]
  }
  
  @scala.inline
  def CreateAccount(destination: String, startingBalance: String): typings.stellarBase.mod.OperationOptions.CreateAccount = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], startingBalance = startingBalance.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.CreateAccount]
  }
  
  @scala.inline
  def CreateClaimableBalance(amount: String, asset: Asset, claimants: js.Array[Claimant]): typings.stellarBase.mod.OperationOptions.CreateClaimableBalance = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], claimants = claimants.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.CreateClaimableBalance]
  }
  
  @scala.inline
  def CreatePassiveSellOffer(amount: String, buying: Asset, price: Double | String | js.Object, selling: Asset): typings.stellarBase.mod.OperationOptions.CreatePassiveSellOffer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.CreatePassiveSellOffer]
  }
  
  @scala.inline
  def ManageBuyOffer(buyAmount: String, buying: Asset, price: Double | String | js.Object, selling: Asset): typings.stellarBase.mod.OperationOptions.ManageBuyOffer = {
    val __obj = js.Dynamic.literal(buyAmount = buyAmount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.ManageBuyOffer]
  }
  
  @scala.inline
  def ManageData(name: String): typings.stellarBase.mod.OperationOptions.ManageData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.ManageData]
  }
  
  @scala.inline
  def ManageSellOffer(amount: String, buying: Asset, price: Double | String | js.Object, selling: Asset): typings.stellarBase.mod.OperationOptions.ManageSellOffer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.ManageSellOffer]
  }
  
  @scala.inline
  def PathPaymentStrictReceive(destAmount: String, destAsset: Asset, destination: String, sendAsset: Asset, sendMax: String): typings.stellarBase.mod.OperationOptions.PathPaymentStrictReceive = {
    val __obj = js.Dynamic.literal(destAmount = destAmount.asInstanceOf[js.Any], destAsset = destAsset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any], sendMax = sendMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.PathPaymentStrictReceive]
  }
  
  @scala.inline
  def PathPaymentStrictSend(destAsset: Asset, destMin: String, destination: String, sendAmount: String, sendAsset: Asset): typings.stellarBase.mod.OperationOptions.PathPaymentStrictSend = {
    val __obj = js.Dynamic.literal(destAsset = destAsset.asInstanceOf[js.Any], destMin = destMin.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], sendAmount = sendAmount.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.PathPaymentStrictSend]
  }
  
  @scala.inline
  def Payment(amount: String, asset: Asset, destination: String): typings.stellarBase.mod.OperationOptions.Payment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.Payment]
  }
  
  @scala.inline
  def RevokeAccountSponsorship(account: String): typings.stellarBase.mod.OperationOptions.RevokeAccountSponsorship = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.RevokeAccountSponsorship]
  }
  
  @scala.inline
  def RevokeClaimableBalanceSponsorship(balanceId: String): typings.stellarBase.mod.OperationOptions.RevokeClaimableBalanceSponsorship = {
    val __obj = js.Dynamic.literal(balanceId = balanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.RevokeClaimableBalanceSponsorship]
  }
  
  @scala.inline
  def RevokeDataSponsorship(account: String, name: String): typings.stellarBase.mod.OperationOptions.RevokeDataSponsorship = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.RevokeDataSponsorship]
  }
  
  @scala.inline
  def RevokeOfferSponsorship(offerId: String, seller: String): typings.stellarBase.mod.OperationOptions.RevokeOfferSponsorship = {
    val __obj = js.Dynamic.literal(offerId = offerId.asInstanceOf[js.Any], seller = seller.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.RevokeOfferSponsorship]
  }
  
  @scala.inline
  def RevokeSignerSponsorship(account: String, signer: SignerKeyOptions): typings.stellarBase.mod.OperationOptions.RevokeSignerSponsorship = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.RevokeSignerSponsorship]
  }
  
  @scala.inline
  def RevokeTrustlineSponsorship(account: String, asset: Asset): typings.stellarBase.mod.OperationOptions.RevokeTrustlineSponsorship = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarBase.mod.OperationOptions.RevokeTrustlineSponsorship]
  }
}
