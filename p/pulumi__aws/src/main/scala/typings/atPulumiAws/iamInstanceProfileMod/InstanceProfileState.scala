package typings.atPulumiAws.iamInstanceProfileMod

import typings.atPulumiAws.iamRoleMod.Role
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceProfileState extends js.Object {
  /**
    * The ARN assigned by AWS to the instance profile.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The creation timestamp of the instance profile.
    */
  val createDate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The profile's name. If omitted, this provider will assign a random, unique name.
    */
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
  /**
    *
    * A list of role names to include in the profile.  The current default is 1.  If you see an error message similar to `Cannot exceed quota for InstanceSessionsPerInstanceProfile: 1`, then you must contact AWS support and ask for a limit increase.
    */
  val roles: js.UndefOr[Input[js.Array[Input[String | Role]]]] = js.undefined
  /**
    * The [unique ID][1] assigned by AWS.
    */
  val uniqueId: js.UndefOr[Input[String]] = js.undefined
}

object InstanceProfileState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    createDate: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    path: Input[String] = null,
    role: Input[String | Role] = null,
    roles: Input[js.Array[Input[String | Role]]] = null,
    uniqueId: Input[String] = null
  ): InstanceProfileState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createDate != null) __obj.updateDynamic("createDate")(createDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceProfileState]
  }
}

