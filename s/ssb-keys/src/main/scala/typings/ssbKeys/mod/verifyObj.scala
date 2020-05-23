package typings.ssbKeys.mod

import typings.ssbKeys.anon.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssb-keys", "verifyObj")
@js.native
object verifyObj extends js.Object {
  def apply(keys: Keys, hmac_key: String, obj: Signature): Boolean = js.native
  def apply(keys: Keys, obj: Signature): Boolean = js.native
}

