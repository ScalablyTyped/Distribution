package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRole extends js.Object {
  /** Role name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** Role policyName */
  var policyName: js.UndefOr[String | Null] = js.undefined
}

object IRole {
  @scala.inline
  def apply(
    name: js.UndefOr[Null | String] = js.undefined,
    policyName: js.UndefOr[Null | String] = js.undefined
  ): IRole = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(policyName)) __obj.updateDynamic("policyName")(policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRole]
  }
}

