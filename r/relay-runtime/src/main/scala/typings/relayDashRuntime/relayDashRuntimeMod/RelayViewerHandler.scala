package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.relayDashRuntimeStrings.Viewer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./handlers/viewer/RelayViewerHandler
trait RelayViewerHandler extends js.Object {
  val VIEWER_ID: DataID
  val VIEWER_TYPE: Viewer
}

object RelayViewerHandler {
  @scala.inline
  def apply(VIEWER_ID: DataID, VIEWER_TYPE: Viewer): RelayViewerHandler = {
    val __obj = js.Dynamic.literal(VIEWER_ID = VIEWER_ID, VIEWER_TYPE = VIEWER_TYPE)
  
    __obj.asInstanceOf[RelayViewerHandler]
  }
}

