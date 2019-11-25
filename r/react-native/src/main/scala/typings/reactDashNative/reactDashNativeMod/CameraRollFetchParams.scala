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
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (assetType != null) __obj.updateDynamic("assetType")(assetType.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (groupTypes != null) __obj.updateDynamic("groupTypes")(groupTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollFetchParams]
  }
}

