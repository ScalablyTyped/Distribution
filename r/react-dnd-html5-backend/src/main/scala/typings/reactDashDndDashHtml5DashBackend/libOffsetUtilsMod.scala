package typings.reactDashDndDashHtml5DashBackend

import typings.dndDashCore.libInterfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-html5-backend/lib/OffsetUtils", JSImport.Namespace)
@js.native
object libOffsetUtilsMod extends js.Object {
  def getDragPreviewOffset(
    sourceNode: js.Any,
    dragPreview: js.Any,
    clientOffset: XYCoord,
    anchorPoint: js.Any,
    offsetPoint: js.Any
  ): Anon_X = js.native
  def getEventClientOffset(e: js.Any): Anon_X = js.native
  def getNodeClientOffset(node: js.Any): Anon_X | Null = js.native
}

