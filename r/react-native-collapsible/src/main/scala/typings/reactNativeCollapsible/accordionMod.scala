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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("react-native-collapsible/Accordion", JSImport.Default)
  @js.native
  open class default[T] ()
    extends Component[AccordionProps[T], js.Object, Any]
  
  type Accordion[T] = Component[AccordionProps[T], js.Object, Any]
  
  trait AccordionProps[T] extends StObject {
    
    /**
      * Control which indices from keyEctractor in the sections array are currently
      * open. If empty, closes all sections.
      */
    var activeSections: js.Array[Double | String]
    
    /**
      * Alignment of the content when transitioning, can be top, center or bottom
      *
      * @default top
      */
    var align: js.UndefOr[top | center | bottom] = js.undefined
    
    /**
      * Optional styling for the Accordion container
      */
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Controls whether user can interact with accordion
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Duration of transition in milliseconds
      *
      * @default 300
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Function or function name from Easing (or tween-functions if < RN 0.8). Collapsible will try to combine Easing functions for you if you name them like tween-functions.
      *
      * @default easeOutCubic
      */
    var easing: js.UndefOr[EasingMode | Any] = js.undefined
    
    /**
      * Expand content from the bottom instead of the top
      *
      * @default false
      */
    var expandFromBottom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow more than one section to be expanded at a time. Defaults to false for legacy behavior.
      *
      * @default false
      */
    var expandMultiple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to extract a unique key for a given item at the specified index. Key is used for caching
      * and as the react key to track item re-ordering. The default extractor checks `item.key`, then
      * falls back to using the index, like React does.
      */
    var keyExtractor: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, Double | String]] = js.undefined
    
    /**
      * A function that is called when the currently active section(s) are updated.
      */
    def onChange(indexes: js.Array[Double]): Unit
    
    /**
      * Render the Accordion as a FlatList. Defaults to false for legacy behavior.
      *
      * @default false
      */
    var renderAsFlatList: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that should return a renderable representing the content
      */
    def renderContent(content: T, index: Double, isActive: Boolean, sections: js.Array[T]): ReactElement
    
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
      ] = js.undefined
    
    /**
      * A function that should return a renderable representing the header
      */
    def renderHeader(content: T, index: Double, isActive: Boolean, sections: js.Array[T]): ReactElement
    
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
      ] = js.undefined
    
    /**
      * Optional styling for the section container
      */
    var sectionContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * An array of sections passed to the render methods
      */
    var sections: js.Array[T]
    
    /**
      * Component to use for the Touchable
      *
      * @default TouchableHighlight
      */
    var touchableComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
    
    /**
      * Object of props to pass to the touchable component
      */
    var touchableProps: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The color of the underlay that will show through when tapping on headers.
      *
      * @default black
      */
    var underlayColor: js.UndefOr[String] = js.undefined
  }
  object AccordionProps {
    
    inline def apply[T](
      activeSections: js.Array[Double | String],
      onChange: js.Array[Double] => Unit,
      renderContent: (T, Double, Boolean, js.Array[T]) => ReactElement,
      renderHeader: (T, Double, Boolean, js.Array[T]) => ReactElement,
      sections: js.Array[T]
    ): AccordionProps[T] = {
      val __obj = js.Dynamic.literal(activeSections = activeSections.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderContent = js.Any.fromFunction4(renderContent), renderHeader = js.Any.fromFunction4(renderHeader), sections = sections.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionProps[T]]
    }
    
    extension [Self <: AccordionProps[?], T](x: Self & AccordionProps[T]) {
      
      inline def setActiveSections(value: js.Array[Double | String]): Self = StObject.set(x, "activeSections", value.asInstanceOf[js.Any])
      
      inline def setActiveSectionsVarargs(value: (Double | String)*): Self = StObject.set(x, "activeSections", js.Array(value*))
      
      inline def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: EasingMode | Any): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setExpandFromBottom(value: Boolean): Self = StObject.set(x, "expandFromBottom", value.asInstanceOf[js.Any])
      
      inline def setExpandFromBottomUndefined: Self = StObject.set(x, "expandFromBottom", js.undefined)
      
      inline def setExpandMultiple(value: Boolean): Self = StObject.set(x, "expandMultiple", value.asInstanceOf[js.Any])
      
      inline def setExpandMultipleUndefined: Self = StObject.set(x, "expandMultiple", js.undefined)
      
      inline def setKeyExtractor(value: (/* item */ T, /* index */ Double) => Double | String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
      
      inline def setKeyExtractorUndefined: Self = StObject.set(x, "keyExtractor", js.undefined)
      
      inline def setOnChange(value: js.Array[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setRenderAsFlatList(value: Boolean): Self = StObject.set(x, "renderAsFlatList", value.asInstanceOf[js.Any])
      
      inline def setRenderAsFlatListUndefined: Self = StObject.set(x, "renderAsFlatList", js.undefined)
      
      inline def setRenderContent(value: (T, Double, Boolean, js.Array[T]) => ReactElement): Self = StObject.set(x, "renderContent", js.Any.fromFunction4(value))
      
      inline def setRenderFooter(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderFooter", js.Any.fromFunction4(value))
      
      inline def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
      
      inline def setRenderHeader(value: (T, Double, Boolean, js.Array[T]) => ReactElement): Self = StObject.set(x, "renderHeader", js.Any.fromFunction4(value))
      
      inline def setRenderSectionTitle(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderSectionTitle", js.Any.fromFunction4(value))
      
      inline def setRenderSectionTitleUndefined: Self = StObject.set(x, "renderSectionTitle", js.undefined)
      
      inline def setSectionContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "sectionContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setSectionContainerStyleNull: Self = StObject.set(x, "sectionContainerStyle", null)
      
      inline def setSectionContainerStyleUndefined: Self = StObject.set(x, "sectionContainerStyle", js.undefined)
      
      inline def setSections(value: js.Array[T]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      inline def setSectionsVarargs(value: T*): Self = StObject.set(x, "sections", js.Array(value*))
      
      inline def setTouchableComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "touchableComponent", value.asInstanceOf[js.Any])
      
      inline def setTouchableComponentUndefined: Self = StObject.set(x, "touchableComponent", js.undefined)
      
      inline def setTouchableProps(value: js.Object): Self = StObject.set(x, "touchableProps", value.asInstanceOf[js.Any])
      
      inline def setTouchablePropsUndefined: Self = StObject.set(x, "touchableProps", js.undefined)
      
      inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
}
