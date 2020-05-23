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
    id: js.UndefOr[Double] = js.undefined,
    maxPacketLifeTime: js.UndefOr[Double] = js.undefined,
    maxRetransmits: js.UndefOr[Double] = js.undefined,
    negotiated: js.UndefOr[scala.Boolean] = js.undefined,
    ordered: js.UndefOr[scala.Boolean] = js.undefined,
    priority: RTCPriorityType = null,
    protocol: java.lang.String = null
  ): RTCDataChannelInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPacketLifeTime)) __obj.updateDynamic("maxPacketLifeTime")(maxPacketLifeTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetransmits)) __obj.updateDynamic("maxRetransmits")(maxRetransmits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(negotiated)) __obj.updateDynamic("negotiated")(negotiated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.get.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelInit]
  }
}

