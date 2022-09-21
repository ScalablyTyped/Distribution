package typings.speedtestNet.mod

import typings.speedtestNet.anon.Id
import typings.speedtestNet.speedtestNetStrings.result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultEvent
  extends StObject
     with BaseEvent
     with SpeedTestEvent {
  
  var download: DownloadUploadData
  
  var interface: InterfaceData
  
  var isp: String
  
  var packetLoss: Double
  
  var ping: PingData
  
  var result: Id
  
  var server: ServerData
  
  var timestamp: js.Date
  
  @JSName("type")
  var type_ResultEvent: result
  
  var upload: DownloadUploadData
}
object ResultEvent {
  
  inline def apply(
    download: DownloadUploadData,
    interface: InterfaceData,
    isp: String,
    packetLoss: Double,
    ping: PingData,
    result: Id,
    server: ServerData,
    timestamp: js.Date,
    upload: DownloadUploadData
  ): ResultEvent = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], interface = interface.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], packetLoss = packetLoss.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("result")
    __obj.asInstanceOf[ResultEvent]
  }
  
  extension [Self <: ResultEvent](x: Self) {
    
    inline def setDownload(value: DownloadUploadData): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setInterface(value: InterfaceData): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    
    inline def setIsp(value: String): Self = StObject.set(x, "isp", value.asInstanceOf[js.Any])
    
    inline def setPacketLoss(value: Double): Self = StObject.set(x, "packetLoss", value.asInstanceOf[js.Any])
    
    inline def setPing(value: PingData): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Id): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setServer(value: ServerData): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: result): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpload(value: DownloadUploadData): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
  }
}
