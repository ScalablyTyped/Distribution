package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.semanticUiReact.ratingIconMod.RatingIconProps
import typings.semanticUiReact.semanticUiReactStrings.auto
import typings.semanticUiReact.semanticUiReactStrings.heart
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.massive
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.star
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingRatingMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/Rating", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[RatingProps, ComponentState, js.Any] {
    def this(props: RatingProps) = this()
    def this(props: RatingProps, context: js.Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/Rating", JSImport.Default)
    @js.native
    val ^ : RatingComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/Rating", "default.Icon")
    @js.native
    class Icon protected ()
      extends Component[RatingIconProps, ComponentState, js.Any] {
      def this(props: RatingIconProps) = this()
      def this(props: RatingIconProps, context: js.Any) = this()
    }
    
    type _To = RatingComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: RatingComponent = ^
  }
  
  @js.native
  trait RatingComponent
    extends StObject
       with ComponentClass[RatingProps, ComponentState] {
    
    var Icon: ComponentClass[RatingIconProps, ComponentState] = js.native
  }
  
  trait RatingProps
    extends StObject
       with StrictRatingProps
       with /* key */ StringDictionary[js.Any]
  object RatingProps {
    
    inline def apply(): RatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatingProps]
    }
  }
  
  trait StrictRatingProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * You can clear the rating by clicking on the current start rating.
      * By default a rating will be only clearable if there is 1 icon.
      * Setting to `true`/`false` will allow or disallow a user to clear their rating.
      */
    var clearable: js.UndefOr[Boolean | auto] = js.undefined
    
    /** The initial rating value. */
    var defaultRating: js.UndefOr[Double | String] = js.undefined
    
    /** You can disable or enable interactive rating.  Makes a read-only rating. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** A rating can use a set of star or heart icons. */
    var icon: js.UndefOr[star | heart] = js.undefined
    
    /** The total number of icons. */
    var maxRating: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Called after user selects a new rating.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed rating.
      */
    var onRate: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
          /* data */ RatingProps, 
          Unit
        ]
      ] = js.undefined
    
    /** The current number of active icons. */
    var rating: js.UndefOr[Double | String] = js.undefined
    
    /** A progress bar can vary in size. */
    var size: js.UndefOr[mini | tiny | small | large | huge | massive] = js.undefined
  }
  object StrictRatingProps {
    
    inline def apply(): StrictRatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRatingProps]
    }
    
    extension [Self <: StrictRatingProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearable(value: Boolean | auto): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def setDefaultRating(value: Double | String): Self = StObject.set(x, "defaultRating", value.asInstanceOf[js.Any])
      
      inline def setDefaultRatingUndefined: Self = StObject.set(x, "defaultRating", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: star | heart): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMaxRating(value: Double | String): Self = StObject.set(x, "maxRating", value.asInstanceOf[js.Any])
      
      inline def setMaxRatingUndefined: Self = StObject.set(x, "maxRating", js.undefined)
      
      inline def setOnRate(value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ RatingProps) => Unit): Self = StObject.set(x, "onRate", js.Any.fromFunction2(value))
      
      inline def setOnRateUndefined: Self = StObject.set(x, "onRate", js.undefined)
      
      inline def setRating(value: Double | String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      inline def setSize(value: mini | tiny | small | large | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
