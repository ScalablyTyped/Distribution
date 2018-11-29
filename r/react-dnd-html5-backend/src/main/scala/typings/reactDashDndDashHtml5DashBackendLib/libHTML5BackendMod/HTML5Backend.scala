package typings
package reactDashDndDashHtml5DashBackendLib.libHTML5BackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTML5Backend
  extends dndDashCoreLib.libInterfacesMod.Backend {
  var actions: js.Any = js.native
  var addEventListeners: js.Any = js.native
  var altKeyPressed: js.Any = js.native
  var asyncEndDragFrameId: js.Any = js.native
  var beginDragNativeItem: js.Any = js.native
  var clearCurrentDragSourceNode: js.Any = js.native
  var context: js.Any = js.native
  var currentDragSourceNode: js.Any = js.native
  var currentNativeHandle: js.Any = js.native
  var currentNativeSource: js.Any = js.native
  var dragEnterTargetIds: js.Any = js.native
  var dragOverTargetIds: js.Any = js.native
  var dragStartSourceIds: js.Any = js.native
  var dropTargetIds: js.Any = js.native
  var endDragIfSourceWasRemovedFromDOM: js.Any = js.native
  var endDragNativeItem: js.Any = js.native
  var enterLeaveCounter: js.Any = js.native
  var getCurrentDropEffect: js.Any = js.native
  var getCurrentSourceNodeOptions: js.Any = js.native
  var getCurrentSourcePreviewNodeOptions: js.Any = js.native
  var getSourceClientOffset: js.Any = js.native
  var handleDragEnter: js.Any = js.native
  var handleDragOver: js.Any = js.native
  var handleDragStart: js.Any = js.native
  var handleDrop: js.Any = js.native
  var handleSelectStart: js.Any = js.native
  var handleTopDragEndCapture: js.Any = js.native
  var handleTopDragEnter: js.Any = js.native
  var handleTopDragEnterCapture: js.Any = js.native
  var handleTopDragLeaveCapture: js.Any = js.native
  var handleTopDragOver: js.Any = js.native
  var handleTopDragOverCapture: js.Any = js.native
  var handleTopDragStart: js.Any = js.native
  var handleTopDragStartCapture: js.Any = js.native
  var handleTopDrop: js.Any = js.native
  var handleTopDropCapture: js.Any = js.native
  var isDraggingNativeItem: js.Any = js.native
  var isNodeInDocument: js.Any = js.native
  var monitor: js.Any = js.native
  var mouseMoveTimeoutTimer: js.Any = js.native
  var registry: js.Any = js.native
  var removeEventListeners: js.Any = js.native
  var setCurrentDragSourceNode: js.Any = js.native
  var sourceNodeOptions: js.Any = js.native
  var sourceNodes: js.Any = js.native
  var sourcePreviewNodeOptions: js.Any = js.native
  var sourcePreviewNodes: js.Any = js.native
  val window: js.UndefOr[reactDashDndDashHtml5DashBackendLib.libHTML5BackendMod.Global.Window] = js.native
  def connectDragPreview(sourceId: java.lang.String, node: js.Any, options: js.Any): js.Function0[scala.Unit] = js.native
  def connectDragSource(sourceId: java.lang.String, node: js.Any, options: js.Any): js.Function0[scala.Unit] = js.native
  def connectDropTarget(targetId: java.lang.String, node: js.Any): js.Function0[scala.Unit] = js.native
}

