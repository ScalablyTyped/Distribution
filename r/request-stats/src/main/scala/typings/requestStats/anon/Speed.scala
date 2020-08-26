package typings.requestStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Speed extends js.Object {
  /**
    * Total bytes send back to the client
    */
  var bytes: Double = js.native
  /**
    * Bytes sent back to the client since previous call to `.progress()`
    */
  var bytesDelta: Double = js.native
  /**
    * Bytes per second calculated since previous call to `.progress()`
    */
  var speed: Double = js.native
}

object Speed {
  @scala.inline
  def apply(bytes: Double, bytesDelta: Double, speed: Double): Speed = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], bytesDelta = bytesDelta.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Speed]
  }
  @scala.inline
  implicit class SpeedOps[Self <: Speed] (val x: Self) extends AnyVal {
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
    def setBytes(value: Double): Self = this.set("bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesDelta(value: Double): Self = this.set("bytesDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
  }
  
}

