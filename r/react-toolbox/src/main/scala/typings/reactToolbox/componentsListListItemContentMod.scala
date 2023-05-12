package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.reactToolboxStrings.auto
import typings.reactToolbox.reactToolboxStrings.large
import typings.reactToolbox.reactToolboxStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsListListItemContentMod {
  
  @JSImport("react-toolbox/components/list/ListItemContent", "ListItemContent")
  @js.native
  open class ListItemContent protected ()
    extends Component[ListItemContentProps, js.Object, Any] {
    def this(props: ListItemContentProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ListItemContentProps, context: Any) = this()
  }
  
  trait ListItemContentProps extends StObject {
    
    /**
      * Main text of the item.
      */
    var caption: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Secondary text to display under the caption.
      */
    var legend: js.UndefOr[String] = js.undefined
    
    /**
      * Object defining the component class name mappings.
      */
    var theme: js.UndefOr[ListItemContentTheme] = js.undefined
    
    /**
      * List item content type.
      */
    var `type`: js.UndefOr[auto | normal | large] = js.undefined
  }
  object ListItemContentProps {
    
    inline def apply(): ListItemContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemContentProps] (val x: Self) extends AnyVal {
      
      inline def setCaption(value: ReactNode): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setTheme(value: ListItemContentTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: auto | normal | large): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ListItemContentTheme extends StObject {
    
    /**
      * Added to the content wrapper element if type is "auto".
      */
    var auto: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the content wrapper element in list item.
      */
    var itemContentRoot: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the content wrapper element if type is "large".
      */
    var large: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the content wrapper element if type is "normal".
      */
    var normal: js.UndefOr[String] = js.undefined
  }
  object ListItemContentTheme {
    
    inline def apply(): ListItemContentTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemContentTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemContentTheme] (val x: Self) extends AnyVal {
      
      inline def setAuto(value: String): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setItemContentRoot(value: String): Self = StObject.set(x, "itemContentRoot", value.asInstanceOf[js.Any])
      
      inline def setItemContentRootUndefined: Self = StObject.set(x, "itemContentRoot", js.undefined)
      
      inline def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setNormal(value: String): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    }
  }
}
