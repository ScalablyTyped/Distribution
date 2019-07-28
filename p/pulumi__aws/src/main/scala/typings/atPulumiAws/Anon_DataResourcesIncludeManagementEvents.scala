package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataResourcesIncludeManagementEvents extends js.Object {
  var dataResources: js.UndefOr[Input[js.Array[Input[Anon_TypeValuesArray]]]] = js.undefined
  var includeManagementEvents: js.UndefOr[Input[Boolean]] = js.undefined
  var readWriteType: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DataResourcesIncludeManagementEvents {
  @scala.inline
  def apply(
    dataResources: Input[js.Array[Input[Anon_TypeValuesArray]]] = null,
    includeManagementEvents: Input[Boolean] = null,
    readWriteType: Input[String] = null
  ): Anon_DataResourcesIncludeManagementEvents = {
    val __obj = js.Dynamic.literal()
    if (dataResources != null) __obj.updateDynamic("dataResources")(dataResources.asInstanceOf[js.Any])
    if (includeManagementEvents != null) __obj.updateDynamic("includeManagementEvents")(includeManagementEvents.asInstanceOf[js.Any])
    if (readWriteType != null) __obj.updateDynamic("readWriteType")(readWriteType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataResourcesIncludeManagementEvents]
  }
}

