package typings.reactToolbox.cardCardTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTextTheme extends js.Object {
  /**
    * Used for the main root element.
    */
  var cardText: js.UndefOr[String] = js.undefined
}

object CardTextTheme {
  @scala.inline
  def apply(cardText: String = null): CardTextTheme = {
    val __obj = js.Dynamic.literal()
    if (cardText != null) __obj.updateDynamic("cardText")(cardText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardTextTheme]
  }
}

