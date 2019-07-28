package typings.reactDashToolbox.libMenuMenuMod

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
    if (active != null) __obj.updateDynamic("active")(active)
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft)
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (menuInner != null) __obj.updateDynamic("menuInner")(menuInner)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (rippled != null) __obj.updateDynamic("rippled")(rippled)
    if (static != null) __obj.updateDynamic("static")(static)
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft)
    if (topRight != null) __obj.updateDynamic("topRight")(topRight)
    __obj.asInstanceOf[MenuTheme]
  }
}

