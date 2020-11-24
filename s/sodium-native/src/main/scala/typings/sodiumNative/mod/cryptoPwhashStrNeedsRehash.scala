package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_pwhash_str_needs_rehash")
@js.native
object cryptoPwhashStrNeedsRehash extends js.Object {
  
  def apply(hash: Buffer, opslimit: Double, memlimit: Double): Boolean = js.native
}
