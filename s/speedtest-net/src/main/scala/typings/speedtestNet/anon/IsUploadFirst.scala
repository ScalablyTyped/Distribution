package typings.speedtestNet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsUploadFirst extends js.Object {
  
  var isUploadFirst: Boolean = js.native
  
  var packetSizeBytes: Double = js.native
  
  var testDurationSeconds: Double = js.native
  
  var threadCount: Double = js.native
}
object IsUploadFirst {
  
  @scala.inline
  def apply(isUploadFirst: Boolean, packetSizeBytes: Double, testDurationSeconds: Double, threadCount: Double): IsUploadFirst = {
    val __obj = js.Dynamic.literal(isUploadFirst = isUploadFirst.asInstanceOf[js.Any], packetSizeBytes = packetSizeBytes.asInstanceOf[js.Any], testDurationSeconds = testDurationSeconds.asInstanceOf[js.Any], threadCount = threadCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsUploadFirst]
  }
  
  @scala.inline
  implicit class IsUploadFirstOps[Self <: IsUploadFirst] (val x: Self) extends AnyVal {
    
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
    def setIsUploadFirst(value: Boolean): Self = this.set("isUploadFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketSizeBytes(value: Double): Self = this.set("packetSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestDurationSeconds(value: Double): Self = this.set("testDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadCount(value: Double): Self = this.set("threadCount", value.asInstanceOf[js.Any])
  }
}
