package typings.rcSelect

import org.scalablytyped.runtime.Shortcut
import typings.rcSelect.anon.Selected
import typings.rcSelect.anon.`0`
import typings.rcSelect.libBaseSelectMod.RawValueType
import typings.rcSelect.libBaseSelectMod.RenderNode
import typings.rcSelect.libInterfaceMod.FlattenOptionData
import typings.rcSelect.libSelectMod.BaseOptionType
import typings.rcSelect.libSelectMod.FieldNames
import typings.rcSelect.libSelectMod.OnActiveValue
import typings.rcSelect.libSelectMod.OnInternalSelect
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectContextMod extends Shortcut {
  
  @JSImport("rc-select/lib/SelectContext", JSImport.Default)
  @js.native
  val default: Context[SelectContextProps] = js.native
  
  trait SelectContextProps extends StObject {
    
    var childrenAsData: js.UndefOr[Boolean] = js.undefined
    
    var defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined
    
    var fieldNames: js.UndefOr[FieldNames] = js.undefined
    
    var flattenOptions: js.Array[FlattenOptionData[BaseOptionType]]
    
    var listHeight: js.UndefOr[Double] = js.undefined
    
    var listItemHeight: js.UndefOr[Double] = js.undefined
    
    var menuItemSelectedIcon: js.UndefOr[RenderNode] = js.undefined
    
    var onActiveValue: OnActiveValue
    
    var onSelect: OnInternalSelect
    
    var options: js.Array[BaseOptionType]
    
    var rawValues: Set[RawValueType]
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object SelectContextProps {
    
    inline def apply(
      flattenOptions: js.Array[FlattenOptionData[BaseOptionType]],
      onActiveValue: (/* active */ typings.rcSelect.libSelectMod.RawValueType, /* index */ Double, /* info */ js.UndefOr[`0`]) => Unit,
      onSelect: (/* value */ typings.rcSelect.libSelectMod.RawValueType, /* info */ Selected) => Unit,
      options: js.Array[BaseOptionType],
      rawValues: Set[RawValueType]
    ): SelectContextProps = {
      val __obj = js.Dynamic.literal(flattenOptions = flattenOptions.asInstanceOf[js.Any], onActiveValue = js.Any.fromFunction3(onActiveValue), onSelect = js.Any.fromFunction2(onSelect), options = options.asInstanceOf[js.Any], rawValues = rawValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectContextProps]
    }
    
    extension [Self <: SelectContextProps](x: Self) {
      
      inline def setChildrenAsData(value: Boolean): Self = StObject.set(x, "childrenAsData", value.asInstanceOf[js.Any])
      
      inline def setChildrenAsDataUndefined: Self = StObject.set(x, "childrenAsData", js.undefined)
      
      inline def setDefaultActiveFirstOption(value: Boolean): Self = StObject.set(x, "defaultActiveFirstOption", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveFirstOptionUndefined: Self = StObject.set(x, "defaultActiveFirstOption", js.undefined)
      
      inline def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      inline def setFlattenOptions(value: js.Array[FlattenOptionData[BaseOptionType]]): Self = StObject.set(x, "flattenOptions", value.asInstanceOf[js.Any])
      
      inline def setFlattenOptionsVarargs(value: FlattenOptionData[BaseOptionType]*): Self = StObject.set(x, "flattenOptions", js.Array(value*))
      
      inline def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
      
      inline def setListHeightUndefined: Self = StObject.set(x, "listHeight", js.undefined)
      
      inline def setListItemHeight(value: Double): Self = StObject.set(x, "listItemHeight", value.asInstanceOf[js.Any])
      
      inline def setListItemHeightUndefined: Self = StObject.set(x, "listItemHeight", js.undefined)
      
      inline def setMenuItemSelectedIcon(value: RenderNode): Self = StObject.set(x, "menuItemSelectedIcon", value.asInstanceOf[js.Any])
      
      inline def setMenuItemSelectedIconFunction1(value: /* props */ Any => ReactNode): Self = StObject.set(x, "menuItemSelectedIcon", js.Any.fromFunction1(value))
      
      inline def setMenuItemSelectedIconUndefined: Self = StObject.set(x, "menuItemSelectedIcon", js.undefined)
      
      inline def setOnActiveValue(
        value: (/* active */ typings.rcSelect.libSelectMod.RawValueType, /* index */ Double, /* info */ js.UndefOr[`0`]) => Unit
      ): Self = StObject.set(x, "onActiveValue", js.Any.fromFunction3(value))
      
      inline def setOnSelect(value: (/* value */ typings.rcSelect.libSelectMod.RawValueType, /* info */ Selected) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOptions(value: js.Array[BaseOptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: BaseOptionType*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setRawValues(value: Set[RawValueType]): Self = StObject.set(x, "rawValues", value.asInstanceOf[js.Any])
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  type _To = Context[SelectContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `libSelectContextMod.foo` */
  override def _to: Context[SelectContextProps] = default
}
