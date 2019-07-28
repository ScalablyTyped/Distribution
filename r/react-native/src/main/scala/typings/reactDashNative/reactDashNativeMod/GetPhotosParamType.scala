package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPhotosParamType extends js.Object {
  var after: js.UndefOr[String] = js.undefined
  var assetType: js.UndefOr[CameraRollAssetType] = js.undefined
  var first: Double
  var groupName: js.UndefOr[String] = js.undefined
  var groupTypes: js.UndefOr[CameraRollGroupType] = js.undefined
  var mimeTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object GetPhotosParamType {
  @scala.inline
  def apply(
    first: Double,
    after: String = null,
    assetType: CameraRollAssetType = null,
    groupName: String = null,
    groupTypes: CameraRollGroupType = null,
    mimeTypes: js.Array[String] = null
  ): GetPhotosParamType = {
    val __obj = js.Dynamic.literal(first = first)
    if (after != null) __obj.updateDynamic("after")(after)
    if (assetType != null) __obj.updateDynamic("assetType")(assetType)
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    if (groupTypes != null) __obj.updateDynamic("groupTypes")(groupTypes)
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes)
    __obj.asInstanceOf[GetPhotosParamType]
  }
}

