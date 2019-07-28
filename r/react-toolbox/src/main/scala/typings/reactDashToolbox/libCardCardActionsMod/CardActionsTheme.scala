package typings.reactDashToolbox.libCardCardActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardActionsTheme extends js.Object {
  /**
    * Used for a wrapper around actions as the root element.
    */
  var cardActions: js.UndefOr[String] = js.undefined
}

object CardActionsTheme {
  @scala.inline
  def apply(cardActions: String = null): CardActionsTheme = {
    val __obj = js.Dynamic.literal()
    if (cardActions != null) __obj.updateDynamic("cardActions")(cardActions)
    __obj.asInstanceOf[CardActionsTheme]
  }
}

