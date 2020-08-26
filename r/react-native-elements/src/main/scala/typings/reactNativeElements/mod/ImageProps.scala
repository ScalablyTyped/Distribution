package typings.reactNativeElements.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageProps
  extends typings.reactNative.mod.ImageProps {
  /**
    * Specify a different component as the Image component.
    *
    * @default Image
    */
  var ImageComponent: js.UndefOr[ComponentType[_]] = js.native
  /**
    * Content to render when image is loading
    */
  var PlaceholderContent: js.UndefOr[ReactElement] = js.native
  /**
    * Additional styling for the container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Additional styling for the placeholder container
    */
  var placeholderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Perform fade transition on image load
    *
    * @default true
    */
  var transition: js.UndefOr[Boolean] = js.native
}

object ImageProps {
  @scala.inline
  def apply(source: ImageSourcePropType): ImageProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
  @scala.inline
  implicit class ImagePropsOps[Self <: ImageProps] (val x: Self) extends AnyVal {
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
    def setImageComponent(value: ComponentType[_]): Self = this.set("ImageComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageComponent: Self = this.set("ImageComponent", js.undefined)
    @scala.inline
    def setPlaceholderContent(value: ReactElement): Self = this.set("PlaceholderContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderContent: Self = this.set("PlaceholderContent", js.undefined)
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setPlaceholderStyle(value: StyleProp[ViewStyle]): Self = this.set("placeholderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderStyle: Self = this.set("placeholderStyle", js.undefined)
    @scala.inline
    def setPlaceholderStyleNull: Self = this.set("placeholderStyle", null)
    @scala.inline
    def setTransition(value: Boolean): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

