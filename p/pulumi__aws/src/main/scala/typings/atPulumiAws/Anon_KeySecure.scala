package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeySecure extends js.Object {
  var key: String
  var secure: js.UndefOr[Boolean] = js.undefined
  var value: String
}

object Anon_KeySecure {
  @scala.inline
  def apply(key: String, value: String, secure: js.UndefOr[Boolean] = js.undefined): Anon_KeySecure = {
    val __obj = js.Dynamic.literal(key = key, value = value)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[Anon_KeySecure]
  }
}

