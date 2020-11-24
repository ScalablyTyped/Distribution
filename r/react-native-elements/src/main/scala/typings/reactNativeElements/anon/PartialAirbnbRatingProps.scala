package typings.reactNativeElements.anon

import typings.reactNative.mod.ImageStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-ratings.react-native-ratings.AirbnbRatingProps> */
@js.native
trait PartialAirbnbRatingProps extends js.Object {
  
  var count: js.UndefOr[Double] = js.native
  
  var defaultRating: js.UndefOr[Double] = js.native
  
  var isDisabled: js.UndefOr[Boolean] = js.native
  
  var onFinishRating: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var reviews: js.UndefOr[js.Array[String]] = js.native
  
  var selectedColor: js.UndefOr[String] = js.native
  
  var showRating: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var starStyle: js.UndefOr[ImageStyle] = js.native
}
object PartialAirbnbRatingProps {
  
  @scala.inline
  def apply(): PartialAirbnbRatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAirbnbRatingProps]
  }
  
  @scala.inline
  implicit class PartialAirbnbRatingPropsOps[Self <: PartialAirbnbRatingProps] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setDefaultRating(value: Double): Self = this.set("defaultRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRating: Self = this.set("defaultRating", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    
    @scala.inline
    def setOnFinishRating(value: /* value */ Double => Unit): Self = this.set("onFinishRating", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFinishRating: Self = this.set("onFinishRating", js.undefined)
    
    @scala.inline
    def setReviewsVarargs(value: String*): Self = this.set("reviews", js.Array(value :_*))
    
    @scala.inline
    def setReviews(value: js.Array[String]): Self = this.set("reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReviews: Self = this.set("reviews", js.undefined)
    
    @scala.inline
    def setSelectedColor(value: String): Self = this.set("selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedColor: Self = this.set("selectedColor", js.undefined)
    
    @scala.inline
    def setShowRating(value: Boolean): Self = this.set("showRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRating: Self = this.set("showRating", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStarStyle(value: ImageStyle): Self = this.set("starStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarStyle: Self = this.set("starStyle", js.undefined)
  }
}
