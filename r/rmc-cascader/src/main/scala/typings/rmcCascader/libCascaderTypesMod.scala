package typings.rmcCascader

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCascaderTypesMod {
  
  type CascaderOneValue = String | Double
  
  type CascaderValue = js.Array[CascaderOneValue]
  
  trait ICascaderDataItem extends StObject {
    
    var children: js.UndefOr[js.Array[ICascaderDataItem]] = js.undefined
    
    var label: ReactNode
    
    var value: CascaderOneValue
  }
  object ICascaderDataItem {
    
    inline def apply(value: CascaderOneValue): ICascaderDataItem = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICascaderDataItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICascaderDataItem] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[ICascaderDataItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ICascaderDataItem*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: CascaderOneValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICascaderProps extends StObject {
    
    /** web only */
    var className: js.UndefOr[String] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var data: js.Array[ICascaderDataItem]
    
    var defaultValue: js.UndefOr[CascaderValue] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var indicatorStyle: js.UndefOr[js.Object] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.undefined
    
    /** web only */
    var onScrollChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.undefined
    
    var pickerItemStyle: js.UndefOr[js.Object] = js.undefined
    
    /** web only */
    var pickerPrefixCls: js.UndefOr[String] = js.undefined
    
    /** web only */
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rootNativeProps: js.UndefOr[js.Object] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
    
    var value: js.UndefOr[CascaderValue] = js.undefined
  }
  object ICascaderProps {
    
    inline def apply(data: js.Array[ICascaderDataItem]): ICascaderProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICascaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICascaderProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setData(value: js.Array[ICascaderDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ICascaderDataItem*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefaultValue(value: CascaderValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: CascaderOneValue*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndicatorStyle(value: js.Object): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setOnChange(value: /* value */ CascaderValue => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnScrollChange(value: /* value */ CascaderValue => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setPickerItemStyle(value: js.Object): Self = StObject.set(x, "pickerItemStyle", value.asInstanceOf[js.Any])
      
      inline def setPickerItemStyleUndefined: Self = StObject.set(x, "pickerItemStyle", js.undefined)
      
      inline def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRootNativeProps(value: js.Object): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      inline def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: CascaderValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: CascaderOneValue*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
