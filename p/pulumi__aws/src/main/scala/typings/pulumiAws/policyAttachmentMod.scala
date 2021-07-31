package typings.pulumiAws

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iamMod.Group
import typings.pulumiAws.iamMod.Role
import typings.pulumiAws.iamMod.User
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyAttachmentMod {
  
  @JSImport("@pulumi/aws/iam/policyAttachment", "PolicyAttachment")
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
      * The group(s) the policy should be applied to
      */
    val groups: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The name of the attachment. This cannot be an empty string.
      */
    val name: Output_[String] = js.native
    
    /**
      * The ARN of the policy you want to apply
      */
    val policyArn: Output_[ARN] = js.native
    
    /**
      * The role(s) the policy should be applied to
      */
    val roles: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The user(s) the policy should be applied to
      */
    val users: Output_[js.UndefOr[js.Array[String]]] = js.native
  }
  /* static members */
  object PolicyAttachment {
    
    @JSImport("@pulumi/aws/iam/policyAttachment", "PolicyAttachment")
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
    @scala.inline
    def get(name: String, id: Input[ID]): PolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[PolicyAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): PolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PolicyAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: PolicyAttachmentState): PolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PolicyAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): PolicyAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PolicyAttachment]
    
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/policyAttachment.PolicyAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iam/policyAttachment.PolicyAttachment */ Boolean]
  }
  
  trait PolicyAttachmentArgs extends StObject {
    
    /**
      * The group(s) the policy should be applied to
      */
    val groups: js.UndefOr[Input[js.Array[Input[String | Group]]]] = js.undefined
    
    /**
      * The name of the attachment. This cannot be an empty string.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the policy you want to apply
      */
    val policyArn: Input[ARN]
    
    /**
      * The role(s) the policy should be applied to
      */
    val roles: js.UndefOr[Input[js.Array[Input[String | Role]]]] = js.undefined
    
    /**
      * The user(s) the policy should be applied to
      */
    val users: js.UndefOr[Input[js.Array[Input[String | User]]]] = js.undefined
  }
  object PolicyAttachmentArgs {
    
    @scala.inline
    implicit class PolicyAttachmentArgsMutableBuilder[Self <: PolicyAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroups(value: Input[js.Array[Input[String | Group]]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: (Input[String | Group])*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicyArn(value: Input[ARN]): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoles(value: Input[js.Array[Input[String | Role]]]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
      
      @scala.inline
      def setRolesVarargs(value: (Input[String | Role])*): Self = StObject.set(x, "roles", js.Array(value :_*))
      
      @scala.inline
      def setUsers(value: Input[js.Array[Input[String | User]]]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
      
      @scala.inline
      def setUsersVarargs(value: (Input[String | User])*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  trait PolicyAttachmentState extends StObject {
    
    /**
      * The group(s) the policy should be applied to
      */
    val groups: js.UndefOr[Input[js.Array[Input[String | Group]]]] = js.undefined
    
    /**
      * The name of the attachment. This cannot be an empty string.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the policy you want to apply
      */
    val policyArn: js.UndefOr[Input[ARN]] = js.undefined
    
    /**
      * The role(s) the policy should be applied to
      */
    val roles: js.UndefOr[Input[js.Array[Input[String | Role]]]] = js.undefined
    
    /**
      * The user(s) the policy should be applied to
      */
    val users: js.UndefOr[Input[js.Array[Input[String | User]]]] = js.undefined
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
      def setGroups(value: Input[js.Array[Input[String | Group]]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: (Input[String | Group])*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicyArn(value: Input[ARN]): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyArnUndefined: Self = StObject.set(x, "policyArn", js.undefined)
      
      @scala.inline
      def setRoles(value: Input[js.Array[Input[String | Role]]]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
      
      @scala.inline
      def setRolesVarargs(value: (Input[String | Role])*): Self = StObject.set(x, "roles", js.Array(value :_*))
      
      @scala.inline
      def setUsers(value: Input[js.Array[Input[String | User]]]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
      
      @scala.inline
      def setUsersVarargs(value: (Input[String | User])*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
}
