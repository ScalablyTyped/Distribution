package typings.atPulumiAws

import typings.atPulumiAws.inspectorAssessmentTargetMod.AssessmentTargetArgs
import typings.atPulumiAws.inspectorAssessmentTargetMod.AssessmentTargetState
import typings.atPulumiAws.inspectorAssessmentTemplateMod.AssessmentTemplateArgs
import typings.atPulumiAws.inspectorAssessmentTemplateMod.AssessmentTemplateState
import typings.atPulumiAws.inspectorGetRulesPackagesMod.GetRulesPackagesResult
import typings.atPulumiAws.inspectorResourceGroupMod.ResourceGroupArgs
import typings.atPulumiAws.inspectorResourceGroupMod.ResourceGroupState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/inspector", JSImport.Namespace)
@js.native
object inspectorMod extends js.Object {
  @js.native
  class AssessmentTarget protected ()
    extends typings.atPulumiAws.inspectorAssessmentTargetMod.AssessmentTarget {
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
  }
  
  @js.native
  class AssessmentTemplate protected ()
    extends typings.atPulumiAws.inspectorAssessmentTemplateMod.AssessmentTemplate {
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
    extends typings.atPulumiAws.inspectorResourceGroupMod.ResourceGroup {
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
  
  def getRulesPackages(): js.Promise[GetRulesPackagesResult] with GetRulesPackagesResult = js.native
  def getRulesPackages(opts: InvokeOptions): js.Promise[GetRulesPackagesResult] with GetRulesPackagesResult = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.inspectorAssessmentTargetMod.AssessmentTarget = js.native
    def get(name: String, id: Input[ID], state: AssessmentTargetState): typings.atPulumiAws.inspectorAssessmentTargetMod.AssessmentTarget = js.native
    def get(name: String, id: Input[ID], state: AssessmentTargetState, opts: CustomResourceOptions): typings.atPulumiAws.inspectorAssessmentTargetMod.AssessmentTarget = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.inspectorAssessmentTemplateMod.AssessmentTemplate = js.native
    def get(name: String, id: Input[ID], state: AssessmentTemplateState): typings.atPulumiAws.inspectorAssessmentTemplateMod.AssessmentTemplate = js.native
    def get(name: String, id: Input[ID], state: AssessmentTemplateState, opts: CustomResourceOptions): typings.atPulumiAws.inspectorAssessmentTemplateMod.AssessmentTemplate = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.inspectorResourceGroupMod.ResourceGroup = js.native
    def get(name: String, id: Input[ID], state: ResourceGroupState): typings.atPulumiAws.inspectorResourceGroupMod.ResourceGroup = js.native
    def get(name: String, id: Input[ID], state: ResourceGroupState, opts: CustomResourceOptions): typings.atPulumiAws.inspectorResourceGroupMod.ResourceGroup = js.native
    /**
      * Returns true if the given object is an instance of ResourceGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/resourceGroup.ResourceGroup */ Boolean = js.native
  }
  
}

