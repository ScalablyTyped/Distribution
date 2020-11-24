package typings.reactNativeElements.mod

import typings.react.mod.ComponentType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonGroupProps extends js.Object {
  
  /**
    * Choose other button component such as TouchableOpacity
    *
    * @default TouchableHighlight
    */
  var Component: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Determines what the opacity of the wrapped view should be when touch is active.
    */
  var activeOpacity: js.UndefOr[Double] = js.native
  
  /**
    * Specify styling for buttons container
    */
  var buttonContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * inherited styling	specify styling for button
    */
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Array of buttons for component, if returning a component, must be an object with { element: componentName }
    */
  var buttons: js.Array[ElementObject | String] = js.native
  
  /**
    * Border radius for the container
    */
  var containerBorderRadius: js.UndefOr[Double] = js.native
  
  /**
    * Specify styling for main button container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Controls if buttons are disabled
    *
    * Setting `true` makes all of them disabled, while using an array only makes those indices disabled
    *
    * @default false
    */
  var disabled: js.UndefOr[Boolean | js.Array[Double]] = js.native
  
  /**
    * Styling for each selected button when disabled
    */
  var disabledSelectedStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Styling for the text of each selected button when disabled
    */
  var disabledSelectedTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * Styling for each button when disabled
    */
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Styling for the text of each button when disabled
    */
  var disabledTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * inherited styling	object { width, color }	update the styling of the interior border of the list of buttons
    */
  var innerBorderStyle: js.UndefOr[InnerBorderStyleProperty] = js.native
  
  /**
    *
    * Called immediately after the underlay is hidden
    */
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Method to update Button Group Index
    */
  def onPress(selectedIndex: Double): Unit = js.native
  
  /**
    * Called immediately after the underlay is shown
    */
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Allows the user to select multiple items
    *
    * @default false
    */
  var selectMultiple: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify styling selected button
    *
    * @default 'white'
    */
  var selectedButtonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Current selected index of array of buttons
    */
  var selectedIndex: js.UndefOr[Double | Null] = js.native
  
  /**
    * The indexes that are selected. Used with 'selectMultiple'
    *
    * @default []
    */
  var selectedIndexes: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Specify specific styling for text in the selected state
    */
  var selectedTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * Animate the touchable to a new opacity.
    */
  var setOpacityTo: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  /**
    * Specify specific styling for text
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * Specify underlayColor for TouchableHighlight
    *
    * @default 'white'
    */
  var underlayColor: js.UndefOr[String] = js.native
  
  /**
    * Display in vertical orientation
    *
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.native
}
object ButtonGroupProps {
  
  @scala.inline
  def apply(buttons: js.Array[ElementObject | String], onPress: Double => Unit): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], onPress = js.Any.fromFunction1(onPress))
    __obj.asInstanceOf[ButtonGroupProps]
  }
  
  @scala.inline
  implicit class ButtonGroupPropsOps[Self <: ButtonGroupProps] (val x: Self) extends AnyVal {
    
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
    def setButtonsVarargs(value: (ElementObject | String)*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[ElementObject | String]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPress(value: Double => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponent(value: ComponentType[_]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    
    @scala.inline
    def setButtonContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("buttonContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonContainerStyle: Self = this.set("buttonContainerStyle", js.undefined)
    
    @scala.inline
    def setButtonContainerStyleNull: Self = this.set("buttonContainerStyle", null)
    
    @scala.inline
    def setButtonStyle(value: StyleProp[ViewStyle]): Self = this.set("buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonStyle: Self = this.set("buttonStyle", js.undefined)
    
    @scala.inline
    def setButtonStyleNull: Self = this.set("buttonStyle", null)
    
    @scala.inline
    def setContainerBorderRadius(value: Double): Self = this.set("containerBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerBorderRadius: Self = this.set("containerBorderRadius", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    
    @scala.inline
    def setDisabledVarargs(value: Double*): Self = this.set("disabled", js.Array(value :_*))
    
    @scala.inline
    def setDisabled(value: Boolean | js.Array[Double]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledSelectedStyle(value: StyleProp[ViewStyle]): Self = this.set("disabledSelectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledSelectedStyle: Self = this.set("disabledSelectedStyle", js.undefined)
    
    @scala.inline
    def setDisabledSelectedStyleNull: Self = this.set("disabledSelectedStyle", null)
    
    @scala.inline
    def setDisabledSelectedTextStyle(value: StyleProp[TextStyle]): Self = this.set("disabledSelectedTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledSelectedTextStyle: Self = this.set("disabledSelectedTextStyle", js.undefined)
    
    @scala.inline
    def setDisabledSelectedTextStyleNull: Self = this.set("disabledSelectedTextStyle", null)
    
    @scala.inline
    def setDisabledStyle(value: StyleProp[ViewStyle]): Self = this.set("disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledStyle: Self = this.set("disabledStyle", js.undefined)
    
    @scala.inline
    def setDisabledStyleNull: Self = this.set("disabledStyle", null)
    
    @scala.inline
    def setDisabledTextStyle(value: StyleProp[TextStyle]): Self = this.set("disabledTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledTextStyle: Self = this.set("disabledTextStyle", js.undefined)
    
    @scala.inline
    def setDisabledTextStyleNull: Self = this.set("disabledTextStyle", null)
    
    @scala.inline
    def setInnerBorderStyle(value: InnerBorderStyleProperty): Self = this.set("innerBorderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerBorderStyle: Self = this.set("innerBorderStyle", js.undefined)
    
    @scala.inline
    def setOnHideUnderlay(value: () => Unit): Self = this.set("onHideUnderlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHideUnderlay: Self = this.set("onHideUnderlay", js.undefined)
    
    @scala.inline
    def setOnShowUnderlay(value: () => Unit): Self = this.set("onShowUnderlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShowUnderlay: Self = this.set("onShowUnderlay", js.undefined)
    
    @scala.inline
    def setSelectMultiple(value: Boolean): Self = this.set("selectMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectMultiple: Self = this.set("selectMultiple", js.undefined)
    
    @scala.inline
    def setSelectedButtonStyle(value: StyleProp[ViewStyle]): Self = this.set("selectedButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedButtonStyle: Self = this.set("selectedButtonStyle", js.undefined)
    
    @scala.inline
    def setSelectedButtonStyleNull: Self = this.set("selectedButtonStyle", null)
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
    
    @scala.inline
    def setSelectedIndexNull: Self = this.set("selectedIndex", null)
    
    @scala.inline
    def setSelectedIndexesVarargs(value: Double*): Self = this.set("selectedIndexes", js.Array(value :_*))
    
    @scala.inline
    def setSelectedIndexes(value: js.Array[Double]): Self = this.set("selectedIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIndexes: Self = this.set("selectedIndexes", js.undefined)
    
    @scala.inline
    def setSelectedTextStyle(value: StyleProp[TextStyle]): Self = this.set("selectedTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedTextStyle: Self = this.set("selectedTextStyle", js.undefined)
    
    @scala.inline
    def setSelectedTextStyleNull: Self = this.set("selectedTextStyle", null)
    
    @scala.inline
    def setSetOpacityTo(value: /* value */ Double => Unit): Self = this.set("setOpacityTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOpacityTo: Self = this.set("setOpacityTo", js.undefined)
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTextStyleNull: Self = this.set("textStyle", null)
    
    @scala.inline
    def setUnderlayColor(value: String): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
