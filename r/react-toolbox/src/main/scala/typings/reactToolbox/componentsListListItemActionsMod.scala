package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.componentsListListItemActionMod.ListItemActionTheme
import typings.reactToolbox.reactToolboxStrings.left
import typings.reactToolbox.reactToolboxStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsListListItemActionsMod {
  
  @JSImport("react-toolbox/components/list/ListItemActions", "ListItemActions")
  @js.native
  open class ListItemActions protected ()
    extends Component[ListItemActionsProps, js.Object, Any] {
    def this(props: ListItemActionsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListItemActionsProps, context: Any) = this()
  }
  
  trait ListItemActionsProps extends StObject {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Object defining the component class name mappings.
      */
    var theme: js.UndefOr[ListItemActionsTheme & ListItemActionTheme] = js.undefined
    
    /**
      * List item action type.
      */
    var `type`: js.UndefOr[left | right] = js.undefined
  }
  object ListItemActionsProps {
    
    inline def apply(): ListItemActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemActionsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemActionsProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTheme(value: ListItemActionsTheme & ListItemActionTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: left | right): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ListItemActionsTheme extends StObject {
    
    /**
      * Added for the element that wraps left actions.
      */
    var left: js.UndefOr[String] = js.undefined
    
    /**
      * Added for the element that wraps right actions.
      */
    var right: js.UndefOr[String] = js.undefined
  }
  object ListItemActionsTheme {
    
    inline def apply(): ListItemActionsTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemActionsTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemActionsTheme] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
}
