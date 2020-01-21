package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait opensshStreamLocalForwardGlobalRequest extends _GlobalRequest {
  var socketPath: String
}

object opensshStreamLocalForwardGlobalRequest {
  @scala.inline
  def apply(socketPath: String): opensshStreamLocalForwardGlobalRequest = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[opensshStreamLocalForwardGlobalRequest]
  }
}

