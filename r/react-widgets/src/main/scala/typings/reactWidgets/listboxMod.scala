package typings.reactWidgets

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactWidgets.accessorsMod.DataKeyAccessor
import typings.reactWidgets.accessorsMod.TextAccessor
import typings.reactWidgets.anon.Disabled
import typings.reactWidgets.anon.Group
import typings.reactWidgets.anon.LastValue
import typings.reactWidgets.listMod.GroupBy
import typings.reactWidgets.messagesMod.UserProvidedMessages
import typings.reactWidgets.reactWidgetsBooleans.`false`
import typings.reactWidgets.reactWidgetsBooleans.`true`
import typings.reactWidgets.sharedMod.WidgetHTMLProps
import typings.reactWidgets.typesMod.DataItem
import typings.reactWidgets.typesMod.RenderProp
import typings.reactWidgets.typesMod.Value
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listboxMod extends Shortcut {
  
  @JSImport("react-widgets/cjs/Listbox", JSImport.Default)
  @js.native
  val default: Listbox = js.native
  
  trait BaseListboxProps[TDataItem]
    extends StObject
       with WidgetHTMLProps[HTMLDivElement] {
    
    var data: js.Array[TDataItem]
    
    var dataKey: js.UndefOr[DataKeyAccessor] = js.undefined
    
    var defaultValue: js.UndefOr[Value] = js.undefined
    
    /**
      * @example false
      */
    var disabled: js.UndefOr[Boolean | js.Array[TDataItem]] = js.undefined
    
    var focusedItem: js.UndefOr[TDataItem] = js.undefined
    
    var groupBy: js.UndefOr[GroupBy[TDataItem]] = js.undefined
    
    var messages: js.UndefOr[UserProvidedMessages] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var optionComponent: js.UndefOr[ElementType[Any]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var renderGroup: js.UndefOr[RenderGroupProp] = js.undefined
    
    var renderItem: js.UndefOr[RenderItemProp[TDataItem]] = js.undefined
    
    var searchTerm: js.UndefOr[String] = js.undefined
    
    var textField: js.UndefOr[TextAccessor] = js.undefined
  }
  object BaseListboxProps {
    
    inline def apply[TDataItem](data: js.Array[TDataItem]): BaseListboxProps[TDataItem] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseListboxProps[TDataItem]]
    }
    
    extension [Self <: BaseListboxProps[?], TDataItem](x: Self & BaseListboxProps[TDataItem]) {
      
      inline def setData(value: js.Array[TDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataKey(value: DataKeyAccessor): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
      
      inline def setDataKeyFunction1(value: /* item */ DataItem => DataItem): Self = StObject.set(x, "dataKey", js.Any.fromFunction1(value))
      
      inline def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
      
      inline def setDataVarargs(value: TDataItem*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefaultValue(value: Value): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean | js.Array[TDataItem]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisabledVarargs(value: TDataItem*): Self = StObject.set(x, "disabled", js.Array(value*))
      
      inline def setFocusedItem(value: TDataItem): Self = StObject.set(x, "focusedItem", value.asInstanceOf[js.Any])
      
      inline def setFocusedItemUndefined: Self = StObject.set(x, "focusedItem", js.undefined)
      
      inline def setGroupBy(value: GroupBy[TDataItem]): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByFunction1(value: TDataItem => Any): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setMessages(value: UserProvidedMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOptionComponent(value: ElementType[Any]): Self = StObject.set(x, "optionComponent", value.asInstanceOf[js.Any])
      
      inline def setOptionComponentUndefined: Self = StObject.set(x, "optionComponent", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRenderGroup(value: Group => ReactNode): Self = StObject.set(x, "renderGroup", js.Any.fromFunction1(value))
      
      inline def setRenderGroupUndefined: Self = StObject.set(x, "renderGroup", js.undefined)
      
      inline def setRenderItem(value: Disabled[TDataItem] => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      inline def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
      
      inline def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
      
      inline def setTextField(value: TextAccessor): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
      
      inline def setTextFieldFunction1(value: /* item */ DataItem => String): Self = StObject.set(x, "textField", js.Any.fromFunction1(value))
      
      inline def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
    }
  }
  
  @js.native
  trait Listbox extends StObject {
    
    def apply[TDataItem](props: ListboxProps[TDataItem] & RefAttributes[ListboxHandle]): ReactElement | Null = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var propTypes: js.UndefOr[Any] = js.native
  }
  
  trait ListboxHandle extends StObject {
    
    def scrollIntoView(): Unit
  }
  object ListboxHandle {
    
    inline def apply(scrollIntoView: () => Unit): ListboxHandle = {
      val __obj = js.Dynamic.literal(scrollIntoView = js.Any.fromFunction0(scrollIntoView))
      __obj.asInstanceOf[ListboxHandle]
    }
    
    extension [Self <: ListboxHandle](x: Self) {
      
      inline def setScrollIntoView(value: () => Unit): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactWidgets.listboxMod.SingleListboxProps[TDataItem]
    - typings.reactWidgets.listboxMod.MultipleListboxProps[TDataItem]
  */
  trait ListboxProps[TDataItem] extends StObject
  object ListboxProps {
    
    inline def MultipleListboxProps[TDataItem](data: js.Array[TDataItem]): typings.reactWidgets.listboxMod.MultipleListboxProps[TDataItem] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], multiple = true)
      __obj.asInstanceOf[typings.reactWidgets.listboxMod.MultipleListboxProps[TDataItem]]
    }
    
    inline def SingleListboxProps[TDataItem](data: js.Array[TDataItem]): typings.reactWidgets.listboxMod.SingleListboxProps[TDataItem] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactWidgets.listboxMod.SingleListboxProps[TDataItem]]
    }
  }
  
  type MultipleChangeHandler[TDataItem] = js.Function2[
    /* dataItem */ js.Array[TDataItem], 
    /* metadata */ typings.reactWidgets.anon.DataItem[TDataItem], 
    Unit
  ]
  
  trait MultipleListboxProps[TDataItem]
    extends StObject
       with BaseListboxProps[TDataItem]
       with ListboxProps[TDataItem] {
    
    @JSName("defaultValue")
    var defaultValue_MultipleListboxProps: js.UndefOr[js.Array[Value]] = js.undefined
    
    @JSName("multiple")
    var multiple_MultipleListboxProps: `true`
    
    var onChange: js.UndefOr[MultipleChangeHandler[TDataItem]] = js.undefined
    
    var value: js.UndefOr[js.Array[Value]] = js.undefined
  }
  object MultipleListboxProps {
    
    inline def apply[TDataItem](data: js.Array[TDataItem]): MultipleListboxProps[TDataItem] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], multiple = true)
      __obj.asInstanceOf[MultipleListboxProps[TDataItem]]
    }
    
    extension [Self <: MultipleListboxProps[?], TDataItem](x: Self & MultipleListboxProps[TDataItem]) {
      
      inline def setDefaultValue(value: js.Array[Value]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: Value*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setMultiple(value: `true`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setOnChange(
        value: (/* dataItem */ js.Array[TDataItem], /* metadata */ typings.reactWidgets.anon.DataItem[TDataItem]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: js.Array[Value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Value*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type RenderGroupProp = RenderProp[Group]
  
  type RenderItemProp[TDataItem] = RenderProp[Disabled[TDataItem]]
  
  type SingleChangeHandler[TDataItem] = js.Function2[/* dataItem */ TDataItem, /* metadata */ LastValue, Unit]
  
  trait SingleListboxProps[TDataItem]
    extends StObject
       with BaseListboxProps[TDataItem]
       with ListboxProps[TDataItem] {
    
    @JSName("multiple")
    var multiple_SingleListboxProps: js.UndefOr[`false`] = js.undefined
    
    var onChange: js.UndefOr[SingleChangeHandler[TDataItem]] = js.undefined
    
    var value: js.UndefOr[Value] = js.undefined
  }
  object SingleListboxProps {
    
    inline def apply[TDataItem](data: js.Array[TDataItem]): SingleListboxProps[TDataItem] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleListboxProps[TDataItem]]
    }
    
    extension [Self <: SingleListboxProps[?], TDataItem](x: Self & SingleListboxProps[TDataItem]) {
      
      inline def setMultiple(value: `false`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnChange(value: (TDataItem, /* metadata */ LastValue) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = Listbox
  
  /* This means you don't have to write `default`, but can instead just say `listboxMod.foo` */
  override def _to: Listbox = default
}
