package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialIconProps extends js.Object {
  /**
    * Component Type of button
    *
    * @default TouchableHighlight
    */
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
  /**
    * Creates button
    *
    * @default false
    */
  var button: js.UndefOr[Boolean] = js.native
  /**
    * Disable button
    *
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Specify different font family
    *
    * @default System font bold (iOS), Sans Serif Black (android)
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * Specify text styling
    */
  var fontStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Specify font weight of title if set as a button with a title
    *
    * @default bold (ios), black(android)
    */
  var fontWeight: js.UndefOr[String] = js.native
  /**
    * Icon color
    */
  var iconColor: js.UndefOr[String] = js.native
  /**
    * Icon size
    *
    * @default 24
    */
  var iconSize: js.UndefOr[Double] = js.native
  /**
    * Extra styling for icon component
    */
  var iconStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Reverses icon color scheme, setting background to white and icon to primary color
    *
    * @default false
    */
  var light: js.UndefOr[Boolean] = js.native
  /**
    * Shows loading indicator
    *
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.native
  /**
    * @default none	function	onLongPress method
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * onPress method
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Adds a drop shadow, set to false to remove
    *
    * @default true
    */
  var raised: js.UndefOr[Boolean] = js.native
  /**
    * Button styling
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Title if made into a button
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Social media type
    */
  var `type`: SocialMediaType = js.native
  /**
    * Specify underlayColor for TouchableHighlight
    *
    * @default 'white' if `light` prop is true, otherwise defaults to icon color.
    */
  var underlayColor: js.UndefOr[String] = js.native
}

object SocialIconProps {
  @scala.inline
  def apply(`type`: SocialMediaType): SocialIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialIconProps]
  }
  @scala.inline
  implicit class SocialIconPropsOps[Self <: SocialIconProps] (val x: Self) extends AnyVal {
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
    def setType(value: SocialMediaType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: ComponentClass[js.Object, ComponentState]): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    @scala.inline
    def setButton(value: Boolean): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontStyle(value: StyleProp[TextStyle]): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontStyleNull: Self = this.set("fontStyle", null)
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    @scala.inline
    def setIconStyle(value: StyleProp[ViewStyle]): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setIconStyleNull: Self = this.set("iconStyle", null)
    @scala.inline
    def setLight(value: Boolean): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLight: Self = this.set("light", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setOnLongPress(value: () => Unit): Self = this.set("onLongPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setRaised(value: Boolean): Self = this.set("raised", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUnderlayColor(value: String): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
  }
  
}

