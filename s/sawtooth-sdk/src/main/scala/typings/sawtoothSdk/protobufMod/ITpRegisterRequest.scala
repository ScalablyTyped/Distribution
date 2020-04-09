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
    family: String = null,
    maxOccupancy: Int | Double = null,
    namespaces: js.Array[String] = null,
    version: String = null
  ): ITpRegisterRequest = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (maxOccupancy != null) __obj.updateDynamic("maxOccupancy")(maxOccupancy.asInstanceOf[js.Any])
    if (namespaces != null) __obj.updateDynamic("namespaces")(namespaces.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITpRegisterRequest]
  }
}

