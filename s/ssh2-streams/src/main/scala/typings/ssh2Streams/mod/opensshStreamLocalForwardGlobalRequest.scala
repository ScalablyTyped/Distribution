package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait opensshStreamLocalForwardGlobalRequest extends _GlobalRequest {
  var socketPath: String = js.native
}

object opensshStreamLocalForwardGlobalRequest {
  @scala.inline
  def apply(socketPath: String): opensshStreamLocalForwardGlobalRequest = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[opensshStreamLocalForwardGlobalRequest]
  }
  @scala.inline
  implicit class opensshStreamLocalForwardGlobalRequestOps[Self <: opensshStreamLocalForwardGlobalRequest] (val x: Self) extends AnyVal {
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
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
  }
  
}

