package typings.stellarBase.mod

import typings.stellarBase.anon.MaxTimeMinTime
import typings.stellarBase.mod.TransactionBuilder.TransactionBuilderOptions
import typings.stellarBase.xdrMod.default.TransactionEnvelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "TransactionBuilder")
@js.native
class TransactionBuilder protected () extends StObject {
  def this(sourceAccount: Account) = this()
  def this(sourceAccount: Account, options: TransactionBuilderOptions) = this()
  
  def addMemo(memo: Memo[MemoType]): this.type = js.native
  
  def addOperation(operation: typings.stellarBase.xdrMod.default.Operation[Operation]): this.type = js.native
  
  def build(): Transaction[Memo[MemoType], js.Array[Operation]] = js.native
  
  def setNetworkPassphrase(networkPassphrase: String): this.type = js.native
  
  def setTimeout(timeoutInSeconds: Double): this.type = js.native
}
/* static members */
object TransactionBuilder {
  
  @JSImport("stellar-base", "TransactionBuilder.buildFeeBumpTransaction")
  @js.native
  def buildFeeBumpTransaction(
    feeSource: Keypair,
    baseFee: String,
    innerTx: Transaction[Memo[MemoType], js.Array[Operation]],
    networkPassphrase: String
  ): FeeBumpTransaction = js.native
  
  @JSImport("stellar-base", "TransactionBuilder.fromXDR")
  @js.native
  def fromXDR(envelope: String, networkPassphrase: String): (Transaction[Memo[MemoType], js.Array[Operation]]) | FeeBumpTransaction = js.native
  @JSImport("stellar-base", "TransactionBuilder.fromXDR")
  @js.native
  def fromXDR(envelope: TransactionEnvelope, networkPassphrase: String): (Transaction[Memo[MemoType], js.Array[Operation]]) | FeeBumpTransaction = js.native
  
  @js.native
  trait TransactionBuilderOptions extends StObject {
    
    var fee: String = js.native
    
    var memo: js.UndefOr[Memo[MemoType]] = js.native
    
    var networkPassphrase: js.UndefOr[String] = js.native
    
    var timebounds: js.UndefOr[MaxTimeMinTime] = js.native
    
    var v1: js.UndefOr[Boolean] = js.native
  }
  object TransactionBuilderOptions {
    
    @scala.inline
    def apply(fee: String): TransactionBuilderOptions = {
      val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionBuilderOptions]
    }
    
    @scala.inline
    implicit class TransactionBuilderOptionsMutableBuilder[Self <: TransactionBuilderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFee(value: String): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemo(value: Memo[MemoType]): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoUndefined: Self = StObject.set(x, "memo", js.undefined)
      
      @scala.inline
      def setNetworkPassphrase(value: String): Self = StObject.set(x, "networkPassphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkPassphraseUndefined: Self = StObject.set(x, "networkPassphrase", js.undefined)
      
      @scala.inline
      def setTimebounds(value: MaxTimeMinTime): Self = StObject.set(x, "timebounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeboundsUndefined: Self = StObject.set(x, "timebounds", js.undefined)
      
      @scala.inline
      def setV1(value: Boolean): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV1Undefined: Self = StObject.set(x, "v1", js.undefined)
    }
  }
}
