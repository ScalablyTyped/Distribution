package typings.pulumiAws

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iamMod.Group
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupPolicyAttachmentMod {
  
  @JSImport("@pulumi/aws/iam/groupPolicyAttachment", "GroupPolicyAttachment")
  @js.native
  class GroupPolicyAttachment protected () extends CustomResource {
    /**
      * Create a GroupPolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupPolicyAttachmentArgs) = this()
    def this(name: String, args: GroupPolicyAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The group the policy should be applied to
      */
    val group: Output_[String] = js.native
    
    /**
      * The ARN of the policy you want to apply
      */
    val policyArn: Output_[ARN] = js.native
  }
  /* static members */
  object GroupPolicyAttachment {
    
    /**
      * Get an existing GroupPolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iam/groupPolicyAttachment", "GroupPolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): GroupPolicyAttachment = js.native
    @JSImport("@pulumi/aws/iam/groupPolicyAttachment", "GroupPolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): GroupPolicyAttachment = js.native
    @JSImport("@pulumi/aws/iam/groupPolicyAttachment", "GroupPolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupPolicyAttachmentState): GroupPolicyAttachment = js.native
    @JSImport("@pulumi/aws/iam/groupPolicyAttachment", "GroupPolicyAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupPolicyAttachmentState, opts: CustomResourceOptions): GroupPolicyAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of GroupPolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iam/groupPolicyAttachment", "GroupPolicyAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/groupPolicyAttachment.GroupPolicyAttachment */ Boolean = js.native
  }
  
  @js.native
  trait GroupPolicyAttachmentArgs extends StObject {
    
    /**
      * The group the policy should be applied to
      */
    val group: Input[String | Group] = js.native
    
    /**
      * The ARN of the policy you want to apply
      */
    val policyArn: Input[ARN] = js.native
  }
  object GroupPolicyAttachmentArgs {
    
    @scala.inline
    implicit class GroupPolicyAttachmentArgsMutableBuilder[Self <: GroupPolicyAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: Input[String | Group]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyArn(value: Input[ARN]): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GroupPolicyAttachmentState extends StObject {
    
    /**
      * The group the policy should be applied to
      */
    val group: js.UndefOr[Input[String | Group]] = js.native
    
    /**
      * The ARN of the policy you want to apply
      */
    val policyArn: js.UndefOr[Input[ARN]] = js.native
  }
  object GroupPolicyAttachmentState {
    
    @scala.inline
    def apply(): GroupPolicyAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupPolicyAttachmentState]
    }
    
    @scala.inline
    implicit class GroupPolicyAttachmentStateMutableBuilder[Self <: GroupPolicyAttachmentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: Input[String | Group]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setPolicyArn(value: Input[ARN]): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyArnUndefined: Self = StObject.set(x, "policyArn", js.undefined)
    }
  }
}
