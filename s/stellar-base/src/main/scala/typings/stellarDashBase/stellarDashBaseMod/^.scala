package typings.stellarDashBase.stellarDashBaseMod

import typings.node.Buffer
import typings.stellarDashBase.stellarDashBaseMod.xdrNs.Signature
import typings.stellarDashBase.stellarDashBaseNumbers.`0`
import typings.stellarDashBase.stellarDashBaseNumbers.`1`
import typings.stellarDashBase.stellarDashBaseNumbers.`2`
import typings.stellarDashBase.stellarDashBaseNumbers.`4`
import typings.stellarDashBase.stellarDashBaseStrings.`return`
import typings.stellarDashBase.stellarDashBaseStrings.hash
import typings.stellarDashBase.stellarDashBaseStrings.id
import typings.stellarDashBase.stellarDashBaseStrings.none
import typings.stellarDashBase.stellarDashBaseStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AuthImmutableFlag: `4` = js.native
  val AuthRequiredFlag: `1` = js.native
  val AuthRevocableFlag: `2` = js.native
  val FastSigning: Boolean = js.native
  val MemoHash: hash = js.native
  val MemoID: id = js.native
  val MemoNone: none = js.native
  val MemoReturn: `return` = js.native
  val MemoText: text = js.native
  val TimeoutInfinite: `0` = js.native
  def hash(data: Buffer): Buffer = js.native
  def sign(data: Buffer, rawSecret: Buffer): Signature = js.native
  def verify(data: Buffer, signature: Signature, rawPublicKey: Buffer): Boolean = js.native
}

