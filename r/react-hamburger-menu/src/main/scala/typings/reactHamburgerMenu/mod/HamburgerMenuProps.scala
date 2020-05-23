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
    animationDuration: js.UndefOr[Double] = js.undefined,
    borderRadius: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    rotate: js.UndefOr[Double] = js.undefined,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): HamburgerMenuProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], menuClicked = js.Any.fromFunction0(menuClicked))
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HamburgerMenuProps]
  }
}

