package typings.scrypt.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrypt", "verifyKdfSync")
@js.native
object verifyKdfSync extends js.Object {
  
  def apply(kdf: Buffer, key: String): Boolean = js.native
  def apply(kdf: Buffer, key: Buffer): Boolean = js.native
}
