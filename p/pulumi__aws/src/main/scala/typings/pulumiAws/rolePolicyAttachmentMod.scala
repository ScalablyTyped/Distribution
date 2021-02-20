package typings.pulumiAws

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iamMod.Role
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rolePolicyAttachmentMod {
  
  @JSImport("@pulumi/aws/iam/rolePolicyAttachment", "RolePolicyAttachment")
  @js.native
  class RolePolicyAttachment protected () extends CustomResource {
    /**
      * Create a RolePolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RolePolicyAttachmentArgs) = this()
    def this(name: String, args: RolePolicyAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the policy you want to apply
      */
    val policyArn: Output_[ARN] = js.native
    
    /**
      * The role the policy should be applied to
      */
    val role: Output_[String] = js.native
  }
  /* static members */
  object RolePolicyAttachment {
    
    /**
      * Get an existing RolePolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iam/rolePolicyAttachment", "RolePolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): RolePolicyAttachment = js.native
    @JSImport("@pulumi/aws/iam/rolePolicyAttachment", "RolePolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RolePolicyAttachment = js.native
    @JSImport("@pulumi/aws/iam/rolePolicyAttachment", "RolePolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: RolePolicyAttachmentState): RolePolicyAttachment = js.native
    @JSImport("@pulumi/aws/iam/rolePolicyAttachment", "RolePolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: RolePolicyAttachmentState, opts: CustomResourceOptions): RolePolicyAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of RolePolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iam/rolePolicyAttachment", "RolePolicyAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/rolePolicyAttachment.RolePolicyAttachment */ Boolean = js.native
  }
  
  @js.native
  trait RolePolicyAttachmentArgs extends StObject {
    
    /**
      * The ARN of the policy you want to apply
      */
    val policyArn: Input[ARN] = js.native
    
    /**
      * The role the policy should be applied to
      */
    val role: Input[String | Role] = js.native
  }
  object RolePolicyAttachmentArgs {
    
    @scala.inline
    implicit class RolePolicyAttachmentArgsMutableBuilder[Self <: RolePolicyAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicyArn(value: Input[ARN]): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: Input[String | Role]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RolePolicyAttachmentState extends StObject {
    
    /**
      * The ARN of the policy you want to apply
      */
    val policyArn: js.UndefOr[Input[ARN]] = js.native
    
    /**
      * The role the policy should be applied to
      */
    val role: js.UndefOr[Input[String | Role]] = js.native
  }
  object RolePolicyAttachmentState {
    
    @scala.inline
    def apply(): RolePolicyAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RolePolicyAttachmentState]
    }
    
    @scala.inline
    implicit class RolePolicyAttachmentStateMutableBuilder[Self <: RolePolicyAttachmentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicyArn(value: Input[ARN]): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyArnUndefined: Self = StObject.set(x, "policyArn", js.undefined)
      
      @scala.inline
      def setRole(value: Input[String | Role]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
}
