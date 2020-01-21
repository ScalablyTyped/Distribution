package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_pwhash")
@js.native
object cryptoPwhash extends js.Object {
  def apply(
    output: Buffer,
    password: Buffer,
    salt: Buffer,
    opslimit: Double,
    memlimit: Double,
    algorithm: Double
  ): Unit = js.native
}

