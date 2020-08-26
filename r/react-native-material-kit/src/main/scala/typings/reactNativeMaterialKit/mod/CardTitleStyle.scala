package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`100`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`200`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`300`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`400`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`500`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`600`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`700`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`800`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`900`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.absolute
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.bold
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.normal
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.relative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardTitleStyle extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontWeight: js.UndefOr[
    normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.native
  var left: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[Double] = js.native
  var position: js.UndefOr[absolute | relative] = js.native
  var top: js.UndefOr[Double] = js.native
}

object CardTitleStyle {
  @scala.inline
  def apply(): CardTitleStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardTitleStyle]
  }
  @scala.inline
  implicit class CardTitleStyleOps[Self <: CardTitleStyle] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontWeight(value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPosition(value: absolute | relative): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

