package typings.reactToolbox.appBarAppBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppBarTheme extends js.Object {
  /**
    * Used for the component root element.
    */
  var appBar: js.UndefOr[String] = js.native
  /**
    * Added to the root element when the app bar is fixed.
    */
  var fixed: js.UndefOr[String] = js.native
  /**
    * Added to the root element when the app bar is flat.
    */
  var flat: js.UndefOr[String] = js.native
  /**
    * Added to the left icon app bar element.
    */
  var leftIcon: js.UndefOr[String] = js.native
  /**
    * Added to the right icon app bar element.
    */
  var rightIcon: js.UndefOr[String] = js.native
  /**
    * Added to the root element when the app bar is hidden during scroll.
    */
  var scrollHide: js.UndefOr[String] = js.native
  /**
    * Used as the app bar title.
    */
  var title: js.UndefOr[String] = js.native
}

object AppBarTheme {
  @scala.inline
  def apply(): AppBarTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppBarTheme]
  }
  @scala.inline
  implicit class AppBarThemeOps[Self <: AppBarTheme] (val x: Self) extends AnyVal {
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
    def setAppBar(value: String): Self = this.set("appBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppBar: Self = this.set("appBar", js.undefined)
    @scala.inline
    def setFixed(value: String): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setFlat(value: String): Self = this.set("flat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    @scala.inline
    def setLeftIcon(value: String): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    @scala.inline
    def setRightIcon(value: String): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
    @scala.inline
    def setScrollHide(value: String): Self = this.set("scrollHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollHide: Self = this.set("scrollHide", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

