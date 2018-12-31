package typings
package atPulumiAwsLib.awsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "inspector")
@js.native
object inspectorNs extends js.Object {
  @js.native
  class AssessmentTarget protected ()
    extends atPulumiAwsLib.inspectorMod.AssessmentTarget {
    /**
      * Create a AssessmentTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.inspectorAssessmentTargetMod.AssessmentTargetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.inspectorAssessmentTargetMod.AssessmentTargetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class AssessmentTemplate protected ()
    extends atPulumiAwsLib.inspectorMod.AssessmentTemplate {
    /**
      * Create a AssessmentTemplate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.inspectorAssessmentTemplateMod.AssessmentTemplateArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.inspectorAssessmentTemplateMod.AssessmentTemplateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceGroup protected ()
    extends atPulumiAwsLib.inspectorMod.ResourceGroup {
    /**
      * Create a ResourceGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getRulesPackages(): js.Promise[atPulumiAwsLib.inspectorGetRulesPackagesMod.GetRulesPackagesResult] = js.native
  def getRulesPackages(opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.inspectorGetRulesPackagesMod.GetRulesPackagesResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.inspectorAssessmentTemplateMod.AssessmentTemplate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.inspectorAssessmentTemplateMod.AssessmentTemplateState
    ): atPulumiAwsLib.inspectorAssessmentTemplateMod.AssessmentTemplate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.inspectorAssessmentTemplateMod.AssessmentTemplateState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.inspectorAssessmentTemplateMod.AssessmentTemplate = js.native
  }
  
  @js.native
  object ResourceGroup extends js.Object {
    /**
      * Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroupState
    ): atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.inspectorResourceGroupMod.ResourceGroup = js.native
  }
  
}

