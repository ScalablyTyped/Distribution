package typings.atPulumiAws.cloudwatchEventRuleMixinsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventRuleEvent extends js.Object {
  var account: String = js.native
  var detail: Record[String, _] = js.native
  var `detail-type`: String = js.native
  var id: String = js.native
  var region: String = js.native
  var resources: js.Array[String] = js.native
  var source: String = js.native
  var time: String = js.native
  var version: String = js.native
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
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventRuleEvent]
  }
}

