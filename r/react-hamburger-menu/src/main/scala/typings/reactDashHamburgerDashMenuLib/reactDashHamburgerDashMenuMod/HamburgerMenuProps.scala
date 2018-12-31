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

