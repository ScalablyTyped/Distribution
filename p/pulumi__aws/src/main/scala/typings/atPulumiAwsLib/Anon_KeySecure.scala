package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeySecure extends js.Object {
  var key: java.lang.String
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var value: java.lang.String
}

object Anon_KeySecure {
  @scala.inline
  def apply(key: java.lang.String, value: java.lang.String, secure: js.UndefOr[scala.Boolean] = js.undefined): Anon_KeySecure = {
    val __obj = js.Dynamic.literal(key = key, value = value)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[Anon_KeySecure]
  }
}

