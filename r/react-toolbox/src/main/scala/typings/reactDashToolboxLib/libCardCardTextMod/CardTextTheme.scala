package typings
package reactDashToolboxLib.libCardCardTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTextTheme extends js.Object {
  /**
    * Used for the main root element.
    */
  var cardText: js.UndefOr[java.lang.String] = js.undefined
}

object CardTextTheme {
  @scala.inline
  def apply(cardText: java.lang.String = null): CardTextTheme = {
    val __obj = js.Dynamic.literal()
    if (cardText != null) __obj.updateDynamic("cardText")(cardText)
    __obj.asInstanceOf[CardTextTheme]
  }
}

