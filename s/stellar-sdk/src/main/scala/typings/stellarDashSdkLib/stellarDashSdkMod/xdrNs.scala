package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr")
@js.native
object xdrNs extends js.Object {
  @js.native
  class Asset () extends XDRStruct
  
  @js.native
  class DecoratedSignature protected () extends XDRStruct {
    def this(keys: stellarDashSdkLib.Anon_Hint) = this()
    def hint(): SignatureHint = js.native
    def signature(): nodeLib.Buffer = js.native
  }
  
  @js.native
  class Memo () extends XDRStruct
  
  @js.native
  class Operation[T /* <: stellarDashSdkLib.stellarDashSdkMod.OperationNs.Operation */] () extends XDRStruct
  
  @js.native
  class TransactionEnvelope () extends XDRStruct
  
  @js.native
  class TransactionResult () extends XDRStruct
  
  @js.native
  class XDRStruct () extends js.Object {
    def toXDR(): nodeLib.Buffer = js.native
    def toXDR(encoding: java.lang.String): java.lang.String = js.native
    @JSName("toXDR")
    def toXDR_Buffer(base: java.lang.String): nodeLib.Buffer = js.native
  }
  
  @js.native
  object Asset extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Asset = js.native
  }
  
  @js.native
  object DecoratedSignature extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.xdrNs.DecoratedSignature = js.native
  }
  
  @js.native
  object Memo extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Memo = js.native
  }
  
  @js.native
  object Operation extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Operation[stellarDashSdkLib.stellarDashSdkMod.OperationNs.Operation] = js.native
  }
  
  @js.native
  object TransactionEnvelope extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.xdrNs.TransactionEnvelope = js.native
  }
  
  @js.native
  object TransactionResult extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.xdrNs.TransactionResult = js.native
  }
  
  @js.native
  object XDRStruct extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.xdrNs.XDRStruct = js.native
  }
  
  type Signature = nodeLib.Buffer
  type SignatureHint = nodeLib.Buffer
}

