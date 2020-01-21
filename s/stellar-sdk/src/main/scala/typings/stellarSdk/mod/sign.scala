package typings.stellarSdk.mod

import typings.node.Buffer
import typings.stellarBase.mod.xdr.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "sign")
@js.native
object sign extends js.Object {
  def apply(data: Buffer, rawSecret: Buffer): Signature = js.native
}

