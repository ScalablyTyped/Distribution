package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.horizontal
import typings.reactToolbox.reactToolboxStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsNavigationNavigationMod {
  
  @JSImport("react-toolbox/components/navigation/Navigation", JSImport.Default)
  @js.native
  open class default protected () extends Navigation {
    def this(props: NavigationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavigationProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/navigation/Navigation", "Navigation")
  @js.native
  open class Navigation protected ()
    extends Component[NavigationProps, js.Object, Any] {
    def this(props: NavigationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavigationProps, context: Any) = this()
  }
  
  trait NavigationProps
    extends StObject
       with Props {
    
    /**
      * Array of objects that will be represented as <Button/> so the keys will be transferred as properties the Button Component.
      */
    var actions: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Array of objects similar to actions but that will be rendered as <Link/> component definition.
      */
    var routes: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[NavigationTheme] = js.undefined
    
    /**
      * Type of the navigation, it can be vertical or horizontal.
      * @default horizontal
      */
    var `type`: js.UndefOr[vertical | horizontal] = js.undefined
  }
  object NavigationProps {
    
    inline def apply(): NavigationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationProps] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Array[Any]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Any*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setRoutes(value: js.Array[Any]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: Any*): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setTheme(value: NavigationTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: vertical | horizontal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NavigationTheme extends StObject {
    
    /**
      * Used for buttons provided in the component.
      */
    var button: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element if the layout is horizontal.
      */
    var horizontal: js.UndefOr[String] = js.undefined
    
    /**
      * Used for links provided in the component.
      */
    var link: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element if the layout is vertical.
      */
    var vertical: js.UndefOr[String] = js.undefined
  }
  object NavigationTheme {
    
    inline def apply(): NavigationTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationTheme] (val x: Self) extends AnyVal {
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
