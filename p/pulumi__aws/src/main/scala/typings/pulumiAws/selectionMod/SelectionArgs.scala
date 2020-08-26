package typings.pulumiAws.selectionMod

import typings.pulumiAws.inputMod.backup.SelectionSelectionTag
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionArgs extends js.Object {
  /**
    * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
    */
  val iamRoleArn: Input[String] = js.native
  /**
    * The display name of a resource selection document.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The backup plan ID to be associated with the selection of resources.
    */
  val planId: Input[String] = js.native
  /**
    * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
    */
  val resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Tag-based conditions used to specify a set of resources to assign to a backup plan.
    */
  val selectionTags: js.UndefOr[Input[js.Array[Input[SelectionSelectionTag]]]] = js.native
}

object SelectionArgs {
  @scala.inline
  def apply(iamRoleArn: Input[String], planId: Input[String]): SelectionArgs = {
    val __obj = js.Dynamic.literal(iamRoleArn = iamRoleArn.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionArgs]
  }
  @scala.inline
  implicit class SelectionArgsOps[Self <: SelectionArgs] (val x: Self) extends AnyVal {
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
    def setIamRoleArn(value: Input[String]): Self = this.set("iamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlanId(value: Input[String]): Self = this.set("planId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: Input[String]*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: Input[js.Array[Input[String]]]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setSelectionTagsVarargs(value: Input[SelectionSelectionTag]*): Self = this.set("selectionTags", js.Array(value :_*))
    @scala.inline
    def setSelectionTags(value: Input[js.Array[Input[SelectionSelectionTag]]]): Self = this.set("selectionTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionTags: Self = this.set("selectionTags", js.undefined)
  }
  
}

