package typings.stellarBase.mod

import typings.node.Buffer
import typings.stellarBase.anon.Hint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr")
@js.native
object xdr extends js.Object {
  @js.native
  class Asset () extends XDRStruct
  
  @js.native
  class DecoratedSignature protected () extends XDRStruct {
    def this(keys: Hint) = this()
    def hint(): SignatureHint = js.native
    def signature(): Buffer = js.native
  }
  
  @js.native
  class Memo () extends XDRStruct
  
  // tslint:disable-line:strict-export-declare-modifiers
  @js.native
  class Operation[T /* <: typings.stellarBase.mod.Operation */] () extends XDRStruct
  
  @js.native
  class TransactionEnvelope () extends XDRStruct
  
  @js.native
  class TransactionResult () extends XDRStruct
  
  @js.native
  class XDRStruct () extends js.Object {
    def toXDR(): Buffer = js.native
    def toXDR(encoding: String): String = js.native
    @JSName("toXDR")
    def toXDR_Buffer(base: String): Buffer = js.native
  }
  
  /* static members */
  @js.native
  object Asset extends js.Object {
    def fromXDR(xdr: Buffer): typings.stellarBase.mod.xdr.Asset = js.native
  }
  
  /* static members */
  @js.native
  object DecoratedSignature extends js.Object {
    def fromXDR(xdr: Buffer): DecoratedSignature = js.native
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
    def fromXDR(xdr: Buffer): TransactionEnvelope = js.native
  }
  
  /* static members */
  @js.native
  object TransactionResult extends js.Object {
    def fromXDR(xdr: Buffer): TransactionResult = js.native
  }
  
  /* static members */
  @js.native
  object XDRStruct extends js.Object {
    def fromXDR(xdr: Buffer): XDRStruct = js.native
  }
  
  type Signature = Buffer
  type SignatureHint = Buffer
}

