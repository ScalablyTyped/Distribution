package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_pwhash_str_verify")
@js.native
object cryptoPwhashStrVerify extends js.Object {
  
  def apply(str: Buffer, password: Buffer): Boolean = js.native
}
