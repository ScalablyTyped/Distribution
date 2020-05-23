package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollbackConfiguration extends js.Object {
  var MonitoringTimeInMinutes: Double | String
  var RollbackTriggers: js.Array[RollbackTrigger]
}

object RollbackConfiguration {
  @scala.inline
  def apply(MonitoringTimeInMinutes: Double | String, RollbackTriggers: js.Array[RollbackTrigger]): RollbackConfiguration = {
    val __obj = js.Dynamic.literal(MonitoringTimeInMinutes = MonitoringTimeInMinutes.asInstanceOf[js.Any], RollbackTriggers = RollbackTriggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackConfiguration]
  }
}

