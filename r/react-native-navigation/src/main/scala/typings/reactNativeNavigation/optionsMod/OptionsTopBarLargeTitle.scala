package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsTopBarLargeTitle extends js.Object {
  /**
    * Set the color of large title's text
    */
  var color: js.UndefOr[Color] = js.native
  /**
    * Set the font family of large title's text
    */
  var fontFamily: js.UndefOr[FontFamily] = js.native
  /**
    * Set the font size of large title's text
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    * Set the font weight, ignore fontFamily and use the iOS system fonts instead
    * #### (iOS specific)
    */
  var fontWeight: js.UndefOr[FontWeight] = js.native
  /**
    * Enable large titles
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object OptionsTopBarLargeTitle {
  @scala.inline
  def apply(): OptionsTopBarLargeTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTopBarLargeTitle]
  }
  @scala.inline
  implicit class OptionsTopBarLargeTitleOps[Self <: OptionsTopBarLargeTitle] (val x: Self) extends AnyVal {
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFontFamily(value: FontFamily): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontWeight(value: FontWeight): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

