package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/organizations/policyAttachment", "PolicyAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): PolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[PolicyAttachment]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): PolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PolicyAttachment]
    inline def get(name: String, id: Input[ID], state: PolicyAttachmentState): PolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PolicyAttachment]
    inline def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): PolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PolicyAttachment]
    
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/policyAttachment.PolicyAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/organizations/policyAttachment.PolicyAttachment */ Boolean]
  }
  
  trait PolicyAttachmentArgs extends StObject {
    
    /**
      * The unique identifier (ID) of the policy that you want to attach to the target.
      */
    val policyId: Input[String]
    
    /**
      * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
      */
    val targetId: Input[String]
  }
  object PolicyAttachmentArgs {
    
    inline def apply(policyId: Input[String], targetId: Input[String]): PolicyAttachmentArgs = {
      val __obj = js.Dynamic.literal(policyId = policyId.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyAttachmentArgs]
    }
    
    extension [Self <: PolicyAttachmentArgs](x: Self) {
      
      inline def setPolicyId(value: Input[String]): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
      
      inline def setTargetId(value: Input[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyAttachmentState extends StObject {
    
    /**
      * The unique identifier (ID) of the policy that you want to attach to the target.
      */
    val policyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
      */
    val targetId: js.UndefOr[Input[String]] = js.undefined
  }
  object PolicyAttachmentState {
    
    inline def apply(): PolicyAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolicyAttachmentState]
    }
    
    extension [Self <: PolicyAttachmentState](x: Self) {
      
      inline def setPolicyId(value: Input[String]): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
      
      inline def setPolicyIdUndefined: Self = StObject.set(x, "policyId", js.undefined)
      
      inline def setTargetId(value: Input[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    }
  }
}
