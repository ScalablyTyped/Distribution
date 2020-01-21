package typings.stellarSdk.mod

import typings.node.Buffer
import typings.stellarBase.AnonHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr")
@js.native
object xdr extends js.Object {
  @js.native
  class Asset ()
    extends typings.stellarBase.mod.xdr.Asset
  
  @js.native
  class DecoratedSignature protected ()
    extends typings.stellarBase.mod.xdr.DecoratedSignature {
    def this(keys: AnonHint) = this()
  }
  
  @js.native
  class Memo ()
    extends typings.stellarBase.mod.xdr.Memo
  
  // tslint:disable-line:strict-export-declare-modifiers
  @js.native
  class Operation[T /* <: typings.stellarBase.mod.Operation */] ()
    extends typings.stellarBase.mod.xdr.Operation[T]
  
  @js.native
  class TransactionEnvelope ()
    extends typings.stellarBase.mod.xdr.TransactionEnvelope
  
  @js.native
  class TransactionResult ()
    extends typings.stellarBase.mod.xdr.TransactionResult
  
  @js.native
  class XDRStruct ()
    extends typings.stellarBase.mod.xdr.XDRStruct
  
  /* static members */
  @js.native
  object Asset extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarBase.mod.xdr.Asset = js.native
  }
  
  /* static members */
  @js.native
  object DecoratedSignature extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarBase.mod.xdr.DecoratedSignature = js.native
  }
  
  /* static members */
  @js.native
  object Memo extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarBase.mod.xdr.Memo = js.native
  }
  
  /* static members */
  @js.native
  object Operation extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarBase.mod.xdr.Operation[typings.stellarBase.mod.Operation] = js.native
  }
  
  /* static members */
  @js.native
  object TransactionEnvelope extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarBase.mod.xdr.TransactionEnvelope = js.native
  }
  
  /* static members */
  @js.native
  object TransactionResult extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarBase.mod.xdr.TransactionResult = js.native
  }
  
  /* static members */
  @js.native
  object XDRStruct extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarBase.mod.xdr.XDRStruct = js.native
  }
  
}

