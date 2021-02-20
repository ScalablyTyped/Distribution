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

object userGroupMembershipMod {
  
  @JSImport("@pulumi/aws/iam/userGroupMembership", "UserGroupMembership")
  @js.native
  class UserGroupMembership protected () extends CustomResource {
    /**
      * Create a UserGroupMembership resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserGroupMembershipArgs) = this()
    def this(name: String, args: UserGroupMembershipArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A list of [IAM Groups](https://www.terraform.io/docs/providers/aws/r/iam_group.html) to add the user to
      */
    val groups: Output_[js.Array[String]] = js.native
    
    /**
      * The name of the [IAM User](https://www.terraform.io/docs/providers/aws/r/iam_user.html) to add to groups
      */
    val user: Output_[String] = js.native
  }
  /* static members */
  object UserGroupMembership {
    
    /**
      * Get an existing UserGroupMembership resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iam/userGroupMembership", "UserGroupMembership.get")
    @js.native
    def get(name: String, id: Input[ID]): UserGroupMembership = js.native
    @JSImport("@pulumi/aws/iam/userGroupMembership", "UserGroupMembership.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UserGroupMembership = js.native
    @JSImport("@pulumi/aws/iam/userGroupMembership", "UserGroupMembership.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserGroupMembershipState): UserGroupMembership = js.native
    @JSImport("@pulumi/aws/iam/userGroupMembership", "UserGroupMembership.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserGroupMembershipState, opts: CustomResourceOptions): UserGroupMembership = js.native
    
    /**
      * Returns true if the given object is an instance of UserGroupMembership.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iam/userGroupMembership", "UserGroupMembership.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userGroupMembership.UserGroupMembership */ Boolean = js.native
  }
  
  @js.native
  trait UserGroupMembershipArgs extends StObject {
    
    /**
      * A list of [IAM Groups](https://www.terraform.io/docs/providers/aws/r/iam_group.html) to add the user to
      */
    val groups: Input[js.Array[Input[String]]] = js.native
    
    /**
      * The name of the [IAM User](https://www.terraform.io/docs/providers/aws/r/iam_user.html) to add to groups
      */
    val user: Input[String] = js.native
  }
  object UserGroupMembershipArgs {
    
    @scala.inline
    def apply(groups: Input[js.Array[Input[String]]], user: Input[String]): UserGroupMembershipArgs = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserGroupMembershipArgs]
    }
    
    @scala.inline
    implicit class UserGroupMembershipArgsMutableBuilder[Self <: UserGroupMembershipArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserGroupMembershipState extends StObject {
    
    /**
      * A list of [IAM Groups](https://www.terraform.io/docs/providers/aws/r/iam_group.html) to add the user to
      */
    val groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The name of the [IAM User](https://www.terraform.io/docs/providers/aws/r/iam_user.html) to add to groups
      */
    val user: js.UndefOr[Input[String]] = js.native
  }
  object UserGroupMembershipState {
    
    @scala.inline
    def apply(): UserGroupMembershipState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserGroupMembershipState]
    }
    
    @scala.inline
    implicit class UserGroupMembershipStateMutableBuilder[Self <: UserGroupMembershipState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
