package typings.stellarDashSdk.stellarDashSdkMod

import typings.node.Buffer
import typings.stellarDashBase.Anon_Hint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr")
@js.native
object xdr extends js.Object {
  @js.native
  class Asset ()
    extends typings.stellarDashBase.stellarDashBaseMod.xdr.Asset
  
  @js.native
  class DecoratedSignature protected ()
    extends typings.stellarDashBase.stellarDashBaseMod.xdr.DecoratedSignature {
    def this(keys: Anon_Hint) = this()
  }
  
  @js.native
  class Memo ()
    extends typings.stellarDashBase.stellarDashBaseMod.xdr.Memo
  
  // tslint:disable-line:strict-export-declare-modifiers
  @js.native
  class Operation[T /* <: typings.stellarDashBase.stellarDashBaseMod.Operation */] ()
    extends typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[T]
  
  @js.native
  class TransactionEnvelope ()
    extends typings.stellarDashBase.stellarDashBaseMod.xdr.TransactionEnvelope
  
  @js.native
  class TransactionResult ()
    extends typings.stellarDashBase.stellarDashBaseMod.xdr.TransactionResult
  
  @js.native
  class XDRStruct ()
    extends typings.stellarDashBase.stellarDashBaseMod.xdr.XDRStruct
  
  /* static members */
  @js.native
  object Asset extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarDashBase.stellarDashBaseMod.xdr.Asset = js.native
  }
  
  /* static members */
  @js.native
  object DecoratedSignature extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarDashBase.stellarDashBaseMod.xdr.DecoratedSignature = js.native
  }
  
  /* static members */
  @js.native
  object Memo extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarDashBase.stellarDashBaseMod.xdr.Memo = js.native
  }
  
  /* static members */
  @js.native
  object Operation extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[typings.stellarDashBase.stellarDashBaseMod.Operation] = js.native
  }
  
  /* static members */
  @js.native
  object TransactionEnvelope extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarDashBase.stellarDashBaseMod.xdr.TransactionEnvelope = js.native
  }
  
  /* static members */
  @js.native
  object TransactionResult extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarDashBase.stellarDashBaseMod.xdr.TransactionResult = js.native
  }
  
  /* static members */
  @js.native
  object XDRStruct extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarDashBase.stellarDashBaseMod.xdr.XDRStruct = js.native
  }
  
}

