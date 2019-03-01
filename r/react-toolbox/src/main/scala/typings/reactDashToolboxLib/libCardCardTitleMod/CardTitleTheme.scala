package typings
package reactDashToolboxLib.libCardCardTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTitleTheme extends js.Object {
  /**
    * Class used for the root element.
    */
  var cardTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root element when the card has no avatar.
    */
  var large: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root element when the card has avatar.
    */
  var small: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the subtitle element.
    */
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the title element.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object CardTitleTheme {
  @scala.inline
  def apply(
    cardTitle: java.lang.String = null,
    large: java.lang.String = null,
    small: java.lang.String = null,
    subtitle: java.lang.String = null,
    title: java.lang.String = null
  ): CardTitleTheme = {
    val __obj = js.Dynamic.literal()
    if (cardTitle != null) __obj.updateDynamic("cardTitle")(cardTitle)
    if (large != null) __obj.updateDynamic("large")(large)
    if (small != null) __obj.updateDynamic("small")(small)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[CardTitleTheme]
  }
}

