package typings.rcCascader

import typings.rcCascader.cascaderMod.DefaultOptionType
import typings.rcCascader.cascaderMod.SingleValueType
import typings.react.mod.Key
import typings.react.mod.global.JSX.Element
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnMod {
  
  @JSImport("rc-cascader/es/OptionList/Column", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasPrefixClsMultipleOptionsActiveValuePrevValuePathOnToggleOpenOnSelectOnActiveCheckedSetHalfCheckedSetLoadingKeysIsSelectable: ColumnProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPrefixClsMultipleOptionsActiveValuePrevValuePathOnToggleOpenOnSelectOnActiveCheckedSetHalfCheckedSetLoadingKeysIsSelectable.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-cascader/es/OptionList/Column", "FIX_LABEL")
  @js.native
  val FIX_LABEL: /* "__cascader_fix_label__" */ String = js.native
  
  trait ColumnProps extends StObject {
    
    /** Current Column opened item key */
    var activeValue: js.UndefOr[Key] = js.undefined
    
    var checkedSet: Set[Key]
    
    var halfCheckedSet: Set[Key]
    
    def isSelectable(option: DefaultOptionType): Boolean
    
    var loadingKeys: js.Array[Key]
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    def onActive(valuePath: SingleValueType): Unit
    
    def onSelect(valuePath: SingleValueType, leaf: Boolean): Unit
    
    def onToggleOpen(open: Boolean): Unit
    
    var options: js.Array[DefaultOptionType]
    
    var prefixCls: String
    
    /** The value path before current column */
    var prevValuePath: js.Array[Key]
  }
  object ColumnProps {
    
    inline def apply(
      checkedSet: Set[Key],
      halfCheckedSet: Set[Key],
      isSelectable: DefaultOptionType => Boolean,
      loadingKeys: js.Array[Key],
      onActive: SingleValueType => Unit,
      onSelect: (SingleValueType, Boolean) => Unit,
      onToggleOpen: Boolean => Unit,
      options: js.Array[DefaultOptionType],
      prefixCls: String,
      prevValuePath: js.Array[Key]
    ): ColumnProps = {
      val __obj = js.Dynamic.literal(checkedSet = checkedSet.asInstanceOf[js.Any], halfCheckedSet = halfCheckedSet.asInstanceOf[js.Any], isSelectable = js.Any.fromFunction1(isSelectable), loadingKeys = loadingKeys.asInstanceOf[js.Any], onActive = js.Any.fromFunction1(onActive), onSelect = js.Any.fromFunction2(onSelect), onToggleOpen = js.Any.fromFunction1(onToggleOpen), options = options.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], prevValuePath = prevValuePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnProps]
    }
    
    extension [Self <: ColumnProps](x: Self) {
      
      inline def setActiveValue(value: Key): Self = StObject.set(x, "activeValue", value.asInstanceOf[js.Any])
      
      inline def setActiveValueUndefined: Self = StObject.set(x, "activeValue", js.undefined)
      
      inline def setCheckedSet(value: Set[Key]): Self = StObject.set(x, "checkedSet", value.asInstanceOf[js.Any])
      
      inline def setHalfCheckedSet(value: Set[Key]): Self = StObject.set(x, "halfCheckedSet", value.asInstanceOf[js.Any])
      
      inline def setIsSelectable(value: DefaultOptionType => Boolean): Self = StObject.set(x, "isSelectable", js.Any.fromFunction1(value))
      
      inline def setLoadingKeys(value: js.Array[Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
      
      inline def setLoadingKeysVarargs(value: Key*): Self = StObject.set(x, "loadingKeys", js.Array(value*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnActive(value: SingleValueType => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction1(value))
      
      inline def setOnSelect(value: (SingleValueType, Boolean) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnToggleOpen(value: Boolean => Unit): Self = StObject.set(x, "onToggleOpen", js.Any.fromFunction1(value))
      
      inline def setOptions(value: js.Array[DefaultOptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: DefaultOptionType*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrevValuePath(value: js.Array[Key]): Self = StObject.set(x, "prevValuePath", value.asInstanceOf[js.Any])
      
      inline def setPrevValuePathVarargs(value: Key*): Self = StObject.set(x, "prevValuePath", js.Array(value*))
    }
  }
}
