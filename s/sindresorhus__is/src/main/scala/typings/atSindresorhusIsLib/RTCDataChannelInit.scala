package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDataChannelInit extends js.Object {
  var id: js.UndefOr[scala.Double] = js.undefined
  var maxPacketLifeTime: js.UndefOr[scala.Double] = js.undefined
  var maxRetransmits: js.UndefOr[scala.Double] = js.undefined
  var negotiated: js.UndefOr[scala.Boolean] = js.undefined
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
  var priority: js.UndefOr[RTCPriorityType] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
}

object RTCDataChannelInit {
  @scala.inline
  def apply(
    id: scala.Int | scala.Double = null,
    maxPacketLifeTime: scala.Int | scala.Double = null,
    maxRetransmits: scala.Int | scala.Double = null,
    negotiated: js.UndefOr[scala.Boolean] = js.undefined,
    ordered: js.UndefOr[scala.Boolean] = js.undefined,
    priority: RTCPriorityType = null,
    protocol: java.lang.String = null
  ): RTCDataChannelInit = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxPacketLifeTime != null) __obj.updateDynamic("maxPacketLifeTime")(maxPacketLifeTime.asInstanceOf[js.Any])
    if (maxRetransmits != null) __obj.updateDynamic("maxRetransmits")(maxRetransmits.asInstanceOf[js.Any])
    if (!js.isUndefined(negotiated)) __obj.updateDynamic("negotiated")(negotiated)
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[RTCDataChannelInit]
  }
}

