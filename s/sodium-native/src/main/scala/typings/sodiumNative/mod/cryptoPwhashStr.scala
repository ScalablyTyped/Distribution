package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_pwhash_str")
@js.native
object cryptoPwhashStr extends js.Object {
  
  def apply(output: Buffer, password: Buffer, opslimit: Double, memlimit: Double): Unit = js.native
}
