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
  val MemoHash: stellarDashBaseLib.stellarDashBaseLibStrings.hash = js.native
  val MemoID: stellarDashBaseLib.stellarDashBaseLibStrings.id = js.native
  val MemoNone: stellarDashBaseLib.stellarDashBaseLibStrings.none = js.native
  val MemoReturn: stellarDashBaseLib.stellarDashBaseLibStrings.`return` = js.native
  val MemoText: stellarDashBaseLib.stellarDashBaseLibStrings.text = js.native
  val TimeoutInfinite: stellarDashBaseLib.stellarDashBaseLibNumbers.`0` = js.native
  def hash(data: nodeLib.Buffer): nodeLib.Buffer = js.native
  def sign(data: nodeLib.Buffer, rawSecret: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Signature = js.native
  def verify(
    data: nodeLib.Buffer,
    signature: stellarDashBaseLib.stellarDashBaseMod.xdrNs.Signature,
    rawPublicKey: nodeLib.Buffer
  ): scala.Boolean = js.native
}

