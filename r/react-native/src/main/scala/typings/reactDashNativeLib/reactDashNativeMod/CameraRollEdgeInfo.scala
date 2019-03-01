package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraRollEdgeInfo extends js.Object {
  var node: CameraRollNodeInfo
}

object CameraRollEdgeInfo {
  @scala.inline
  def apply(node: CameraRollNodeInfo): CameraRollEdgeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[CameraRollEdgeInfo]
  }
}

