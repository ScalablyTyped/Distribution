package typings.ssbKeys.mod

import typings.ssbKeys.anon.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssb-keys", "signObj")
@js.native
object signObj extends js.Object {
  
  def apply[T /* <: js.Object */](keys: Keys, hmac_key: String, obj: T): T with Signature = js.native
  def apply[T /* <: js.Object */](keys: Keys, obj: T): T with Signature = js.native
}
