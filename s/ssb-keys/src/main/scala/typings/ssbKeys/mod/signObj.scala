package typings.ssbKeys.mod

import typings.ssbKeys.AnonSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssb-keys", "signObj")
@js.native
object signObj extends js.Object {
  def apply[T /* <: js.Object */](keys: Keys, hmac_key: String, obj: T): T with AnonSignature = js.native
  def apply[T /* <: js.Object */](keys: Keys, obj: T): T with AnonSignature = js.native
}

