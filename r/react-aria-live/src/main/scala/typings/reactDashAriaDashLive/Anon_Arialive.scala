package typings.reactDashAriaDashLive

import typings.reactDashAriaDashLive.reactDashAriaDashLiveStrings.assertive
import typings.reactDashAriaDashLive.reactDashAriaDashLiveStrings.polite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arialive extends js.Object {
  var `aria-live`: assertive | polite
  var clearOnUnmount: js.UndefOr[Boolean] = js.undefined
  var message: String
}

object Anon_Arialive {
  @scala.inline
  def apply(
    `aria-live`: assertive | polite,
    message: String,
    clearOnUnmount: js.UndefOr[Boolean] = js.undefined
  ): Anon_Arialive = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnUnmount)) __obj.updateDynamic("clearOnUnmount")(clearOnUnmount)
    __obj.asInstanceOf[Anon_Arialive]
  }
}

