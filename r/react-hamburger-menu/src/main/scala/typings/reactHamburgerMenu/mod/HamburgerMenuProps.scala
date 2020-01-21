package typings.reactHamburgerMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HamburgerMenuProps extends js.Object {
  /**
    * The length of time it takes for the icon transitions to complete.
    * @default 0.4
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /**
    * The border radius of the lines
    * @default 0
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  /**
    * The color of both icons
    * @default #000
    */
  var color: String
  /**
    * The height of the icon
    * @default 30
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Determines whether the menu is a hamburger or cross icon
    */
  var isOpen: Boolean
  /**
    * The rotation of the icon, eg {45} would be 45deg
    * @default 0
    */
  var rotate: js.UndefOr[Double] = js.undefined
  /**
    * The stroke width of the lines
    * @default 2
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
  /**
    * The width of the icon
    * @default 36
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * Will be invoked when the component is clicked
    */
  def menuClicked(): Unit
}

object HamburgerMenuProps {
  @scala.inline
  def apply(
    color: String,
    isOpen: Boolean,
    menuClicked: () => Unit,
    animationDuration: Int | Double = null,
    borderRadius: Int | Double = null,
    height: Int | Double = null,
    rotate: Int | Double = null,
    strokeWidth: Int | Double = null,
    width: Int | Double = null
  ): HamburgerMenuProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], menuClicked = js.Any.fromFunction0(menuClicked))
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HamburgerMenuProps]
  }
}

