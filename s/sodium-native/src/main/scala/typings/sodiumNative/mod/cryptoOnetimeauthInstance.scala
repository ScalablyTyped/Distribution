package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_onetimeauth_instance")
@js.native
object cryptoOnetimeauthInstance extends js.Object {
  def apply(key: Buffer): CryptoOneTimeAuthWrap = js.native
}

