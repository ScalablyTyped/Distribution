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

object linkAggregationGroupMod {
  
  @JSImport("@pulumi/aws/directconnect/linkAggregationGroup", "LinkAggregationGroup")
  @js.native
  class LinkAggregationGroup protected () extends CustomResource {
    /**
      * Create a LinkAggregationGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LinkAggregationGroupArgs) = this()
    def this(name: String, args: LinkAggregationGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the LAG.
      * * `jumboFrameCapable` -Indicates whether jumbo frames (9001 MTU) are supported.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
      */
    val connectionsBandwidth: Output_[String] = js.native
    
    /**
      * A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
      */
    val forceDestroy: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
      */
    val hasLogicalRedundancy: Output_[String] = js.native
    
    val jumboFrameCapable: Output_[Boolean] = js.native
    
    /**
      * The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
      */
    val location: Output_[String] = js.native
    
    /**
      * The name of the LAG.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object LinkAggregationGroup {
    
    @JSImport("@pulumi/aws/directconnect/linkAggregationGroup", "LinkAggregationGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LinkAggregationGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): LinkAggregationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LinkAggregationGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LinkAggregationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LinkAggregationGroup]
    inline def get(name: String, id: Input[ID], state: LinkAggregationGroupState): LinkAggregationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LinkAggregationGroup]
    inline def get(name: String, id: Input[ID], state: LinkAggregationGroupState, opts: CustomResourceOptions): LinkAggregationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LinkAggregationGroup]
    
    /**
      * Returns true if the given object is an instance of LinkAggregationGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/linkAggregationGroup.LinkAggregationGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/linkAggregationGroup.LinkAggregationGroup */ Boolean]
  }
  
  trait LinkAggregationGroupArgs extends StObject {
    
    /**
      * The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
      */
    val connectionsBandwidth: Input[String]
    
    /**
      * A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
      */
    val location: Input[String]
    
    /**
      * The name of the LAG.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object LinkAggregationGroupArgs {
    
    inline def apply(connectionsBandwidth: Input[String], location: Input[String]): LinkAggregationGroupArgs = {
      val __obj = js.Dynamic.literal(connectionsBandwidth = connectionsBandwidth.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkAggregationGroupArgs]
    }
    
    extension [Self <: LinkAggregationGroupArgs](x: Self) {
      
      inline def setConnectionsBandwidth(value: Input[String]): Self = StObject.set(x, "connectionsBandwidth", value.asInstanceOf[js.Any])
      
      inline def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      inline def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      inline def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait LinkAggregationGroupState extends StObject {
    
    /**
      * The ARN of the LAG.
      * * `jumboFrameCapable` -Indicates whether jumbo frames (9001 MTU) are supported.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
      */
    val connectionsBandwidth: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
      */
    val hasLogicalRedundancy: js.UndefOr[Input[String]] = js.undefined
    
    val jumboFrameCapable: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
      */
    val location: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the LAG.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object LinkAggregationGroupState {
    
    inline def apply(): LinkAggregationGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkAggregationGroupState]
    }
    
    extension [Self <: LinkAggregationGroupState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setConnectionsBandwidth(value: Input[String]): Self = StObject.set(x, "connectionsBandwidth", value.asInstanceOf[js.Any])
      
      inline def setConnectionsBandwidthUndefined: Self = StObject.set(x, "connectionsBandwidth", js.undefined)
      
      inline def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      inline def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      inline def setHasLogicalRedundancy(value: Input[String]): Self = StObject.set(x, "hasLogicalRedundancy", value.asInstanceOf[js.Any])
      
      inline def setHasLogicalRedundancyUndefined: Self = StObject.set(x, "hasLogicalRedundancy", js.undefined)
      
      inline def setJumboFrameCapable(value: Input[Boolean]): Self = StObject.set(x, "jumboFrameCapable", value.asInstanceOf[js.Any])
      
      inline def setJumboFrameCapableUndefined: Self = StObject.set(x, "jumboFrameCapable", js.undefined)
      
      inline def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
