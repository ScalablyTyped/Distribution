package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsListListItemActionMod {
  
  @JSImport("react-toolbox/components/list/ListItemAction", "ListItemAction")
  @js.native
  open class ListItemAction protected ()
    extends Component[ListItemActionProps, js.Object, Any] {
    def this(props: ListItemActionProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ListItemActionProps, context: Any) = this()
  }
  
  trait ListItemActionProps extends StObject {
    
    /**
      * List item action.
      */
    var action: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Object defining the component class name mappings.
      */
    var theme: js.UndefOr[ListItemActionTheme] = js.undefined
  }
  object ListItemActionProps {
    
    inline def apply(): ListItemActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemActionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemActionProps] (val x: Self) extends AnyVal {
      
      inline def setAction(value: ReactNode): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setTheme(value: ListItemActionTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ListItemActionTheme extends StObject {
    
    /**
      * Used for each action element (left/right).
      */
    var itemAction: js.UndefOr[String] = js.undefined
  }
  object ListItemActionTheme {
    
    inline def apply(): ListItemActionTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemActionTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemActionTheme] (val x: Self) extends AnyVal {
      
      inline def setItemAction(value: String): Self = StObject.set(x, "itemAction", value.asInstanceOf[js.Any])
      
      inline def setItemActionUndefined: Self = StObject.set(x, "itemAction", js.undefined)
    }
  }
}
