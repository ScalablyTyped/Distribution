package typings.atPulumiAws.iamInstanceProfileMod

import typings.atPulumiAws.iamRoleMod.Role
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceProfileArgs extends js.Object {
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * Path in which to create the profile.
    */
  val path: js.UndefOr[Input[String]] = js.undefined
  /**
    * The role name to include in the profile.
    */
  val role: js.UndefOr[Input[String | Role]] = js.undefined
  val roles: js.UndefOr[Input[js.Array[Input[String | Role]]]] = js.undefined
}

object InstanceProfileArgs {
  @scala.inline
  def apply(
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    path: Input[String] = null,
    role: Input[String | Role] = null,
    roles: Input[js.Array[Input[String | Role]]] = null
  ): InstanceProfileArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceProfileArgs]
  }
}

