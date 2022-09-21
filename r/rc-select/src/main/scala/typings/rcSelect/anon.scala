package typings.rcSelect

import typings.rcSelect.baseSelectMod.BaseSelectRef
import typings.rcSelect.baseSelectMod.DisplayValueType
import typings.rcSelect.optGroupMod.OptionGroupFC
import typings.rcSelect.optionMod.OptionFC
import typings.rcSelect.rcSelectStrings.add
import typings.rcSelect.rcSelectStrings.blur
import typings.rcSelect.rcSelectStrings.clear
import typings.rcSelect.rcSelectStrings.effect
import typings.rcSelect.rcSelectStrings.keyboard
import typings.rcSelect.rcSelectStrings.mouse
import typings.rcSelect.rcSelectStrings.remove
import typings.rcSelect.rcSelectStrings.submit
import typings.rcSelect.rcSelectStrings.typing
import typings.rcSelect.selectMod.FieldNames
import typings.rcSelect.selectMod.RawValueType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var source: js.UndefOr[keyboard | mouse] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setSource(value: keyboard | mouse): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var ref: js.UndefOr[Ref[BaseSelectRef]] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setRef(value: Ref[BaseSelectRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ BaseSelectRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait ChildrenAsData extends StObject {
    
    var childrenAsData: js.UndefOr[Boolean] = js.undefined
    
    var fieldNames: js.UndefOr[FieldNames] = js.undefined
  }
  object ChildrenAsData {
    
    inline def apply(): ChildrenAsData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildrenAsData]
    }
    
    extension [Self <: ChildrenAsData](x: Self) {
      
      inline def setChildrenAsData(value: Boolean): Self = StObject.set(x, "childrenAsData", value.asInstanceOf[js.Any])
      
      inline def setChildrenAsDataUndefined: Self = StObject.set(x, "childrenAsData", js.undefined)
      
      inline def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    }
  }
  
  trait Label extends StObject {
    
    var label: String
    
    var options: String
    
    var value: String
  }
  object Label {
    
    inline def apply(label: String, options: String, value: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait LabelOptions[OptionType] extends StObject {
    
    var labelOptions: Map[ReactNode, OptionType]
    
    var options: js.Array[OptionType]
    
    var valueOptions: Map[RawValueType, OptionType]
  }
  object LabelOptions {
    
    inline def apply[OptionType](
      labelOptions: Map[ReactNode, OptionType],
      options: js.Array[OptionType],
      valueOptions: Map[RawValueType, OptionType]
    ): LabelOptions[OptionType] = {
      val __obj = js.Dynamic.literal(labelOptions = labelOptions.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], valueOptions = valueOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelOptions[OptionType]]
    }
    
    extension [Self <: LabelOptions[?], OptionType](x: Self & LabelOptions[OptionType]) {
      
      inline def setLabelOptions(value: Map[ReactNode, OptionType]): Self = StObject.set(x, "labelOptions", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[OptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: OptionType*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setValueOptions(value: Map[RawValueType, OptionType]): Self = StObject.set(x, "valueOptions", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<rc-select.rc-select/lib/Select.DefaultOptionType, 'children'> */
  trait OmitDefaultOptionTypechil extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: ReactNode
    
    var value: js.UndefOr[String | Double | Null] = js.undefined
  }
  object OmitDefaultOptionTypechil {
    
    inline def apply(): OmitDefaultOptionTypechil = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitDefaultOptionTypechil]
    }
    
    extension [Self <: OmitDefaultOptionTypechil](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait OptGroup extends StObject {
    
    var OptGroup: OptionGroupFC
    
    var Option: OptionFC
  }
  object OptGroup {
    
    inline def apply(OptGroup: OptionGroupFC, Option: OptionFC): OptGroup = {
      val __obj = js.Dynamic.literal(OptGroup = OptGroup.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptGroup]
    }
    
    extension [Self <: OptGroup](x: Self) {
      
      inline def setOptGroup(value: OptionGroupFC): Self = StObject.set(x, "OptGroup", value.asInstanceOf[js.Any])
      
      inline def setOption(value: OptionFC): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
    }
  }
  
  trait Selected extends StObject {
    
    var selected: Boolean
  }
  object Selected {
    
    inline def apply(selected: Boolean): Selected = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selected]
    }
    
    extension [Self <: Selected](x: Self) {
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait Source extends StObject {
    
    var source: typing | effect | submit | blur
  }
  object Source {
    
    inline def apply(source: typing | effect | submit | blur): Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setSource(value: typing | effect | submit | blur): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: add | remove | clear
    
    var values: js.Array[DisplayValueType]
  }
  object Type {
    
    inline def apply(`type`: add | remove | clear, values: js.Array[DisplayValueType]): Type = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: add | remove | clear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[DisplayValueType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: DisplayValueType*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
