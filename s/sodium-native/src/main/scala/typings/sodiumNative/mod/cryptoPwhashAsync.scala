package typings.sodiumNative.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_pwhash_async")
@js.native
object cryptoPwhashAsync extends js.Object {
  
  def apply(
    output: Buffer,
    password: Buffer,
    salt: Buffer,
    opslimit: Double,
    memlimit: Double,
    algorithm: Double,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
}
