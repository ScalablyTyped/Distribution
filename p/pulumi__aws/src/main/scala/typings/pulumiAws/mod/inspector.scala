package typings.pulumiAws.mod

import typings.pulumiAws.assessmentTargetMod.AssessmentTargetArgs
import typings.pulumiAws.assessmentTargetMod.AssessmentTargetState
import typings.pulumiAws.assessmentTemplateMod.AssessmentTemplateArgs
import typings.pulumiAws.assessmentTemplateMod.AssessmentTemplateState
import typings.pulumiAws.getRulesPackagesMod.GetRulesPackagesResult
import typings.pulumiAws.resourceGroupMod.ResourceGroupArgs
import typings.pulumiAws.resourceGroupMod.ResourceGroupState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "inspector")
@js.native
object inspector extends js.Object {
  @js.native
  class AssessmentTarget protected ()
    extends typings.pulumiAws.inspectorMod.AssessmentTarget {
    /**
      * Create a AssessmentTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AssessmentTargetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AssessmentTargetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class AssessmentTemplate protected ()
    extends typings.pulumiAws.inspectorMod.AssessmentTemplate {
    /**
      * Create a AssessmentTemplate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AssessmentTemplateArgs) = this()
    def this(name: String, args: AssessmentTemplateArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceGroup protected ()
    extends typings.pulumiAws.inspectorMod.ResourceGroup {
    /**
      * Create a ResourceGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceGroupArgs) = this()
    def this(name: String, args: ResourceGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  def getRulesPackages(): js.Promise[GetRulesPackagesResult] = js.native
  def getRulesPackages(opts: InvokeOptions): js.Promise[GetRulesPackagesResult] = js.native
  /* static members */
  @js.native
  object AssessmentTarget extends js.Object {
    /**
      * Get an existing AssessmentTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.assessmentTargetMod.AssessmentTarget = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.assessmentTargetMod.AssessmentTarget = js.native
    def get(name: String, id: Input[ID], state: AssessmentTargetState): typings.pulumiAws.assessmentTargetMod.AssessmentTarget = js.native
    def get(name: String, id: Input[ID], state: AssessmentTargetState, opts: CustomResourceOptions): typings.pulumiAws.assessmentTargetMod.AssessmentTarget = js.native
    /**
      * Returns true if the given object is an instance of AssessmentTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/assessmentTarget.AssessmentTarget */ Boolean = js.native
  }
  
  /* static members */
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.assessmentTemplateMod.AssessmentTemplate = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.assessmentTemplateMod.AssessmentTemplate = js.native
    def get(name: String, id: Input[ID], state: AssessmentTemplateState): typings.pulumiAws.assessmentTemplateMod.AssessmentTemplate = js.native
    def get(name: String, id: Input[ID], state: AssessmentTemplateState, opts: CustomResourceOptions): typings.pulumiAws.assessmentTemplateMod.AssessmentTemplate = js.native
    /**
      * Returns true if the given object is an instance of AssessmentTemplate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/assessmentTemplate.AssessmentTemplate */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResourceGroup extends js.Object {
    /**
      * Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.resourceGroupMod.ResourceGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.resourceGroupMod.ResourceGroup = js.native
    def get(name: String, id: Input[ID], state: ResourceGroupState): typings.pulumiAws.resourceGroupMod.ResourceGroup = js.native
    def get(name: String, id: Input[ID], state: ResourceGroupState, opts: CustomResourceOptions): typings.pulumiAws.resourceGroupMod.ResourceGroup = js.native
    /**
      * Returns true if the given object is an instance of ResourceGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/resourceGroup.ResourceGroup */ Boolean = js.native
  }
  
}

