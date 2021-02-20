package typings.reactNativeCollapsible

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCollapsible.mod.EasingMode
import typings.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typings.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typings.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("react-native-collapsible/Accordion", JSImport.Default)
  @js.native
  class default[T] ()
    extends Component[AccordionProps[T], js.Object, js.Any]
  
  type Accordion[T] = Component[AccordionProps[T], js.Object, js.Any]
  
  @js.native
  trait AccordionProps[T] extends StObject {
    
    /**
      * Control which indices in the sections array are currently open. If empty, closes all sections.
      */
    var activeSections: js.Array[Double] = js.native
    
    /**
      * Alignment of the content when transitioning, can be top, center or bottom
      *
      * @default top
      */
    var align: js.UndefOr[top | center | bottom] = js.native
    
    /**
      * Optional styling for the Accordion container
      */
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /**
      * Controls whether user can interact with accordion
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Duration of transition in milliseconds
      *
      * @default 300
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * Function or function name from Easing (or tween-functions if < RN 0.8). Collapsible will try to combine Easing functions for you if you name them like tween-functions.
      *
      * @default easeOutCubic
      */
    var easing: js.UndefOr[EasingMode | js.Any] = js.native
    
    /**
      * Expand content from the bottom instead of the top
      *
      * @default false
      */
    var expandFromBottom: js.UndefOr[Boolean] = js.native
    
    /**
      * Allow more than one section to be expanded at a time. Defaults to false for legacy behavior.
      *
      * @default false
      */
    var expandMultiple: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that is called when the currently active section(s) are updated.
      */
    def onChange(indexes: js.Array[Double]): Unit = js.native
    
    /**
      * A function that should return a renderable representing the content
      */
    def renderContent(content: T, index: Double, isActive: Boolean, sections: js.Array[T]): ReactElement = js.native
    
    /**
      * A function that should return a renderable representing the footer
      */
    var renderFooter: js.UndefOr[
        js.Function4[
          /* content */ T, 
          /* index */ Double, 
          /* isActive */ Boolean, 
          /* sections */ js.Array[T], 
          ReactElement
        ]
      ] = js.native
    
    /**
      * A function that should return a renderable representing the header
      */
    def renderHeader(content: T, index: Double, isActive: Boolean, sections: js.Array[T]): ReactElement = js.native
    
    /**
      * A function that should return a renderable representing the section title above the touchable
      */
    var renderSectionTitle: js.UndefOr[
        js.Function4[
          /* content */ T, 
          /* index */ Double, 
          /* isActive */ Boolean, 
          /* sections */ js.Array[T], 
          ReactElement
        ]
      ] = js.native
    
    /**
      * Optional styling for the section container
      */
    var sectionContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /**
      * An array of sections passed to the render methods
      */
    var sections: js.Array[T] = js.native
    
    /**
      * Component to use for the Touchable
      *
      * @default TouchableHighlight
      */
    var touchableComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
    
    /**
      * Object of props to pass to the touchable component
      */
    var touchableProps: js.UndefOr[js.Object] = js.native
    
    /**
      * The color of the underlay that will show through when tapping on headers.
      *
      * @default black
      */
    var underlayColor: js.UndefOr[String] = js.native
  }
  object AccordionProps {
    
    @scala.inline
    def apply[T](
      activeSections: js.Array[Double],
      onChange: js.Array[Double] => Unit,
      renderContent: (T, Double, Boolean, js.Array[T]) => ReactElement,
      renderHeader: (T, Double, Boolean, js.Array[T]) => ReactElement,
      sections: js.Array[T]
    ): AccordionProps[T] = {
      val __obj = js.Dynamic.literal(activeSections = activeSections.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderContent = js.Any.fromFunction4(renderContent), renderHeader = js.Any.fromFunction4(renderHeader), sections = sections.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionProps[T]]
    }
    
    @scala.inline
    implicit class AccordionPropsMutableBuilder[Self <: AccordionProps[_], T] (val x: Self with AccordionProps[T]) extends AnyVal {
      
      @scala.inline
      def setActiveSections(value: js.Array[Double]): Self = StObject.set(x, "activeSections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveSectionsVarargs(value: Double*): Self = StObject.set(x, "activeSections", js.Array(value :_*))
      
      @scala.inline
      def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: EasingMode | js.Any): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setExpandFromBottom(value: Boolean): Self = StObject.set(x, "expandFromBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandFromBottomUndefined: Self = StObject.set(x, "expandFromBottom", js.undefined)
      
      @scala.inline
      def setExpandMultiple(value: Boolean): Self = StObject.set(x, "expandMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandMultipleUndefined: Self = StObject.set(x, "expandMultiple", js.undefined)
      
      @scala.inline
      def setOnChange(value: js.Array[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderContent(value: (T, Double, Boolean, js.Array[T]) => ReactElement): Self = StObject.set(x, "renderContent", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderFooter(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderFooter", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
      
      @scala.inline
      def setRenderHeader(value: (T, Double, Boolean, js.Array[T]) => ReactElement): Self = StObject.set(x, "renderHeader", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderSectionTitle(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderSectionTitle", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderSectionTitleUndefined: Self = StObject.set(x, "renderSectionTitle", js.undefined)
      
      @scala.inline
      def setSectionContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "sectionContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionContainerStyleNull: Self = StObject.set(x, "sectionContainerStyle", null)
      
      @scala.inline
      def setSectionContainerStyleUndefined: Self = StObject.set(x, "sectionContainerStyle", js.undefined)
      
      @scala.inline
      def setSections(value: js.Array[T]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionsVarargs(value: T*): Self = StObject.set(x, "sections", js.Array(value :_*))
      
      @scala.inline
      def setTouchableComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "touchableComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchableComponentUndefined: Self = StObject.set(x, "touchableComponent", js.undefined)
      
      @scala.inline
      def setTouchableProps(value: js.Object): Self = StObject.set(x, "touchableProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchablePropsUndefined: Self = StObject.set(x, "touchableProps", js.undefined)
      
      @scala.inline
      def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
}
