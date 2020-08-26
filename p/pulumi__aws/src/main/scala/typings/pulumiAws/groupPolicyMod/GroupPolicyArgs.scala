package typings.pulumiAws.groupPolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupPolicyArgs extends js.Object {
  /**
    * The IAM group to attach to the policy.
    */
  val group: Input[String] = js.native
  /**
    * The name of the policy. If omitted, this provider will
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
}

object GroupPolicyArgs {
  @scala.inline
  def apply(group: Input[String], policy: Input[String | PolicyDocument]): GroupPolicyArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupPolicyArgs]
  }
  @scala.inline
  implicit class GroupPolicyArgsOps[Self <: GroupPolicyArgs] (val x: Self) extends AnyVal {
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
    def setGroup(value: Input[String]): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicy(value: Input[String | PolicyDocument]): Self = this.set("policy", value.asInstanceOf[js.Any])
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

