package typings.ssbDashKeys.ssbDashKeysMod

import typings.ssbDashKeys.Anon_Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssb-keys", "verifyObj")
@js.native
object verifyObj extends js.Object {
  def apply(keys: Keys, hmac_key: String, obj: Anon_Signature): Boolean = js.native
  def apply(keys: Keys, obj: Anon_Signature): Boolean = js.native
}

