package typings.atPulumiAws.typesOutputMod.cloudtrail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrailEventSelector extends js.Object {
  /**
    * Specifies logging data events. Fields documented below.
    */
  var dataResources: js.UndefOr[js.Array[TrailEventSelectorDataResource]] = js.undefined
  /**
    * Specify if you want your event selector to include management events for your trail.
    */
  var includeManagementEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify if you want your trail to log read-only events, write-only events, or all. By default, the value is All. You can specify only the following value: "ReadOnly", "WriteOnly", "All". Defaults to `All`.
    */
  var readWriteType: js.UndefOr[String] = js.undefined
}

object TrailEventSelector {
  @scala.inline
  def apply(
    dataResources: js.Array[TrailEventSelectorDataResource] = null,
    includeManagementEvents: js.UndefOr[Boolean] = js.undefined,
    readWriteType: String = null
  ): TrailEventSelector = {
    val __obj = js.Dynamic.literal()
    if (dataResources != null) __obj.updateDynamic("dataResources")(dataResources)
    if (!js.isUndefined(includeManagementEvents)) __obj.updateDynamic("includeManagementEvents")(includeManagementEvents)
    if (readWriteType != null) __obj.updateDynamic("readWriteType")(readWriteType)
    __obj.asInstanceOf[TrailEventSelector]
  }
}

