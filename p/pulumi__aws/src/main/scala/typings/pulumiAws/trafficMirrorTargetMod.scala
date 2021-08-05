package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trafficMirrorTargetMod {
  
  @JSImport("@pulumi/aws/ec2/trafficMirrorTarget", "TrafficMirrorTarget")
  @js.native
  class TrafficMirrorTarget protected () extends CustomResource {
    /**
      * Create a TrafficMirrorTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TrafficMirrorTargetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: TrafficMirrorTargetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the traffic mirror target.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A description of the traffic mirror session.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The network interface ID that is associated with the target.
      */
    val networkInterfaceId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
      */
    val networkLoadBalancerArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object TrafficMirrorTarget {
    
    @JSImport("@pulumi/aws/ec2/trafficMirrorTarget", "TrafficMirrorTarget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TrafficMirrorTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): TrafficMirrorTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[TrafficMirrorTarget]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): TrafficMirrorTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TrafficMirrorTarget]
    inline def get(name: String, id: Input[ID], state: TrafficMirrorTargetState): TrafficMirrorTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[TrafficMirrorTarget]
    inline def get(name: String, id: Input[ID], state: TrafficMirrorTargetState, opts: CustomResourceOptions): TrafficMirrorTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TrafficMirrorTarget]
    
    /**
      * Returns true if the given object is an instance of TrafficMirrorTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/trafficMirrorTarget.TrafficMirrorTarget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/trafficMirrorTarget.TrafficMirrorTarget */ Boolean]
  }
  
  trait TrafficMirrorTargetArgs extends StObject {
    
    /**
      * A description of the traffic mirror session.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The network interface ID that is associated with the target.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
      */
    val networkLoadBalancerArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object TrafficMirrorTargetArgs {
    
    inline def apply(): TrafficMirrorTargetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrafficMirrorTargetArgs]
    }
    
    extension [Self <: TrafficMirrorTargetArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      inline def setNetworkLoadBalancerArn(value: Input[String]): Self = StObject.set(x, "networkLoadBalancerArn", value.asInstanceOf[js.Any])
      
      inline def setNetworkLoadBalancerArnUndefined: Self = StObject.set(x, "networkLoadBalancerArn", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait TrafficMirrorTargetState extends StObject {
    
    /**
      * The ARN of the traffic mirror target.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A description of the traffic mirror session.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The network interface ID that is associated with the target.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
      */
    val networkLoadBalancerArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object TrafficMirrorTargetState {
    
    inline def apply(): TrafficMirrorTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrafficMirrorTargetState]
    }
    
    extension [Self <: TrafficMirrorTargetState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      inline def setNetworkLoadBalancerArn(value: Input[String]): Self = StObject.set(x, "networkLoadBalancerArn", value.asInstanceOf[js.Any])
      
      inline def setNetworkLoadBalancerArnUndefined: Self = StObject.set(x, "networkLoadBalancerArn", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
