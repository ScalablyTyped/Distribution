package typings
package reactDashDndLib.libCjsInterfacesHooksApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragSourceHookSpec[DragObject, CollectedProps] extends js.Object {
  /**
    * When the dragging starts, beginDrag is called. You must return a plain JavaScript object describing the
    * data being dragged. What you return is the only information available to the drop targets about the drag
    * source so it's important to pick the minimal data they need to know. You may be tempted to put a reference
    * to the component into it, but you should try very hard to avoid doing this because it couples the drag
    * sources and drop targets. It's a good idea to return something like { id: props.id } from this method.
    */
  var begin: js.UndefOr[
    js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragSourceMonitor, 
      DragObject
    ]
  ] = js.undefined
  /**
    * Optional.
    * Use it to specify whether the dragging is currently allowed. If you want to always allow it, just omit this method.
    * Specifying it is handy if you'd like to disable dragging based on some predicate over props. Note: You may not call
    * monitor.canDrag() inside this method.
    */
  var canDrag: js.UndefOr[
    js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragSourceMonitor, 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * A function to collect rendering properties
    */
  var collect: js.UndefOr[
    js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragSourceMonitor, 
      CollectedProps
    ]
  ] = js.undefined
  /**
    * Optional.
    * When the dragging stops, endDrag is called. For every beginDrag call, a corresponding endDrag call is guaranteed.
    * You may call monitor.didDrop() to check whether or not the drop was handled by a compatible drop target. If it was handled,
    * and the drop target specified a drop result by returning a plain object from its drop() method, it will be available as
    * monitor.getDropResult(). This method is a good place to fire a Flux action. Note: If the component is unmounted while dragging,
    * component parameter is set to be null.
    */
  var end: js.UndefOr[
    js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragSourceMonitor, 
      scala.Unit
    ]
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
  var isDragging: js.UndefOr[
    js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragSourceMonitor, 
      scala.Boolean
    ]
  ] = js.undefined
  var options: js.UndefOr[reactDashDndLib.libCjsInterfacesOptionsMod.DragSourceOptions] = js.undefined
  var preview: js.UndefOr[
    reactLib.reactMod.ReactNs.Ref[_] | reactLib.Element | (js.Promise[reactLib.reactMod.ReactNs.Ref[_] | reactLib.Element])
  ] = js.undefined
  var previewOptions: js.UndefOr[reactDashDndLib.libCjsInterfacesOptionsMod.DragPreviewOptions] = js.undefined
  var ref: reactLib.reactMod.ReactNs.RefObject[_]
  var `type`: dndDashCoreLib.libCjsInterfacesMod.SourceType
}

object DragSourceHookSpec {
  @scala.inline
  def apply[DragObject, CollectedProps](
    ref: reactLib.reactMod.ReactNs.RefObject[_],
    `type`: dndDashCoreLib.libCjsInterfacesMod.SourceType,
    begin: js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragSourceMonitor, 
      DragObject
    ] = null,
    canDrag: js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragSourceMonitor, 
      scala.Boolean
    ] = null,
    collect: js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragSourceMonitor, 
      CollectedProps
    ] = null,
    end: js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragSourceMonitor, 
      scala.Unit
    ] = null,
    isDragging: js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragSourceMonitor, 
      scala.Boolean
    ] = null,
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DragSourceOptions = null,
    preview: reactLib.reactMod.ReactNs.Ref[_] | reactLib.Element | (js.Promise[reactLib.reactMod.ReactNs.Ref[_] | reactLib.Element]) = null,
    previewOptions: reactDashDndLib.libCjsInterfacesOptionsMod.DragPreviewOptions = null
  ): DragSourceHookSpec[DragObject, CollectedProps] = {
    val __obj = js.Dynamic.literal(ref = ref)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (canDrag != null) __obj.updateDynamic("canDrag")(canDrag)
    if (collect != null) __obj.updateDynamic("collect")(collect)
    if (end != null) __obj.updateDynamic("end")(end)
    if (isDragging != null) __obj.updateDynamic("isDragging")(isDragging)
    if (options != null) __obj.updateDynamic("options")(options)
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (previewOptions != null) __obj.updateDynamic("previewOptions")(previewOptions)
    __obj.asInstanceOf[DragSourceHookSpec[DragObject, CollectedProps]]
  }
}

