package typings.rmcDatePicker

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.rmcPicker.popupPickerTypesMod.IPopupPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod {
  
  @JSImport("rmc-date-picker/lib/Popup", JSImport.Default)
  @js.native
  class default () extends PopupDatePicker
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rmc-date-picker/lib/Popup", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rmc-date-picker/lib/Popup", "default.defaultProps.pickerValueChangeProp")
      @js.native
      def pickerValueChangeProp: String = js.native
      @scala.inline
      def pickerValueChangeProp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerValueChangeProp")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-date-picker/lib/Popup", "default.defaultProps.pickerValueProp")
      @js.native
      def pickerValueProp: String = js.native
      @scala.inline
      def pickerValueProp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerValueProp")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPopupDatePickerProps extends IPopupPickerProps {
    
    var date: js.UndefOr[js.Any] = js.native
    
    var datePicker: ReactElement = js.native
    
    var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IPopupDatePickerProps {
    
    @scala.inline
    def apply(datePicker: ReactElement): IPopupDatePickerProps = {
      val __obj = js.Dynamic.literal(datePicker = datePicker.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPopupDatePickerProps]
    }
    
    @scala.inline
    implicit class IPopupDatePickerPropsMutableBuilder[Self <: IPopupDatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: js.Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePicker(value: ReactElement): Self = StObject.set(x, "datePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* date */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  @js.native
  trait PopupDatePicker
    extends Component[IPopupDatePickerProps, js.Any, js.Any] {
    
    def onOk(v: js.Any): Unit = js.native
  }
}
