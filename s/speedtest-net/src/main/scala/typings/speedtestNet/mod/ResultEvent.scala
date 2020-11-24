package typings.speedtestNet.mod

import typings.speedtestNet.anon.Id
import typings.speedtestNet.speedtestNetStrings.result
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultEvent
  extends BaseEvent
     with SpeedTestEvent {
  
  var download: DownloadUploadData = js.native
  
  var interface: InterfaceData = js.native
  
  var isp: String = js.native
  
  var packetLoss: Double = js.native
  
  var ping: PingData = js.native
  
  var result: Id = js.native
  
  var server: ServerData = js.native
  
  var timestamp: Date = js.native
  
  @JSName("type")
  var type_ResultEvent: result = js.native
  
  var upload: DownloadUploadData = js.native
}
object ResultEvent {
  
  @scala.inline
  def apply(
    download: DownloadUploadData,
    interface: InterfaceData,
    isp: String,
    packetLoss: Double,
    ping: PingData,
    result: Id,
    server: ServerData,
    timestamp: Date,
    `type`: result,
    upload: DownloadUploadData
  ): ResultEvent = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], interface = interface.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], packetLoss = packetLoss.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultEvent]
  }
  
  @scala.inline
  implicit class ResultEventOps[Self <: ResultEvent] (val x: Self) extends AnyVal {
    
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
    def setDownload(value: DownloadUploadData): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterface(value: InterfaceData): Self = this.set("interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsp(value: String): Self = this.set("isp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketLoss(value: Double): Self = this.set("packetLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPing(value: PingData): Self = this.set("ping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Id): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: ServerData): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: result): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload(value: DownloadUploadData): Self = this.set("upload", value.asInstanceOf[js.Any])
  }
}
