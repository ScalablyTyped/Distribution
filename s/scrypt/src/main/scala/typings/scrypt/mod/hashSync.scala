package typings.scrypt.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrypt", "hashSync")
@js.native
object hashSync extends js.Object {
  
  def apply(key: String, params: Params_, outputLength: Double, salt: String): Buffer = js.native
  def apply(key: String, params: Params_, outputLength: Double, salt: Buffer): Buffer = js.native
  def apply(key: Buffer, params: Params_, outputLength: Double, salt: String): Buffer = js.native
  def apply(key: Buffer, params: Params_, outputLength: Double, salt: Buffer): Buffer = js.native
}
