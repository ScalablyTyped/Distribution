package typings.simplecrawler.queueMod

import typings.simplecrawler.AnonActualDataSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueItem extends js.Object {
  var depth: Double
  var fetched: Boolean
  var host: String
  var id: Double
  var path: String
  var port: Double
  var protocol: String
  var referrer: String
  var stateData: AnonActualDataSize
  var status: QueueItemStatus
  var uriPath: String
  var url: String
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
    stateData: AnonActualDataSize,
    status: QueueItemStatus,
    uriPath: String,
    url: String
  ): QueueItem = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], fetched = fetched.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], stateData = stateData.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uriPath = uriPath.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueueItem]
  }
}

