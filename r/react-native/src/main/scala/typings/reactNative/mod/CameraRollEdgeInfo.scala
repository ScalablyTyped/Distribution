package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraRollEdgeInfo extends js.Object {
  var node: CameraRollNodeInfo = js.native
}

object CameraRollEdgeInfo {
  @scala.inline
  def apply(node: CameraRollNodeInfo): CameraRollEdgeInfo = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollEdgeInfo]
  }
  @scala.inline
  implicit class CameraRollEdgeInfoOps[Self <: CameraRollEdgeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNode(value: CameraRollNodeInfo): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

