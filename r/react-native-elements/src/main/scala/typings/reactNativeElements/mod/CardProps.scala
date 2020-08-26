package typings.reactNativeElements.mod

import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PartialImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardProps extends js.Object {
  /**
    * Outer container style
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Additional divider styling
    * (if title provided)
    */
  var dividerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Subtitle rendered over the image
    * (only works if image prop is present)
    */
  var featuredSubtitle: js.UndefOr[String] = js.native
  /**
    * Styling for featured subtitle
    */
  var featuredSubtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Title rendered over the image
    * (only works if image prop is present)
    */
  var featuredTitle: js.UndefOr[String] = js.native
  /**
    * Styling for featured title
    */
  var featuredTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Add an image as the heading with the image prop
    */
  var image: js.UndefOr[ImageSourcePropType] = js.native
  /**
    * Optional properties to pass to the image if provided e.g "resizeMode"
    */
  var imageProps: js.UndefOr[PartialImageProps] = js.native
  /**
    * Specify image styling if image is provided
    */
  var imageStyle: js.UndefOr[ImageStyle] = js.native
  /**
    * Specify styling for view surrounding image
    */
  var imageWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Card title
    */
  var title: js.UndefOr[String | ReactElement] = js.native
  /**
    * Additional title styling (if title provided)
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Inner container style
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object CardProps {
  @scala.inline
  def apply(): CardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardProps]
  }
  @scala.inline
  implicit class CardPropsOps[Self <: CardProps] (val x: Self) extends AnyVal {
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
    def setDividerStyle(value: StyleProp[ViewStyle]): Self = this.set("dividerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDividerStyle: Self = this.set("dividerStyle", js.undefined)
    @scala.inline
    def setDividerStyleNull: Self = this.set("dividerStyle", null)
    @scala.inline
    def setFeaturedSubtitle(value: String): Self = this.set("featuredSubtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedSubtitle: Self = this.set("featuredSubtitle", js.undefined)
    @scala.inline
    def setFeaturedSubtitleStyle(value: StyleProp[TextStyle]): Self = this.set("featuredSubtitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedSubtitleStyle: Self = this.set("featuredSubtitleStyle", js.undefined)
    @scala.inline
    def setFeaturedSubtitleStyleNull: Self = this.set("featuredSubtitleStyle", null)
    @scala.inline
    def setFeaturedTitle(value: String): Self = this.set("featuredTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedTitle: Self = this.set("featuredTitle", js.undefined)
    @scala.inline
    def setFeaturedTitleStyle(value: StyleProp[TextStyle]): Self = this.set("featuredTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedTitleStyle: Self = this.set("featuredTitleStyle", js.undefined)
    @scala.inline
    def setFeaturedTitleStyleNull: Self = this.set("featuredTitleStyle", null)
    @scala.inline
    def setImageVarargs(value: ImageURISource*): Self = this.set("image", js.Array(value :_*))
    @scala.inline
    def setImage(value: ImageSourcePropType): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setImageProps(value: PartialImageProps): Self = this.set("imageProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageProps: Self = this.set("imageProps", js.undefined)
    @scala.inline
    def setImageStyle(value: ImageStyle): Self = this.set("imageStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageStyle: Self = this.set("imageStyle", js.undefined)
    @scala.inline
    def setImageWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("imageWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageWrapperStyle: Self = this.set("imageWrapperStyle", js.undefined)
    @scala.inline
    def setImageWrapperStyleNull: Self = this.set("imageWrapperStyle", null)
    @scala.inline
    def setTitle(value: String | ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    @scala.inline
    def setTitleStyleNull: Self = this.set("titleStyle", null)
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
    @scala.inline
    def setWrapperStyleNull: Self = this.set("wrapperStyle", null)
  }
  
}

