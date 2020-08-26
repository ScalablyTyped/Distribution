package typings.pulumiAws.instanceProfileMod

import typings.pulumiAws.iamMod.Role
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceProfileArgs extends js.Object {
  /**
    * The profile's name. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Path in which to create the profile.
    */
  val path: js.UndefOr[Input[String]] = js.native
  /**
    * The role name to include in the profile.
    */
  val role: js.UndefOr[Input[String | Role]] = js.native
  /**
    * A list of role names to include in the profile.  The current default is 1.  If you see an error message similar to `Cannot exceed quota for InstanceSessionsPerInstanceProfile: 1`, then you must contact AWS support and ask for a limit increase.
    *
    * @deprecated Use `role` instead. Only a single role can be passed to an IAM Instance Profile
    */
  val roles: js.UndefOr[Input[js.Array[Input[String | Role]]]] = js.native
}

object InstanceProfileArgs {
  @scala.inline
  def apply(): InstanceProfileArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceProfileArgs]
  }
  @scala.inline
  implicit class InstanceProfileArgsOps[Self <: InstanceProfileArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRole(value: Input[String | Role]): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setRolesVarargs(value: (Input[String | Role])*): Self = this.set("roles", js.Array(value :_*))
    @scala.inline
    def setRoles(value: Input[js.Array[Input[String | Role]]]): Self = this.set("roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
  }
  
}

