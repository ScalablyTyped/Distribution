package typings.reactNativeElements.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextProps
  extends typings.reactNative.mod.TextProps
     with _HeaderSubComponent {
  /**
    * font size 40
    */
  var h1: js.UndefOr[Boolean] = js.native
  /**
    * Styling for when `h1` is set
    */
  var h1Style: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * font size 34
    */
  var h2: js.UndefOr[Boolean] = js.native
  /**
    * Styling for when `h2` is set
    */
  var h2Style: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * font size 28
    */
  var h3: js.UndefOr[Boolean] = js.native
  /**
    * Styling for when `h3` is set
    */
  var h3Style: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * font size 22
    */
  var h4: js.UndefOr[Boolean] = js.native
  /**
    * Styling for when `h4` is set
    */
  var h4Style: js.UndefOr[StyleProp[TextStyle]] = js.native
}

object TextProps {
  @scala.inline
  def apply(): TextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProps]
  }
  @scala.inline
  implicit class TextPropsOps[Self <: TextProps] (val x: Self) extends AnyVal {
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
    def setH1(value: Boolean): Self = this.set("h1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH1: Self = this.set("h1", js.undefined)
    @scala.inline
    def setH1Style(value: StyleProp[TextStyle]): Self = this.set("h1Style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH1Style: Self = this.set("h1Style", js.undefined)
    @scala.inline
    def setH1StyleNull: Self = this.set("h1Style", null)
    @scala.inline
    def setH2(value: Boolean): Self = this.set("h2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH2: Self = this.set("h2", js.undefined)
    @scala.inline
    def setH2Style(value: StyleProp[TextStyle]): Self = this.set("h2Style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH2Style: Self = this.set("h2Style", js.undefined)
    @scala.inline
    def setH2StyleNull: Self = this.set("h2Style", null)
    @scala.inline
    def setH3(value: Boolean): Self = this.set("h3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH3: Self = this.set("h3", js.undefined)
    @scala.inline
    def setH3Style(value: StyleProp[TextStyle]): Self = this.set("h3Style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH3Style: Self = this.set("h3Style", js.undefined)
    @scala.inline
    def setH3StyleNull: Self = this.set("h3Style", null)
    @scala.inline
    def setH4(value: Boolean): Self = this.set("h4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH4: Self = this.set("h4", js.undefined)
    @scala.inline
    def setH4Style(value: StyleProp[TextStyle]): Self = this.set("h4Style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH4Style: Self = this.set("h4Style", js.undefined)
    @scala.inline
    def setH4StyleNull: Self = this.set("h4Style", null)
  }
  
}

