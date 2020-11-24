package typings.rcVirtualList.listMod

import typings.rcVirtualList.anon.Style
import typings.rcVirtualList.interfaceMod.RenderFunc
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.Key
import typings.react.mod.NativeUIEvent
import typings.react.mod.ReactNode
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProps[T]
  extends HTMLAttributes[js.Any] {
  
  @JSName("children")
  var children_ListProps: RenderFunc[T] = js.native
  
  var component: js.UndefOr[String | FC[_] | (ComponentClass[_, ComponentState])] = js.native
  
  var data: js.Array[T] = js.native
  
  /** If not match virtual scroll condition, Set List still use height of container. */
  var fullHeight: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var itemHeight: js.UndefOr[Double] = js.native
  
  var itemKey: Key | (js.Function1[/* item */ T, Key]) = js.native
  
  @JSName("onScroll")
  var onScroll_ListProps: js.UndefOr[UIEventHandler[HTMLElement]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  /** Set `false` will always use real scroll instead of virtual one */
  var virtual: js.UndefOr[Boolean] = js.native
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
  implicit class ListPropsOps[Self <: ListProps[_], T] (val x: Self with ListProps[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildren(value: (T, /* index */ Double, /* props */ Style) => ReactNode): Self = this.set("children", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemKeyFunction1(value: /* item */ T => Key): Self = this.set("itemKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemKey(value: Key | (js.Function1[/* item */ T, Key])): Self = this.set("itemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: String | FC[_] | (ComponentClass[_, ComponentState])): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setFullHeight(value: Boolean): Self = this.set("fullHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullHeight: Self = this.set("fullHeight", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setItemHeight(value: Double): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemHeight: Self = this.set("itemHeight", js.undefined)
    
    @scala.inline
    def setOnScroll(value: UIEvent[HTMLElement, NativeUIEvent] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setVirtual(value: Boolean): Self = this.set("virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
}
