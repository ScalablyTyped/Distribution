package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataResourcesIncludeManagementEvents extends js.Object {
  var dataResources: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_TypeValues]]]
  ] = js.undefined
  var includeManagementEvents: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var readWriteType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_DataResourcesIncludeManagementEvents {
  @scala.inline
  def apply(
    dataResources: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_TypeValues]]] = null,
    includeManagementEvents: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    readWriteType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_DataResourcesIncludeManagementEvents = {
    val __obj = js.Dynamic.literal()
    if (dataResources != null) __obj.updateDynamic("dataResources")(dataResources.asInstanceOf[js.Any])
    if (includeManagementEvents != null) __obj.updateDynamic("includeManagementEvents")(includeManagementEvents.asInstanceOf[js.Any])
    if (readWriteType != null) __obj.updateDynamic("readWriteType")(readWriteType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataResourcesIncludeManagementEvents]
  }
}

