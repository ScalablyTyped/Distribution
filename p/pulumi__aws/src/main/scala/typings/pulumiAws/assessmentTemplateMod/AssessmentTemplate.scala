package typings.pulumiAws.assessmentTemplateMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/inspector/assessmentTemplate", "AssessmentTemplate")
@js.native
class AssessmentTemplate protected () extends CustomResource {
  /**
    * Create a AssessmentTemplate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AssessmentTemplateArgs) = this()
  def this(name: String, args: AssessmentTemplateArgs, opts: CustomResourceOptions) = this()
  /**
    * The template assessment ARN.
    */
  val arn: Output_[String] = js.native
  /**
    * The duration of the inspector run.
    */
  val duration: Output_[Double] = js.native
  /**
    * The name of the assessment template.
    */
  val name: Output_[String] = js.native
  /**
    * The rules to be used during the run.
    */
  val rulesPackageArns: Output_[js.Array[String]] = js.native
  /**
    * Key-value map of tags for the Inspector assessment template.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The assessment target ARN to attach the template to.
    */
  val targetArn: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/inspector/assessmentTemplate", "AssessmentTemplate")
@js.native
object AssessmentTemplate extends js.Object {
  /**
    * Get an existing AssessmentTemplate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): AssessmentTemplate = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AssessmentTemplate = js.native
  def get(name: String, id: Input[ID], state: AssessmentTemplateState): AssessmentTemplate = js.native
  def get(name: String, id: Input[ID], state: AssessmentTemplateState, opts: CustomResourceOptions): AssessmentTemplate = js.native
  /**
    * Returns true if the given object is an instance of AssessmentTemplate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/assessmentTemplate.AssessmentTemplate */ Boolean = js.native
}

