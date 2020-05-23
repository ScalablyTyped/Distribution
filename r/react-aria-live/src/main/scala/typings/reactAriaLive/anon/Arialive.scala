package typings.reactAriaLive.anon

import typings.reactAriaLive.reactAriaLiveStrings.assertive
import typings.reactAriaLive.reactAriaLiveStrings.polite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arialive extends js.Object {
  var `aria-live`: assertive | polite
  var clearOnUnmount: js.UndefOr[Boolean] = js.undefined
  var message: String
}

object Arialive {
  @scala.inline
  def apply(
    `aria-live`: assertive | polite,
    message: String,
    clearOnUnmount: js.UndefOr[Boolean] = js.undefined
  ): Arialive = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnUnmount)) __obj.updateDynamic("clearOnUnmount")(clearOnUnmount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialive]
  }
}

