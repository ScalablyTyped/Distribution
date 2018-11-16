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
  class XDRStruct () extends js.Object {
    def toXDR(): nodeLib.Buffer = js.native
    def toXDR(encoding: java.lang.String): java.lang.String = js.native
  }
  
  @js.native
  object XDRStruct extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.xdrNs.XDRStruct = js.native
  }
  
  type Signature = nodeLib.Buffer
  type SignatureHint = nodeLib.Buffer
}

