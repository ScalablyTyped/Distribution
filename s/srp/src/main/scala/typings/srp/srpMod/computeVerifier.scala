package typings.srp.srpMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("srp", "computeVerifier")
@js.native
object computeVerifier extends js.Object {
  def apply(params: Params, salt: Buffer, I: Buffer, P: Buffer): Buffer = js.native
}

