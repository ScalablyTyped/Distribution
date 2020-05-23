package typings.pulumiAws.outputMod.cloudtrail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrailEventSelector extends js.Object {
  /**
    * Specifies logging data events. Fields documented below.
    */
  var dataResources: js.UndefOr[js.Array[TrailEventSelectorDataResource]] = js.native
  /**
    * Specify if you want your event selector to include management events for your trail.
    */
  var includeManagementEvents: js.UndefOr[Boolean] = js.native
  /**
    * Specify if you want your trail to log read-only events, write-only events, or all. By default, the value is All. You can specify only the following value: "ReadOnly", "WriteOnly", "All". Defaults to `All`.
    */
  var readWriteType: js.UndefOr[String] = js.native
}

object TrailEventSelector {
  @scala.inline
  def apply(
    dataResources: js.Array[TrailEventSelectorDataResource] = null,
    includeManagementEvents: js.UndefOr[Boolean] = js.undefined,
    readWriteType: String = null
  ): TrailEventSelector = {
    val __obj = js.Dynamic.literal()
    if (dataResources != null) __obj.updateDynamic("dataResources")(dataResources.asInstanceOf[js.Any])
    if (!js.isUndefined(includeManagementEvents)) __obj.updateDynamic("includeManagementEvents")(includeManagementEvents.get.asInstanceOf[js.Any])
    if (readWriteType != null) __obj.updateDynamic("readWriteType")(readWriteType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrailEventSelector]
  }
}

