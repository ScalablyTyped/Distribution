package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr")
@js.native
object xdrNs extends js.Object {
  @js.native
  class Asset ()
    extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Asset
  
  @js.native
  class DecoratedSignature protected ()
    extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.DecoratedSignature {
    def this(keys: stellarDashSdkLib.Anon_Hint) = this()
  }
  
  @js.native
  class Memo ()
    extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Memo
  
  @js.native
  class Operation[T /* <: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType] */] ()
    extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[T]
  
  @js.native
  class TransactionEnvelope ()
    extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.TransactionEnvelope
  
  @js.native
  class TransactionResult ()
    extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.TransactionResult
  
  @js.native
  class XDRStruct ()
    extends stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.XDRStruct
  
  @js.native
  object Asset extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Asset = js.native
  }
  
  @js.native
  object DecoratedSignature extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.DecoratedSignature = js.native
  }
  
  @js.native
  object Memo extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Memo = js.native
  }
  
  @js.native
  object Operation extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.Operation[
        stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationNs.Operation[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.OperationType]
      ] = js.native
  }
  
  @js.native
  object TransactionEnvelope extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.TransactionEnvelope = js.native
  }
  
  @js.native
  object TransactionResult extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.TransactionResult = js.native
  }
  
  @js.native
  object XDRStruct extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.xdrNs.XDRStruct = js.native
  }
  
}

