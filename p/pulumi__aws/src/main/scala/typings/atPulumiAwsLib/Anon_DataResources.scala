package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataResources extends js.Object {
  var dataResources: js.UndefOr[js.Array[Anon_TypeValues]] = js.undefined
  var includeManagementEvents: js.UndefOr[scala.Boolean] = js.undefined
  var readWriteType: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DataResources {
  @scala.inline
  def apply(
    dataResources: js.Array[Anon_TypeValues] = null,
    includeManagementEvents: js.UndefOr[scala.Boolean] = js.undefined,
    readWriteType: java.lang.String = null
  ): Anon_DataResources = {
    val __obj = js.Dynamic.literal()
    if (dataResources != null) __obj.updateDynamic("dataResources")(dataResources)
    if (!js.isUndefined(includeManagementEvents)) __obj.updateDynamic("includeManagementEvents")(includeManagementEvents)
    if (readWriteType != null) __obj.updateDynamic("readWriteType")(readWriteType)
    __obj.asInstanceOf[Anon_DataResources]
  }
}

