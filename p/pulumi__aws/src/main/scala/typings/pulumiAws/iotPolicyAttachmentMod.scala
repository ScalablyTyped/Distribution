package typings.pulumiAws

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iotMod.Policy
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iotPolicyAttachmentMod {
  
  @JSImport("@pulumi/aws/iot/policyAttachment", "PolicyAttachment")
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
      * The name of the policy to attach.
      */
    val policy: Output_[String] = js.native
    
    /**
      * The identity to which the policy is attached.
      */
    val target: Output_[ARN] = js.native
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
    @JSImport("@pulumi/aws/iot/policyAttachment", "PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): PolicyAttachment = js.native
    @JSImport("@pulumi/aws/iot/policyAttachment", "PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PolicyAttachment = js.native
    @JSImport("@pulumi/aws/iot/policyAttachment", "PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState): PolicyAttachment = js.native
    @JSImport("@pulumi/aws/iot/policyAttachment", "PolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): PolicyAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iot/policyAttachment", "PolicyAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/policyAttachment.PolicyAttachment */ Boolean = js.native
  }
  
  @js.native
  trait PolicyAttachmentArgs extends StObject {
    
    /**
      * The name of the policy to attach.
      */
    val policy: Input[String | Policy] = js.native
    
    /**
      * The identity to which the policy is attached.
      */
    val target: Input[ARN] = js.native
  }
  object PolicyAttachmentArgs {
    
    @scala.inline
    implicit class PolicyAttachmentArgsMutableBuilder[Self <: PolicyAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: Input[String | Policy]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Input[ARN]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PolicyAttachmentState extends StObject {
    
    /**
      * The name of the policy to attach.
      */
    val policy: js.UndefOr[Input[String | Policy]] = js.native
    
    /**
      * The identity to which the policy is attached.
      */
    val target: js.UndefOr[Input[ARN]] = js.native
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
      def setPolicy(value: Input[String | Policy]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setTarget(value: Input[ARN]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
