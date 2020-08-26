package typings.reactNativeSnapCarousel.mod

import typings.reactNative.mod.ImageProps
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSnapCarousel.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallaxImageProps
  extends ImageProps
     with AdditionalParallaxProps {
  /**
    * Optional style for image's container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * On screen dimensions of the image
    */
  var dimensions: js.UndefOr[Height] = js.native
  /**
    * Speed of parallax effect. A higher value appears more 'zoomed in'
    */
  var parallaxFactor: js.UndefOr[Double] = js.native
  /**
    * Whether to display a loading spinner
    */
  var showSpinner: js.UndefOr[Boolean] = js.native
  /**
    * Color of the loading spinner if displayed
    */
  var spinnerColor: js.UndefOr[String] = js.native
}

object ParallaxImageProps {
  @scala.inline
  def apply(source: ImageSourcePropType): ParallaxImageProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallaxImageProps]
  }
  @scala.inline
  implicit class ParallaxImagePropsOps[Self <: ParallaxImageProps] (val x: Self) extends AnyVal {
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
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setDimensions(value: Height): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setParallaxFactor(value: Double): Self = this.set("parallaxFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallaxFactor: Self = this.set("parallaxFactor", js.undefined)
    @scala.inline
    def setShowSpinner(value: Boolean): Self = this.set("showSpinner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSpinner: Self = this.set("showSpinner", js.undefined)
    @scala.inline
    def setSpinnerColor(value: String): Self = this.set("spinnerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinnerColor: Self = this.set("spinnerColor", js.undefined)
  }
  
}

