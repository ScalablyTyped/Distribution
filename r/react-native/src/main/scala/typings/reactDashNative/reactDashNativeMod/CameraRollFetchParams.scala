package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraRollFetchParams extends js.Object {
  var after: js.UndefOr[String] = js.undefined
  var assetType: js.UndefOr[CameraRollAssetType] = js.undefined
  var first: Double
  var groupName: js.UndefOr[String] = js.undefined
  var groupTypes: js.UndefOr[CameraRollGroupType] = js.undefined
}

object CameraRollFetchParams {
  @scala.inline
  def apply(
    first: Double,
    after: String = null,
    assetType: CameraRollAssetType = null,
    groupName: String = null,
    groupTypes: CameraRollGroupType = null
  ): CameraRollFetchParams = {
    val __obj = js.Dynamic.literal(first = first)
    if (after != null) __obj.updateDynamic("after")(after)
    if (assetType != null) __obj.updateDynamic("assetType")(assetType)
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    if (groupTypes != null) __obj.updateDynamic("groupTypes")(groupTypes)
    __obj.asInstanceOf[CameraRollFetchParams]
  }
}

