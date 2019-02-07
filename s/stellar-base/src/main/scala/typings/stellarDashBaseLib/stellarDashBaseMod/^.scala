package typings
package stellarDashBaseLib.stellarDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AuthImmutableFlag: stellarDashBaseLib.stellarDashBaseLibNumbers.`4` = js.native
  val AuthRequiredFlag: stellarDashBaseLib.stellarDashBaseLibNumbers.`1` = js.native
  val AuthRevocableFlag: stellarDashBaseLib.stellarDashBaseLibNumbers.`2` = js.native
  val FastSigning: scala.Boolean = js.native
  val MemoHash: /* hash */ java.lang.String = js.native
  val MemoID: /* id */ java.lang.String = js.native
  val MemoNone: /* none */ java.lang.String = js.native
  val MemoReturn: /* return */ java.lang.String = js.native
  val MemoText: /* text */ java.lang.String = js.native
  val TimeoutInfinite: /* 0 */ scala.Double = js.native
  def hash(data: nodeLib.Buffer): nodeLib.Buffer = js.native
  def sign(data: nodeLib.Buffer, rawSecret: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Signature = js.native
  def verify(
    data: nodeLib.Buffer,
    signature: stellarDashBaseLib.stellarDashBaseMod.xdrNs.Signature,
    rawPublicKey: nodeLib.Buffer
  ): scala.Boolean = js.native
}

