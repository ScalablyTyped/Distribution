package typings
package reactDashDndLib.libDecoratorsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetSpec[Props] extends js.Object {
  /**
    * Optional. Use it to specify whether the drop target is able to accept the item. If you want to always allow it, just
    * omit this method. Specifying it is handy if you'd like to disable dropping based on some predicate over props or
    * monitor.getItem(). Note: You may not call monitor.canDrop() inside this method.
    */
  var canDrop: js.UndefOr[
    js.Function2[
      /* props */ Props, 
      /* monitor */ reactDashDndLib.libInterfacesMonitorsMod.DropTargetMonitor, 
      scala.Boolean
    ]
  ] = js.undefined
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
    js.Function3[
      /* props */ Props, 
      /* monitor */ reactDashDndLib.libInterfacesMonitorsMod.DropTargetMonitor, 
      /* component */ js.Any, 
      _
    ]
  ] = js.undefined
  /**
    * Optional.
    * Called when an item is hovered over the component. You can check monitor.isOver({ shallow: true }) to test whether
    * the hover happens over just the current target, or over a nested one. Unlike drop(), this method will be called even
    * if canDrop() is defined and returns false. You can check monitor.canDrop() to test whether this is the case.
    */
  var hover: js.UndefOr[
    js.Function3[
      /* props */ Props, 
      /* monitor */ reactDashDndLib.libInterfacesMonitorsMod.DropTargetMonitor, 
      /* component */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
}

object DropTargetSpec {
  @scala.inline
  def apply[Props](
    canDrop: (/* props */ Props, /* monitor */ reactDashDndLib.libInterfacesMonitorsMod.DropTargetMonitor) => scala.Boolean = null,
    drop: (/* props */ Props, /* monitor */ reactDashDndLib.libInterfacesMonitorsMod.DropTargetMonitor, /* component */ js.Any) => _ = null,
    hover: (/* props */ Props, /* monitor */ reactDashDndLib.libInterfacesMonitorsMod.DropTargetMonitor, /* component */ js.Any) => scala.Unit = null
  ): DropTargetSpec[Props] = {
    val __obj = js.Dynamic.literal()
    if (canDrop != null) __obj.updateDynamic("canDrop")(js.Any.fromFunction2(canDrop))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction3(drop))
    if (hover != null) __obj.updateDynamic("hover")(js.Any.fromFunction3(hover))
    __obj.asInstanceOf[DropTargetSpec[Props]]
  }
}

