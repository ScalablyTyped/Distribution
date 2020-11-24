package typings.requestStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BytesDelta extends js.Object {
  
  /**
    * Total bytes received
    */
  var bytes: Double = js.native
  
  /**
    * Bytes received since previous call to `.progress()`
    */
  var bytesDelta: Double = js.native
  
  /**
    * If the request contains a Content-Size header
    */
  var bytesLeft: Double = js.native
  
  /**
    * Bytes per second calculated since previous call to `.progress()`
    */
  var speed: Double = js.native
  
  /**
    * If the request contains a Content-Size header
    */
  var timeLeft: Double = js.native
}
object BytesDelta {
  
  @scala.inline
  def apply(bytes: Double, bytesDelta: Double, bytesLeft: Double, speed: Double, timeLeft: Double): BytesDelta = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], bytesDelta = bytesDelta.asInstanceOf[js.Any], bytesLeft = bytesLeft.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesDelta]
  }
  
  @scala.inline
  implicit class BytesDeltaOps[Self <: BytesDelta] (val x: Self) extends AnyVal {
    
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
    def setBytesLeft(value: Double): Self = this.set("bytesLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLeft(value: Double): Self = this.set("timeLeft", value.asInstanceOf[js.Any])
  }
}
