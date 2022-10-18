package typings.reactWidgets

import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsCalendarButtonMod {
  
  @JSImport("react-widgets/cjs/CalendarButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasClassNameProps: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasClassNameProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props
    extends StObject
       with HTMLProps[HTMLButtonElement] {
    
    var busy: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var spinner: js.UndefOr[ReactNode] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
      
      inline def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setSpinner(value: ReactNode): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
    }
  }
}
