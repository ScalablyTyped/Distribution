package typings.stellarBase.mod

import typings.node.Buffer
import typings.stellarBase.mod.xdr.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "verify")
@js.native
object verify extends js.Object {
  def apply(data: Buffer, signature: Signature, rawPublicKey: Buffer): Boolean = js.native
}

