package typings.rmcPicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiPickerPropsMod {
  
  trait IMultiPickerProps extends StObject {
    
    var children: js.UndefOr[js.Any] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var onScrollChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
    
    var onValueChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rootNativeProps: js.UndefOr[js.Any] = js.undefined
    
    var selectedValue: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var style: js.UndefOr[js.Any] = js.undefined
  }
  object IMultiPickerProps {
    
    @scala.inline
    def apply(): IMultiPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMultiPickerProps]
    }
    
    @scala.inline
    implicit class IMultiPickerPropsMutableBuilder[Self <: IMultiPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootNativeProps(value: js.Any): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Array[js.Any]): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setSelectedValueVarargs(value: js.Any*): Self = StObject.set(x, "selectedValue", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait IPickerCol extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var props: js.UndefOr[js.Any] = js.undefined
  }
  object IPickerCol {
    
    @scala.inline
    def apply(): IPickerCol = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickerCol]
    }
    
    @scala.inline
    implicit class IPickerColMutableBuilder[Self <: IPickerCol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
}
