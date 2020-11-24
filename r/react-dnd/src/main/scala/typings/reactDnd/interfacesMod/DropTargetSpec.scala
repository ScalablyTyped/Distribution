package typings.reactDnd.interfacesMod

import typings.reactDnd.monitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropTargetSpec[Props] extends js.Object {
  
  /**
    * Optional. Use it to specify whether the drop target is able to accept the item. If you want to always allow it, just
    * omit this method. Specifying it is handy if you'd like to disable dropping based on some predicate over props or
    * monitor.getItem(). Note: You may not call monitor.canDrop() inside this method.
    */
  var canDrop: js.UndefOr[js.Function2[/* props */ Props, /* monitor */ DropTargetMonitor, Boolean]] = js.native
  
  /**
    * Optional.
    * Called when a compatible item is dropped on the target. You may either return undefined, or a plain object.
    * If you return an object, it is going to become the drop result and will be available to the drag source in its
    * endDrag method as monitor.getDropResult(). This is useful in case you want to perform different actions
    * depending on which target received the drop. If you have nested drop targets, you can test whether a nested
    * target has already handled drop by checking monitor.didDrop() and monitor.getDropResult(). Both this method and
    * the source's endDrag method are good places to fire Flux actions. This method will not be called if canDrop()
    * is defined and returns false.
    */
  var drop: js.UndefOr[
    js.Function3[/* props */ Props, /* monitor */ DropTargetMonitor, /* component */ js.Any, _]
  ] = js.native
  
  /**
    * Optional.
    * Called when an item is hovered over the component. You can check monitor.isOver({ shallow: true }) to test whether
    * the hover happens over just the current target, or over a nested one. Unlike drop(), this method will be called even
    * if canDrop() is defined and returns false. You can check monitor.canDrop() to test whether this is the case.
    */
  var hover: js.UndefOr[
    js.Function3[/* props */ Props, /* monitor */ DropTargetMonitor, /* component */ js.Any, Unit]
  ] = js.native
}
object DropTargetSpec {
  
  @scala.inline
  def apply[Props](): DropTargetSpec[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetSpec[Props]]
  }
  
  @scala.inline
  implicit class DropTargetSpecOps[Self <: DropTargetSpec[_], Props] (val x: Self with DropTargetSpec[Props]) extends AnyVal {
    
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
    def setCanDrop(value: (/* props */ Props, /* monitor */ DropTargetMonitor) => Boolean): Self = this.set("canDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCanDrop: Self = this.set("canDrop", js.undefined)
    
    @scala.inline
    def setDrop(value: (/* props */ Props, /* monitor */ DropTargetMonitor, /* component */ js.Any) => _): Self = this.set("drop", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setHover(value: (/* props */ Props, /* monitor */ DropTargetMonitor, /* component */ js.Any) => Unit): Self = this.set("hover", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
  }
}
