package typings.pulumiAws.roleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the role.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The policy that grants an entity permission to assume the role.
    */
  val assumeRolePolicy: js.UndefOr[Input[String | PolicyDocument]] = js.native
  /**
    * The creation date of the IAM role.
    */
  val createDate: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the role.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies to force detaching any policies the role has before destroying it. Defaults to `false`.
    */
  val forceDetachPolicies: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
    */
  val maxSessionDuration: js.UndefOr[Input[Double]] = js.native
  /**
    * The name of the role. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The path to the role.
    * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
    */
  val path: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the policy that is used to set the permissions boundary for the role.
    */
  val permissionsBoundary: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of tags for the IAM role
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The stable and unique string identifying the role.
    */
  val uniqueId: js.UndefOr[Input[String]] = js.native
}

object RoleState {
  @scala.inline
  def apply(): RoleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleState]
  }
  @scala.inline
  implicit class RoleStateOps[Self <: RoleState] (val x: Self) extends AnyVal {
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
    def setAssumeRolePolicy(value: Input[String | PolicyDocument]): Self = this.set("assumeRolePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssumeRolePolicy: Self = this.set("assumeRolePolicy", js.undefined)
    @scala.inline
    def setCreateDate(value: Input[String]): Self = this.set("createDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDate: Self = this.set("createDate", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setForceDetachPolicies(value: Input[Boolean]): Self = this.set("forceDetachPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceDetachPolicies: Self = this.set("forceDetachPolicies", js.undefined)
    @scala.inline
    def setMaxSessionDuration(value: Input[Double]): Self = this.set("maxSessionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSessionDuration: Self = this.set("maxSessionDuration", js.undefined)
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
    def setPermissionsBoundary(value: Input[String]): Self = this.set("permissionsBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionsBoundary: Self = this.set("permissionsBoundary", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUniqueId(value: Input[String]): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueId: Self = this.set("uniqueId", js.undefined)
  }
  
}

