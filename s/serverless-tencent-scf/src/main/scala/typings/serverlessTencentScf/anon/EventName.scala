package typings.serverlessTencentScf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventName extends js.Object {
  var eventName: String
  var eventQueue: String
  var eventSource: String
  var eventTime: Double
  var eventVersion: String
  var reqid: Double
  var requestParameters: RequestHeaders
  var reservedInfo: String
}

object EventName {
  @scala.inline
  def apply(
    eventName: String,
    eventQueue: String,
    eventSource: String,
    eventTime: Double,
    eventVersion: String,
    reqid: Double,
    requestParameters: RequestHeaders,
    reservedInfo: String
  ): EventName = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], eventQueue = eventQueue.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], reqid = reqid.asInstanceOf[js.Any], requestParameters = requestParameters.asInstanceOf[js.Any], reservedInfo = reservedInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventName]
  }
}

