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

object peeringAttachmentMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/peeringAttachment", "PeeringAttachment")
  @js.native
  class PeeringAttachment protected () extends CustomResource {
    /**
      * Create a PeeringAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PeeringAttachmentArgs) = this()
    def this(name: String, args: PeeringAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
      */
    val peerAccountId: Output_[String] = js.native
    
    /**
      * Region of EC2 Transit Gateway to peer with.
      */
    val peerRegion: Output_[String] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway to peer with.
      */
    val peerTransitGatewayId: Output_[String] = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway Peering Attachment.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: Output_[String] = js.native
  }
  /* static members */
  object PeeringAttachment {
    
    @JSImport("@pulumi/aws/ec2transitgateway/peeringAttachment", "PeeringAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PeeringAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): PeeringAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[PeeringAttachment]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): PeeringAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PeeringAttachment]
    inline def get(name: String, id: Input[ID], state: PeeringAttachmentState): PeeringAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PeeringAttachment]
    inline def get(name: String, id: Input[ID], state: PeeringAttachmentState, opts: CustomResourceOptions): PeeringAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PeeringAttachment]
    
    /**
      * Returns true if the given object is an instance of PeeringAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/peeringAttachment.PeeringAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/peeringAttachment.PeeringAttachment */ Boolean]
  }
  
  trait PeeringAttachmentArgs extends StObject {
    
    /**
      * Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
      */
    val peerAccountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Region of EC2 Transit Gateway to peer with.
      */
    val peerRegion: Input[String]
    
    /**
      * Identifier of EC2 Transit Gateway to peer with.
      */
    val peerTransitGatewayId: Input[String]
    
    /**
      * Key-value tags for the EC2 Transit Gateway Peering Attachment.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: Input[String]
  }
  object PeeringAttachmentArgs {
    
    inline def apply(peerRegion: Input[String], peerTransitGatewayId: Input[String], transitGatewayId: Input[String]): PeeringAttachmentArgs = {
      val __obj = js.Dynamic.literal(peerRegion = peerRegion.asInstanceOf[js.Any], peerTransitGatewayId = peerTransitGatewayId.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeeringAttachmentArgs]
    }
    
    extension [Self <: PeeringAttachmentArgs](x: Self) {
      
      inline def setPeerAccountId(value: Input[String]): Self = StObject.set(x, "peerAccountId", value.asInstanceOf[js.Any])
      
      inline def setPeerAccountIdUndefined: Self = StObject.set(x, "peerAccountId", js.undefined)
      
      inline def setPeerRegion(value: Input[String]): Self = StObject.set(x, "peerRegion", value.asInstanceOf[js.Any])
      
      inline def setPeerTransitGatewayId(value: Input[String]): Self = StObject.set(x, "peerTransitGatewayId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
    }
  }
  
  trait PeeringAttachmentState extends StObject {
    
    /**
      * Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
      */
    val peerAccountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Region of EC2 Transit Gateway to peer with.
      */
    val peerRegion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of EC2 Transit Gateway to peer with.
      */
    val peerTransitGatewayId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value tags for the EC2 Transit Gateway Peering Attachment.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: js.UndefOr[Input[String]] = js.undefined
  }
  object PeeringAttachmentState {
    
    inline def apply(): PeeringAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeeringAttachmentState]
    }
    
    extension [Self <: PeeringAttachmentState](x: Self) {
      
      inline def setPeerAccountId(value: Input[String]): Self = StObject.set(x, "peerAccountId", value.asInstanceOf[js.Any])
      
      inline def setPeerAccountIdUndefined: Self = StObject.set(x, "peerAccountId", js.undefined)
      
      inline def setPeerRegion(value: Input[String]): Self = StObject.set(x, "peerRegion", value.asInstanceOf[js.Any])
      
      inline def setPeerRegionUndefined: Self = StObject.set(x, "peerRegion", js.undefined)
      
      inline def setPeerTransitGatewayId(value: Input[String]): Self = StObject.set(x, "peerTransitGatewayId", value.asInstanceOf[js.Any])
      
      inline def setPeerTransitGatewayIdUndefined: Self = StObject.set(x, "peerTransitGatewayId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
    }
  }
}
