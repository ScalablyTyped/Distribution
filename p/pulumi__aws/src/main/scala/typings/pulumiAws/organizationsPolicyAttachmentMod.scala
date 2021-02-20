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

object organizationsPolicyAttachmentMod {
  
  @JSImport("@pulumi/aws/organizations/policyAttachment", "PolicyAttachment")
  @js.native
  class PolicyAttachment protected () extends CustomResource {
    /**
      * Create a PolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyAttachmentArgs) = this()
    def this(name: String, args: PolicyAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The unique identifier (ID) of the policy that you want to attach to the target.
      */
    val policyId: Output_[String] = js.native
    
    /**
      * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
      */
    val targetId: Output_[String] = js.native
  }
  /* static members */
  object PolicyAttachment {
    
    /**
      * Get an existing PolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/organizations/policyAttachment", "PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): PolicyAttachment = js.native
    @JSImport("@pulumi/aws/organizations/policyAttachment", "PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PolicyAttachment = js.native
    @JSImport("@pulumi/aws/organizations/policyAttachment", "PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState): PolicyAttachment = js.native
    @JSImport("@pulumi/aws/organizations/policyAttachment", "PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): PolicyAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/organizations/policyAttachment", "PolicyAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/policyAttachment.PolicyAttachment */ Boolean = js.native
  }
  
  @js.native
  trait PolicyAttachmentArgs extends StObject {
    
    /**
      * The unique identifier (ID) of the policy that you want to attach to the target.
      */
    val policyId: Input[String] = js.native
    
    /**
      * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
      */
    val targetId: Input[String] = js.native
  }
  object PolicyAttachmentArgs {
    
    @scala.inline
    def apply(policyId: Input[String], targetId: Input[String]): PolicyAttachmentArgs = {
      val __obj = js.Dynamic.literal(policyId = policyId.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyAttachmentArgs]
    }
    
    @scala.inline
    implicit class PolicyAttachmentArgsMutableBuilder[Self <: PolicyAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicyId(value: Input[String]): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetId(value: Input[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PolicyAttachmentState extends StObject {
    
    /**
      * The unique identifier (ID) of the policy that you want to attach to the target.
      */
    val policyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
      */
    val targetId: js.UndefOr[Input[String]] = js.native
  }
  object PolicyAttachmentState {
    
    @scala.inline
    def apply(): PolicyAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolicyAttachmentState]
    }
    
    @scala.inline
    implicit class PolicyAttachmentStateMutableBuilder[Self <: PolicyAttachmentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicyId(value: Input[String]): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyIdUndefined: Self = StObject.set(x, "policyId", js.undefined)
      
      @scala.inline
      def setTargetId(value: Input[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    }
  }
}
