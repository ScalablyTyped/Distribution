package typings
package atPulumiAwsLib.iamGetRoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRoleArgs extends js.Object {
  /**
    * The friendly IAM role name to match.
    */
  val name: js.UndefOr[java.lang.String] = js.undefined
  val roleName: js.UndefOr[java.lang.String] = js.undefined
}

object GetRoleArgs {
  @scala.inline
  def apply(name: java.lang.String = null, roleName: java.lang.String = null): GetRoleArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (roleName != null) __obj.updateDynamic("roleName")(roleName)
    __obj.asInstanceOf[GetRoleArgs]
  }
}

