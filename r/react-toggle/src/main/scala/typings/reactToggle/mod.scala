package typings.reactToggle

import typings.react.mod.Component
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-toggle", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ToggleProps, js.Object, Any]
  
  type Toggle = Component[ToggleProps, js.Object, Any]
  
  trait ToggleIcons extends StObject {
    
    var checked: js.UndefOr[ReactNode] = js.undefined
    
    var unchecked: js.UndefOr[ReactNode] = js.undefined
  }
  object ToggleIcons {
    
    inline def apply(): ToggleIcons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleIcons]
    }
    
    extension [Self <: ToggleIcons](x: Self) {
      
      inline def setChecked(value: ReactNode): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setUnchecked(value: ReactNode): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
      
      inline def setUncheckedUndefined: Self = StObject.set(x, "unchecked", js.undefined)
    }
  }
  
  trait ToggleProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    var icons: js.UndefOr[Boolean | ToggleIcons] = js.undefined
  }
  object ToggleProps {
    
    inline def apply(): ToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleProps]
    }
    
    extension [Self <: ToggleProps](x: Self) {
      
      inline def setIcons(value: Boolean | ToggleIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    }
  }
}
