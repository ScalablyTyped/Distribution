package typings.reactToolbox

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsListListItemTextMod {
  
  @JSImport("react-toolbox/components/list/ListItemText", "ListItemText")
  @js.native
  open class ListItemText protected ()
    extends Component[ListItemTextProps, js.Object, Any] {
    def this(props: ListItemTextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListItemTextProps, context: Any) = this()
  }
  
  trait ListItemTextProps
    extends StObject
       with Props
       with /**
    * Additional properties passed to inner input element.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Whether list item text should have 'primary' look.
      * @default
      */
    var primary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object defining the component class name mappings.
      */
    var theme: js.UndefOr[ListItemTextTheme] = js.undefined
  }
  object ListItemTextProps {
    
    inline def apply(): ListItemTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemTextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemTextProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setTheme(value: ListItemTextTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ListItemTextTheme extends StObject {
    
    /**
      * Added to the text inside of the list item.
      */
    var itemText: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the text inside of the list item if its primary.
      */
    var primary: js.UndefOr[String] = js.undefined
  }
  object ListItemTextTheme {
    
    inline def apply(): ListItemTextTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemTextTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemTextTheme] (val x: Self) extends AnyVal {
      
      inline def setItemText(value: String): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
      
      inline def setItemTextUndefined: Self = StObject.set(x, "itemText", js.undefined)
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    }
  }
}
