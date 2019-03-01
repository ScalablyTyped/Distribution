package typings
package atPulumiAwsLib.cloudwatchEventRuleMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRuleEvent extends js.Object {
  var account: java.lang.String
  var detail: stdLib.Record[java.lang.String, _]
  var `detail-type`: java.lang.String
  var id: java.lang.String
  var region: java.lang.String
  var resources: js.Array[java.lang.String]
  var source: java.lang.String
  var time: java.lang.String
  var version: java.lang.String
}

object EventRuleEvent {
  @scala.inline
  def apply(
    account: java.lang.String,
    detail: stdLib.Record[java.lang.String, _],
    `detail-type`: java.lang.String,
    id: java.lang.String,
    region: java.lang.String,
    resources: js.Array[java.lang.String],
    source: java.lang.String,
    time: java.lang.String,
    version: java.lang.String
  ): EventRuleEvent = {
    val __obj = js.Dynamic.literal(`detail-type` = `detail-type`)
    __obj.updateDynamic("account")(account)
    __obj.updateDynamic("detail")(detail)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[EventRuleEvent]
  }
}

