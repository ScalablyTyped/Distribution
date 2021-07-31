package typings.reactVirtualizedSelect

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.PureComponent
import typings.react.mod.StatelessComponent
import typings.react.mod.global.JSX.Element
import typings.reactVirtualized.esListMod.ListProps
import typings.reactVirtualizedSelect.anon.Async
import typings.reactVirtualizedSelect.anon.Option
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-virtualized-select", JSImport.Default)
  @js.native
  class default[TValue] ()
    extends PureComponent[VirtualizedSelectProps[TValue], js.Object, js.Any]
  
  trait AdditionalVirtualizedSelectProps[TValue] extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var optionHeight: js.UndefOr[Double | (js.Function1[/* options */ Option[TValue], Double])] = js.undefined
    
    var optionRenderer: js.UndefOr[js.Function1[/* options */ VirtualizedOptionRenderOptions[TValue], Element]] = js.undefined
    
    var selectComponent: js.UndefOr[(ComponentClass[js.Any, ComponentState]) | StatelessComponent[js.Any]] = js.undefined
  }
  object AdditionalVirtualizedSelectProps {
    
    @scala.inline
    def apply[TValue](): AdditionalVirtualizedSelectProps[TValue] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalVirtualizedSelectProps[TValue]]
    }
    
    @scala.inline
    implicit class AdditionalVirtualizedSelectPropsMutableBuilder[Self <: AdditionalVirtualizedSelectProps[?], TValue] (val x: Self & AdditionalVirtualizedSelectProps[TValue]) extends AnyVal {
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setOptionHeight(value: Double | (js.Function1[/* options */ Option[TValue], Double])): Self = StObject.set(x, "optionHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionHeightFunction1(value: /* options */ Option[TValue] => Double): Self = StObject.set(x, "optionHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptionHeightUndefined: Self = StObject.set(x, "optionHeight", js.undefined)
      
      @scala.inline
      def setOptionRenderer(value: /* options */ VirtualizedOptionRenderOptions[TValue] => Element): Self = StObject.set(x, "optionRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptionRendererUndefined: Self = StObject.set(x, "optionRenderer", js.undefined)
      
      @scala.inline
      def setSelectComponent(value: (ComponentClass[js.Any, ComponentState]) | StatelessComponent[js.Any]): Self = StObject.set(x, "selectComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectComponentUndefined: Self = StObject.set(x, "selectComponent", js.undefined)
    }
  }
  
  trait VirtualizedOptionRenderOptions[T] extends StObject {
    
    def focusOption(option: T): Unit
    
    var focusedOption: T
    
    var focusedOptionIndex: Double
    
    var key: String
    
    var labelKey: /* keyof T */ String
    
    var listProps: ListProps
    
    var option: T
    
    var options: js.Array[T]
    
    def selectValue(option: T): Unit
    
    var style: Record[String, String]
    
    var valueArray: js.Array[T]
  }
  object VirtualizedOptionRenderOptions {
    
    @scala.inline
    def apply[T](
      focusOption: T => Unit,
      focusedOption: T,
      focusedOptionIndex: Double,
      key: String,
      labelKey: /* keyof T */ String,
      listProps: ListProps,
      option: T,
      options: js.Array[T],
      selectValue: T => Unit,
      style: Record[String, String],
      valueArray: js.Array[T]
    ): VirtualizedOptionRenderOptions[T] = {
      val __obj = js.Dynamic.literal(focusOption = js.Any.fromFunction1(focusOption), focusedOption = focusedOption.asInstanceOf[js.Any], focusedOptionIndex = focusedOptionIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], listProps = listProps.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectValue = js.Any.fromFunction1(selectValue), style = style.asInstanceOf[js.Any], valueArray = valueArray.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualizedOptionRenderOptions[T]]
    }
    
    @scala.inline
    implicit class VirtualizedOptionRenderOptionsMutableBuilder[Self <: VirtualizedOptionRenderOptions[?], T] (val x: Self & VirtualizedOptionRenderOptions[T]) extends AnyVal {
      
      @scala.inline
      def setFocusOption(value: T => Unit): Self = StObject.set(x, "focusOption", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusedOption(value: T): Self = StObject.set(x, "focusedOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedOptionIndex(value: Double): Self = StObject.set(x, "focusedOptionIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelKey(value: /* keyof T */ String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListProps(value: ListProps): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOption(value: T): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setSelectValue(value: T => Unit): Self = StObject.set(x, "selectValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: Record[String, String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueArray(value: js.Array[T]): Self = StObject.set(x, "valueArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueArrayVarargs(value: T*): Self = StObject.set(x, "valueArray", js.Array(value :_*))
    }
  }
  
  type VirtualizedSelect[TValue] = PureComponent[VirtualizedSelectProps[TValue], js.Object, js.Any]
  
  type VirtualizedSelectProps[TValue] = ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactCreatableSelectProps<TValue> */ js.Any) & AdditionalVirtualizedSelectProps[TValue] & Async) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactCreatableSelectProps<TValue> */ js.Any) & AdditionalVirtualizedSelectProps[TValue])
}
