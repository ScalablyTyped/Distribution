package typings.reactWidgets

import typings.react.mod.Context
import typings.react.mod.MutableRefObject
import typings.react.mod.RefObject
import typings.reactWidgets.cjsAccessorsMod.TextAccessorFn
import typings.reactWidgets.cjsTypesMod.DataItem
import typings.reactWidgets.reactWidgetsStrings.clear
import typings.reactWidgets.reactWidgetsStrings.loop
import typings.reactWidgets.reactWidgetsStrings.stop
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsFocusListContextMod {
  
  @JSImport("react-widgets/cjs/FocusListContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FocusListContext extends StObject {
    
    var activeId: js.UndefOr[String] = js.undefined
    
    var focusedItem: js.UndefOr[Any] = js.undefined
    
    var map: WeakMap[HTMLElement, Any]
  }
  object FocusListContext {
    
    @JSImport("react-widgets/cjs/FocusListContext", "FocusListContext")
    @js.native
    val ^ : Context[FocusListContext | Null] = js.native
    
    extension [Self <: FocusListContext](x: Self) {
      
      inline def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setActiveIdUndefined: Self = StObject.set(x, "activeId", js.undefined)
      
      inline def setFocusedItem(value: Any): Self = StObject.set(x, "focusedItem", value.asInstanceOf[js.Any])
      
      inline def setFocusedItemUndefined: Self = StObject.set(x, "focusedItem", js.undefined)
      
      inline def setMap(value: WeakMap[HTMLElement, Any]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    }
  }
  
  inline def useFocusList[TDataItem](param0: FocusListOptions[TDataItem]): FocusList[TDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusList")(param0.asInstanceOf[js.Any]).asInstanceOf[FocusList[TDataItem]]
  
  inline def useListOption[TDataItem, T /* <: HTMLElement */](dataItem: TDataItem): js.Tuple3[RefObject[T], Boolean, js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useListOption")(dataItem.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[RefObject[T], Boolean, js.UndefOr[String]]]
  
  @js.native
  trait FocusList[TDataItem] extends StObject {
    
    var context: FocusListContext = js.native
    
    def first(): js.UndefOr[HTMLElement] = js.native
    
    def focus(): Unit = js.native
    def focus(el: HTMLElement): Unit = js.native
    
    def get(): js.Tuple2[js.Array[HTMLElement], js.UndefOr[HTMLElement]] = js.native
    
    def getFocused(): js.UndefOr[TDataItem] = js.native
    
    def hasFocused(): Boolean = js.native
    
    def last(): js.UndefOr[HTMLElement] = js.native
    
    def next(): js.UndefOr[HTMLElement] = js.native
    def next(opts: FocusOptions): js.UndefOr[HTMLElement] = js.native
    
    def prev(): js.UndefOr[HTMLElement] = js.native
    def prev(opts: FocusOptions): js.UndefOr[HTMLElement] = js.native
    
    def size(): Double = js.native
    
    def toDataItem(el: HTMLElement): js.UndefOr[TDataItem] = js.native
  }
  
  trait FocusListOptions[TDataItem] extends StObject {
    
    var activeId: js.UndefOr[String] = js.undefined
    
    var anchorItem: js.UndefOr[TDataItem] = js.undefined
    
    var focusFirstItem: js.UndefOr[Boolean] = js.undefined
    
    var scope: MutableRefObject[HTMLElement | Null]
    
    var scopeSelector: js.UndefOr[String] = js.undefined
  }
  object FocusListOptions {
    
    inline def apply[TDataItem](scope: MutableRefObject[HTMLElement | Null]): FocusListOptions[TDataItem] = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusListOptions[TDataItem]]
    }
    
    extension [Self <: FocusListOptions[?], TDataItem](x: Self & FocusListOptions[TDataItem]) {
      
      inline def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setActiveIdUndefined: Self = StObject.set(x, "activeId", js.undefined)
      
      inline def setAnchorItem(value: TDataItem): Self = StObject.set(x, "anchorItem", value.asInstanceOf[js.Any])
      
      inline def setAnchorItemUndefined: Self = StObject.set(x, "anchorItem", js.undefined)
      
      inline def setFocusFirstItem(value: Boolean): Self = StObject.set(x, "focusFirstItem", value.asInstanceOf[js.Any])
      
      inline def setFocusFirstItemUndefined: Self = StObject.set(x, "focusFirstItem", js.undefined)
      
      inline def setScope(value: MutableRefObject[HTMLElement | Null]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeSelector(value: String): Self = StObject.set(x, "scopeSelector", value.asInstanceOf[js.Any])
      
      inline def setScopeSelectorUndefined: Self = StObject.set(x, "scopeSelector", js.undefined)
    }
  }
  
  trait FocusOptions extends StObject {
    
    var behavior: js.UndefOr[clear | stop | loop] = js.undefined
  }
  object FocusOptions {
    
    inline def apply(): FocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOptions]
    }
    
    extension [Self <: FocusOptions](x: Self) {
      
      inline def setBehavior(value: clear | stop | loop): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    }
  }
  
  trait FocusProps extends StObject {
    
    var children: Any
    
    var textAccessor: TextAccessorFn
  }
  object FocusProps {
    
    inline def apply(children: Any, textAccessor: /* item */ DataItem => String): FocusProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], textAccessor = js.Any.fromFunction1(textAccessor))
      __obj.asInstanceOf[FocusProps]
    }
    
    extension [Self <: FocusProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setTextAccessor(value: /* item */ DataItem => String): Self = StObject.set(x, "textAccessor", js.Any.fromFunction1(value))
    }
  }
}
