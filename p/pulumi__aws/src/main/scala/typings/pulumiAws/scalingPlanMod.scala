package typings.pulumiAws

import typings.pulumiAws.outputMod.autoscalingplans.ScalingPlanApplicationSource
import typings.pulumiAws.outputMod.autoscalingplans.ScalingPlanScalingInstruction
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scalingPlanMod {
  
  @JSImport("@pulumi/aws/autoscalingplans/scalingPlan", "ScalingPlan")
  @js.native
  class ScalingPlan protected () extends CustomResource {
    /**
      * Create a ScalingPlan resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ScalingPlanArgs) = this()
    def this(name: String, args: ScalingPlanArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A CloudFormation stack or set of tags. You can create one scaling plan per application source.
      */
    val applicationSource: Output_[ScalingPlanApplicationSource] = js.native
    
    /**
      * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
      */
    val name: Output_[String] = js.native
    
    /**
      * The scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
      */
    val scalingInstructions: Output_[js.Array[ScalingPlanScalingInstruction]] = js.native
    
    /**
      * The version number of the scaling plan. This value is always 1.
      */
    val scalingPlanVersion: Output_[Double] = js.native
  }
  /* static members */
  object ScalingPlan {
    
    /**
      * Get an existing ScalingPlan resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/autoscalingplans/scalingPlan", "ScalingPlan.get")
    @js.native
    def get(name: String, id: Input[ID]): ScalingPlan = js.native
    @JSImport("@pulumi/aws/autoscalingplans/scalingPlan", "ScalingPlan.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ScalingPlan = js.native
    @JSImport("@pulumi/aws/autoscalingplans/scalingPlan", "ScalingPlan.get")
    @js.native
    def get(name: String, id: Input[ID], state: ScalingPlanState): ScalingPlan = js.native
    @JSImport("@pulumi/aws/autoscalingplans/scalingPlan", "ScalingPlan.get")
    @js.native
    def get(name: String, id: Input[ID], state: ScalingPlanState, opts: CustomResourceOptions): ScalingPlan = js.native
    
    /**
      * Returns true if the given object is an instance of ScalingPlan.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/autoscalingplans/scalingPlan", "ScalingPlan.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscalingplans/scalingPlan.ScalingPlan */ Boolean = js.native
  }
  
  @js.native
  trait ScalingPlanArgs extends StObject {
    
    /**
      * A CloudFormation stack or set of tags. You can create one scaling plan per application source.
      */
    val applicationSource: Input[typings.pulumiAws.inputMod.autoscalingplans.ScalingPlanApplicationSource] = js.native
    
    /**
      * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
      */
    val scalingInstructions: Input[
        js.Array[Input[typings.pulumiAws.inputMod.autoscalingplans.ScalingPlanScalingInstruction]]
      ] = js.native
  }
  object ScalingPlanArgs {
    
    @scala.inline
    def apply(
      applicationSource: Input[typings.pulumiAws.inputMod.autoscalingplans.ScalingPlanApplicationSource],
      scalingInstructions: Input[
          js.Array[Input[typings.pulumiAws.inputMod.autoscalingplans.ScalingPlanScalingInstruction]]
        ]
    ): ScalingPlanArgs = {
      val __obj = js.Dynamic.literal(applicationSource = applicationSource.asInstanceOf[js.Any], scalingInstructions = scalingInstructions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScalingPlanArgs]
    }
    
    @scala.inline
    implicit class ScalingPlanArgsMutableBuilder[Self <: ScalingPlanArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationSource(value: Input[typings.pulumiAws.inputMod.autoscalingplans.ScalingPlanApplicationSource]): Self = StObject.set(x, "applicationSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setScalingInstructions(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.autoscalingplans.ScalingPlanScalingInstruction]]
            ]
      ): Self = StObject.set(x, "scalingInstructions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingInstructionsVarargs(value: Input[typings.pulumiAws.inputMod.autoscalingplans.ScalingPlanScalingInstruction]*): Self = StObject.set(x, "scalingInstructions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ScalingPlanState extends StObject {
    
    /**
      * A CloudFormation stack or set of tags. You can create one scaling plan per application source.
      */
    val applicationSource: js.UndefOr[Input[typings.pulumiAws.inputMod.autoscalingplans.ScalingPlanApplicationSource]] = js.native
    
    /**
      * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
      */
    val scalingInstructions: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.autoscalingplans.ScalingPlanScalingInstruction]]
        ]
      ] = js.native
    
    /**
      * The version number of the scaling plan. This value is always 1.
      */
    val scalingPlanVersion: js.UndefOr[Input[Double]] = js.native
  }
  object ScalingPlanState {
    
    @scala.inline
    def apply(): ScalingPlanState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScalingPlanState]
    }
    
    @scala.inline
    implicit class ScalingPlanStateMutableBuilder[Self <: ScalingPlanState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationSource(value: Input[typings.pulumiAws.inputMod.autoscalingplans.ScalingPlanApplicationSource]): Self = StObject.set(x, "applicationSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationSourceUndefined: Self = StObject.set(x, "applicationSource", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setScalingInstructions(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.autoscalingplans.ScalingPlanScalingInstruction]]
            ]
      ): Self = StObject.set(x, "scalingInstructions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingInstructionsUndefined: Self = StObject.set(x, "scalingInstructions", js.undefined)
      
      @scala.inline
      def setScalingInstructionsVarargs(value: Input[typings.pulumiAws.inputMod.autoscalingplans.ScalingPlanScalingInstruction]*): Self = StObject.set(x, "scalingInstructions", js.Array(value :_*))
      
      @scala.inline
      def setScalingPlanVersion(value: Input[Double]): Self = StObject.set(x, "scalingPlanVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingPlanVersionUndefined: Self = StObject.set(x, "scalingPlanVersion", js.undefined)
    }
  }
}
