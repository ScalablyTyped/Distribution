package typings
package atPulumiAwsLib.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/inspector", "AssessmentTarget")
@js.native
class AssessmentTarget protected ()
  extends atPulumiAwsLib.inspectorAssessmentTargetMod.AssessmentTarget {
  /**
    * Create a AssessmentTarget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.inspectorAssessmentTargetMod.AssessmentTargetArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.inspectorAssessmentTargetMod.AssessmentTargetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/inspector", "AssessmentTarget")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.inspectorAssessmentTargetMod.AssessmentTarget = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.inspectorAssessmentTargetMod.AssessmentTargetState
  ): atPulumiAwsLib.inspectorAssessmentTargetMod.AssessmentTarget = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.inspectorAssessmentTargetMod.AssessmentTargetState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.inspectorAssessmentTargetMod.AssessmentTarget = js.native
}

