package typings.pulumiAws.instanceProfileMod

import typings.pulumiAws.iamMod.Role
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceProfileState extends js.Object {
  /**
    * The ARN assigned by AWS to the instance profile.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The creation timestamp of the instance profile.
    */
  val createDate: js.UndefOr[Input[String]] = js.native
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
  /**
    * The [unique ID][1] assigned by AWS.
    */
  val uniqueId: js.UndefOr[Input[String]] = js.native
}

object InstanceProfileState {
  @scala.inline
  def apply(): InstanceProfileState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceProfileState]
  }
  @scala.inline
  implicit class InstanceProfileStateOps[Self <: InstanceProfileState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreateDate(value: Input[String]): Self = this.set("createDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDate: Self = this.set("createDate", js.undefined)
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
    @scala.inline
    def setUniqueId(value: Input[String]): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueId: Self = this.set("uniqueId", js.undefined)
  }
  
}

