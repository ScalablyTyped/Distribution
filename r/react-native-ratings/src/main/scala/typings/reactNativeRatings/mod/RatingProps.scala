package typings.reactNativeRatings.mod

import typings.propTypes.mod.Requireable
import typings.reactNative.mod.ImageURISource
import typings.reactNativeRatings.reactNativeRatingsStrings.bell
import typings.reactNativeRatings.reactNativeRatingsStrings.custom
import typings.reactNativeRatings.reactNativeRatingsStrings.heart
import typings.reactNativeRatings.reactNativeRatingsStrings.rocket
import typings.reactNativeRatings.reactNativeRatingsStrings.star
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RatingProps extends js.Object {
  
  /**
    * The number of decimal places for the rating value; must be between 0 and 20
    */
  var fractions: js.UndefOr[Double] = js.native
  
  /**
    * The size of each rating image
    *
    * Default is 50
    */
  var imageSize: js.UndefOr[Double] = js.native
  
  /**
    * The minimum value the user can select
    *
    * Default is 0
    */
  var minValue: js.UndefOr[Double] = js.native
  
  /**
    * Callback method when the user finishes rating. Gives you the final rating value as a whole number
    */
  var onFinishRating: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.native
  
  /**
    * Callback method when the user starts rating.
    */
  var onStartRating: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Pass in a custom background-fill-color for the rating icon; use this along with type='custom' prop above
    *
    * Default is 'white'
    */
  var ratingBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Pass in a custom fill-color for the rating icon; use this along with type='custom' prop above
    *
    * Default is '#f1c40f'
    */
  var ratingColor: js.UndefOr[String] = js.native
  
  /**
    * Number of rating images to display
    *
    * Default is 5
    */
  var ratingCount: js.UndefOr[Double] = js.native
  
  /**
    * Pass in a custom image source; use this along with type='custom' prop above
    */
  var ratingImage: js.UndefOr[ImageURISource] = js.native
  
  /**
    * Color used for the text labels
    */
  var ratingTextColor: js.UndefOr[String] = js.native
  
  /**
    * Whether the rating can be modiefied by the user
    *
    * Default is false
    */
  var readonly: js.UndefOr[Boolean] = js.native
  
  /**
    * Displays the Built-in Rating UI to show the rating value in real-time
    *
    * Default is false
    */
  var showRating: js.UndefOr[Boolean] = js.native
  
  /**
    * The initial rating to render
    *
    * Default is ratingCount/2
    */
  var startingValue: js.UndefOr[Double] = js.native
  
  /**
    * Exposes style prop to add additonal styling to the container view
    */
  var style: js.UndefOr[Requireable[js.Object]] = js.native
  
  /**
    * Color used for the background
    */
  var tintColor: js.UndefOr[String] = js.native
  
  /**
    * Graphic used for represent a rating
    *
    * Default is 'star'
    */
  var `type`: js.UndefOr[star | rocket | bell | heart | custom] = js.native
}
object RatingProps {
  
  @scala.inline
  def apply(): RatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RatingProps]
  }
  
  @scala.inline
  implicit class RatingPropsOps[Self <: RatingProps] (val x: Self) extends AnyVal {
    
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
