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
    extends stellarDashBaseLib.stellarDashBaseMod.xdrNs.Asset
  
  @js.native
  class DecoratedSignature protected ()
    extends stellarDashBaseLib.stellarDashBaseMod.xdrNs.DecoratedSignature {
    def this(keys: stellarDashBaseLib.Anon_Hint) = this()
  }
  
  @js.native
  class Memo ()
    extends stellarDashBaseLib.stellarDashBaseMod.xdrNs.Memo
  
  @js.native
  class TransactionEnvelope ()
    extends stellarDashBaseLib.stellarDashBaseMod.xdrNs.TransactionEnvelope
  
  @js.native
  class TransactionResult ()
    extends stellarDashBaseLib.stellarDashBaseMod.xdrNs.TransactionResult
  
  @js.native
  class XDRStruct ()
    extends stellarDashBaseLib.stellarDashBaseMod.xdrNs.XDRStruct
  
  /* static members */
  @js.native
  object Asset extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Asset = js.native
  }
  
  /* static members */
  @js.native
  object DecoratedSignature extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.DecoratedSignature = js.native
  }
  
  /* static members */
  @js.native
  object Memo extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Memo = js.native
  }
  
  /* static members */
  @js.native
  object TransactionEnvelope extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.TransactionEnvelope = js.native
  }
  
  /* static members */
  @js.native
  object TransactionResult extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.TransactionResult = js.native
  }
  
  /* static members */
  @js.native
  object XDRStruct extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.XDRStruct = js.native
  }
  
}

