package typings.stellarSdk

import typings.stellarBase.mod.AssetType
import typings.stellarBase.mod.Memo
import typings.stellarBase.mod.MemoType
import typings.stellarBase.mod.Operation
import typings.stellarBase.mod.Transaction
import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData
import typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.InternalServerError
import typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.RateLimitExceeded
import typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.TransactionFailed
import typings.stellarSdk.horizonApiMod.Horizon.ResponseLink
import typings.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Amount extends StObject {
    
    var amount: String = js.native
    
    var price: String = js.native
    
    var price_r: D = js.native
  }
  object Amount {
    
    @scala.inline
    def apply(amount: String, price: String, price_r: D): Amount = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_r = price_r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Amount]
    }
    
    @scala.inline
    implicit class AmountMutableBuilder[Self <: Amount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrice_r(value: D): Self = StObject.set(x, "price_r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Assetcode extends StObject {
    
    var asset_code: String = js.native
    
    var asset_issuer: String = js.native
    
    var asset_type: AssetType = js.native
  }
  object Assetcode {
    
    @scala.inline
    def apply(asset_code: String, asset_issuer: String, asset_type: AssetType): Assetcode = {
      val __obj = js.Dynamic.literal(asset_code = asset_code.asInstanceOf[js.Any], asset_issuer = asset_issuer.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assetcode]
    }
    
    @scala.inline
    implicit class AssetcodeMutableBuilder[Self <: Assetcode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsset_code(value: String): Self = StObject.set(x, "asset_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsset_issuer(value: String): Self = StObject.set(x, "asset_issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsset_type(value: AssetType): Self = StObject.set(x, "asset_type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Assetissuer extends StObject {
    
    var asset_code: String = js.native
    
    var asset_issuer: String = js.native
    
    var asset_type: String = js.native
  }
  object Assetissuer {
    
    @scala.inline
    def apply(asset_code: String, asset_issuer: String, asset_type: String): Assetissuer = {
      val __obj = js.Dynamic.literal(asset_code = asset_code.asInstanceOf[js.Any], asset_issuer = asset_issuer.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assetissuer]
    }
    
    @scala.inline
    implicit class AssetissuerMutableBuilder[Self <: Assetissuer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsset_code(value: String): Self = StObject.set(x, "asset_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsset_issuer(value: String): Self = StObject.set(x, "asset_issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsset_type(value: String): Self = StObject.set(x, "asset_type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClientAccountID extends StObject {
    
    var clientAccountID: String = js.native
    
    var matchedHomeDomain: String = js.native
    
    var tx: Transaction[Memo[MemoType], js.Array[Operation]] = js.native
  }
  object ClientAccountID {
    
    @scala.inline
    def apply(
      clientAccountID: String,
      matchedHomeDomain: String,
      tx: Transaction[Memo[MemoType], js.Array[Operation]]
    ): ClientAccountID = {
      val __obj = js.Dynamic.literal(clientAccountID = clientAccountID.asInstanceOf[js.Any], matchedHomeDomain = matchedHomeDomain.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientAccountID]
    }
    
    @scala.inline
    implicit class ClientAccountIDMutableBuilder[Self <: ClientAccountID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientAccountID(value: String): Self = StObject.set(x, "clientAccountID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchedHomeDomain(value: String): Self = StObject.set(x, "matchedHomeDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTx(value: Transaction[Memo[MemoType], js.Array[Operation]]): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait D extends StObject {
    
    var d: Double = js.native
    
    var n: Double = js.native
  }
  object D {
    
    @scala.inline
    def apply(d: Double, n: Double): D = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[D]
    }
    
    @scala.inline
    implicit class DMutableBuilder[Self <: D] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var data: js.UndefOr[ErrorResponseData] = js.native
    
    var status: js.UndefOr[Double] = js.native
    
    var statusText: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Data {
    
    @scala.inline
    def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: ErrorResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Next extends StObject {
    
    var next: ResponseLink = js.native
    
    var prev: ResponseLink = js.native
    
    var self: ResponseLink = js.native
  }
  object Next {
    
    @scala.inline
    def apply(next: ResponseLink, prev: ResponseLink, self: ResponseLink): Next = {
      val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
      __obj.asInstanceOf[Next]
    }
    
    @scala.inline
    implicit class NextMutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: ResponseLink): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev(value: ResponseLink): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelf(value: ResponseLink): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Operations extends StObject {
    
    var operations: js.Array[String] = js.native
    
    var transaction: TransactionFailedResultCodes = js.native
  }
  object Operations {
    
    @scala.inline
    def apply(operations: js.Array[String], transaction: TransactionFailedResultCodes): Operations = {
      val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Operations]
    }
    
    @scala.inline
    implicit class OperationsMutableBuilder[Self <: Operations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOperations(value: js.Array[String]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationsVarargs(value: String*): Self = StObject.set(x, "operations", js.Array(value :_*))
      
      @scala.inline
      def setTransaction(value: TransactionFailedResultCodes): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Records[T /* <: BaseResponse[scala.Nothing] */] extends StObject {
    
    var records: js.Array[T] = js.native
  }
  object Records {
    
    @scala.inline
    def apply[T /* <: BaseResponse[scala.Nothing] */](records: js.Array[T]): Records[T] = {
      val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[Records[T]]
    }
    
    @scala.inline
    implicit class RecordsMutableBuilder[Self <: Records[_], T /* <: BaseResponse[scala.Nothing] */] (val x: Self with Records[T]) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[T]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: T*): Self = StObject.set(x, "records", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Status extends StObject {
    
    var data: js.UndefOr[RateLimitExceeded | InternalServerError | TransactionFailed] = js.native
    
    var status: js.UndefOr[Double] = js.native
    
    var statusText: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Status {
    
    @scala.inline
    def apply(): Status = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: RateLimitExceeded | InternalServerError | TransactionFailed): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var value: String = js.native
  }
  object Value {
    
    @scala.inline
    def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in 'account' | 'ledger' | 'operations' | 'effects' | 'succeeds' | 'precedes' | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink} */
  @js.native
  trait keyinaccountledgeroperati extends StObject {
    
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
    implicit class keyinaccountledgeroperatiMutableBuilder[Self <: keyinaccountledgeroperati] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: ResponseLink): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffects(value: ResponseLink): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLedger(value: ResponseLink): Self = StObject.set(x, "ledger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperations(value: ResponseLink): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecedes(value: ResponseLink): Self = StObject.set(x, "precedes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelf(value: ResponseLink): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSucceeds(value: ResponseLink): Self = StObject.set(x, "succeeds", value.asInstanceOf[js.Any])
    }
  }
}
