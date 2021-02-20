package typings.speedtestNet.mod

import typings.speedtestNet.anon.Id
import typings.speedtestNet.speedtestNetStrings.result
import typings.std.Date
import org.scalablytyped.runtime.StObject
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
  implicit class ResultEventMutableBuilder[Self <: ResultEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownload(value: DownloadUploadData): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterface(value: InterfaceData): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsp(value: String): Self = StObject.set(x, "isp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketLoss(value: Double): Self = StObject.set(x, "packetLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPing(value: PingData): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Id): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: ServerData): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: result): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload(value: DownloadUploadData): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
  }
}
