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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspector {
  
  @JSImport("@pulumi/aws", "inspector")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "inspector.AssessmentTarget")
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: AssessmentTargetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AssessmentTarget {
    
    @JSImport("@pulumi/aws", "inspector.AssessmentTarget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AssessmentTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.assessmentTargetMod.AssessmentTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.assessmentTargetMod.AssessmentTarget]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.assessmentTargetMod.AssessmentTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.assessmentTargetMod.AssessmentTarget]
    @scala.inline
    def get(name: String, id: Input[ID], state: AssessmentTargetState): typings.pulumiAws.assessmentTargetMod.AssessmentTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.assessmentTargetMod.AssessmentTarget]
    @scala.inline
    def get(name: String, id: Input[ID], state: AssessmentTargetState, opts: CustomResourceOptions): typings.pulumiAws.assessmentTargetMod.AssessmentTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.assessmentTargetMod.AssessmentTarget]
    
    /**
      * Returns true if the given object is an instance of AssessmentTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/assessmentTarget.AssessmentTarget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/inspector/assessmentTarget.AssessmentTarget */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "inspector.AssessmentTemplate")
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
  /* static members */
  object AssessmentTemplate {
    
    @JSImport("@pulumi/aws", "inspector.AssessmentTemplate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AssessmentTemplate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.assessmentTemplateMod.AssessmentTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.assessmentTemplateMod.AssessmentTemplate]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.assessmentTemplateMod.AssessmentTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.assessmentTemplateMod.AssessmentTemplate]
    @scala.inline
    def get(name: String, id: Input[ID], state: AssessmentTemplateState): typings.pulumiAws.assessmentTemplateMod.AssessmentTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.assessmentTemplateMod.AssessmentTemplate]
    @scala.inline
    def get(name: String, id: Input[ID], state: AssessmentTemplateState, opts: CustomResourceOptions): typings.pulumiAws.assessmentTemplateMod.AssessmentTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.assessmentTemplateMod.AssessmentTemplate]
    
    /**
      * Returns true if the given object is an instance of AssessmentTemplate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/assessmentTemplate.AssessmentTemplate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/inspector/assessmentTemplate.AssessmentTemplate */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "inspector.ResourceGroup")
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
  /* static members */
  object ResourceGroup {
    
    @JSImport("@pulumi/aws", "inspector.ResourceGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.resourceGroupMod.ResourceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourceGroupMod.ResourceGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.resourceGroupMod.ResourceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourceGroupMod.ResourceGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResourceGroupState): typings.pulumiAws.resourceGroupMod.ResourceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourceGroupMod.ResourceGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResourceGroupState, opts: CustomResourceOptions): typings.pulumiAws.resourceGroupMod.ResourceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourceGroupMod.ResourceGroup]
    
    /**
      * Returns true if the given object is an instance of ResourceGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/resourceGroup.ResourceGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/inspector/resourceGroup.ResourceGroup */ Boolean]
  }
  
  @scala.inline
  def getRulesPackages(): js.Promise[GetRulesPackagesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRulesPackages")().asInstanceOf[js.Promise[GetRulesPackagesResult]]
  @scala.inline
  def getRulesPackages(opts: InvokeOptions): js.Promise[GetRulesPackagesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRulesPackages")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRulesPackagesResult]]
}
