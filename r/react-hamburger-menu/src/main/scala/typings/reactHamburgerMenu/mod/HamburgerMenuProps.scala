package typings.reactHamburgerMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HamburgerMenuProps extends js.Object {
  /**
    * The length of time it takes for the icon transitions to complete.
    * @default 0.4
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * The border radius of the lines
    * @default 0
    */
  var borderRadius: js.UndefOr[Double] = js.native
  /**
    * The color of both icons
    * @default #000
    */
  var color: String = js.native
  /**
    * The height of the icon
    * @default 30
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Determines whether the menu is a hamburger or cross icon
    */
  var isOpen: Boolean = js.native
  /**
    * The rotation of the icon, eg {45} would be 45deg
    * @default 0
    */
  var rotate: js.UndefOr[Double] = js.native
  /**
    * The stroke width of the lines
    * @default 2
    */
  var strokeWidth: js.UndefOr[Double] = js.native
  /**
    * The width of the icon
    * @default 36
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Will be invoked when the component is clicked
    */
  def menuClicked(): Unit = js.native
}

object HamburgerMenuProps {
  @scala.inline
  def apply(color: String, isOpen: Boolean, menuClicked: () => Unit): HamburgerMenuProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], menuClicked = js.Any.fromFunction0(menuClicked))
    __obj.asInstanceOf[HamburgerMenuProps]
  }
  @scala.inline
  implicit class HamburgerMenuPropsOps[Self <: HamburgerMenuProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuClicked(value: () => Unit): Self = this.set("menuClicked", js.Any.fromFunction0(value))
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

