package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileProps extends js.Object {
  /**
    * Specify a different component as the Image component
    * @default React Native BackgroundImage component
    */
  var ImageComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
  /**
    * Number passed to control opacity on press
    *
    * @default 0.2
    */
  var activeOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Text inside the tile when tile is featured
    */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Styling for the caption
    */
  var captionStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * @default none	object (style)	Styling for the outer tile container
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Styling for bottom container when not featured tile
    */
  var contentContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Changes the look of the tile
    */
  var featured: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Height for the tile
    *
    * @default Device Width * 0.8
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Icon Component Props
    */
  var icon: js.UndefOr[IconObject] = js.undefined
  /**
    * Styling for the outer icon container
    */
  var iconContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Styling for the image
    */
  var imageContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Source for the image
    */
  var imageSrc: reactDashNativeLib.reactDashNativeMod.ImageURISource | java.lang.String | scala.Double
  /**
    * @default none	function (event)	Function to call when tile is pressed
    */
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Text inside the tile
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Styling for the title
    */
  var titleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * Width for the tile
    *
    * @default Device Width
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TileProps {
  @scala.inline
  def apply(
    imageSrc: reactDashNativeLib.reactDashNativeMod.ImageURISource | java.lang.String | scala.Double,
    ImageComponent: reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState] = null,
    activeOpacity: scala.Int | scala.Double = null,
    caption: java.lang.String = null,
    captionStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    contentContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    featured: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    icon: IconObject = null,
    iconContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    imageContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    onPress: js.Function0[scala.Unit] = null,
    title: java.lang.String = null,
    titleStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    width: scala.Int | scala.Double = null
  ): TileProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("imageSrc")(imageSrc.asInstanceOf[js.Any])
    if (ImageComponent != null) __obj.updateDynamic("ImageComponent")(ImageComponent)
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (captionStyle != null) __obj.updateDynamic("captionStyle")(captionStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(featured)) __obj.updateDynamic("featured")(featured)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconContainerStyle != null) __obj.updateDynamic("iconContainerStyle")(iconContainerStyle.asInstanceOf[js.Any])
    if (imageContainerStyle != null) __obj.updateDynamic("imageContainerStyle")(imageContainerStyle.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileProps]
  }
}

