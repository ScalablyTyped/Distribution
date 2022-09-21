package typings.reactWidgets

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactWidgets.anon.ClassName
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("react-widgets/cjs/Widget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-widgets/cjs/Widget", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[WidgetProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def useWidgetProps(props: WidgetProps): ClassName = ^.asInstanceOf[js.Dynamic].applyDynamic("useWidgetProps")(props.asInstanceOf[js.Any]).asInstanceOf[ClassName]
  
  trait WidgetProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var autofilling: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dropUp: js.UndefOr[Boolean] = js.undefined
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
  }
  object WidgetProps {
    
    inline def apply(): WidgetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetProps]
    }
    
    extension [Self <: WidgetProps](x: Self) {
      
      inline def setAutofilling(value: Boolean): Self = StObject.set(x, "autofilling", value.asInstanceOf[js.Any])
      
      inline def setAutofillingUndefined: Self = StObject.set(x, "autofilling", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDropUp(value: Boolean): Self = StObject.set(x, "dropUp", value.asInstanceOf[js.Any])
      
      inline def setDropUpUndefined: Self = StObject.set(x, "dropUp", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    }
  }
}
