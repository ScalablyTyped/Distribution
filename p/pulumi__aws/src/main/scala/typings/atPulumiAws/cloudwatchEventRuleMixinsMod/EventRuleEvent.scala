package typings.atPulumiAws.cloudwatchEventRuleMixinsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRuleEvent extends js.Object {
  var account: String
  var detail: Record[String, _]
  var `detail-type`: String
  var id: String
  var region: String
  var resources: js.Array[String]
  var source: String
  var time: String
  var version: String
}

object EventRuleEvent {
  @scala.inline
  def apply(
    account: String,
    detail: Record[String, _],
    `detail-type`: String,
    id: String,
    region: String,
    resources: js.Array[String],
    source: String,
    time: String,
    version: String
  ): EventRuleEvent = {
    val __obj = js.Dynamic.literal(account = account, detail = detail, id = id, region = region, resources = resources, source = source, time = time, version = version)
    __obj.updateDynamic("detail-type")(`detail-type`)
    __obj.asInstanceOf[EventRuleEvent]
  }
}

