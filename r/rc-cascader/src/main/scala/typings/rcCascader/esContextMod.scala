package typings.rcCascader

import org.scalablytyped.runtime.Shortcut
import typings.rcCascader.esCascaderMod.DefaultOptionType
import typings.rcCascader.esCascaderMod.InternalFieldNames
import typings.rcCascader.esCascaderMod.SingleValueType
import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMod extends Shortcut {
  
  @JSImport("rc-cascader/es/context", JSImport.Default)
  @js.native
  val default: Context[CascaderContextProps] = js.native
  
  trait CascaderContextProps extends StObject {
    
    var changeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var checkable: js.UndefOr[Boolean | ReactNode] = js.undefined
    
    var dropdownMenuColumnStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var dropdownPrefixCls: js.UndefOr[String] = js.undefined
    
    var expandIcon: js.UndefOr[ReactNode] = js.undefined
    
    var expandTrigger: js.UndefOr["hover" | "click"] = js.undefined
    
    var fieldNames: InternalFieldNames
    
    var halfValues: js.Array[SingleValueType]
    
    var loadData: js.UndefOr[js.Function1[/* selectOptions */ js.Array[DefaultOptionType], Unit]] = js.undefined
    
    var loadingIcon: js.UndefOr[ReactNode] = js.undefined
    
    def onSelect(valuePath: SingleValueType): Unit
    
    var options: js.UndefOr[js.Array[DefaultOptionType]] = js.undefined
    
    var searchOptions: js.Array[DefaultOptionType]
    
    var values: js.Array[SingleValueType]
  }
  object CascaderContextProps {
    
    inline def apply(
      fieldNames: InternalFieldNames,
      halfValues: js.Array[SingleValueType],
      onSelect: SingleValueType => Unit,
      searchOptions: js.Array[DefaultOptionType],
      values: js.Array[SingleValueType]
    ): CascaderContextProps = {
      val __obj = js.Dynamic.literal(fieldNames = fieldNames.asInstanceOf[js.Any], halfValues = halfValues.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), searchOptions = searchOptions.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[CascaderContextProps]
    }
    
    extension [Self <: CascaderContextProps](x: Self) {
      
      inline def setChangeOnSelect(value: Boolean): Self = StObject.set(x, "changeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setChangeOnSelectUndefined: Self = StObject.set(x, "changeOnSelect", js.undefined)
      
      inline def setCheckable(value: Boolean | ReactNode): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setDropdownMenuColumnStyle(value: CSSProperties): Self = StObject.set(x, "dropdownMenuColumnStyle", value.asInstanceOf[js.Any])
      
      inline def setDropdownMenuColumnStyleUndefined: Self = StObject.set(x, "dropdownMenuColumnStyle", js.undefined)
      
      inline def setDropdownPrefixCls(value: String): Self = StObject.set(x, "dropdownPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setDropdownPrefixClsUndefined: Self = StObject.set(x, "dropdownPrefixCls", js.undefined)
      
      inline def setExpandIcon(value: ReactNode): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setExpandTrigger(value: "hover" | "click"): Self = StObject.set(x, "expandTrigger", value.asInstanceOf[js.Any])
      
      inline def setExpandTriggerUndefined: Self = StObject.set(x, "expandTrigger", js.undefined)
      
      inline def setFieldNames(value: InternalFieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setHalfValues(value: js.Array[SingleValueType]): Self = StObject.set(x, "halfValues", value.asInstanceOf[js.Any])
      
      inline def setHalfValuesVarargs(value: SingleValueType*): Self = StObject.set(x, "halfValues", js.Array(value*))
      
      inline def setLoadData(value: /* selectOptions */ js.Array[DefaultOptionType] => Unit): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      inline def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      inline def setLoadingIcon(value: ReactNode): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      inline def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      inline def setOnSelect(value: SingleValueType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOptions(value: js.Array[DefaultOptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: DefaultOptionType*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setSearchOptions(value: js.Array[DefaultOptionType]): Self = StObject.set(x, "searchOptions", value.asInstanceOf[js.Any])
      
      inline def setSearchOptionsVarargs(value: DefaultOptionType*): Self = StObject.set(x, "searchOptions", js.Array(value*))
      
      inline def setValues(value: js.Array[SingleValueType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: SingleValueType*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type _To = Context[CascaderContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esContextMod.foo` */
  override def _to: Context[CascaderContextProps] = default
}
