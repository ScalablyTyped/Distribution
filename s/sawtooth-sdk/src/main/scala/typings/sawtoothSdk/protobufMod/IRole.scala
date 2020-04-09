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
  def apply(name: String = null, policyName: String = null): IRole = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (policyName != null) __obj.updateDynamic("policyName")(policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRole]
  }
}

