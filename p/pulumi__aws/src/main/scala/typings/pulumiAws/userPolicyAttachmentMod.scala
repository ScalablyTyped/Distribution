package typings.pulumiAws

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iamMod.User
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userPolicyAttachmentMod {
  
  @JSImport("@pulumi/aws/iam/userPolicyAttachment", "UserPolicyAttachment")
  @js.native
  class UserPolicyAttachment protected () extends CustomResource {
    /**
      * Create a UserPolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserPolicyAttachmentArgs) = this()
    def this(name: String, args: UserPolicyAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the policy you want to apply
      */
    val policyArn: Output_[ARN] = js.native
    
    /**
      * The user the policy should be applied to
      */
    val user: Output_[String] = js.native
  }
  /* static members */
  object UserPolicyAttachment {
    
    @JSImport("@pulumi/aws/iam/userPolicyAttachment", "UserPolicyAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing UserPolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): UserPolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[UserPolicyAttachment]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): UserPolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UserPolicyAttachment]
    inline def get(name: String, id: Input[ID], state: UserPolicyAttachmentState): UserPolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[UserPolicyAttachment]
    inline def get(name: String, id: Input[ID], state: UserPolicyAttachmentState, opts: CustomResourceOptions): UserPolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UserPolicyAttachment]
    
    /**
      * Returns true if the given object is an instance of UserPolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userPolicyAttachment.UserPolicyAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iam/userPolicyAttachment.UserPolicyAttachment */ Boolean]
  }
  
  trait UserPolicyAttachmentArgs extends StObject {
    
    /**
      * The ARN of the policy you want to apply
      */
    val policyArn: Input[ARN]
    
    /**
      * The user the policy should be applied to
      */
    val user: Input[String | User]
  }
  object UserPolicyAttachmentArgs {
    
    extension [Self <: UserPolicyAttachmentArgs](x: Self) {
      
      inline def setPolicyArn(value: Input[ARN]): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
      
      inline def setUser(value: Input[String | User]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserPolicyAttachmentState extends StObject {
    
    /**
      * The ARN of the policy you want to apply
      */
    val policyArn: js.UndefOr[Input[ARN]] = js.undefined
    
    /**
      * The user the policy should be applied to
      */
    val user: js.UndefOr[Input[String | User]] = js.undefined
  }
  object UserPolicyAttachmentState {
    
    inline def apply(): UserPolicyAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserPolicyAttachmentState]
    }
    
    extension [Self <: UserPolicyAttachmentState](x: Self) {
      
      inline def setPolicyArn(value: Input[ARN]): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
      
      inline def setPolicyArnUndefined: Self = StObject.set(x, "policyArn", js.undefined)
      
      inline def setUser(value: Input[String | User]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
