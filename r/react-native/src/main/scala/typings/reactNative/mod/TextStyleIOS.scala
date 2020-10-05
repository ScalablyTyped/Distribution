package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.dashed
import typings.reactNative.reactNativeStrings.dotted
import typings.reactNative.reactNativeStrings.double
import typings.reactNative.reactNativeStrings.ltr
import typings.reactNative.reactNativeStrings.rtl
import typings.reactNative.reactNativeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyleIOS extends ViewStyle {
  var fontVariant: js.UndefOr[js.Array[FontVariant]] = js.native
  var letterSpacing: js.UndefOr[Double] = js.native
  var textDecorationColor: js.UndefOr[ColorValue] = js.native
  var textDecorationStyle: js.UndefOr[solid | double | dotted | dashed] = js.native
  var writingDirection: js.UndefOr[auto | ltr | rtl] = js.native
}

object TextStyleIOS {
  @scala.inline
  def apply(): TextStyleIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyleIOS]
  }
  @scala.inline
  implicit class TextStyleIOSOps[Self <: TextStyleIOS] (val x: Self) extends AnyVal {
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
    def setFontVariantVarargs(value: FontVariant*): Self = this.set("fontVariant", js.Array(value :_*))
    @scala.inline
    def setFontVariant(value: js.Array[FontVariant]): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    @scala.inline
    def setLetterSpacing(value: Double): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    @scala.inline
    def setTextDecorationColor(value: ColorValue): Self = this.set("textDecorationColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecorationColor: Self = this.set("textDecorationColor", js.undefined)
    @scala.inline
    def setTextDecorationStyle(value: solid | double | dotted | dashed): Self = this.set("textDecorationStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecorationStyle: Self = this.set("textDecorationStyle", js.undefined)
    @scala.inline
    def setWritingDirection(value: auto | ltr | rtl): Self = this.set("writingDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritingDirection: Self = this.set("writingDirection", js.undefined)
  }
  
}

