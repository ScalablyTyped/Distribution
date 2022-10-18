package typings.reactVirtualizedSelect

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.reactVirtualizedSelect.anon.Async
import typings.reactVirtualizedSelect.anon.Option
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-virtualized-select", JSImport.Default)
  @js.native
  open class default[TValue] ()
    extends PureComponent[VirtualizedSelectProps[TValue], js.Object, Any]
  
  trait AdditionalVirtualizedSelectProps[TValue] extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var optionHeight: js.UndefOr[Double | (js.Function1[/* options */ Option[TValue], Double])] = js.undefined
    
    var optionRenderer: js.UndefOr[js.Function1[/* options */ VirtualizedOptionRenderOptions[TValue], Element]] = js.undefined
    
    var selectComponent: js.UndefOr[(ComponentClass[Any, ComponentState]) | FunctionComponent[Any]] = js.undefined
  }
  object AdditionalVirtualizedSelectProps {
    
    inline def apply[TValue](): AdditionalVirtualizedSelectProps[TValue] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalVirtualizedSelectProps[TValue]]
    }
    
    extension [Self <: AdditionalVirtualizedSelectProps[?], TValue](x: Self & AdditionalVirtualizedSelectProps[TValue]) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setOptionHeight(value: Double | (js.Function1[/* options */ Option[TValue], Double])): Self = StObject.set(x, "optionHeight", value.asInstanceOf[js.Any])
      
      inline def setOptionHeightFunction1(value: /* options */ Option[TValue] => Double): Self = StObject.set(x, "optionHeight", js.Any.fromFunction1(value))
      
      inline def setOptionHeightUndefined: Self = StObject.set(x, "optionHeight", js.undefined)
      
      inline def setOptionRenderer(value: /* options */ VirtualizedOptionRenderOptions[TValue] => Element): Self = StObject.set(x, "optionRenderer", js.Any.fromFunction1(value))
      
      inline def setOptionRendererUndefined: Self = StObject.set(x, "optionRenderer", js.undefined)
      
      inline def setSelectComponent(value: (ComponentClass[Any, ComponentState]) | FunctionComponent[Any]): Self = StObject.set(x, "selectComponent", value.asInstanceOf[js.Any])
      
      inline def setSelectComponentUndefined: Self = StObject.set(x, "selectComponent", js.undefined)
    }
  }
  
  trait VirtualizedOptionRenderOptions[T] extends StObject {
    
    def focusOption(option: T): Unit
    
    var focusedOption: T
    
    var focusedOptionIndex: Double
    
    var key: String
    
    var labelKey: /* keyof T */ String
    
    var listProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ListProps */ Any
    
    var option: T
    
    var options: js.Array[T]
    
    def selectValue(option: T): Unit
    
    var style: Record[String, String]
    
    var valueArray: js.Array[T]
  }
  object VirtualizedOptionRenderOptions {
    
    inline def apply[T](
      focusOption: T => Unit,
      focusedOption: T,
      focusedOptionIndex: Double,
      key: String,
      labelKey: /* keyof T */ String,
      listProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ListProps */ Any,
      option: T,
      options: js.Array[T],
      selectValue: T => Unit,
      style: Record[String, String],
      valueArray: js.Array[T]
    ): VirtualizedOptionRenderOptions[T] = {
      val __obj = js.Dynamic.literal(focusOption = js.Any.fromFunction1(focusOption), focusedOption = focusedOption.asInstanceOf[js.Any], focusedOptionIndex = focusedOptionIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], listProps = listProps.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectValue = js.Any.fromFunction1(selectValue), style = style.asInstanceOf[js.Any], valueArray = valueArray.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualizedOptionRenderOptions[T]]
    }
    
    extension [Self <: VirtualizedOptionRenderOptions[?], T](x: Self & VirtualizedOptionRenderOptions[T]) {
      
      inline def setFocusOption(value: T => Unit): Self = StObject.set(x, "focusOption", js.Any.fromFunction1(value))
      
      inline def setFocusedOption(value: T): Self = StObject.set(x, "focusedOption", value.asInstanceOf[js.Any])
      
      inline def setFocusedOptionIndex(value: Double): Self = StObject.set(x, "focusedOptionIndex", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabelKey(value: /* keyof T */ String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
      
      inline def setListProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ListProps */ Any
      ): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      inline def setOption(value: T): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setSelectValue(value: T => Unit): Self = StObject.set(x, "selectValue", js.Any.fromFunction1(value))
      
      inline def setStyle(value: Record[String, String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setValueArray(value: js.Array[T]): Self = StObject.set(x, "valueArray", value.asInstanceOf[js.Any])
      
      inline def setValueArrayVarargs(value: T*): Self = StObject.set(x, "valueArray", js.Array(value*))
    }
  }
  
  type VirtualizedSelect[TValue] = PureComponent[VirtualizedSelectProps[TValue], js.Object, Any]
  
  type VirtualizedSelectProps[TValue] = ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactCreatableSelectProps<TValue> */ Any) & AdditionalVirtualizedSelectProps[TValue] & Async) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactCreatableSelectProps<TValue> */ Any) & AdditionalVirtualizedSelectProps[TValue])
}
