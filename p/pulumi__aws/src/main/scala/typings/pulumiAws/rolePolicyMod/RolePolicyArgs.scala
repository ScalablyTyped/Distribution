package typings.pulumiAws.rolePolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiAws.iamMod.Role
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RolePolicyArgs extends js.Object {
  /**
    * The name of the role policy. If omitted, this provider will
    * assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The policy document. This is a JSON formatted string.
    */
  val policy: Input[String | PolicyDocument] = js.native
  /**
    * The IAM role to attach to the policy.
    */
  val role: Input[String | Role] = js.native
}

object RolePolicyArgs {
  @scala.inline
  def apply(policy: Input[String | PolicyDocument], role: Input[String | Role]): RolePolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[RolePolicyArgs]
  }
  @scala.inline
  implicit class RolePolicyArgsOps[Self <: RolePolicyArgs] (val x: Self) extends AnyVal {
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
    def setPolicy(value: Input[String | PolicyDocument]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: Input[String | Role]): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
  }
  
}

