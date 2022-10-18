package typings.rcCascader

import typings.rcCascader.esCascaderMod.BaseOptionType
import typings.rcCascader.esCascaderMod.DefaultOptionType
import typings.rcCascader.esCascaderMod.SingleValueType
import typings.rcSelect.libBaseSelectMod.BaseSelectRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Disabled extends StObject {
    
    var disabled: Boolean
    
    var key: String
    
    var label: ReactNode
    
    var value: String
    
    var valueCells: SingleValueType
  }
  object Disabled {
    
    inline def apply(disabled: Boolean, key: String, value: String, valueCells: SingleValueType): Disabled = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueCells = valueCells.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disabled]
    }
    
    extension [Self <: Disabled](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueCells(value: SingleValueType): Self = StObject.set(x, "valueCells", value.asInstanceOf[js.Any])
      
      inline def setValueCellsVarargs(value: (String | Double)*): Self = StObject.set(x, "valueCells", js.Array(value*))
    }
  }
  
  trait DisplayName extends StObject {
    
    var SHOW_CHILD: /* "SHOW_CHILD" */ String
    
    var SHOW_PARENT: /* "SHOW_PARENT" */ String
    
    var displayName: js.UndefOr[String] = js.undefined
  }
  object DisplayName {
    
    inline def apply(SHOW_CHILD: /* "SHOW_CHILD" */ String, SHOW_PARENT: /* "SHOW_PARENT" */ String): DisplayName = {
      val __obj = js.Dynamic.literal(SHOW_CHILD = SHOW_CHILD.asInstanceOf[js.Any], SHOW_PARENT = SHOW_PARENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayName]
    }
    
    extension [Self <: DisplayName](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setSHOW_CHILD(value: /* "SHOW_CHILD" */ String): Self = StObject.set(x, "SHOW_CHILD", value.asInstanceOf[js.Any])
      
      inline def setSHOW_PARENT(value: /* "SHOW_PARENT" */ String): Self = StObject.set(x, "SHOW_PARENT", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var option: DefaultOptionType
    
    var value: /* import warning: importer.ImportType#apply Failed type conversion: rc-cascader.rc-cascader/es/Cascader.SingleValueType[number] */ js.Any
  }
  object Index {
    
    inline def apply(
      index: Double,
      option: DefaultOptionType,
      value: /* import warning: importer.ImportType#apply Failed type conversion: rc-cascader.rc-cascader/es/Cascader.SingleValueType[number] */ js.Any
    ): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOption(value: DefaultOptionType): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: rc-cascader.rc-cascader/es/Cascader.SingleValueType[number] */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnChange[OptionType /* <: BaseOptionType */] extends StObject {
    
    var onChange: js.UndefOr[
        js.Function2[
          /* value */ SingleValueType | js.Array[SingleValueType], 
          /* selectOptions */ js.Array[js.Array[OptionType] | OptionType], 
          Unit
        ]
      ] = js.undefined
  }
  object OnChange {
    
    inline def apply[OptionType /* <: BaseOptionType */](): OnChange[OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnChange[OptionType]]
    }
    
    extension [Self <: OnChange[?], OptionType /* <: BaseOptionType */](x: Self & OnChange[OptionType]) {
      
      inline def setOnChange(
        value: (/* value */ SingleValueType | js.Array[SingleValueType], /* selectOptions */ js.Array[js.Array[OptionType] | OptionType]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  trait Ref extends StObject {
    
    var ref: js.UndefOr[typings.react.mod.Ref[BaseSelectRef]] = js.undefined
  }
  object Ref {
    
    inline def apply(): Ref = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref]
    }
    
    extension [Self <: Ref](x: Self) {
      
      inline def setRef(value: typings.react.mod.Ref[BaseSelectRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ BaseSelectRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
