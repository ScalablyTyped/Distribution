package typings.reactDashToolbox.libCardCardMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardMediaTheme extends js.Object {
  /**
    * Added to the element root.
    */
  var cardMedia: js.UndefOr[String] = js.undefined
  /**
    * Used for the content element.
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * Added to content element if its overlayed.
    */
  var contentOverlay: js.UndefOr[String] = js.undefined
  /**
    * Added to content element if its squared.
    */
  var square: js.UndefOr[String] = js.undefined
  /**
    * Added to content element if its wide.
    */
  var wide: js.UndefOr[String] = js.undefined
}

object CardMediaTheme {
  @scala.inline
  def apply(
    cardMedia: String = null,
    content: String = null,
    contentOverlay: String = null,
    square: String = null,
    wide: String = null
  ): CardMediaTheme = {
    val __obj = js.Dynamic.literal()
    if (cardMedia != null) __obj.updateDynamic("cardMedia")(cardMedia)
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentOverlay != null) __obj.updateDynamic("contentOverlay")(contentOverlay)
    if (square != null) __obj.updateDynamic("square")(square)
    if (wide != null) __obj.updateDynamic("wide")(wide)
    __obj.asInstanceOf[CardMediaTheme]
  }
}

