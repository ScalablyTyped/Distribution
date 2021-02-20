package typings.pulumiAws

import typings.pulumiAws.outputMod.emr.ManagedScalingPolicyComputeLimit
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managedScalingPolicyMod {
  
  @JSImport("@pulumi/aws/emr/managedScalingPolicy", "ManagedScalingPolicy")
  @js.native
  class ManagedScalingPolicy protected () extends CustomResource {
    /**
      * Create a ManagedScalingPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ManagedScalingPolicyArgs) = this()
    def this(name: String, args: ManagedScalingPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The id of the EMR cluster
      */
    val clusterId: Output_[String] = js.native
    
    /**
      * Configuration block with compute limit settings. Described below.
      */
    val computeLimits: Output_[js.Array[ManagedScalingPolicyComputeLimit]] = js.native
  }
  /* static members */
  object ManagedScalingPolicy {
    
    /**
      * Get an existing ManagedScalingPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/emr/managedScalingPolicy", "ManagedScalingPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): ManagedScalingPolicy = js.native
    @JSImport("@pulumi/aws/emr/managedScalingPolicy", "ManagedScalingPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ManagedScalingPolicy = js.native
    @JSImport("@pulumi/aws/emr/managedScalingPolicy", "ManagedScalingPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ManagedScalingPolicyState): ManagedScalingPolicy = js.native
    @JSImport("@pulumi/aws/emr/managedScalingPolicy", "ManagedScalingPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ManagedScalingPolicyState, opts: CustomResourceOptions): ManagedScalingPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of ManagedScalingPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/emr/managedScalingPolicy", "ManagedScalingPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/managedScalingPolicy.ManagedScalingPolicy */ Boolean = js.native
  }
  
  @js.native
  trait ManagedScalingPolicyArgs extends StObject {
    
    /**
      * The id of the EMR cluster
      */
    val clusterId: Input[String] = js.native
    
    /**
      * Configuration block with compute limit settings. Described below.
      */
    val computeLimits: Input[js.Array[Input[typings.pulumiAws.inputMod.emr.ManagedScalingPolicyComputeLimit]]] = js.native
  }
  object ManagedScalingPolicyArgs {
    
    @scala.inline
    def apply(
      clusterId: Input[String],
      computeLimits: Input[js.Array[Input[typings.pulumiAws.inputMod.emr.ManagedScalingPolicyComputeLimit]]]
    ): ManagedScalingPolicyArgs = {
      val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any], computeLimits = computeLimits.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManagedScalingPolicyArgs]
    }
    
    @scala.inline
    implicit class ManagedScalingPolicyArgsMutableBuilder[Self <: ManagedScalingPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterId(value: Input[String]): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputeLimits(value: Input[js.Array[Input[typings.pulumiAws.inputMod.emr.ManagedScalingPolicyComputeLimit]]]): Self = StObject.set(x, "computeLimits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputeLimitsVarargs(value: Input[typings.pulumiAws.inputMod.emr.ManagedScalingPolicyComputeLimit]*): Self = StObject.set(x, "computeLimits", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ManagedScalingPolicyState extends StObject {
    
    /**
      * The id of the EMR cluster
      */
    val clusterId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block with compute limit settings. Described below.
      */
    val computeLimits: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.emr.ManagedScalingPolicyComputeLimit]]]
      ] = js.native
  }
  object ManagedScalingPolicyState {
    
    @scala.inline
    def apply(): ManagedScalingPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagedScalingPolicyState]
    }
    
    @scala.inline
    implicit class ManagedScalingPolicyStateMutableBuilder[Self <: ManagedScalingPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterId(value: Input[String]): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
      
      @scala.inline
      def setComputeLimits(value: Input[js.Array[Input[typings.pulumiAws.inputMod.emr.ManagedScalingPolicyComputeLimit]]]): Self = StObject.set(x, "computeLimits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputeLimitsUndefined: Self = StObject.set(x, "computeLimits", js.undefined)
      
      @scala.inline
      def setComputeLimitsVarargs(value: Input[typings.pulumiAws.inputMod.emr.ManagedScalingPolicyComputeLimit]*): Self = StObject.set(x, "computeLimits", js.Array(value :_*))
    }
  }
}
