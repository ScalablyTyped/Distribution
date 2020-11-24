package typings.reactSortablePane.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.TouchEvent
import typings.reactMotion.mod.SpringHelperConfig
import typings.reactSortablePane.reactSortablePaneStrings.horizontal
import typings.reactSortablePane.reactSortablePaneStrings.vertical
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortablePaneProps extends js.Object {
  
  var children: js.Array[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var defaultOrder: js.UndefOr[js.Array[String]] = js.native
  
  var direction: js.UndefOr[horizontal | vertical] = js.native
  
  var disableEffect: js.UndefOr[Boolean] = js.native
  
  var dragHandleClassName: js.UndefOr[String] = js.native
  
  var isSortable: js.UndefOr[Boolean] = js.native
  
  var margin: js.UndefOr[Double] = js.native
  
  var onDragStart: js.UndefOr[
    js.Function3[
      /* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], 
      /* key */ PaneKey, 
      /* elementRef */ HTMLElement, 
      Unit
    ]
  ] = js.native
  
  var onDragStop: js.UndefOr[
    js.Function4[
      /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
      /* key */ PaneKey, 
      /* elementRef */ HTMLElement, 
      /* order */ js.Array[String], 
      Unit
    ]
  ] = js.native
  
  var onOrderChange: js.UndefOr[js.Function1[/* order */ js.Array[String], Unit]] = js.native
  
  var onResize: js.UndefOr[
    js.Function5[
      /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
      /* key */ PaneKey, 
      /* dir */ PaneResizeDirection, 
      /* elementRef */ HTMLElement, 
      /* delta */ PaneSize, 
      Unit
    ]
  ] = js.native
  
  var onResizeStart: js.UndefOr[
    js.Function3[
      /* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], 
      /* key */ PaneKey, 
      /* dir */ PaneResizeDirection, 
      Unit
    ]
  ] = js.native
  
  var onResizeStop: js.UndefOr[
    js.Function5[
      /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
      /* key */ PaneKey, 
      /* dir */ PaneResizeDirection, 
      /* elementRef */ HTMLElement, 
      /* delta */ PaneSize, 
      Unit
    ]
  ] = js.native
  
  var order: js.UndefOr[js.Array[String]] = js.native
  
  var springConfig: js.UndefOr[SpringHelperConfig] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object SortablePaneProps {
  
  @scala.inline
  def apply(children: js.Array[ReactElement]): SortablePaneProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortablePaneProps]
  }
  
  @scala.inline
  implicit class SortablePanePropsOps[Self <: SortablePaneProps] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDefaultOrderVarargs(value: String*): Self = this.set("defaultOrder", js.Array(value :_*))
    
    @scala.inline
    def setDefaultOrder(value: js.Array[String]): Self = this.set("defaultOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOrder: Self = this.set("defaultOrder", js.undefined)
    
    @scala.inline
    def setDirection(value: horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisableEffect(value: Boolean): Self = this.set("disableEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableEffect: Self = this.set("disableEffect", js.undefined)
    
    @scala.inline
    def setDragHandleClassName(value: String): Self = this.set("dragHandleClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragHandleClassName: Self = this.set("dragHandleClassName", js.undefined)
    
    @scala.inline
    def setIsSortable(value: Boolean): Self = this.set("isSortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSortable: Self = this.set("isSortable", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOnDragStart(
      value: (/* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], /* key */ PaneKey, /* elementRef */ HTMLElement) => Unit
    ): Self = this.set("onDragStart", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragStop(
      value: (/* e */ typings.std.MouseEvent | typings.std.TouchEvent, /* key */ PaneKey, /* elementRef */ HTMLElement, /* order */ js.Array[String]) => Unit
    ): Self = this.set("onDragStop", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnDragStop: Self = this.set("onDragStop", js.undefined)
    
    @scala.inline
    def setOnOrderChange(value: /* order */ js.Array[String] => Unit): Self = this.set("onOrderChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOrderChange: Self = this.set("onOrderChange", js.undefined)
    
    @scala.inline
    def setOnResize(
      value: (/* e */ typings.std.MouseEvent | typings.std.TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Unit
    ): Self = this.set("onResize", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setOnResizeStart(
      value: (/* e */ (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement], /* key */ PaneKey, /* dir */ PaneResizeDirection) => Unit
    ): Self = this.set("onResizeStart", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnResizeStart: Self = this.set("onResizeStart", js.undefined)
    
    @scala.inline
    def setOnResizeStop(
      value: (/* e */ typings.std.MouseEvent | typings.std.TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Unit
    ): Self = this.set("onResizeStop", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOnResizeStop: Self = this.set("onResizeStop", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: String*): Self = this.set("order", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: js.Array[String]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setSpringConfig(value: SpringHelperConfig): Self = this.set("springConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpringConfig: Self = this.set("springConfig", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
