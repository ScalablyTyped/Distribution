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

object transitGatewayPeeringAttachmentAccepterMod {
  
  @JSImport("@pulumi/aws/ec2/transitGatewayPeeringAttachmentAccepter", "TransitGatewayPeeringAttachmentAccepter")
  @js.native
  class TransitGatewayPeeringAttachmentAccepter protected () extends CustomResource {
    /**
      * Create a TransitGatewayPeeringAttachmentAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TransitGatewayPeeringAttachmentAccepterArgs) = this()
    def this(name: String, args: TransitGatewayPeeringAttachmentAccepterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Identifier of the AWS account that owns the EC2 TGW peering.
      */
    val peerAccountId: Output_[String] = js.native
    
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
      * The ID of the EC2 Transit Gateway Peering Attachment to manage.
      */
    val transitGatewayAttachmentId: Output_[String] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: Output_[String] = js.native
  }
  /* static members */
  object TransitGatewayPeeringAttachmentAccepter {
    
    @JSImport("@pulumi/aws/ec2/transitGatewayPeeringAttachmentAccepter", "TransitGatewayPeeringAttachmentAccepter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TransitGatewayPeeringAttachmentAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): TransitGatewayPeeringAttachmentAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[TransitGatewayPeeringAttachmentAccepter]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): TransitGatewayPeeringAttachmentAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TransitGatewayPeeringAttachmentAccepter]
    @scala.inline
    def get(name: String, id: Input[ID], state: TransitGatewayPeeringAttachmentAccepterState): TransitGatewayPeeringAttachmentAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[TransitGatewayPeeringAttachmentAccepter]
    @scala.inline
    def get(
      name: String,
      id: Input[ID],
      state: TransitGatewayPeeringAttachmentAccepterState,
      opts: CustomResourceOptions
    ): TransitGatewayPeeringAttachmentAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TransitGatewayPeeringAttachmentAccepter]
    
    /**
      * Returns true if the given object is an instance of TransitGatewayPeeringAttachmentAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/transitGatewayPeeringAttachmentAccepter.TransitGatewayPeeringAttachmentAccepter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/transitGatewayPeeringAttachmentAccepter.TransitGatewayPeeringAttachmentAccepter */ Boolean]
  }
  
  trait TransitGatewayPeeringAttachmentAccepterArgs extends StObject {
    
    /**
      * Key-value tags for the EC2 Transit Gateway Peering Attachment.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ID of the EC2 Transit Gateway Peering Attachment to manage.
      */
    val transitGatewayAttachmentId: Input[String]
  }
  object TransitGatewayPeeringAttachmentAccepterArgs {
    
    @scala.inline
    def apply(transitGatewayAttachmentId: Input[String]): TransitGatewayPeeringAttachmentAccepterArgs = {
      val __obj = js.Dynamic.literal(transitGatewayAttachmentId = transitGatewayAttachmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitGatewayPeeringAttachmentAccepterArgs]
    }
    
    @scala.inline
    implicit class TransitGatewayPeeringAttachmentAccepterArgsMutableBuilder[Self <: TransitGatewayPeeringAttachmentAccepterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransitGatewayAttachmentId(value: Input[String]): Self = StObject.set(x, "transitGatewayAttachmentId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransitGatewayPeeringAttachmentAccepterState extends StObject {
    
    /**
      * Identifier of the AWS account that owns the EC2 TGW peering.
      */
    val peerAccountId: js.UndefOr[Input[String]] = js.undefined
    
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
      * The ID of the EC2 Transit Gateway Peering Attachment to manage.
      */
    val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: js.UndefOr[Input[String]] = js.undefined
  }
  object TransitGatewayPeeringAttachmentAccepterState {
    
    @scala.inline
    def apply(): TransitGatewayPeeringAttachmentAccepterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitGatewayPeeringAttachmentAccepterState]
    }
    
    @scala.inline
    implicit class TransitGatewayPeeringAttachmentAccepterStateMutableBuilder[Self <: TransitGatewayPeeringAttachmentAccepterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPeerAccountId(value: Input[String]): Self = StObject.set(x, "peerAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerAccountIdUndefined: Self = StObject.set(x, "peerAccountId", js.undefined)
      
      @scala.inline
      def setPeerRegion(value: Input[String]): Self = StObject.set(x, "peerRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerRegionUndefined: Self = StObject.set(x, "peerRegion", js.undefined)
      
      @scala.inline
      def setPeerTransitGatewayId(value: Input[String]): Self = StObject.set(x, "peerTransitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerTransitGatewayIdUndefined: Self = StObject.set(x, "peerTransitGatewayId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransitGatewayAttachmentId(value: Input[String]): Self = StObject.set(x, "transitGatewayAttachmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "transitGatewayAttachmentId", js.undefined)
      
      @scala.inline
      def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
    }
  }
}
