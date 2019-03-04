package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardedX11 extends js.Object {
  var originAddr: java.lang.String
  var originPort: scala.Double
}

object ForwardedX11 {
  @scala.inline
  def apply(originAddr: java.lang.String, originPort: scala.Double): ForwardedX11 = {
    val __obj = js.Dynamic.literal(originAddr = originAddr, originPort = originPort)
  
    __obj.asInstanceOf[ForwardedX11]
  }
}

