package typings.reactDndHtml5Backend

import typings.dndCore.interfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-html5-backend/lib/OffsetUtils", JSImport.Namespace)
@js.native
object offsetUtilsMod extends js.Object {
  def getDragPreviewOffset(
    sourceNode: js.Any,
    dragPreview: js.Any,
    clientOffset: XYCoord,
    anchorPoint: js.Any,
    offsetPoint: js.Any
  ): AnonX = js.native
  def getEventClientOffset(e: js.Any): AnonX = js.native
  def getNodeClientOffset(node: js.Any): AnonX | Null = js.native
}

