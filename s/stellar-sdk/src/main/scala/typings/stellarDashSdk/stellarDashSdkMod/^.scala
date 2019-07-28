package typings.stellarDashSdk.stellarDashSdkMod

import typings.node.Buffer
import typings.stellarDashBase.stellarDashBaseMod.xdrNs.Signature
import typings.stellarDashSdk.stellarDashSdkNumbers.`1`
import typings.stellarDashSdk.stellarDashSdkNumbers.`2`
import typings.stellarDashSdk.stellarDashSdkNumbers.`4`
import typings.stellarDashSdk.stellarDashSdkStrings.`return`
import typings.stellarDashSdk.stellarDashSdkStrings.hash
import typings.stellarDashSdk.stellarDashSdkStrings.id
import typings.stellarDashSdk.stellarDashSdkStrings.none
import typings.stellarDashSdk.stellarDashSdkStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", JSImport.Namespace)
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
  def hash(data: Buffer): Buffer = js.native
  def sign(data: Buffer, rawSecret: Buffer): Signature = js.native
  def verify(data: Buffer, signature: Signature, rawPublicKey: Buffer): Boolean = js.native
}

