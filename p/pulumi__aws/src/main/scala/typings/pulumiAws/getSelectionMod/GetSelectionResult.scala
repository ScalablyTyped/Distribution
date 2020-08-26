package typings.pulumiAws.getSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSelectionResult extends js.Object {
  /**
    * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
    */
  val iamRoleArn: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The display name of a resource selection document.
    */
  val name: String = js.native
  val planId: String = js.native
  /**
    * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
    */
  val resources: js.Array[String] = js.native
  val selectionId: String = js.native
}

object GetSelectionResult {
  @scala.inline
  def apply(
    iamRoleArn: String,
    id: String,
    name: String,
    planId: String,
    resources: js.Array[String],
    selectionId: String
  ): GetSelectionResult = {
    val __obj = js.Dynamic.literal(iamRoleArn = iamRoleArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], selectionId = selectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSelectionResult]
  }
  @scala.inline
  implicit class GetSelectionResultOps[Self <: GetSelectionResult] (val x: Self) extends AnyVal {
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
    def setIamRoleArn(value: String): Self = this.set("iamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionId(value: String): Self = this.set("selectionId", value.asInstanceOf[js.Any])
  }
  
}

