package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assessmentTargetMod {
  
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
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
  object AssessmentTarget {
    
    @JSImport("@pulumi/aws/inspector/assessmentTarget", "AssessmentTarget")
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
    inline def get(name: String, id: Input[ID]): AssessmentTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[AssessmentTarget]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): AssessmentTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AssessmentTarget]
    inline def get(name: String, id: Input[ID], state: AssessmentTargetState): AssessmentTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AssessmentTarget]
    inline def get(name: String, id: Input[ID], state: AssessmentTargetState, opts: CustomResourceOptions): AssessmentTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AssessmentTarget]
    
    /**
      * Returns true if the given object is an instance of AssessmentTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/assessmentTarget.AssessmentTarget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/inspector/assessmentTarget.AssessmentTarget */ Boolean]
  }
  
  trait AssessmentTargetArgs extends StObject {
    
    /**
      * The name of the assessment target.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
      */
    val resourceGroupArn: js.UndefOr[Input[String]] = js.undefined
  }
  object AssessmentTargetArgs {
    
    inline def apply(): AssessmentTargetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssessmentTargetArgs]
    }
    
    extension [Self <: AssessmentTargetArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResourceGroupArn(value: Input[String]): Self = StObject.set(x, "resourceGroupArn", value.asInstanceOf[js.Any])
      
      inline def setResourceGroupArnUndefined: Self = StObject.set(x, "resourceGroupArn", js.undefined)
    }
  }
  
  trait AssessmentTargetState extends StObject {
    
    /**
      * The target assessment ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the assessment target.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Inspector Resource Group Amazon Resource Name (ARN) stating tags for instance matching. If not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
      */
    val resourceGroupArn: js.UndefOr[Input[String]] = js.undefined
  }
  object AssessmentTargetState {
    
    inline def apply(): AssessmentTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssessmentTargetState]
    }
    
    extension [Self <: AssessmentTargetState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResourceGroupArn(value: Input[String]): Self = StObject.set(x, "resourceGroupArn", value.asInstanceOf[js.Any])
      
      inline def setResourceGroupArnUndefined: Self = StObject.set(x, "resourceGroupArn", js.undefined)
    }
  }
}
