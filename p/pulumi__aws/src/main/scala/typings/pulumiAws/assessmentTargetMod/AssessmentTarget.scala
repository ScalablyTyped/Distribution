package typings.pulumiAws.assessmentTargetMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/inspector/assessmentTarget", "AssessmentTarget")
@js.native
class AssessmentTarget protected () extends CustomResource {
  /**
    * Create a AssessmentTarget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AssessmentTargetArgs) = this()
  def this(name: String, args: AssessmentTargetArgs, opts: CustomResourceOptions) = this()
  /**
    * The target assessment ARN.
    */
  val arn: Output_[String] = js.native
  /**
    * The name of the assessment target.
    */
  val name: Output_[String] = js.native
  /**
    * Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
    */
  val resourceGroupArn: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/inspector/assessmentTarget", "AssessmentTarget")
@js.native
object AssessmentTarget extends js.Object {
  /**
    * Get an existing AssessmentTarget resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): AssessmentTarget = js.native
  def get(name: String, id: Input[ID], state: AssessmentTargetState): AssessmentTarget = js.native
  def get(name: String, id: Input[ID], state: AssessmentTargetState, opts: CustomResourceOptions): AssessmentTarget = js.native
  /**
    * Returns true if the given object is an instance of AssessmentTarget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/assessmentTarget.AssessmentTarget */ Boolean = js.native
}

