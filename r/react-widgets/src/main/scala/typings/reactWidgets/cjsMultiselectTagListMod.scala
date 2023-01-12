package typings.reactWidgets

import typings.react.mod.ComponentType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactWidgets.anon.Item
import typings.reactWidgets.cjsAccessorsMod.TextAccessorFn
import typings.reactWidgets.cjsMultiselectTagMod.MultiselectTagProps
import typings.reactWidgets.cjsTypesMod.DataItem
import typings.reactWidgets.cjsTypesMod.RenderProp
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsMultiselectTagListMod {
  
  @JSImport("react-widgets/cjs/MultiselectTagList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDataItem](param0: MultiselectTagListProps[TDataItem]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MultiselectTagListProps[TDataItem] extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var clearTagIcon: ReactNode
    
    var disabled: js.UndefOr[js.Array[TDataItem] | Boolean] = js.undefined
    
    var focusedItem: js.UndefOr[TDataItem] = js.undefined
    
    var id: String
    
    var label: js.UndefOr[String] = js.undefined
    
    def onDelete(dataItem: TDataItem, event: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var renderTagValue: js.UndefOr[RenderTagProp[TDataItem]] = js.undefined
    
    var tagOptionComponent: js.UndefOr[TagComponentProp] = js.undefined
    
    var textAccessor: TextAccessorFn
    
    var value: js.Array[TDataItem]
  }
  object MultiselectTagListProps {
    
    inline def apply[TDataItem](
      id: String,
      onDelete: (TDataItem, MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit,
      textAccessor: /* item */ DataItem => String,
      value: js.Array[TDataItem]
    ): MultiselectTagListProps[TDataItem] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onDelete = js.Any.fromFunction2(onDelete), textAccessor = js.Any.fromFunction1(textAccessor), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiselectTagListProps[TDataItem]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiselectTagListProps[?], TDataItem] (val x: Self & MultiselectTagListProps[TDataItem]) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClearTagIcon(value: ReactNode): Self = StObject.set(x, "clearTagIcon", value.asInstanceOf[js.Any])
      
      inline def setClearTagIconUndefined: Self = StObject.set(x, "clearTagIcon", js.undefined)
      
      inline def setDisabled(value: js.Array[TDataItem] | Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisabledVarargs(value: TDataItem*): Self = StObject.set(x, "disabled", js.Array(value*))
      
      inline def setFocusedItem(value: TDataItem): Self = StObject.set(x, "focusedItem", value.asInstanceOf[js.Any])
      
      inline def setFocusedItemUndefined: Self = StObject.set(x, "focusedItem", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnDelete(value: (TDataItem, MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onDelete", js.Any.fromFunction2(value))
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRenderTagValue(value: Item[TDataItem] => ReactNode): Self = StObject.set(x, "renderTagValue", js.Any.fromFunction1(value))
      
      inline def setRenderTagValueUndefined: Self = StObject.set(x, "renderTagValue", js.undefined)
      
      inline def setTagOptionComponent(value: TagComponentProp): Self = StObject.set(x, "tagOptionComponent", value.asInstanceOf[js.Any])
      
      inline def setTagOptionComponentUndefined: Self = StObject.set(x, "tagOptionComponent", js.undefined)
      
      inline def setTextAccessor(value: /* item */ DataItem => String): Self = StObject.set(x, "textAccessor", js.Any.fromFunction1(value))
      
      inline def setValue(value: js.Array[TDataItem]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: TDataItem*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type RenderTagProp[TDataItem] = RenderProp[Item[TDataItem]]
  
  type TagComponentProp = ComponentType[MultiselectTagProps]
}
