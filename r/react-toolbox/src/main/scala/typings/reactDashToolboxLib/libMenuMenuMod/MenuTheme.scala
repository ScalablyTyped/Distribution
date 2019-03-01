package typings
package reactDashToolboxLib.libMenuMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuTheme extends js.Object {
  /**
    * Added to the root element when menu is active.
    */
  var active: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root when position is bottom left.
    */
  var bottomLeft: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root when position is bottom right.
    */
  var bottomRight: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the root element of the menu.
    */
  var menu: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the inner wrapper.
    */
  var menuInner: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to draw the outline.
    */
  var outline: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the menu in case if should have ripple.
    */
  var rippled: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root in case its static.
    */
  var static: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root when position is top left.
    */
  var topLeft: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root when position is top right.
    */
  var topRight: js.UndefOr[java.lang.String] = js.undefined
}

object MenuTheme {
  @scala.inline
  def apply(
    active: java.lang.String = null,
    bottomLeft: java.lang.String = null,
    bottomRight: java.lang.String = null,
    menu: java.lang.String = null,
    menuInner: java.lang.String = null,
    outline: java.lang.String = null,
    rippled: java.lang.String = null,
    static: java.lang.String = null,
    topLeft: java.lang.String = null,
    topRight: java.lang.String = null
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

