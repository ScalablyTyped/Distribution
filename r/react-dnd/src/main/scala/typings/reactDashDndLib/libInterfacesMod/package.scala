package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterfacesMod {
  type ConnectDragPreview = DragElementWrapper[DragPreviewOptions]
  type ConnectDragSource = DragElementWrapper[DragSourceOptions]
  type ConnectDropTarget = js.Function1[
    /* elementOrNode */ reactLib.reactMod.ReactNs.ReactElement[js.Any], 
    reactLib.reactMod.ReactNs.ReactElement[js.Any]
  ]
  type DragElementWrapper[Options] = js.Function2[
    /* elementOrNode */ reactLib.reactMod.ReactNs.ReactElement[js.Any] | reactLib.Element, 
    /* options */ js.UndefOr[Options], 
    reactLib.reactMod.ReactNs.ReactElement[js.Any]
  ]
  type DragLayerCollector[TargetProps, CollectedProps] = js.Function2[/* monitor */ DragLayerMonitor, /* props */ TargetProps, CollectedProps]
  type DragSourceCollector[CollectedProps] = js.Function2[/* connect */ DragSourceConnector, /* monitor */ DragSourceMonitor, CollectedProps]
  type DropTargetCollector[CollectedProps] = js.Function2[/* connect */ DropTargetConnector, /* monitor */ DropTargetMonitor, CollectedProps]
}
