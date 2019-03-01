package typings
package atPulumiAwsLib.mqGetBrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBrokerArgs extends js.Object {
  /**
    * The unique id of the mq broker.
    */
  val brokerId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unique name of the mq broker.
    */
  val brokerName: js.UndefOr[java.lang.String] = js.undefined
  val logs: js.UndefOr[atPulumiAwsLib.Anon_Audit] = js.undefined
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetBrokerArgs {
  @scala.inline
  def apply(
    brokerId: java.lang.String = null,
    brokerName: java.lang.String = null,
    logs: atPulumiAwsLib.Anon_Audit = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetBrokerArgs = {
    val __obj = js.Dynamic.literal()
    if (brokerId != null) __obj.updateDynamic("brokerId")(brokerId)
    if (brokerName != null) __obj.updateDynamic("brokerName")(brokerName)
    if (logs != null) __obj.updateDynamic("logs")(logs)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetBrokerArgs]
  }
}

