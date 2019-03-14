package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCjsInterfacesClassApiMod {
  type ConnectDragPreview = DragElementWrapper[reactDashDndLib.libCjsInterfacesOptionsMod.DragPreviewOptions]
  type ConnectDragSource = DragElementWrapper[reactDashDndLib.libCjsInterfacesOptionsMod.DragSourceOptions]
  type ConnectDropTarget = js.Function1[
    /* elementOrNode */ ConnectedElement, 
    reactLib.reactMod.ReactNs.ReactElement[js.Any]
  ]
  type ConnectedElement = reactLib.reactMod.ReactNs.ReactElement[js.Any] | stdLib.Element | scala.Null
  type DragElementWrapper[Options] = js.Function2[
    /* elementOrNode */ ConnectedElement, 
    /* options */ js.UndefOr[Options], 
    reactLib.reactMod.ReactNs.ReactElement[js.Any]
  ]
  type DragLayerCollector[TargetProps, CollectedProps] = js.Function2[
    /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragLayerMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  type DragSourceCollector[CollectedProps] = js.Function2[
    /* connect */ DragSourceConnector, 
    /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragSourceMonitor, 
    CollectedProps
  ]
  type DropTargetCollector[CollectedProps] = js.Function2[
    /* connect */ DropTargetConnector, 
    /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DropTargetMonitor, 
    CollectedProps
  ]
}
