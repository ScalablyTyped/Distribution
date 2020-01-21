package typings.sodiumNative.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_pwhash_str_async")
@js.native
object cryptoPwhashStrAsync extends js.Object {
  def apply(
    output: Buffer,
    password: Buffer,
    opslimit: Double,
    memlimit: Double,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
}

