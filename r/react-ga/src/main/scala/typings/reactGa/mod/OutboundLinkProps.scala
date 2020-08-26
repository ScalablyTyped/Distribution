package typings.reactGa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutboundLinkProps extends js.Object {
  var eventLabel: String = js.native
  var onClick: js.UndefOr[js.Function] = js.native
  var target: js.UndefOr[String] = js.native
  var to: String = js.native
  var trackerNames: js.UndefOr[TrackerNames] = js.native
}

object OutboundLinkProps {
  @scala.inline
  def apply(eventLabel: String, to: String): OutboundLinkProps = {
    val __obj = js.Dynamic.literal(eventLabel = eventLabel.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundLinkProps]
  }
  @scala.inline
  implicit class OutboundLinkPropsOps[Self <: OutboundLinkProps] (val x: Self) extends AnyVal {
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
    def setEventLabel(value: String): Self = this.set("eventLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(value: js.Function): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTrackerNamesVarargs(value: String*): Self = this.set("trackerNames", js.Array(value :_*))
    @scala.inline
    def setTrackerNames(value: TrackerNames): Self = this.set("trackerNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackerNames: Self = this.set("trackerNames", js.undefined)
  }
  
}

