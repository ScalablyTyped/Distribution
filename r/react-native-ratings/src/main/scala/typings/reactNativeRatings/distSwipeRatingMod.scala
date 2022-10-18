package typings.reactNativeRatings

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeRatings.anon.BackgroundColor
import typings.reactNativeRatings.anon.ImageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSwipeRatingMod {
  
  @JSImport("react-native-ratings/dist/SwipeRating", JSImport.Default)
  @js.native
  open class default protected () extends SwipeRating {
    def this(props: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-ratings/dist/SwipeRating", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-ratings/dist/SwipeRating", "default.defaultProps")
    @js.native
    def defaultProps: ImageSize = js.native
    inline def defaultProps_=(x: ImageSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SwipeRating extends Component[SwipeRatingProps, SwipeRatingState, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MSwipeRating(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSwipeRating(prevProps: Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSwipeRating(): Unit = js.native
    
    def displayCurrentRating(): Element = js.native
    
    def getCurrentRating(value: Any): Double = js.native
    
    def getPrimaryViewStyle(): BackgroundColor = js.native
    
    def getSecondaryViewStyle(): BackgroundColor = js.native
    
    def handleLayoutChange(): Unit = js.native
    
    var ratingRef: Any = js.native
    
    def renderRatings(): Any = js.native
    
    def setCurrentRating(rating: Any): Unit = js.native
  }
  
  trait SwipeRatingProps extends StObject {
    
    /**
      * The number of decimal places for the rating value; must be between 0 and 20
      */
    var fractions: js.UndefOr[Any] = js.undefined
    
    /**
      * The size of each rating image
      *
      * Default is 50
      */
    var imageSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The number to jump per swipe
      * Default is 0 (not to jump)
      */
    var jumpValue: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum value the user can select
      *
      * Default is 0
      */
    var minValue: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback method when the user finishes rating. Gives you the final rating value as a whole number
      */
    var onFinishRating: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback method when the user starts rating.
      */
    var onStartRating: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback method when the user is swiping.
      */
    var onSwipeRating: js.UndefOr[js.Function1[/* number */ Any, Unit]] = js.undefined
    
    /**
      * Pass in a custom background-fill-color for the rating icon; use this along with type='custom' prop above
      *
      * Default is 'white'
      */
    var ratingBackgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Pass in a custom fill-color for the rating icon; use this along with type='custom' prop above
      *
      * Default is '#f1c40f'
      */
    var ratingColor: js.UndefOr[String] = js.undefined
    
    /**
      * Number of rating images to display
      *
      * Default is 5
      */
    var ratingCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Pass in a custom image source; use this along with type='custom' prop above
      */
    var ratingImage: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Color used for the text labels
      */
    var ratingTextColor: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the rating can be modiefied by the user
      *
      * Default is false
      */
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Displays the Built-in Rating UI to show the rating value in real-time
      *
      * Default is false
      */
    var showRating: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the text is read only
      *
      * Default is false
      */
    var showReadOnlyText: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The initial rating to render
      *
      * Default is ratingCount/2
      */
    var startingValue: js.UndefOr[Double] = js.undefined
    
    /**
      * Exposes style prop to add additonal styling to the container view
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Color used for the background
      */
    var tintColor: js.UndefOr[String] = js.undefined
    
    /**
      * Graphic used for represent a rating
      *
      * Default is 'star'
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SwipeRatingProps {
    
    inline def apply(): SwipeRatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeRatingProps]
    }
    
    extension [Self <: SwipeRatingProps](x: Self) {
      
      inline def setFractions(value: Any): Self = StObject.set(x, "fractions", value.asInstanceOf[js.Any])
      
      inline def setFractionsUndefined: Self = StObject.set(x, "fractions", js.undefined)
      
      inline def setImageSize(value: Double): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      inline def setJumpValue(value: Double): Self = StObject.set(x, "jumpValue", value.asInstanceOf[js.Any])
      
      inline def setJumpValueUndefined: Self = StObject.set(x, "jumpValue", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setOnFinishRating(value: js.Function): Self = StObject.set(x, "onFinishRating", value.asInstanceOf[js.Any])
      
      inline def setOnFinishRatingUndefined: Self = StObject.set(x, "onFinishRating", js.undefined)
      
      inline def setOnStartRating(value: js.Function): Self = StObject.set(x, "onStartRating", value.asInstanceOf[js.Any])
      
      inline def setOnStartRatingUndefined: Self = StObject.set(x, "onStartRating", js.undefined)
      
      inline def setOnSwipeRating(value: /* number */ Any => Unit): Self = StObject.set(x, "onSwipeRating", js.Any.fromFunction1(value))
      
      inline def setOnSwipeRatingUndefined: Self = StObject.set(x, "onSwipeRating", js.undefined)
      
      inline def setRatingBackgroundColor(value: String): Self = StObject.set(x, "ratingBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setRatingBackgroundColorUndefined: Self = StObject.set(x, "ratingBackgroundColor", js.undefined)
      
      inline def setRatingColor(value: String): Self = StObject.set(x, "ratingColor", value.asInstanceOf[js.Any])
      
      inline def setRatingColorUndefined: Self = StObject.set(x, "ratingColor", js.undefined)
      
      inline def setRatingCount(value: Double): Self = StObject.set(x, "ratingCount", value.asInstanceOf[js.Any])
      
      inline def setRatingCountUndefined: Self = StObject.set(x, "ratingCount", js.undefined)
      
      inline def setRatingImage(value: ReactNode): Self = StObject.set(x, "ratingImage", value.asInstanceOf[js.Any])
      
      inline def setRatingImageUndefined: Self = StObject.set(x, "ratingImage", js.undefined)
      
      inline def setRatingTextColor(value: String): Self = StObject.set(x, "ratingTextColor", value.asInstanceOf[js.Any])
      
      inline def setRatingTextColorUndefined: Self = StObject.set(x, "ratingTextColor", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setShowRating(value: Boolean): Self = StObject.set(x, "showRating", value.asInstanceOf[js.Any])
      
      inline def setShowRatingUndefined: Self = StObject.set(x, "showRating", js.undefined)
      
      inline def setShowReadOnlyText(value: Boolean): Self = StObject.set(x, "showReadOnlyText", value.asInstanceOf[js.Any])
      
      inline def setShowReadOnlyTextUndefined: Self = StObject.set(x, "showReadOnlyText", js.undefined)
      
      inline def setStartingValue(value: Double): Self = StObject.set(x, "startingValue", value.asInstanceOf[js.Any])
      
      inline def setStartingValueUndefined: Self = StObject.set(x, "startingValue", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SwipeRatingState extends StObject {
    
    var centerX: js.UndefOr[Double] = js.undefined
    
    var display: Boolean
    
    var isComponentMounted: Boolean
    
    var panResponder: Any
    
    var position: Any
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object SwipeRatingState {
    
    inline def apply(display: Boolean, isComponentMounted: Boolean, panResponder: Any, position: Any): SwipeRatingState = {
      val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], isComponentMounted = isComponentMounted.asInstanceOf[js.Any], panResponder = panResponder.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwipeRatingState]
    }
    
    extension [Self <: SwipeRatingState](x: Self) {
      
      inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
      
      inline def setCenterXUndefined: Self = StObject.set(x, "centerX", js.undefined)
      
      inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setIsComponentMounted(value: Boolean): Self = StObject.set(x, "isComponentMounted", value.asInstanceOf[js.Any])
      
      inline def setPanResponder(value: Any): Self = StObject.set(x, "panResponder", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
