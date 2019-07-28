package typings.reactDashDnd.libInterfacesHooksApiMod

import typings.reactDashDnd.libInterfacesMonitorsMod.DragSourceMonitor
import typings.reactDashDnd.libInterfacesOptionsMod.DragPreviewOptions
import typings.reactDashDnd.libInterfacesOptionsMod.DragSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragSourceHookSpec[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps] extends js.Object {
  /**
    * When the dragging starts, beginDrag is called. If an object is returned from this function it will overide the default dragItem
    */
  var begin: js.UndefOr[js.Function1[/* monitor */ DragSourceMonitor, js.UndefOr[DragObject | Unit]]] = js.undefined
  /**
    * Optional.
    * Use it to specify whether the dragging is currently allowed. If you want to always allow it, just omit this method.
    * Specifying it is handy if you'd like to disable dragging based on some predicate over props. Note: You may not call
    * monitor.canDrag() inside this method.
    */
  var canDrag: js.UndefOr[Boolean | (js.Function1[/* monitor */ DragSourceMonitor, Boolean])] = js.undefined
  /**
    * A function to collect rendering properties
    */
  var collect: js.UndefOr[js.Function1[/* monitor */ DragSourceMonitor, CollectedProps]] = js.undefined
  /**
    * Optional.
    * When the dragging stops, endDrag is called. For every beginDrag call, a corresponding endDrag call is guaranteed.
    * You may call monitor.didDrop() to check whether or not the drop was handled by a compatible drop target. If it was handled,
    * and the drop target specified a drop result by returning a plain object from its drop() method, it will be available as
    * monitor.getDropResult(). This method is a good place to fire a Flux action. Note: If the component is unmounted while dragging,
    * component parameter is set to be null.
    */
  var end: js.UndefOr[
    js.Function2[/* dropResult */ js.UndefOr[DropResult], /* monitor */ DragSourceMonitor, Unit]
  ] = js.undefined
  /**
    * Optional.
    * By default, only the drag source that initiated the drag operation is considered to be dragging. You can
    * override this behavior by defining a custom isDragging method. It might return something like props.id === monitor.getItem().id.
    * Do this if the original component may be unmounted during the dragging and later “resurrected” with a different parent.
    * For example, when moving a card across the lists in a Kanban board, you want it to retain the dragged appearance—even though
    * technically, the component gets unmounted and a different one gets mounted every time you move it to another list.
    *
    * Note: You may not call monitor.isDragging() inside this method.
    */
  var isDragging: js.UndefOr[js.Function1[/* monitor */ DragSourceMonitor, Boolean]] = js.undefined
  /**
    * A plain javascript item describing the data being dragged.
    * This is the only information available to the drop targets about the drag
    * source so it's important to pick the minimal data they need to know.
    *
    * You may be tempted to put a reference to the component or complex object here,
    * but you shouldx try very hard to avoid doing this because it couples the
    * drag sources and drop targets. It's a good idea to use something like
    * { id: props.id }
    *
    */
  var item: DragObject
  /**
    * The drag source options
    */
  var options: js.UndefOr[DragSourceOptions] = js.undefined
  /**
    * DragPreview options
    */
  var previewOptions: js.UndefOr[DragPreviewOptions] = js.undefined
}

object DragSourceHookSpec {
  @scala.inline
  def apply[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](
    item: DragObject,
    begin: /* monitor */ DragSourceMonitor => js.UndefOr[DragObject | Unit] = null,
    canDrag: Boolean | (js.Function1[/* monitor */ DragSourceMonitor, Boolean]) = null,
    collect: /* monitor */ DragSourceMonitor => CollectedProps = null,
    end: (/* dropResult */ js.UndefOr[DropResult], /* monitor */ DragSourceMonitor) => Unit = null,
    isDragging: /* monitor */ DragSourceMonitor => Boolean = null,
    options: DragSourceOptions = null,
    previewOptions: DragPreviewOptions = null
  ): DragSourceHookSpec[DragObject, DropResult, CollectedProps] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(js.Any.fromFunction1(begin))
    if (canDrag != null) __obj.updateDynamic("canDrag")(canDrag.asInstanceOf[js.Any])
    if (collect != null) __obj.updateDynamic("collect")(js.Any.fromFunction1(collect))
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction2(end))
    if (isDragging != null) __obj.updateDynamic("isDragging")(js.Any.fromFunction1(isDragging))
    if (options != null) __obj.updateDynamic("options")(options)
    if (previewOptions != null) __obj.updateDynamic("previewOptions")(previewOptions)
    __obj.asInstanceOf[DragSourceHookSpec[DragObject, DropResult, CollectedProps]]
  }
}

