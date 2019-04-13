package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait ImageProps extends js.Object {
  /**
    * Specify a different component as the Image component.
    *
    * @default Image
    */
  var ImageComponent: js.UndefOr[reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState]] = js.undefined
  /**
    * Content to render when image is loading
    */
  var PlaceholderContent: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * Additional styling for the container
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Additional styling for the placeholder container
    */
  var placeholderStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    ImageComponent: reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = null,
    PlaceholderContent: reactLib.reactMod.ReactElement[_] = null,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    placeholderStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal()
    if (ImageComponent != null) __obj.updateDynamic("ImageComponent")(ImageComponent)
    if (PlaceholderContent != null) __obj.updateDynamic("PlaceholderContent")(PlaceholderContent)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
}

