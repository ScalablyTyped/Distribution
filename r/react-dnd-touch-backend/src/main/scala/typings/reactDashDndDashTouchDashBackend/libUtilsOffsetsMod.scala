package typings.reactDashDndDashTouchDashBackend

import typings.dndDashCore.libInterfacesMod.XYCoord
import typings.std.MouseEvent
import typings.std.Touch
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-touch-backend/lib/utils/offsets", JSImport.Namespace)
@js.native
object libUtilsOffsetsMod extends js.Object {
  def getEventClientOffset(e: MouseEvent): js.UndefOr[XYCoord] = js.native
  def getEventClientOffset(e: Touch): js.UndefOr[XYCoord] = js.native
  def getEventClientOffset(e: TouchEvent): js.UndefOr[XYCoord] = js.native
  def getEventClientTouchOffset(e: TouchEvent): js.UndefOr[XYCoord] = js.native
  def getNodeClientOffset(node: js.Any): js.UndefOr[XYCoord] = js.native
}

