package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMenuMenuDividerMod {
  
  @JSImport("react-toolbox/components/menu/MenuDivider", JSImport.Default)
  @js.native
  open class default protected () extends MenuDivider {
    def this(props: MenuDividerProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
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
      * @see https://legacy.reactjs.org/docs/legacy-context.html
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuDividerProps] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuDividerTheme] (val x: Self) extends AnyVal {
      
      inline def setMenuDivider(value: String): Self = StObject.set(x, "menuDivider", value.asInstanceOf[js.Any])
      
      inline def setMenuDividerUndefined: Self = StObject.set(x, "menuDivider", js.undefined)
    }
  }
}
