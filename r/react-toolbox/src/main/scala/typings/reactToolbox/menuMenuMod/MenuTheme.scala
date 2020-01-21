package typings.reactToolbox.menuMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuTheme extends js.Object {
  /**
    * Added to the root element when menu is active.
    */
  var active: js.UndefOr[String] = js.undefined
  /**
    * Added to the root when position is bottom left.
    */
  var bottomLeft: js.UndefOr[String] = js.undefined
  /**
    * Added to the root when position is bottom right.
    */
  var bottomRight: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element of the menu.
    */
  var menu: js.UndefOr[String] = js.undefined
  /**
    * Used for the inner wrapper.
    */
  var menuInner: js.UndefOr[String] = js.undefined
  /**
    * Used to draw the outline.
    */
  var outline: js.UndefOr[String] = js.undefined
  /**
    * Added to the menu in case if should have ripple.
    */
  var rippled: js.UndefOr[String] = js.undefined
  /**
    * Added to the root in case its static.
    */
  var static: js.UndefOr[String] = js.undefined
  /**
    * Added to the root when position is top left.
    */
  var topLeft: js.UndefOr[String] = js.undefined
  /**
    * Added to the root when position is top right.
    */
  var topRight: js.UndefOr[String] = js.undefined
}

object MenuTheme {
  @scala.inline
  def apply(
    active: String = null,
    bottomLeft: String = null,
    bottomRight: String = null,
    menu: String = null,
    menuInner: String = null,
    outline: String = null,
    rippled: String = null,
    static: String = null,
    topLeft: String = null,
    topRight: String = null
  ): MenuTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft.asInstanceOf[js.Any])
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (menuInner != null) __obj.updateDynamic("menuInner")(menuInner.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (rippled != null) __obj.updateDynamic("rippled")(rippled.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft.asInstanceOf[js.Any])
    if (topRight != null) __obj.updateDynamic("topRight")(topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuTheme]
  }
}

