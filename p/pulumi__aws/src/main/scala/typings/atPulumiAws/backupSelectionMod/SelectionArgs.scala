package typings.atPulumiAws.backupSelectionMod

import typings.atPulumiAws.typesInputMod.backup.SelectionSelectionTag
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionArgs extends js.Object {
  /**
    * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
    */
  val iamRoleArn: Input[String]
  /**
    * The display name of a resource selection document.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The backup plan ID to be associated with the selection of resources.
    */
  val planId: Input[String]
  /**
    * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
    */
  val resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Tag-based conditions used to specify a set of resources to assign to a backup plan.
    */
  val selectionTags: js.UndefOr[Input[js.Array[Input[SelectionSelectionTag]]]] = js.undefined
}

object SelectionArgs {
  @scala.inline
  def apply(
    iamRoleArn: Input[String],
    planId: Input[String],
    name: Input[String] = null,
    resources: Input[js.Array[Input[String]]] = null,
    selectionTags: Input[js.Array[Input[SelectionSelectionTag]]] = null
  ): SelectionArgs = {
    val __obj = js.Dynamic.literal(iamRoleArn = iamRoleArn.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (selectionTags != null) __obj.updateDynamic("selectionTags")(selectionTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionArgs]
  }
}

