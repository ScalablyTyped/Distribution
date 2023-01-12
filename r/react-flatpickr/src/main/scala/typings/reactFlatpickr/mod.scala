package typings.reactFlatpickr

import typings.flatpickr.distTypesGlobalsMod.global.Date
import typings.flatpickr.mod.flatpickr.Instance
import typings.flatpickr.mod.flatpickr.Options.Hook
import typings.flatpickr.mod.flatpickr.Options.Options
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactFlatpickr.reactFlatpickrStrings.options
import typings.reactFlatpickr.reactFlatpickrStrings.render
import typings.std.Exclude
import typings.std.HTMLInputElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-flatpickr", JSImport.Default)
  @js.native
  open class default () extends DatePicker
  
  @js.native
  trait DatePicker
    extends Component[DateTimePickerProps, js.Object, Any] {
    
    var flatpickr: Instance = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.ComponentPropsWithoutRef<'input'>, 'children' | 'value' | 'onChange'> ]: react.react.ComponentPropsWithoutRef<'input'>[P]} */ trait DateTimePickerProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[Hook] = js.undefined
    
    var onClose: js.UndefOr[Hook] = js.undefined
    
    var onDayCreate: js.UndefOr[Hook] = js.undefined
    
    var onMonthChange: js.UndefOr[Hook] = js.undefined
    
    var onOpen: js.UndefOr[Hook] = js.undefined
    
    var onReady: js.UndefOr[Hook] = js.undefined
    
    var onValueUpdate: js.UndefOr[Hook] = js.undefined
    
    var onYearChange: js.UndefOr[Hook] = js.undefined
    
    var options: js.UndefOr[Options] = js.undefined
    
    var render: js.UndefOr[
        js.Function2[
          /* props */ Omit[this.type, options | typings.reactFlatpickr.reactFlatpickrStrings.render], 
          /* ref */ js.Function1[/* node */ HTMLInputElement | Null, Unit], 
          ReactElement
        ]
      ] = js.undefined
    
    var value: js.UndefOr[String | js.Date | Double | (js.Array[String | js.Date | Double])] = js.undefined
  }
  object DateTimePickerProps {
    
    inline def apply(): DateTimePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimePickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateTimePickerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOnChange(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClose(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onClose", js.Any.fromFunction4(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnDayCreate(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onDayCreate", js.Any.fromFunction4(value))
      
      inline def setOnDayCreateUndefined: Self = StObject.set(x, "onDayCreate", js.undefined)
      
      inline def setOnMonthChange(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction4(value))
      
      inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      inline def setOnOpen(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onOpen", js.Any.fromFunction4(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnReady(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onReady", js.Any.fromFunction4(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnValueUpdate(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onValueUpdate", js.Any.fromFunction4(value))
      
      inline def setOnValueUpdateUndefined: Self = StObject.set(x, "onValueUpdate", js.undefined)
      
      inline def setOnYearChange(
        value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ typings.flatpickr.distTypesInstanceMod.Instance, /* data */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onYearChange", js.Any.fromFunction4(value))
      
      inline def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRender(
        value: (/* props */ Omit[DateTimePickerProps, options | render], /* ref */ js.Function1[/* node */ HTMLInputElement | Null, Unit]) => ReactElement
      ): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setValue(value: String | js.Date | Double | (js.Array[String | js.Date | Double])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (String | js.Date | Double)*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
}
