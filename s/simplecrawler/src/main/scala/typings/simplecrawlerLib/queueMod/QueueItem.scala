package typings
package simplecrawlerLib.queueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueItem extends js.Object {
  var depth: scala.Double
  var fetched: scala.Boolean
  var host: java.lang.String
  var id: scala.Double
  var path: java.lang.String
  var port: scala.Double
  var protocol: java.lang.String
  var referrer: java.lang.String
  var stateData: simplecrawlerLib.Anon_ActualDataSize
  var status: QueueItemStatus
  var uriPath: java.lang.String
  var url: java.lang.String
}

object QueueItem {
  @scala.inline
  def apply(
    depth: scala.Double,
    fetched: scala.Boolean,
    host: java.lang.String,
    id: scala.Double,
    path: java.lang.String,
    port: scala.Double,
    protocol: java.lang.String,
    referrer: java.lang.String,
    stateData: simplecrawlerLib.Anon_ActualDataSize,
    status: QueueItemStatus,
    uriPath: java.lang.String,
    url: java.lang.String
  ): QueueItem = {
    val __obj = js.Dynamic.literal(depth = depth, fetched = fetched, host = host, id = id, path = path, port = port, protocol = protocol, referrer = referrer, stateData = stateData, status = status, uriPath = uriPath, url = url)
  
    __obj.asInstanceOf[QueueItem]
  }
}

