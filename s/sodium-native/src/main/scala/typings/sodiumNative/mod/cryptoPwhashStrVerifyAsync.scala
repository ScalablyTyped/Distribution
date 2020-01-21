package typings.sodiumNative.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_pwhash_str_verify_async")
@js.native
object cryptoPwhashStrVerifyAsync extends js.Object {
  def apply(
    str: Buffer,
    password: Buffer,
    callback: js.Function2[/* err */ Error | Null, /* bool */ Boolean, Unit]
  ): Unit = js.native
}

