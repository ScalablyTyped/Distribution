package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.VpcPeeringConnectionAccepterAccepter
import typings.pulumiAws.outputMod.ec2.VpcPeeringConnectionAccepterRequester
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpcPeeringConnectionAccepterMod {
  
  @JSImport("@pulumi/aws/ec2/vpcPeeringConnectionAccepter", "VpcPeeringConnectionAccepter")
  @js.native
  class VpcPeeringConnectionAccepter protected () extends CustomResource {
    /**
      * Create a VpcPeeringConnectionAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcPeeringConnectionAccepterArgs) = this()
    def this(name: String, args: VpcPeeringConnectionAccepterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The status of the VPC Peering Connection request.
      */
    val acceptStatus: Output_[String] = js.native
    
    /**
      * A configuration block that describes [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
      */
    val accepter: Output_[VpcPeeringConnectionAccepterAccepter] = js.native
    
    /**
      * Whether or not to accept the peering request. Defaults to `false`.
      */
    val autoAccept: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The AWS account ID of the owner of the requester VPC.
      */
    val peerOwnerId: Output_[String] = js.native
    
    /**
      * The region of the accepter VPC.
      */
    val peerRegion: Output_[String] = js.native
    
    /**
      * The ID of the requester VPC.
      */
    val peerVpcId: Output_[String] = js.native
    
    /**
      * A configuration block that describes [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
      */
    val requester: Output_[VpcPeeringConnectionAccepterRequester] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The ID of the accepter VPC.
      */
    val vpcId: Output_[String] = js.native
    
    /**
      * The VPC Peering Connection ID to manage.
      */
    val vpcPeeringConnectionId: Output_[String] = js.native
  }
  /* static members */
  object VpcPeeringConnectionAccepter {
    
    @JSImport("@pulumi/aws/ec2/vpcPeeringConnectionAccepter", "VpcPeeringConnectionAccepter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcPeeringConnectionAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): VpcPeeringConnectionAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VpcPeeringConnectionAccepter]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VpcPeeringConnectionAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcPeeringConnectionAccepter]
    inline def get(name: String, id: Input[ID], state: VpcPeeringConnectionAccepterState): VpcPeeringConnectionAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VpcPeeringConnectionAccepter]
    inline def get(name: String, id: Input[ID], state: VpcPeeringConnectionAccepterState, opts: CustomResourceOptions): VpcPeeringConnectionAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcPeeringConnectionAccepter]
    
    /**
      * Returns true if the given object is an instance of VpcPeeringConnectionAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcPeeringConnectionAccepter.VpcPeeringConnectionAccepter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/vpcPeeringConnectionAccepter.VpcPeeringConnectionAccepter */ Boolean]
  }
  
  trait VpcPeeringConnectionAccepterArgs extends StObject {
    
    /**
      * A configuration block that describes [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
      */
    val accepter: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterAccepter]] = js.undefined
    
    /**
      * Whether or not to accept the peering request. Defaults to `false`.
      */
    val autoAccept: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A configuration block that describes [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
      */
    val requester: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterRequester]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VPC Peering Connection ID to manage.
      */
    val vpcPeeringConnectionId: Input[String]
  }
  object VpcPeeringConnectionAccepterArgs {
    
    inline def apply(vpcPeeringConnectionId: Input[String]): VpcPeeringConnectionAccepterArgs = {
      val __obj = js.Dynamic.literal(vpcPeeringConnectionId = vpcPeeringConnectionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcPeeringConnectionAccepterArgs]
    }
    
    extension [Self <: VpcPeeringConnectionAccepterArgs](x: Self) {
      
      inline def setAccepter(value: Input[typings.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterAccepter]): Self = StObject.set(x, "accepter", value.asInstanceOf[js.Any])
      
      inline def setAccepterUndefined: Self = StObject.set(x, "accepter", js.undefined)
      
      inline def setAutoAccept(value: Input[Boolean]): Self = StObject.set(x, "autoAccept", value.asInstanceOf[js.Any])
      
      inline def setAutoAcceptUndefined: Self = StObject.set(x, "autoAccept", js.undefined)
      
      inline def setRequester(value: Input[typings.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterRequester]): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
      
      inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcPeeringConnectionId(value: Input[String]): Self = StObject.set(x, "vpcPeeringConnectionId", value.asInstanceOf[js.Any])
    }
  }
  
  trait VpcPeeringConnectionAccepterState extends StObject {
    
    /**
      * The status of the VPC Peering Connection request.
      */
    val acceptStatus: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A configuration block that describes [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
      */
    val accepter: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterAccepter]] = js.undefined
    
    /**
      * Whether or not to accept the peering request. Defaults to `false`.
      */
    val autoAccept: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The AWS account ID of the owner of the requester VPC.
      */
    val peerOwnerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The region of the accepter VPC.
      */
    val peerRegion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the requester VPC.
      */
    val peerVpcId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A configuration block that describes [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
      */
    val requester: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterRequester]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ID of the accepter VPC.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The VPC Peering Connection ID to manage.
      */
    val vpcPeeringConnectionId: js.UndefOr[Input[String]] = js.undefined
  }
  object VpcPeeringConnectionAccepterState {
    
    inline def apply(): VpcPeeringConnectionAccepterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcPeeringConnectionAccepterState]
    }
    
    extension [Self <: VpcPeeringConnectionAccepterState](x: Self) {
      
      inline def setAcceptStatus(value: Input[String]): Self = StObject.set(x, "acceptStatus", value.asInstanceOf[js.Any])
      
      inline def setAcceptStatusUndefined: Self = StObject.set(x, "acceptStatus", js.undefined)
      
      inline def setAccepter(value: Input[typings.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterAccepter]): Self = StObject.set(x, "accepter", value.asInstanceOf[js.Any])
      
      inline def setAccepterUndefined: Self = StObject.set(x, "accepter", js.undefined)
      
      inline def setAutoAccept(value: Input[Boolean]): Self = StObject.set(x, "autoAccept", value.asInstanceOf[js.Any])
      
      inline def setAutoAcceptUndefined: Self = StObject.set(x, "autoAccept", js.undefined)
      
      inline def setPeerOwnerId(value: Input[String]): Self = StObject.set(x, "peerOwnerId", value.asInstanceOf[js.Any])
      
      inline def setPeerOwnerIdUndefined: Self = StObject.set(x, "peerOwnerId", js.undefined)
      
      inline def setPeerRegion(value: Input[String]): Self = StObject.set(x, "peerRegion", value.asInstanceOf[js.Any])
      
      inline def setPeerRegionUndefined: Self = StObject.set(x, "peerRegion", js.undefined)
      
      inline def setPeerVpcId(value: Input[String]): Self = StObject.set(x, "peerVpcId", value.asInstanceOf[js.Any])
      
      inline def setPeerVpcIdUndefined: Self = StObject.set(x, "peerVpcId", js.undefined)
      
      inline def setRequester(value: Input[typings.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepterRequester]): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
      
      inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
      
      inline def setVpcPeeringConnectionId(value: Input[String]): Self = StObject.set(x, "vpcPeeringConnectionId", value.asInstanceOf[js.Any])
      
      inline def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "vpcPeeringConnectionId", js.undefined)
    }
  }
}
