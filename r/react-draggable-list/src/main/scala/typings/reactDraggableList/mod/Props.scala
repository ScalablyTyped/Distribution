package typings.reactDraggableList.mod

import org.scalablytyped.runtime.Instantiable2
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props[I, C, T] extends js.Object {
  
  var autoScrollMaxSpeed: js.UndefOr[Double] = js.native
  
  var autoScrollRegionSize: js.UndefOr[Double] = js.native
  
  var commonProps: js.UndefOr[C] = js.native
  
  var constrainDrag: js.UndefOr[Boolean] = js.native
  
  var container: js.UndefOr[js.Function0[js.UndefOr[HTMLElement | Null]]] = js.native
  
  var itemKey: String | (js.Function1[/* item */ I, String]) = js.native
  
  var list: js.Array[I] = js.native
  
  var onMoveEnd: js.UndefOr[
    js.Function4[
      /* newList */ js.Array[I], 
      /* movedItem */ I, 
      /* oldIndex */ Double, 
      /* newIndex */ Double, 
      Unit
    ]
  ] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var springConfig: js.UndefOr[js.Object] = js.native
  
  var template: Instantiable2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], T] = js.native
  
  var unsetZIndex: js.UndefOr[Boolean] = js.native
}
object Props {
  
  @scala.inline
  def apply[I, C, T](
    itemKey: String | (js.Function1[/* item */ I, String]),
    list: js.Array[I],
    template: Instantiable2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], T]
  ): Props[I, C, T] = {
    val __obj = js.Dynamic.literal(itemKey = itemKey.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[I, C, T]]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props[_, _, _], I, C, T] (val x: Self with (Props[I, C, T])) extends AnyVal {
    
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
    def setItemKeyFunction1(value: /* item */ I => String): Self = this.set("itemKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemKey(value: String | (js.Function1[/* item */ I, String])): Self = this.set("itemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListVarargs(value: I*): Self = this.set("list", js.Array(value :_*))
    
    @scala.inline
    def setList(value: js.Array[I]): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: Instantiable2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], T]): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScrollMaxSpeed(value: Double): Self = this.set("autoScrollMaxSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScrollMaxSpeed: Self = this.set("autoScrollMaxSpeed", js.undefined)
    
    @scala.inline
    def setAutoScrollRegionSize(value: Double): Self = this.set("autoScrollRegionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScrollRegionSize: Self = this.set("autoScrollRegionSize", js.undefined)
    
    @scala.inline
    def setCommonProps(value: C): Self = this.set("commonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonProps: Self = this.set("commonProps", js.undefined)
    
    @scala.inline
    def setConstrainDrag(value: Boolean): Self = this.set("constrainDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrainDrag: Self = this.set("constrainDrag", js.undefined)
    
    @scala.inline
    def setContainer(value: () => js.UndefOr[HTMLElement | Null]): Self = this.set("container", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setOnMoveEnd(
      value: (/* newList */ js.Array[I], /* movedItem */ I, /* oldIndex */ Double, /* newIndex */ Double) => Unit
    ): Self = this.set("onMoveEnd", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnMoveEnd: Self = this.set("onMoveEnd", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setSpringConfig(value: js.Object): Self = this.set("springConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpringConfig: Self = this.set("springConfig", js.undefined)
    
    @scala.inline
    def setUnsetZIndex(value: Boolean): Self = this.set("unsetZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsetZIndex: Self = this.set("unsetZIndex", js.undefined)
  }
}
