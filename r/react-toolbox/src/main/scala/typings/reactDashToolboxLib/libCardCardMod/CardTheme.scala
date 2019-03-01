package typings
package reactDashToolboxLib.libCardCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTheme extends js.Object {
  /**
    * Class used for the root element.
    */
  var card: js.UndefOr[java.lang.String] = js.undefined
  /**
    *Added to the root element in case the card is raised.
    */
  var raised: js.UndefOr[java.lang.String] = js.undefined
}

object CardTheme {
  @scala.inline
  def apply(card: java.lang.String = null, raised: java.lang.String = null): CardTheme = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card)
    if (raised != null) __obj.updateDynamic("raised")(raised)
    __obj.asInstanceOf[CardTheme]
  }
}

