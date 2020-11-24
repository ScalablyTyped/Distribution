package typings.reactNativeStarRating.mod

import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeStarRating.reactNativeStarRatingStrings.bounce
import typings.reactNativeStarRating.reactNativeStarRatingStrings.flash
import typings.reactNativeStarRating.reactNativeStarRatingStrings.jello
import typings.reactNativeStarRating.reactNativeStarRatingStrings.pulse
import typings.reactNativeStarRating.reactNativeStarRatingStrings.rotate
import typings.reactNativeStarRating.reactNativeStarRatingStrings.rubberBand
import typings.reactNativeStarRating.reactNativeStarRatingStrings.shake
import typings.reactNativeStarRating.reactNativeStarRatingStrings.swing
import typings.reactNativeStarRating.reactNativeStarRatingStrings.tada
import typings.reactNativeStarRating.reactNativeStarRatingStrings.wobble
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StarRatingProps extends js.Object {
  
  /**
    * Number between 0 to 1 to determine the opacity of the button.
    * Default is 0.2
    */
  var activeOpacity: js.UndefOr[Double] = js.native
  
  /**
    * Add an animation to the stars upon selection.
    */
  var animation: js.UndefOr[
    bounce | flash | jello | pulse | rotate | rubberBand | shake | swing | tada | wobble
  ] = js.native
  
  /**
    * Style of the button containing the star.
    */
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Style of the element containing the star rating component.
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Sets the interactivity of the star buttons.
    *
    * Default is false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the icon to represent an empty star.
    * Refer to react-native-vector-icons.
    * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx').
    *
    * Default is "star-o"
    */
  var emptyStar: js.UndefOr[String | ImageURISource] = js.native
  
  /**
    * Color of an empty star.
    *
    * Default is gray
    */
  var emptyStarColor: js.UndefOr[String] = js.native
  
  /**
    * The name of the icon to represent a full star.
    * Refer to react-native-vector-icons.
    * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx')
    *
    * Default is "star"
    */
  var fullStar: js.UndefOr[String | ImageURISource] = js.native
  
  /**
    * Color of a filled star.
    *
    * Default is black
    */
  var fullStarColor: js.UndefOr[String] = js.native
  
  /**
    * The name of the icon to represent an half star.
    * Refer to react-native-vector-icons.
    * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx').
    *
    * Default is "star-half-o"
    */
  var halfStar: js.UndefOr[String | ImageURISource] = js.native
  
  /**
    * Color of a half-filled star.
    *
    * Defaults to fullStarColor.
    */
  var halfStarColor: js.UndefOr[String] = js.native
  
  /**
    * Sets ability to select half stars
    *
    * Default is false
    */
  var halfStarEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the icon set the star image belongs to.
    * Refer to react-native-vector-icons.
    *
    * Default is "FontAwesome"
    */
  var iconSet: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of stars possible.
    *
    * Default is 5
    */
  var maxStars: js.UndefOr[Double] = js.native
  
  /**
    * The current rating to show.
    *
    * Default is 0
    */
  var rating: js.UndefOr[Double] = js.native
  
  /**
    * Renders stars from right to left
    *
    * Default is false
    */
  var reversed: js.UndefOr[Boolean] = js.native
  
  /**
    * A function to handle star button presses.
    */
  var selectedStar: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.native
  
  /**
    * Size of the star.
    *
    * Default is 40
    */
  var starSize: js.UndefOr[Double] = js.native
  
  /**
    * Style to apply to the star.
    */
  var starStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object StarRatingProps {
  
  @scala.inline
  def apply(): StarRatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StarRatingProps]
  }
  
  @scala.inline
  implicit class StarRatingPropsOps[Self <: StarRatingProps] (val x: Self) extends AnyVal {
    
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
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    
    @scala.inline
    def setAnimation(value: bounce | flash | jello | pulse | rotate | rubberBand | shake | swing | tada | wobble): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setButtonStyle(value: StyleProp[ViewStyle]): Self = this.set("buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonStyle: Self = this.set("buttonStyle", js.undefined)
    
    @scala.inline
    def setButtonStyleNull: Self = this.set("buttonStyle", null)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEmptyStar(value: String | ImageURISource): Self = this.set("emptyStar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyStar: Self = this.set("emptyStar", js.undefined)
    
    @scala.inline
    def setEmptyStarColor(value: String): Self = this.set("emptyStarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyStarColor: Self = this.set("emptyStarColor", js.undefined)
    
    @scala.inline
    def setFullStar(value: String | ImageURISource): Self = this.set("fullStar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullStar: Self = this.set("fullStar", js.undefined)
    
    @scala.inline
    def setFullStarColor(value: String): Self = this.set("fullStarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullStarColor: Self = this.set("fullStarColor", js.undefined)
    
    @scala.inline
    def setHalfStar(value: String | ImageURISource): Self = this.set("halfStar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHalfStar: Self = this.set("halfStar", js.undefined)
    
    @scala.inline
    def setHalfStarColor(value: String): Self = this.set("halfStarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHalfStarColor: Self = this.set("halfStarColor", js.undefined)
    
    @scala.inline
    def setHalfStarEnabled(value: Boolean): Self = this.set("halfStarEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHalfStarEnabled: Self = this.set("halfStarEnabled", js.undefined)
    
    @scala.inline
    def setIconSet(value: String): Self = this.set("iconSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSet: Self = this.set("iconSet", js.undefined)
    
    @scala.inline
    def setMaxStars(value: Double): Self = this.set("maxStars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxStars: Self = this.set("maxStars", js.undefined)
    
    @scala.inline
    def setRating(value: Double): Self = this.set("rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRating: Self = this.set("rating", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    
    @scala.inline
    def setSelectedStar(value: /* rating */ Double => Unit): Self = this.set("selectedStar", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectedStar: Self = this.set("selectedStar", js.undefined)
    
    @scala.inline
    def setStarSize(value: Double): Self = this.set("starSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarSize: Self = this.set("starSize", js.undefined)
    
    @scala.inline
    def setStarStyle(value: StyleProp[ViewStyle]): Self = this.set("starStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarStyle: Self = this.set("starStyle", js.undefined)
    
    @scala.inline
    def setStarStyleNull: Self = this.set("starStyle", null)
  }
}
