package typings.reactNativeElements.anon

import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.CardProps>> */
@js.native
trait RecursivePartialPartialCa extends js.Object {
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var dividerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var featuredSubtitle: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var featuredSubtitleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  var featuredTitle: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var featuredTitleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  var image: js.UndefOr[RecursivePartial[js.UndefOr[ImageSourcePropType]]] = js.native
  var imageProps: js.UndefOr[RecursivePartial[js.UndefOr[PartialImageProps]]] = js.native
  var imageStyle: js.UndefOr[RecursivePartial[js.UndefOr[ImageStyle]]] = js.native
  var imageWrapperStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var title: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.native
  var titleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  var wrapperStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
}

object RecursivePartialPartialCa {
  @scala.inline
  def apply(): RecursivePartialPartialCa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialCa]
  }
  @scala.inline
  implicit class RecursivePartialPartialCaOps[Self <: RecursivePartialPartialCa] (val x: Self) extends AnyVal {
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
    def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setDividerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("dividerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDividerStyle: Self = this.set("dividerStyle", js.undefined)
    @scala.inline
    def setFeaturedSubtitle(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("featuredSubtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedSubtitle: Self = this.set("featuredSubtitle", js.undefined)
    @scala.inline
    def setFeaturedSubtitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("featuredSubtitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedSubtitleStyle: Self = this.set("featuredSubtitleStyle", js.undefined)
    @scala.inline
    def setFeaturedTitle(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("featuredTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedTitle: Self = this.set("featuredTitle", js.undefined)
    @scala.inline
    def setFeaturedTitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("featuredTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedTitleStyle: Self = this.set("featuredTitleStyle", js.undefined)
    @scala.inline
    def setImage(value: RecursivePartial[js.UndefOr[ImageSourcePropType]]): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setImageProps(value: RecursivePartial[js.UndefOr[PartialImageProps]]): Self = this.set("imageProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageProps: Self = this.set("imageProps", js.undefined)
    @scala.inline
    def setImageStyle(value: RecursivePartial[js.UndefOr[ImageStyle]]): Self = this.set("imageStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageStyle: Self = this.set("imageStyle", js.undefined)
    @scala.inline
    def setImageWrapperStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("imageWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageWrapperStyle: Self = this.set("imageWrapperStyle", js.undefined)
    @scala.inline
    def setTitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    @scala.inline
    def setWrapperStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
  }
  
}

