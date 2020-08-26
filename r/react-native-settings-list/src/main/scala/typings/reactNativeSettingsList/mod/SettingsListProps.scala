package typings.reactNativeSettingsList.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsListProps extends js.Object {
  /**
    * default: white
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * default: black
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * default: 50
    */
  var defaultItemSize: js.UndefOr[Double] = js.native
  var defaultTitleInfoPosition: js.UndefOr[String] = js.native
  /**
    * default: {fontSize: 16}
    */
  var defaultTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var scrollViewProps: js.UndefOr[js.Object] = js.native
  /**
    * default: transparent
    */
  var underlayColor: js.UndefOr[String] = js.native
}

object SettingsListProps {
  @scala.inline
  def apply(): SettingsListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsListProps]
  }
  @scala.inline
  implicit class SettingsListPropsOps[Self <: SettingsListProps] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setDefaultItemSize(value: Double): Self = this.set("defaultItemSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultItemSize: Self = this.set("defaultItemSize", js.undefined)
    @scala.inline
    def setDefaultTitleInfoPosition(value: String): Self = this.set("defaultTitleInfoPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTitleInfoPosition: Self = this.set("defaultTitleInfoPosition", js.undefined)
    @scala.inline
    def setDefaultTitleStyle(value: StyleProp[TextStyle]): Self = this.set("defaultTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTitleStyle: Self = this.set("defaultTitleStyle", js.undefined)
    @scala.inline
    def setDefaultTitleStyleNull: Self = this.set("defaultTitleStyle", null)
    @scala.inline
    def setScrollViewProps(value: js.Object): Self = this.set("scrollViewProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollViewProps: Self = this.set("scrollViewProps", js.undefined)
    @scala.inline
    def setUnderlayColor(value: String): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
  }
  
}

