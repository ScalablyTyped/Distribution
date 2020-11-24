package typings.reactDnd.hooksApiMod

import typings.dndCore.interfacesMod.Identifier
import typings.dndCore.interfacesMod.TargetType
import typings.reactDnd.monitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropTargetHookSpec[DragObject, DropResult, CollectedProps] extends js.Object {
  
  /**
    * The kinds of dragItems this dropTarget accepts
    */
  var accept: TargetType = js.native
  
  /**
    * Optional. Use it to specify whether the drop target is able to accept the item. If you want to always allow it, just
    * omit this method. Specifying it is handy if you'd like to disable dropping based on some predicate over props or
    * monitor.getItem(). Note: You may not call monitor.canDrop() inside this method.
    */
  var canDrop: js.UndefOr[js.Function2[/* item */ DragObject, /* monitor */ DropTargetMonitor, Boolean]] = js.native
  
  /**
    * A function to collect rendering properties
    */
  var collect: js.UndefOr[js.Function1[/* monitor */ DropTargetMonitor, CollectedProps]] = js.native
  
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
    js.Function2[/* item */ DragObject, /* monitor */ DropTargetMonitor, js.UndefOr[DropResult]]
  ] = js.native
  
  /**
    * Optional.
    * Called when an item is hovered over the component. You can check monitor.isOver({ shallow: true }) to test whether
    * the hover happens over just the current target, or over a nested one. Unlike drop(), this method will be called even
    * if canDrop() is defined and returns false. You can check monitor.canDrop() to test whether this is the case.
    */
  var hover: js.UndefOr[js.Function2[/* item */ DragObject, /* monitor */ DropTargetMonitor, Unit]] = js.native
  
  /**
    * The drop target optinos
    */
  var options: js.UndefOr[js.Any] = js.native
}
object DropTargetHookSpec {
  
  @scala.inline
  def apply[DragObject, DropResult, CollectedProps](accept: TargetType): DropTargetHookSpec[DragObject, DropResult, CollectedProps] = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetHookSpec[DragObject, DropResult, CollectedProps]]
  }
  
  @scala.inline
  implicit class DropTargetHookSpecOps[Self <: DropTargetHookSpec[_, _, _], DragObject, DropResult, CollectedProps] (val x: Self with (DropTargetHookSpec[DragObject, DropResult, CollectedProps])) extends AnyVal {
    
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
    def setAcceptVarargs(value: Identifier*): Self = this.set("accept", js.Array(value :_*))
    
    @scala.inline
    def setAccept(value: TargetType): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDrop(value: (/* item */ DragObject, /* monitor */ DropTargetMonitor) => Boolean): Self = this.set("canDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCanDrop: Self = this.set("canDrop", js.undefined)
    
    @scala.inline
    def setCollect(value: /* monitor */ DropTargetMonitor => CollectedProps): Self = this.set("collect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCollect: Self = this.set("collect", js.undefined)
    
    @scala.inline
    def setDrop(value: (/* item */ DragObject, /* monitor */ DropTargetMonitor) => js.UndefOr[DropResult]): Self = this.set("drop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setHover(value: (/* item */ DragObject, /* monitor */ DropTargetMonitor) => Unit): Self = this.set("hover", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
