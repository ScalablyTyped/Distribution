package typings.reactNativeElements.anon

import typings.propTypes.mod.Requireable
import typings.reactNative.mod.ImageURISource
import typings.reactNativeElements.mod.RecursivePartial
import typings.reactNativeElements.reactNativeElementsStrings.bell
import typings.reactNativeElements.reactNativeElementsStrings.custom
import typings.reactNativeElements.reactNativeElementsStrings.heart
import typings.reactNativeElements.reactNativeElementsStrings.rocket
import typings.reactNativeElements.reactNativeElementsStrings.star
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-ratings.react-native-ratings.RatingProps>> */
@js.native
trait RecursivePartialPartialRa extends js.Object {
  var fractions: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var imageSize: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var minValue: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var onFinishRating: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* rating */ Double, Unit]]]] = js.native
  var onStartRating: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var ratingBackgroundColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var ratingColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var ratingCount: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var ratingImage: js.UndefOr[RecursivePartial[js.UndefOr[ImageURISource]]] = js.native
  var ratingTextColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var readonly: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var showRating: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var startingValue: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var style: js.UndefOr[RecursivePartial[js.UndefOr[Requireable[js.Object]]]] = js.native
  var tintColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var `type`: js.UndefOr[RecursivePartial[js.UndefOr[star | rocket | bell | heart | custom]]] = js.native
}

object RecursivePartialPartialRa {
  @scala.inline
  def apply(): RecursivePartialPartialRa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialRa]
  }
  @scala.inline
  implicit class RecursivePartialPartialRaOps[Self <: RecursivePartialPartialRa] (val x: Self) extends AnyVal {
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
    def setFractions(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("fractions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFractions: Self = this.set("fractions", js.undefined)
    @scala.inline
    def setImageSize(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("imageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSize: Self = this.set("imageSize", js.undefined)
    @scala.inline
    def setMinValue(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setOnFinishRating(value: RecursivePartial[js.UndefOr[js.Function1[/* rating */ Double, Unit]]]): Self = this.set("onFinishRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFinishRating: Self = this.set("onFinishRating", js.undefined)
    @scala.inline
    def setOnStartRating(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onStartRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStartRating: Self = this.set("onStartRating", js.undefined)
    @scala.inline
    def setRatingBackgroundColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("ratingBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatingBackgroundColor: Self = this.set("ratingBackgroundColor", js.undefined)
    @scala.inline
    def setRatingColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("ratingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatingColor: Self = this.set("ratingColor", js.undefined)
    @scala.inline
    def setRatingCount(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("ratingCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatingCount: Self = this.set("ratingCount", js.undefined)
    @scala.inline
    def setRatingImage(value: RecursivePartial[js.UndefOr[ImageURISource]]): Self = this.set("ratingImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatingImage: Self = this.set("ratingImage", js.undefined)
    @scala.inline
    def setRatingTextColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("ratingTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatingTextColor: Self = this.set("ratingTextColor", js.undefined)
    @scala.inline
    def setReadonly(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    @scala.inline
    def setShowRating(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("showRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRating: Self = this.set("showRating", js.undefined)
    @scala.inline
    def setStartingValue(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("startingValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartingValue: Self = this.set("startingValue", js.undefined)
    @scala.inline
    def setStyle(value: RecursivePartial[js.UndefOr[Requireable[js.Object]]]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTintColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    @scala.inline
    def setType(value: RecursivePartial[js.UndefOr[star | rocket | bell | heart | custom]]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

