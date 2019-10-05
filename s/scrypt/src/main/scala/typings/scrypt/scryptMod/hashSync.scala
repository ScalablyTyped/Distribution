package typings.scrypt.scryptMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrypt", "hashSync")
@js.native
object hashSync extends js.Object {
  def apply(key: String, params: Params, outputLength: Double, salt: String): Buffer = js.native
  def apply(key: String, params: Params, outputLength: Double, salt: Buffer): Buffer = js.native
  def apply(key: Buffer, params: Params, outputLength: Double, salt: String): Buffer = js.native
  def apply(key: Buffer, params: Params, outputLength: Double, salt: Buffer): Buffer = js.native
}

