package typings.rmcCascader

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.rmcCascader.cascaderTypesMod.CascaderValue
import typings.rmcPicker.popupPickerTypesMod.IPopupPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod {
  
  @JSImport("rmc-cascader/lib/Popup", JSImport.Default)
  @js.native
  class default () extends PopupCascader
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rmc-cascader/lib/Popup", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rmc-cascader/lib/Popup", "default.defaultProps.pickerValueChangeProp")
      @js.native
      def pickerValueChangeProp: String = js.native
      @scala.inline
      def pickerValueChangeProp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerValueChangeProp")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-cascader/lib/Popup", "default.defaultProps.pickerValueProp")
      @js.native
      def pickerValueProp: String = js.native
      @scala.inline
      def pickerValueProp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerValueProp")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPopupCascaderProps extends IPopupPickerProps {
    
    var cascader: ReactElement = js.native
    
    var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[CascaderValue], Unit]] = js.native
  }
  object IPopupCascaderProps {
    
    @scala.inline
    def apply(cascader: ReactElement): IPopupCascaderProps = {
      val __obj = js.Dynamic.literal(cascader = cascader.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPopupCascaderProps]
    }
    
    @scala.inline
    implicit class IPopupCascaderPropsMutableBuilder[Self <: IPopupCascaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCascader(value: ReactElement): Self = StObject.set(x, "cascader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: /* date */ js.UndefOr[CascaderValue] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  @js.native
  trait PopupCascader
    extends Component[IPopupCascaderProps, js.Any, js.Any] {
    
    def onOk(v: js.Any): Unit = js.native
  }
}
