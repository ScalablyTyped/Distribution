package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardedX11 extends js.Object {
  var originAddr: String
  var originPort: Double
}

object ForwardedX11 {
  @scala.inline
  def apply(originAddr: String, originPort: Double): ForwardedX11 = {
    val __obj = js.Dynamic.literal(originAddr = originAddr, originPort = originPort)
  
    __obj.asInstanceOf[ForwardedX11]
  }
}

