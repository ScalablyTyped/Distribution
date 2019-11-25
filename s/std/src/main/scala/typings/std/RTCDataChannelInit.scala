package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDataChannelInit extends js.Object {
  var id: js.UndefOr[Double] = js.undefined
  var maxPacketLifeTime: js.UndefOr[Double] = js.undefined
  var maxRetransmits: js.UndefOr[Double] = js.undefined
  var negotiated: js.UndefOr[scala.Boolean] = js.undefined
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
  var priority: js.UndefOr[RTCPriorityType] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
}

object RTCDataChannelInit {
  @scala.inline
  def apply(
    id: Int | Double = null,
    maxPacketLifeTime: Int | Double = null,
    maxRetransmits: Int | Double = null,
    negotiated: js.UndefOr[scala.Boolean] = js.undefined,
    ordered: js.UndefOr[scala.Boolean] = js.undefined,
    priority: RTCPriorityType = null,
    protocol: java.lang.String = null
  ): RTCDataChannelInit = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxPacketLifeTime != null) __obj.updateDynamic("maxPacketLifeTime")(maxPacketLifeTime.asInstanceOf[js.Any])
    if (maxRetransmits != null) __obj.updateDynamic("maxRetransmits")(maxRetransmits.asInstanceOf[js.Any])
    if (!js.isUndefined(negotiated)) __obj.updateDynamic("negotiated")(negotiated.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelInit]
  }
}

