package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterfacesConnectorsMod {
  type ConnectDragPreview = DragElementWrapper[reactDashDndLib.libInterfacesOptionsMod.DragPreviewOptions]
  type ConnectDragSource = DragElementWrapper[reactDashDndLib.libInterfacesOptionsMod.DragSourceOptions]
  type ConnectDropTarget = DragElementWrapper[js.Any]
  type ConnectableElement = reactLib.reactMod.RefObject[js.Any] | reactLib.reactMod.ReactElement | stdLib.Element | scala.Null
  type DragElementWrapper[Options] = js.Function2[
    /* elementOrNode */ ConnectableElement, 
    /* options */ js.UndefOr[Options], 
    reactLib.reactMod.ReactElement | scala.Null
  ]
}
