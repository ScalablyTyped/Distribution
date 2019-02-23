package typings
package atPulumiAwsLib.inspectorAssessmentTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/inspector/assessmentTemplate", "AssessmentTemplate")
@js.native
class AssessmentTemplate protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a AssessmentTemplate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: AssessmentTemplateArgs) = this()
  def this(name: java.lang.String, args: AssessmentTemplateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The template assessment ARN.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The duration of the inspector run.
    */
  val duration: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * The name of the assessment template.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The rules to be used during the run.
    */
  val rulesPackageArns: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The assessment target ARN to attach the template to.
    */
  val targetArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.inspectorAssessmentTemplateMod.AssessmentTemplate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.inspectorAssessmentTemplateMod.AssessmentTemplateState
  ): atPulumiAwsLib.inspectorAssessmentTemplateMod.AssessmentTemplate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.inspectorAssessmentTemplateMod.AssessmentTemplateState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.inspectorAssessmentTemplateMod.AssessmentTemplate = js.native
}

