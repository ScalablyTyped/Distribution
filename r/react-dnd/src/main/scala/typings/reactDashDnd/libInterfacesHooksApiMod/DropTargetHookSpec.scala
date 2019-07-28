package typings.reactDashDnd.libInterfacesHooksApiMod

import typings.dndDashCore.libInterfacesMod.TargetType
import typings.reactDashDnd.libInterfacesMonitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetHookSpec[DragObject, DropResult, CollectedProps] extends js.Object {
  /**
    * The kinds of dragItems this dropTarget accepts
    */
  var accept: TargetType
  /**
    * Optional. Use it to specify whether the drop target is able to accept the item. If you want to always allow it, just
    * omit this method. Specifying it is handy if you'd like to disable dropping based on some predicate over props or
    * monitor.getItem(). Note: You may not call monitor.canDrop() inside this method.
    */
  var canDrop: js.UndefOr[js.Function2[/* item */ DragObject, /* monitor */ DropTargetMonitor, Boolean]] = js.undefined
  /**
    * A function to collect rendering properties
    */
  var collect: js.UndefOr[js.Function1[/* monitor */ DropTargetMonitor, CollectedProps]] = js.undefined
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
  ] = js.undefined
  /**
    * Optional.
    * Called when an item is hovered over the component. You can check monitor.isOver({ shallow: true }) to test whether
    * the hover happens over just the current target, or over a nested one. Unlike drop(), this method will be called even
    * if canDrop() is defined and returns false. You can check monitor.canDrop() to test whether this is the case.
    */
  var hover: js.UndefOr[js.Function2[/* item */ DragObject, /* monitor */ DropTargetMonitor, Unit]] = js.undefined
  /**
    * The drop target optinos
    */
  var options: js.UndefOr[js.Any] = js.undefined
}

object DropTargetHookSpec {
  @scala.inline
  def apply[DragObject, DropResult, CollectedProps](
    accept: TargetType,
    canDrop: (/* item */ DragObject, /* monitor */ DropTargetMonitor) => Boolean = null,
    collect: /* monitor */ DropTargetMonitor => CollectedProps = null,
    drop: (/* item */ DragObject, /* monitor */ DropTargetMonitor) => js.UndefOr[DropResult] = null,
    hover: (/* item */ DragObject, /* monitor */ DropTargetMonitor) => Unit = null,
    options: js.Any = null
  ): DropTargetHookSpec[DragObject, DropResult, CollectedProps] = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any])
    if (canDrop != null) __obj.updateDynamic("canDrop")(js.Any.fromFunction2(canDrop))
    if (collect != null) __obj.updateDynamic("collect")(js.Any.fromFunction1(collect))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction2(drop))
    if (hover != null) __obj.updateDynamic("hover")(js.Any.fromFunction2(hover))
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[DropTargetHookSpec[DragObject, DropResult, CollectedProps]]
  }
}

