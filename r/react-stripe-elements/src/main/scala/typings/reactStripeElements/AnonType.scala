package typings.reactStripeElements

import typings.reactStripeElements.mod.ReactStripeElements.TokenType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: js.UndefOr[TokenType] = js.undefined
}

object AnonType {
  @scala.inline
  def apply(`type`: TokenType = null): AnonType = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

