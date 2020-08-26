package typings.stellarSdk.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "verify")
@js.native
object verify extends js.Object {
  def apply(data: Buffer, signature: Buffer, rawPublicKey: Buffer): Boolean = js.native
}

