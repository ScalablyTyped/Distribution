package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListItemProps extends js.Object {
  /**
       * Left avatar. This is the React Native Image source prop. Avatar can be used in parallel to leftIcon if needed.
       */
  var avatar: js.UndefOr[
    java.lang.String | reactDashNativeLib.reactDashNativeMod.ImageURISource | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  /**
       * Avatar outer container styling
       */
  var avatarContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * Avatar overlay container styling
       */
  var avatarOverlayContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * Avatar styling. This is the React Native Image style prop
       */
  var avatarStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageStyle] = js.undefined
  /**
       * Add a badge to the ListItem by using this prop
       *
       */
  var badge: js.UndefOr[BadgeProps | ElementObject] = js.undefined
  /**
       * Set chevron color
       *
       * @default '#bdc6cf'
       */
  var chevronColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * View or TouchableHighlight if onPress method is added as prop
       * Replace element with custom element
       */
  var component: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
  /**
       * Additional main container styling
       */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * If true the user won't be able to perform any action on the list item. Default value is false.
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Specify different font family
       *
       * @default 'HelevticaNeue' (iOS)
       * @default 'Sans Serif' (android)
       */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Set if you do not want a chevron
       *
       * @default false
       */
  var hideChevron: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Add a label with your own styling by providing a label={} prop to ListItem
       */
  var label: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
       * Icon configuration for left icon, either a name from the icon library (like material) or a React Native element like Image.
       * leftIcon can be used in parallel to avatar if needed.
       * {name, color, style, type}
       * (type defaults to material icons) OR React Native element
       */
  var leftIcon: js.UndefOr[IconObject | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
       * Attaches an onLongPress on left Icon
       */
  var leftIconOnLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Attaches an onPress on left Icon
       */
  var leftIconOnPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Underlay color for left Icon
       *
       * @default	'white'
       */
  var leftIconUnderlayColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * onLongPress method for link
       */
  var onLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * onPress method for link
       */
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Attaches an onPress on right Icon
       */
  var onPressRightIcon: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Add a callback function when the switch is toggled
       */
  var onSwitch: js.UndefOr[js.Function1[/* value */ scala.Boolean, scala.Unit]] = js.undefined
  /**
       * {name: 'chevron-right'}	object {name, color, style, type} (type defaults to material icons) OR
       * React Native element	icon configuration for right icon, either a name from the icon library (like material) or a React Native element like Image.
       * Shows up unless hideChevron is set
       */
  var rightIcon: js.UndefOr[IconObject | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
       * Provide a rightTitle to have a title show up on the right side of the button
       */
  var rightTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Style the outer container of the rightTitle text
       *
       * @default "{flex: 1, alignItems: 'flex-end', justifyContent: 'center'}""
       */
  var rightTitleContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * Number of lines for Right Title
       *
       * @default 1
       */
  var rightTitleNumberOfLines: js.UndefOr[scala.Double] = js.undefined
  /**
       * Style the text of the rightTitle text
       *
       * @default "{marginRight: 5, color: '#bdc6cf'}"
       */
  var rightTitleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
       * Make left avatar round
       *
       * @default false
       */
  var roundAvatar: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Subtitle text or custom view
       */
  var subtitle: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
       * Provide styling for subtitle container
       */
  var subtitleContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * Number of lines for Subtitle
       *
       * @default	1
       */
  var subtitleNumberOfLines: js.UndefOr[scala.Double] = js.undefined
  /**
       * Additional subtitle styling
       */
  var subtitleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
       * Add a switch to the right side of your component
       *
       * @default false
       */
  var switchButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true the user won't be able to toggle the switch. Default value is false.
       * @default false
       */
  var switchDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Background color when the switch is turned on.
       */
  var switchOnTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Color of the foreground switch grip.
       */
  var switchThumbTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Border color on iOS and background color on Android when the switch is turned off.
       */
  var switchTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The value of the switch. If true the switch will be turned on. Default value is false.
       *
       * @default false
       */
  var switched: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether to have the right title area be an input text component.
       *
       * @default false
       */
  var textInput: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Can tell TextInput to automatically capitalize certain characters.
       */
  var textInputAutoCapitalize: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Can tell TextInput to automatically capitalize certain characters.
       */
  var textInputAutoCorrect: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, focuses the input on componentDidMount. The default value is false.
       */
  var textInputAutoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * 	Style for the container surrounding the input text
       */
  var textInputContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * If false, text is not editable. The default value is true.
       */
  var textInputEditable: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * 	Can be one of the following:
       * 'default', 'email-address', 'numeric', 'phone-pad', 'ascii-capable', 'numbers-and-punctuation', 'url', 'number-pad', 'name-phone-pad', 'decimal-pad', 'twitter', 'web-search'
       */
  var textInputKeyboardType: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.KeyboardType | reactDashNativeLib.reactDashNativeMod.KeyboardTypeIOS
  ] = js.undefined
  /**
       * Limits the maximum number of characters that can be entered.
       */
  var textInputMaxLength: js.UndefOr[scala.Double] = js.undefined
  /**
       * If true, the text input can be multiple lines. The default value is false.
       */
  var textInputMultiline: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * 	Callback that is called when the text input is blurred.
       */
  var textInputOnBlur: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * 	Callback that is called when the text input's text changes. Changed text is passed as an argument to the callback handler.
       */
  var textInputOnChangeText: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
  /**
       * 	Callback that is called when the text input is focused.
       */
  var textInputOnFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Placeholder for the text input
       */
  var textInputPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Determines how the return key should look. For more info see the React Native docs
       */
  var textInputReturnKeyType: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If true, obscures the text entered so that sensitive text like passwords stay secure.
       */
  var textInputSecure: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, all text will automatically be selected on focus.
       */
  var textInputSelectTextOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * 	Style for the input text
       */
  var textInputStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
       * Manually set value of the input
       */
  var textInputValue: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Main title for list item, can be text or custom view
       */
  var title: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
       * Provide styling for title container
       */
  var titleContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
       * Number of lines for title
       *
       * @default 1
       */
  var titleNumberOfLines: js.UndefOr[scala.Double] = js.undefined
  /**
       * Additional title styling
       */
  var titleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
       * Define underlay color for TouchableHighlight
       *
       * @default 'white'
       */
  var underlayColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Additional wrapper styling
       */
  var wrapperStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

