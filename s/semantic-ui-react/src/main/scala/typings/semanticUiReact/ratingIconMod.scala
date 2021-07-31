package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingIconMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/RatingIcon", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[RatingIconProps, ComponentState, js.Any] {
    def this(props: RatingIconProps) = this()
    def this(props: RatingIconProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/RatingIcon", JSImport.Default)
  @js.native
  val default: ComponentClass[RatingIconProps, ComponentState] = js.native
  
  trait RatingIconProps
    extends StObject
       with StrictRatingIconProps
       with /* key */ StringDictionary[js.Any]
  object RatingIconProps {
    
    @scala.inline
    def apply(): RatingIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatingIconProps]
    }
  }
  
  trait StrictRatingIconProps extends StObject {
    
    /** Indicates activity of an icon. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** An index of icon inside Rating. */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed rating.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
          /* data */ RatingIconProps, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Called on keyup.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed rating.
      */
    var onKeyUp: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
          /* data */ RatingIconProps, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Called on mouseenter.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed rating.
      */
    var onMouseEnter: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
          /* data */ RatingIconProps, 
          Unit
        ]
      ] = js.undefined
    
    /** Indicates selection of an icon. */
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object StrictRatingIconProps {
    
    @scala.inline
    def apply(): StrictRatingIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRatingIconProps]
    }
    
    @scala.inline
    implicit class StrictRatingIconPropsMutableBuilder[Self <: StrictRatingIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ RatingIconProps) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ RatingIconProps) => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ RatingIconProps) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  type _To = ComponentClass[RatingIconProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `ratingIconMod.foo` */
  override def _to: ComponentClass[RatingIconProps, ComponentState] = default
}
