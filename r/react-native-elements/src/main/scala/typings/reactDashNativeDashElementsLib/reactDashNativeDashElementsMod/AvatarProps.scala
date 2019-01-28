package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  /**
    * Component for enclosing element (eg: TouchableHighlight, View, etc)
    *
    * @default TouchableOpacity
    */
  var Component: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
  /**
    * Image Component of Avatar
    * @default React Native default Image component
    */
  var ImageComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
  /**
    * Opacity when pressed
    *
    * @default 0.2
    */
  var activeOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Style for avatar image
    */
  var avatarStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageStyle] = js.undefined
  /**
    * Styling for outer container
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Edit button for the avatar
    *
    * @default "{size: null, iconName: 'mode-edit', iconType: 'material', iconColor: '#fff', underlayColor: '#000', style: null}"
    */
  var editButton: js.UndefOr[stdLib.Partial[IconProps]] = js.undefined
  /**
    * Icon for the avatar
    */
  var icon: js.UndefOr[AvatarIcon] = js.undefined
  /**
    * extra styling for icon component
    */
  var iconStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * Optional properties to pass to the image if provided e.g "resizeMode"
    */
  var imageProps: js.UndefOr[
    stdLib.Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ImageProperties */ _
    ]
  ] = js.undefined
  /**
    * Callback function when pressing Edit button
    */
  var onEditPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback function when long pressing component
    */
  var onLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback function when pressing component
    */
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Style for the view outside image or icon
    */
  var overlayContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Style for the placeholder
    */
  var placeholderStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Render a content inside placeholder
    */
  var renderPlaceholderContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[js.Object]] = js.undefined
  /**
    * Determines the shape of avatar
    *
    * @default false
    */
  var rounded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If to show the edit button or not
    *
    * @default false
    */
  var showEditButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Size of Avatar
    * @default "small"
    */
  var size: js.UndefOr[
    reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.small | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.medium | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.large | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.xlarge | scala.Double
  ] = js.undefined
  /**
    * Image source
    */
  var source: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageURISource] = js.undefined
  /**
    * Renders title in the avatar
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Style for the title
    */
  var titleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
}

