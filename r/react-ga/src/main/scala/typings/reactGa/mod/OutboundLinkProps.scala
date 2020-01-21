package typings.reactGa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundLinkProps extends js.Object {
  var eventLabel: String
  var onClick: js.UndefOr[js.Function] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var to: String
  var trackerNames: js.UndefOr[TrackerNames] = js.undefined
}

object OutboundLinkProps {
  @scala.inline
  def apply(
    eventLabel: String,
    to: String,
    onClick: js.Function = null,
    target: String = null,
    trackerNames: TrackerNames = null
  ): OutboundLinkProps = {
    val __obj = js.Dynamic.literal(eventLabel = eventLabel.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (trackerNames != null) __obj.updateDynamic("trackerNames")(trackerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundLinkProps]
  }
}

