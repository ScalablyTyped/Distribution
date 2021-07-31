package typings.rcVirtualList

import typings.rcVirtualList.anon.Children
import typings.rcVirtualList.anon.Style
import typings.rcVirtualList.interfaceMod.RenderFunc
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.Key
import typings.react.mod.NativeUIEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("rc-virtual-list/es/List", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Item](props: Children & ListProps[Item]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @scala.inline
  def RawList[T](props: ListProps[T], ref: Ref[ListRef]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("RawList")(props.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  trait ListProps[T]
    extends StObject
       with HTMLAttributes[js.Any] {
    
    @JSName("children")
    var children_ListProps: RenderFunc[T]
    
    var component: js.UndefOr[String | FC[js.Any] | (ComponentClass[js.Any, ComponentState])] = js.undefined
    
    var data: js.Array[T]
    
    /** If not match virtual scroll condition, Set List still use height of container. */
    var fullHeight: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var itemHeight: js.UndefOr[Double] = js.undefined
    
    var itemKey: Key | (js.Function1[/* item */ T, Key])
    
    @JSName("onScroll")
    var onScroll_ListProps: js.UndefOr[UIEventHandler[HTMLElement]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    /** Set `false` will always use real scroll instead of virtual one */
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object ListProps {
    
    @scala.inline
    def apply[T](
      children: (T, /* index */ Double, /* props */ Style) => ReactNode,
      data: js.Array[T],
      itemKey: Key | (js.Function1[/* item */ T, Key])
    ): ListProps[T] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children), data = data.asInstanceOf[js.Any], itemKey = itemKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListProps[T]]
    }
    
    @scala.inline
    implicit class ListPropsMutableBuilder[Self <: ListProps[?], T] (val x: Self & ListProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (T, /* index */ Double, /* props */ Style) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      @scala.inline
      def setComponent(value: String | FC[js.Any] | (ComponentClass[js.Any, ComponentState])): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFullHeight(value: Boolean): Self = StObject.set(x, "fullHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullHeightUndefined: Self = StObject.set(x, "fullHeight", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      @scala.inline
      def setItemKey(value: Key | (js.Function1[/* item */ T, Key])): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemKeyFunction1(value: /* item */ T => Key): Self = StObject.set(x, "itemKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScroll(value: UIEvent[HTMLElement, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  trait ListRef extends StObject {
    
    var scrollTo: ScrollTo
  }
  object ListRef {
    
    @scala.inline
    def apply(scrollTo: /* arg */ Double | ScrollConfig => Unit): ListRef = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
      __obj.asInstanceOf[ListRef]
    }
    
    @scala.inline
    implicit class ListRefMutableBuilder[Self <: ListRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollTo(value: /* arg */ Double | ScrollConfig => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcVirtualList.rcVirtualListStrings.top
    - typings.rcVirtualList.rcVirtualListStrings.bottom
    - typings.rcVirtualList.rcVirtualListStrings.auto
  */
  trait ScrollAlign extends StObject
  object ScrollAlign {
    
    @scala.inline
    def auto: typings.rcVirtualList.rcVirtualListStrings.auto = "auto".asInstanceOf[typings.rcVirtualList.rcVirtualListStrings.auto]
    
    @scala.inline
    def bottom: typings.rcVirtualList.rcVirtualListStrings.bottom = "bottom".asInstanceOf[typings.rcVirtualList.rcVirtualListStrings.bottom]
    
    @scala.inline
    def top: typings.rcVirtualList.rcVirtualListStrings.top = "top".asInstanceOf[typings.rcVirtualList.rcVirtualListStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcVirtualList.anon.Align
    - typings.rcVirtualList.anon.Key
  */
  trait ScrollConfig extends StObject
  object ScrollConfig {
    
    @scala.inline
    def Align(index: Double): typings.rcVirtualList.anon.Align = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rcVirtualList.anon.Align]
    }
    
    @scala.inline
    def Key(key: typings.react.mod.Key): typings.rcVirtualList.anon.Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rcVirtualList.anon.Key]
    }
  }
  
  type ScrollTo = js.Function1[/* arg */ Double | ScrollConfig, Unit]
}
