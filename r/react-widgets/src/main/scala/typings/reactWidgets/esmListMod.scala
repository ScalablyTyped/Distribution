package typings.reactWidgets

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.SyntheticEvent
import typings.reactWidgets.anon.ActionDataItem
import typings.reactWidgets.anon.Disabled
import typings.reactWidgets.anon.Group
import typings.reactWidgets.esmAccessorsMod.Accessors
import typings.reactWidgets.esmListOptionMod.ListOptionProps
import typings.reactWidgets.esmMessagesMod.UserProvidedMessages
import typings.reactWidgets.esmTypesMod.RenderProp
import typings.std.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmListMod {
  
  @JSImport("react-widgets/esm/List", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-widgets/esm/List", JSImport.Default)
  @js.native
  val default: typings.reactWidgets.esmListMod.List = js.native
  
  inline def useHandleSelect[TDataItem](multiple: Boolean, dataItems: js.Array[TDataItem], onChange: ChangeHandler[TDataItem]): js.Function2[/* dataItem */ TDataItem, /* event */ SyntheticEvent[Element, Event], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useHandleSelect")(multiple.asInstanceOf[js.Any], dataItems.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* dataItem */ TDataItem, /* event */ SyntheticEvent[Element, Event], Unit]]
  
  inline def useScrollFocusedIntoView(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollFocusedIntoView")().asInstanceOf[js.Function0[Unit]]
  inline def useScrollFocusedIntoView(element: Null, observeChanges: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollFocusedIntoView")(element.asInstanceOf[js.Any], observeChanges.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def useScrollFocusedIntoView(element: HTMLElement): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollFocusedIntoView")(element.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def useScrollFocusedIntoView(element: HTMLElement, observeChanges: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollFocusedIntoView")(element.asInstanceOf[js.Any], observeChanges.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  type ChangeHandler[TDataItem] = js.Function2[
    /* dataItem */ TDataItem | js.Array[TDataItem], 
    /* metadata */ ActionDataItem[TDataItem], 
    Unit
  ]
  
  type GroupBy[TDataItem] = (js.Function1[/* item */ TDataItem, Any]) | String
  
  @js.native
  trait List extends StObject {
    
    def apply[TDataItem](props: ListProps[TDataItem] & RefAttributes[ListHandle]): ReactElement | Null = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var propTypes: js.UndefOr[Any] = js.native
  }
  
  trait ListHandle extends StObject {
    
    def scrollIntoView(): Unit
  }
  object ListHandle {
    
    inline def apply(scrollIntoView: () => Unit): ListHandle = {
      val __obj = js.Dynamic.literal(scrollIntoView = js.Any.fromFunction0(scrollIntoView))
      __obj.asInstanceOf[ListHandle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListHandle] (val x: Self) extends AnyVal {
      
      inline def setScrollIntoView(value: () => Unit): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction0(value))
    }
  }
  
  trait ListProps[TDataItem]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var accessors: Accessors
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.Array[TDataItem]
    
    var disabled: js.UndefOr[Boolean | js.Array[TDataItem]] = js.undefined
    
    var elementRef: js.UndefOr[MutableRefObject[HTMLDivElement | Null]] = js.undefined
    
    var focusedItem: js.UndefOr[TDataItem] = js.undefined
    
    var groupBy: js.UndefOr[GroupBy[TDataItem]] = js.undefined
    
    var messages: js.UndefOr[UserProvidedMessages] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var onChange: ChangeHandler[TDataItem]
    
    var optionComponent: js.UndefOr[ElementType[Any]] = js.undefined
    
    var renderGroup: js.UndefOr[RenderGroupProp] = js.undefined
    
    var renderItem: js.UndefOr[RenderItemProp[TDataItem]] = js.undefined
    
    var searchTerm: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.Array[TDataItem] | TDataItem] = js.undefined
  }
  object ListProps {
    
    inline def apply[TDataItem](
      accessors: Accessors,
      data: js.Array[TDataItem],
      onChange: (/* dataItem */ TDataItem | js.Array[TDataItem], /* metadata */ ActionDataItem[TDataItem]) => Unit
    ): ListProps[TDataItem] = {
      val __obj = js.Dynamic.literal(accessors = accessors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], onChange = js.Any.fromFunction2(onChange))
      __obj.asInstanceOf[ListProps[TDataItem]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListProps[?], TDataItem] (val x: Self & ListProps[TDataItem]) extends AnyVal {
      
      inline def setAccessors(value: Accessors): Self = StObject.set(x, "accessors", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setData(value: js.Array[TDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: TDataItem*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDisabled(value: Boolean | js.Array[TDataItem]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisabledVarargs(value: TDataItem*): Self = StObject.set(x, "disabled", js.Array(value*))
      
      inline def setElementRef(value: MutableRefObject[HTMLDivElement | Null]): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
      
      inline def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
      
      inline def setFocusedItem(value: TDataItem): Self = StObject.set(x, "focusedItem", value.asInstanceOf[js.Any])
      
      inline def setFocusedItemUndefined: Self = StObject.set(x, "focusedItem", js.undefined)
      
      inline def setGroupBy(value: GroupBy[TDataItem]): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByFunction1(value: TDataItem => Any): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setMessages(value: UserProvidedMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnChange(
        value: (/* dataItem */ TDataItem | js.Array[TDataItem], /* metadata */ ActionDataItem[TDataItem]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOptionComponent(value: ElementType[Any]): Self = StObject.set(x, "optionComponent", value.asInstanceOf[js.Any])
      
      inline def setOptionComponentUndefined: Self = StObject.set(x, "optionComponent", js.undefined)
      
      inline def setRenderGroup(value: Group => ReactNode): Self = StObject.set(x, "renderGroup", js.Any.fromFunction1(value))
      
      inline def setRenderGroupUndefined: Self = StObject.set(x, "renderGroup", js.undefined)
      
      inline def setRenderItem(value: Disabled[TDataItem] => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      inline def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
      
      inline def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
      
      inline def setValue(value: js.Array[TDataItem] | TDataItem): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: TDataItem*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type OptionComponentProp = ComponentType[ListOptionProps[Any]]
  
  type RenderGroupProp = RenderProp[Group]
  
  type RenderItemProp[TDataItem] = RenderProp[Disabled[TDataItem]]
}
