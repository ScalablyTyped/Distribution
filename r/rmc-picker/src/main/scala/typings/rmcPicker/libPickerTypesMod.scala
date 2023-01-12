package typings.rmcPicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerTypesMod {
  
  trait IPickerProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultSelectedValue: js.UndefOr[Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var indicatorClassName: js.UndefOr[String] = js.undefined
    
    var indicatorStyle: js.UndefOr[Any] = js.undefined
    
    var itemStyle: js.UndefOr[Any] = js.undefined
    
    var noAnimate: js.UndefOr[Boolean] = js.undefined
    
    var onScrollChange: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    var onValueChange: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    /** web only */
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var selectedValue: js.UndefOr[Any] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
  }
  object IPickerProps {
    
    inline def apply(): IPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPickerProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultSelectedValue(value: Any): Self = StObject.set(x, "defaultSelectedValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedValueUndefined: Self = StObject.set(x, "defaultSelectedValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndicatorClassName(value: String): Self = StObject.set(x, "indicatorClassName", value.asInstanceOf[js.Any])
      
      inline def setIndicatorClassNameUndefined: Self = StObject.set(x, "indicatorClassName", js.undefined)
      
      inline def setIndicatorStyle(value: Any): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setItemStyle(value: Any): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setNoAnimate(value: Boolean): Self = StObject.set(x, "noAnimate", value.asInstanceOf[js.Any])
      
      inline def setNoAnimateUndefined: Self = StObject.set(x, "noAnimate", js.undefined)
      
      inline def setOnScrollChange(value: /* value */ Any => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setOnValueChange(value: /* value */ Any => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSelectedValue(value: Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
