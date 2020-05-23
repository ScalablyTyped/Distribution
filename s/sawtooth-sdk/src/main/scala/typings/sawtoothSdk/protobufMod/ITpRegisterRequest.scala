package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITpRegisterRequest extends js.Object {
  /** TpRegisterRequest family */
  var family: js.UndefOr[String | Null] = js.undefined
  /** TpRegisterRequest maxOccupancy */
  var maxOccupancy: js.UndefOr[Double | Null] = js.undefined
  /** TpRegisterRequest namespaces */
  var namespaces: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** TpRegisterRequest version */
  var version: js.UndefOr[String | Null] = js.undefined
}

object ITpRegisterRequest {
  @scala.inline
  def apply(
    family: js.UndefOr[Null | String] = js.undefined,
    maxOccupancy: js.UndefOr[Null | Double] = js.undefined,
    namespaces: js.UndefOr[Null | js.Array[String]] = js.undefined,
    version: js.UndefOr[Null | String] = js.undefined
  ): ITpRegisterRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOccupancy)) __obj.updateDynamic("maxOccupancy")(maxOccupancy.asInstanceOf[js.Any])
    if (!js.isUndefined(namespaces)) __obj.updateDynamic("namespaces")(namespaces.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpRegisterRequest]
  }
}

