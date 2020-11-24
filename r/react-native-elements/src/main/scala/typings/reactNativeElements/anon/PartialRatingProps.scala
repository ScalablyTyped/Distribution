package typings.reactNativeElements.anon

import typings.propTypes.mod.Requireable
import typings.reactNative.mod.ImageURISource
import typings.reactNativeElements.reactNativeElementsStrings.bell
import typings.reactNativeElements.reactNativeElementsStrings.custom
import typings.reactNativeElements.reactNativeElementsStrings.heart
import typings.reactNativeElements.reactNativeElementsStrings.rocket
import typings.reactNativeElements.reactNativeElementsStrings.star
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-ratings.react-native-ratings.RatingProps> */
@js.native
trait PartialRatingProps extends js.Object {
  
  var fractions: js.UndefOr[Double] = js.native
  
  var imageSize: js.UndefOr[Double] = js.native
  
  var minValue: js.UndefOr[Double] = js.native
  
  var onFinishRating: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.native
  
  var onStartRating: js.UndefOr[js.Function0[Unit]] = js.native
  
  var ratingBackgroundColor: js.UndefOr[String] = js.native
  
  var ratingColor: js.UndefOr[String] = js.native
  
  var ratingCount: js.UndefOr[Double] = js.native
  
  var ratingImage: js.UndefOr[ImageURISource] = js.native
  
  var ratingTextColor: js.UndefOr[String] = js.native
  
  var readonly: js.UndefOr[Boolean] = js.native
  
  var showRating: js.UndefOr[Boolean] = js.native
  
  var startingValue: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[Requireable[js.Object]] = js.native
  
  var tintColor: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[star | rocket | bell | heart | custom] = js.native
}
object PartialRatingProps {
  
  @scala.inline
  def apply(): PartialRatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRatingProps]
  }
  
  @scala.inline
  implicit class PartialRatingPropsOps[Self <: PartialRatingProps] (val x: Self) extends AnyVal {
    
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
    def setFractions(value: Double): Self = this.set("fractions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFractions: Self = this.set("fractions", js.undefined)
    
    @scala.inline
    def setImageSize(value: Double): Self = this.set("imageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSize: Self = this.set("imageSize", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setOnFinishRating(value: /* rating */ Double => Unit): Self = this.set("onFinishRating", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFinishRating: Self = this.set("onFinishRating", js.undefined)
    
    @scala.inline
    def setOnStartRating(value: () => Unit): Self = this.set("onStartRating", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnStartRating: Self = this.set("onStartRating", js.undefined)
    
    @scala.inline
    def setRatingBackgroundColor(value: String): Self = this.set("ratingBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingBackgroundColor: Self = this.set("ratingBackgroundColor", js.undefined)
    
    @scala.inline
    def setRatingColor(value: String): Self = this.set("ratingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingColor: Self = this.set("ratingColor", js.undefined)
    
    @scala.inline
    def setRatingCount(value: Double): Self = this.set("ratingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingCount: Self = this.set("ratingCount", js.undefined)
    
    @scala.inline
    def setRatingImage(value: ImageURISource): Self = this.set("ratingImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingImage: Self = this.set("ratingImage", js.undefined)
    
    @scala.inline
    def setRatingTextColor(value: String): Self = this.set("ratingTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingTextColor: Self = this.set("ratingTextColor", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setShowRating(value: Boolean): Self = this.set("showRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRating: Self = this.set("showRating", js.undefined)
    
    @scala.inline
    def setStartingValue(value: Double): Self = this.set("startingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartingValue: Self = this.set("startingValue", js.undefined)
    
    @scala.inline
    def setStyle(value: Requireable[js.Object]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setType(value: star | rocket | bell | heart | custom): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
