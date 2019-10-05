package typings.stellarDashBase.stellarDashBaseMod

import typings.node.Buffer
import typings.stellarDashBase.stellarDashBaseMod.xdr.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "sign")
@js.native
object sign extends js.Object {
  def apply(data: Buffer, rawSecret: Buffer): Signature = js.native
}

