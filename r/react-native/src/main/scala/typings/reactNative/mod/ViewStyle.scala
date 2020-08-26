package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dashed
import typings.reactNative.reactNativeStrings.dotted
import typings.reactNative.reactNativeStrings.hidden
import typings.reactNative.reactNativeStrings.solid
import typings.reactNative.reactNativeStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewStyle
  extends FlexStyle
     with ShadowStyleIOS
     with TransformsStyle {
  var backfaceVisibility: js.UndefOr[visible | hidden] = js.native
  var backgroundColor: js.UndefOr[ColorValue] = js.native
  var borderBottomColor: js.UndefOr[ColorValue] = js.native
  var borderBottomEndRadius: js.UndefOr[Double] = js.native
  var borderBottomLeftRadius: js.UndefOr[Double] = js.native
  var borderBottomRightRadius: js.UndefOr[Double] = js.native
  var borderBottomStartRadius: js.UndefOr[Double] = js.native
  var borderColor: js.UndefOr[ColorValue] = js.native
  var borderEndColor: js.UndefOr[ColorValue] = js.native
  var borderLeftColor: js.UndefOr[ColorValue] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var borderRightColor: js.UndefOr[ColorValue] = js.native
  var borderStartColor: js.UndefOr[ColorValue] = js.native
  var borderStyle: js.UndefOr[solid | dotted | dashed] = js.native
  var borderTopColor: js.UndefOr[ColorValue] = js.native
  var borderTopEndRadius: js.UndefOr[Double] = js.native
  var borderTopLeftRadius: js.UndefOr[Double] = js.native
  var borderTopRightRadius: js.UndefOr[Double] = js.native
  var borderTopStartRadius: js.UndefOr[Double] = js.native
  /**
    * Sets the elevation of a view, using Android's underlying
    * [elevation API](https://developer.android.com/training/material/shadows-clipping.html#Elevation).
    * This adds a drop shadow to the item and affects z-order for overlapping views.
    * Only supported on Android 5.0+, has no effect on earlier versions.
    *
    * @platform android
    */
  var elevation: js.UndefOr[Double] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var testID: js.UndefOr[String] = js.native
}

object ViewStyle {
  @scala.inline
  def apply(): ViewStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewStyle]
  }
  @scala.inline
  implicit class ViewStyleOps[Self <: ViewStyle] (val x: Self) extends AnyVal {
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
    def setBackfaceVisibility(value: visible | hidden): Self = this.set("backfaceVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackfaceVisibility: Self = this.set("backfaceVisibility", js.undefined)
    @scala.inline
    def setBackgroundColor(value: ColorValue): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderBottomColor(value: ColorValue): Self = this.set("borderBottomColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomColor: Self = this.set("borderBottomColor", js.undefined)
    @scala.inline
    def setBorderBottomEndRadius(value: Double): Self = this.set("borderBottomEndRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomEndRadius: Self = this.set("borderBottomEndRadius", js.undefined)
    @scala.inline
    def setBorderBottomLeftRadius(value: Double): Self = this.set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomLeftRadius: Self = this.set("borderBottomLeftRadius", js.undefined)
    @scala.inline
    def setBorderBottomRightRadius(value: Double): Self = this.set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomRightRadius: Self = this.set("borderBottomRightRadius", js.undefined)
    @scala.inline
    def setBorderBottomStartRadius(value: Double): Self = this.set("borderBottomStartRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomStartRadius: Self = this.set("borderBottomStartRadius", js.undefined)
    @scala.inline
    def setBorderColor(value: ColorValue): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderEndColor(value: ColorValue): Self = this.set("borderEndColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderEndColor: Self = this.set("borderEndColor", js.undefined)
    @scala.inline
    def setBorderLeftColor(value: ColorValue): Self = this.set("borderLeftColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeftColor: Self = this.set("borderLeftColor", js.undefined)
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBorderRightColor(value: ColorValue): Self = this.set("borderRightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRightColor: Self = this.set("borderRightColor", js.undefined)
    @scala.inline
    def setBorderStartColor(value: ColorValue): Self = this.set("borderStartColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStartColor: Self = this.set("borderStartColor", js.undefined)
    @scala.inline
    def setBorderStyle(value: solid | dotted | dashed): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    @scala.inline
    def setBorderTopColor(value: ColorValue): Self = this.set("borderTopColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopColor: Self = this.set("borderTopColor", js.undefined)
    @scala.inline
    def setBorderTopEndRadius(value: Double): Self = this.set("borderTopEndRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopEndRadius: Self = this.set("borderTopEndRadius", js.undefined)
    @scala.inline
    def setBorderTopLeftRadius(value: Double): Self = this.set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopLeftRadius: Self = this.set("borderTopLeftRadius", js.undefined)
    @scala.inline
    def setBorderTopRightRadius(value: Double): Self = this.set("borderTopRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopRightRadius: Self = this.set("borderTopRightRadius", js.undefined)
    @scala.inline
    def setBorderTopStartRadius(value: Double): Self = this.set("borderTopStartRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopStartRadius: Self = this.set("borderTopStartRadius", js.undefined)
    @scala.inline
    def setElevation(value: Double): Self = this.set("elevation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
  }
  
}

