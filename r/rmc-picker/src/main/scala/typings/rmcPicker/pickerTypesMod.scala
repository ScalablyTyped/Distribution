package typings.rmcPicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerTypesMod {
  
  @js.native
  trait IPickerProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var defaultSelectedValue: js.UndefOr[js.Any] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var indicatorClassName: js.UndefOr[String] = js.native
    
    var indicatorStyle: js.UndefOr[js.Any] = js.native
    
    var itemStyle: js.UndefOr[js.Any] = js.native
    
    var noAnimate: js.UndefOr[Boolean] = js.native
    
    var onScrollChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    var onValueChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    /** web only */
    var prefixCls: js.UndefOr[String] = js.native
    
    var selectedValue: js.UndefOr[js.Any] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
  }
  object IPickerProps {
    
    @scala.inline
    def apply(): IPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickerProps]
    }
    
    @scala.inline
    implicit class IPickerPropsMutableBuilder[Self <: IPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultSelectedValue(value: js.Any): Self = StObject.set(x, "defaultSelectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedValueUndefined: Self = StObject.set(x, "defaultSelectedValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIndicatorClassName(value: String): Self = StObject.set(x, "indicatorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorClassNameUndefined: Self = StObject.set(x, "indicatorClassName", js.undefined)
      
      @scala.inline
      def setIndicatorStyle(value: js.Any): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      @scala.inline
      def setItemStyle(value: js.Any): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setNoAnimate(value: Boolean): Self = StObject.set(x, "noAnimate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAnimateUndefined: Self = StObject.set(x, "noAnimate", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
