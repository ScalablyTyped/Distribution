package typings.rmcCascader

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cascaderTypesMod {
  
  type CascaderOneValue = String | Double
  
  type CascaderValue = js.Array[CascaderOneValue]
  
  @js.native
  trait ICascaderDataItem extends StObject {
    
    var children: js.UndefOr[js.Array[ICascaderDataItem]] = js.native
    
    var label: ReactNode = js.native
    
    var value: CascaderOneValue = js.native
  }
  object ICascaderDataItem {
    
    @scala.inline
    def apply(value: CascaderOneValue): ICascaderDataItem = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICascaderDataItem]
    }
    
    @scala.inline
    implicit class ICascaderDataItemMutableBuilder[Self <: ICascaderDataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ICascaderDataItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ICascaderDataItem*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: CascaderOneValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICascaderProps extends StObject {
    
    /** web only */
    var className: js.UndefOr[String] = js.native
    
    var cols: js.UndefOr[Double] = js.native
    
    var data: js.Array[ICascaderDataItem] = js.native
    
    var defaultValue: js.UndefOr[CascaderValue] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var indicatorStyle: js.UndefOr[js.Object] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.native
    
    /** web only */
    var onScrollChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.native
    
    var pickerItemStyle: js.UndefOr[js.Object] = js.native
    
    /** web only */
    var pickerPrefixCls: js.UndefOr[String] = js.native
    
    /** web only */
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootNativeProps: js.UndefOr[js.Object] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
    
    var value: js.UndefOr[CascaderValue] = js.native
  }
  object ICascaderProps {
    
    @scala.inline
    def apply(data: js.Array[ICascaderDataItem]): ICascaderProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICascaderProps]
    }
    
    @scala.inline
    implicit class ICascaderPropsMutableBuilder[Self <: ICascaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[ICascaderDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: ICascaderDataItem*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDefaultValue(value: CascaderValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: CascaderOneValue*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIndicatorStyle(value: js.Object): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ CascaderValue => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: /* value */ CascaderValue => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setPickerItemStyle(value: js.Object): Self = StObject.set(x, "pickerItemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerItemStyleUndefined: Self = StObject.set(x, "pickerItemStyle", js.undefined)
      
      @scala.inline
      def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootNativeProps(value: js.Object): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: CascaderValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: CascaderOneValue*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
