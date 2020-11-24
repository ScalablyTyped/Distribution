package typings.simplecrawler.queueMod

import typings.simplecrawler.anon.ActualDataSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueItem extends js.Object {
  
  var depth: Double = js.native
  
  var fetched: Boolean = js.native
  
  var host: String = js.native
  
  var id: Double = js.native
  
  var path: String = js.native
  
  var port: Double = js.native
  
  var protocol: String = js.native
  
  var referrer: String = js.native
  
  var stateData: ActualDataSize = js.native
  
  var status: QueueItemStatus = js.native
  
  var uriPath: String = js.native
  
  var url: String = js.native
}
object QueueItem {
  
  @scala.inline
  def apply(
    depth: Double,
    fetched: Boolean,
    host: String,
    id: Double,
    path: String,
    port: Double,
    protocol: String,
    referrer: String,
    stateData: ActualDataSize,
    status: QueueItemStatus,
    uriPath: String,
    url: String
  ): QueueItem = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], fetched = fetched.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], stateData = stateData.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uriPath = uriPath.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueItem]
  }
  
  @scala.inline
  implicit class QueueItemOps[Self <: QueueItem] (val x: Self) extends AnyVal {
    
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetched(value: Boolean): Self = this.set("fetched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateData(value: ActualDataSize): Self = this.set("stateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: QueueItemStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriPath(value: String): Self = this.set("uriPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
