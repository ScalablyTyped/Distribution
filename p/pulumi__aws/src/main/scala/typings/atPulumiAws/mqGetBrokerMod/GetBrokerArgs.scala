package typings.atPulumiAws.mqGetBrokerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.mq.GetBrokerLogs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBrokerArgs extends js.Object {
  /**
    * The unique id of the mq broker.
    */
  val brokerId: js.UndefOr[String] = js.undefined
  /**
    * The unique name of the mq broker.
    */
  val brokerName: js.UndefOr[String] = js.undefined
  val logs: js.UndefOr[GetBrokerLogs] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetBrokerArgs {
  @scala.inline
  def apply(
    brokerId: String = null,
    brokerName: String = null,
    logs: GetBrokerLogs = null,
    tags: StringDictionary[js.Any] = null
  ): GetBrokerArgs = {
    val __obj = js.Dynamic.literal()
    if (brokerId != null) __obj.updateDynamic("brokerId")(brokerId)
    if (brokerName != null) __obj.updateDynamic("brokerName")(brokerName)
    if (logs != null) __obj.updateDynamic("logs")(logs)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetBrokerArgs]
  }
}

