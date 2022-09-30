package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuDividerMod {
  
  @JSImport("react-toolbox/components/menu/MenuDivider", JSImport.Default)
  @js.native
  open class default protected () extends MenuDivider {
    def this(props: MenuDividerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuDividerProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/menu/MenuDivider", "MenuDivider")
  @js.native
  open class MenuDivider protected ()
    extends Component[MenuDividerProps, js.Object, Any] {
    def this(props: MenuDividerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuDividerProps, context: Any) = this()
  }
  
  trait MenuDividerProps
    extends StObject
       with Props {
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[MenuDividerTheme] = js.undefined
  }
  object MenuDividerProps {
    
    inline def apply(): MenuDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuDividerProps]
    }
    
    extension [Self <: MenuDividerProps](x: Self) {
      
      inline def setTheme(value: MenuDividerTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait MenuDividerTheme extends StObject {
    
    /**
      *
      */
    var menuDivider: js.UndefOr[String] = js.undefined
  }
  object MenuDividerTheme {
    
    inline def apply(): MenuDividerTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuDividerTheme]
    }
    
    extension [Self <: MenuDividerTheme](x: Self) {
      
      inline def setMenuDivider(value: String): Self = StObject.set(x, "menuDivider", value.asInstanceOf[js.Any])
      
      inline def setMenuDividerUndefined: Self = StObject.set(x, "menuDivider", js.undefined)
    }
  }
}
