package typings
package reactDashHamburgerDashMenuLib.reactDashHamburgerDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HamburgerMenuProps extends js.Object {
  /**
    * The length of time it takes for the icon transitions to complete.
    * @default 0.4
    */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The border radius of the lines
    * @default 0
    */
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color of both icons
    * @default #000
    */
  var color: java.lang.String
  /**
    * The height of the icon
    * @default 30
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Determines whether the menu is a hamburger or cross icon
    */
  var isOpen: scala.Boolean
  /**
    * The rotation of the icon, eg {45} would be 45deg
    * @default 0
    */
  var rotate: js.UndefOr[scala.Double] = js.undefined
  /**
    * The stroke width of the lines
    * @default 2
    */
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the icon
    * @default 36
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * Will be invoked when the component is clicked
    */
  def menuClicked(): scala.Unit
}

object HamburgerMenuProps {
  @scala.inline
  def apply(
    color: java.lang.String,
    isOpen: scala.Boolean,
    menuClicked: js.Function0[scala.Unit],
    animationDuration: scala.Int | scala.Double = null,
    borderRadius: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    rotate: scala.Int | scala.Double = null,
    strokeWidth: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): HamburgerMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("isOpen")(isOpen)
    __obj.updateDynamic("menuClicked")(menuClicked)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HamburgerMenuProps]
  }
}

