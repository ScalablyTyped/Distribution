package typings.serverless.awsProviderMod

import typings.serverless.anon.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlbEvent extends js.Object {
  var conditions: Host = js.native
  var listenerArn: String = js.native
  var priority: Double | String = js.native
}

object AlbEvent {
  @scala.inline
  def apply(conditions: Host, listenerArn: String, priority: Double | String): AlbEvent = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], listenerArn = listenerArn.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbEvent]
  }
  @scala.inline
  implicit class AlbEventOps[Self <: AlbEvent] (val x: Self) extends AnyVal {
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
    def setConditions(value: Host): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setListenerArn(value: String): Self = this.set("listenerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double | String): Self = this.set("priority", value.asInstanceOf[js.Any])
  }
  
}

