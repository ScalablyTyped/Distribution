package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.bottom
import typings.reactNative.reactNativeStrings.center
import typings.reactNative.reactNativeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyleAndroid extends ViewStyle {
  var includeFontPadding: js.UndefOr[Boolean] = js.native
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.native
}

object TextStyleAndroid {
  @scala.inline
  def apply(): TextStyleAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyleAndroid]
  }
  @scala.inline
  implicit class TextStyleAndroidOps[Self <: TextStyleAndroid] (val x: Self) extends AnyVal {
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
    def setIncludeFontPadding(value: Boolean): Self = this.set("includeFontPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeFontPadding: Self = this.set("includeFontPadding", js.undefined)
    @scala.inline
    def setTextAlignVertical(value: auto | top | bottom | center): Self = this.set("textAlignVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlignVertical: Self = this.set("textAlignVertical", js.undefined)
  }
  
}

