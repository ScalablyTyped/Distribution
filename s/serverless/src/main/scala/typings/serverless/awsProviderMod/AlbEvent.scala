package typings.serverless.awsProviderMod

import typings.serverless.anon.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlbEvent extends js.Object {
  var conditions: Host
  var listenerArn: String
  var priority: Double | String
}

object AlbEvent {
  @scala.inline
  def apply(conditions: Host, listenerArn: String, priority: Double | String): AlbEvent = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], listenerArn = listenerArn.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbEvent]
  }
}

