package typings.atPulumiAws.typesInputMod.cloudtrail

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrailEventSelector extends js.Object {
  /**
    * Specifies logging data events. Fields documented below.
    */
  var dataResources: js.UndefOr[Input[js.Array[Input[TrailEventSelectorDataResource]]]] = js.native
  /**
    * Specify if you want your event selector to include management events for your trail.
    */
  var includeManagementEvents: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specify if you want your trail to log read-only events, write-only events, or all. By default, the value is All. You can specify only the following value: "ReadOnly", "WriteOnly", "All". Defaults to `All`.
    */
  var readWriteType: js.UndefOr[Input[String]] = js.native
}

object TrailEventSelector {
  @scala.inline
  def apply(
    dataResources: Input[js.Array[Input[TrailEventSelectorDataResource]]] = null,
    includeManagementEvents: Input[Boolean] = null,
    readWriteType: Input[String] = null
  ): TrailEventSelector = {
    val __obj = js.Dynamic.literal()
    if (dataResources != null) __obj.updateDynamic("dataResources")(dataResources.asInstanceOf[js.Any])
    if (includeManagementEvents != null) __obj.updateDynamic("includeManagementEvents")(includeManagementEvents.asInstanceOf[js.Any])
    if (readWriteType != null) __obj.updateDynamic("readWriteType")(readWriteType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrailEventSelector]
  }
}

