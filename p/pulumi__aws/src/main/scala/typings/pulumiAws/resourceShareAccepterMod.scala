package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceShareAccepterMod {
  
  @JSImport("@pulumi/aws/ram/resourceShareAccepter", "ResourceShareAccepter")
  @js.native
  class ResourceShareAccepter protected () extends CustomResource {
    /**
      * Create a ResourceShareAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceShareAccepterArgs) = this()
    def this(name: String, args: ResourceShareAccepterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the resource share invitation.
      */
    val invitationArn: Output_[String] = js.native
    
    /**
      * The account ID of the receiver account which accepts the invitation.
      */
    val receiverAccountId: Output_[String] = js.native
    
    /**
      * A list of the resource ARNs shared via the resource share.
      */
    val resources: Output_[js.Array[String]] = js.native
    
    /**
      * The account ID of the sender account which submits the invitation.
      */
    val senderAccountId: Output_[String] = js.native
    
    /**
      * The ARN of the resource share.
      */
    val shareArn: Output_[String] = js.native
    
    /**
      * The ID of the resource share as displayed in the console.
      */
    val shareId: Output_[String] = js.native
    
    /**
      * The name of the resource share.
      */
    val shareName: Output_[String] = js.native
    
    /**
      * The status of the resource share (ACTIVE, PENDING, FAILED, DELETING, DELETED).
      */
    val status: Output_[String] = js.native
  }
  /* static members */
  object ResourceShareAccepter {
    
    /**
      * Get an existing ResourceShareAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ram/resourceShareAccepter", "ResourceShareAccepter.get")
    @js.native
    def get(name: String, id: Input[ID]): ResourceShareAccepter = js.native
    @JSImport("@pulumi/aws/ram/resourceShareAccepter", "ResourceShareAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ResourceShareAccepter = js.native
    @JSImport("@pulumi/aws/ram/resourceShareAccepter", "ResourceShareAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceShareAccepterState): ResourceShareAccepter = js.native
    @JSImport("@pulumi/aws/ram/resourceShareAccepter", "ResourceShareAccepter.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceShareAccepterState, opts: CustomResourceOptions): ResourceShareAccepter = js.native
    
    /**
      * Returns true if the given object is an instance of ResourceShareAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ram/resourceShareAccepter", "ResourceShareAccepter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceShareAccepter.ResourceShareAccepter */ Boolean = js.native
  }
  
  @js.native
  trait ResourceShareAccepterArgs extends StObject {
    
    /**
      * The ARN of the resource share.
      */
    val shareArn: Input[String] = js.native
  }
  object ResourceShareAccepterArgs {
    
    @scala.inline
    def apply(shareArn: Input[String]): ResourceShareAccepterArgs = {
      val __obj = js.Dynamic.literal(shareArn = shareArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceShareAccepterArgs]
    }
    
    @scala.inline
    implicit class ResourceShareAccepterArgsMutableBuilder[Self <: ResourceShareAccepterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShareArn(value: Input[String]): Self = StObject.set(x, "shareArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceShareAccepterState extends StObject {
    
    /**
      * The ARN of the resource share invitation.
      */
    val invitationArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The account ID of the receiver account which accepts the invitation.
      */
    val receiverAccountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of the resource ARNs shared via the resource share.
      */
    val resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The account ID of the sender account which submits the invitation.
      */
    val senderAccountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the resource share.
      */
    val shareArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the resource share as displayed in the console.
      */
    val shareId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the resource share.
      */
    val shareName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The status of the resource share (ACTIVE, PENDING, FAILED, DELETING, DELETED).
      */
    val status: js.UndefOr[Input[String]] = js.native
  }
  object ResourceShareAccepterState {
    
    @scala.inline
    def apply(): ResourceShareAccepterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceShareAccepterState]
    }
    
    @scala.inline
    implicit class ResourceShareAccepterStateMutableBuilder[Self <: ResourceShareAccepterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvitationArn(value: Input[String]): Self = StObject.set(x, "invitationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvitationArnUndefined: Self = StObject.set(x, "invitationArn", js.undefined)
      
      @scala.inline
      def setReceiverAccountId(value: Input[String]): Self = StObject.set(x, "receiverAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiverAccountIdUndefined: Self = StObject.set(x, "receiverAccountId", js.undefined)
      
      @scala.inline
      def setResources(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      @scala.inline
      def setResourcesVarargs(value: Input[String]*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setSenderAccountId(value: Input[String]): Self = StObject.set(x, "senderAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderAccountIdUndefined: Self = StObject.set(x, "senderAccountId", js.undefined)
      
      @scala.inline
      def setShareArn(value: Input[String]): Self = StObject.set(x, "shareArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareArnUndefined: Self = StObject.set(x, "shareArn", js.undefined)
      
      @scala.inline
      def setShareId(value: Input[String]): Self = StObject.set(x, "shareId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareIdUndefined: Self = StObject.set(x, "shareId", js.undefined)
      
      @scala.inline
      def setShareName(value: Input[String]): Self = StObject.set(x, "shareName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareNameUndefined: Self = StObject.set(x, "shareName", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
