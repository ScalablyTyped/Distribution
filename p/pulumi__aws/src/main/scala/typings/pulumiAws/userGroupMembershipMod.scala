package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/iam/userGroupMembership", "UserGroupMembership")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing UserGroupMembership resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): UserGroupMembership = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[UserGroupMembership]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): UserGroupMembership = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UserGroupMembership]
    inline def get(name: String, id: Input[ID], state: UserGroupMembershipState): UserGroupMembership = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[UserGroupMembership]
    inline def get(name: String, id: Input[ID], state: UserGroupMembershipState, opts: CustomResourceOptions): UserGroupMembership = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UserGroupMembership]
    
    /**
      * Returns true if the given object is an instance of UserGroupMembership.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/userGroupMembership.UserGroupMembership */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iam/userGroupMembership.UserGroupMembership */ Boolean]
  }
  
  trait UserGroupMembershipArgs extends StObject {
    
    /**
      * A list of [IAM Groups](https://www.terraform.io/docs/providers/aws/r/iam_group.html) to add the user to
      */
    val groups: Input[js.Array[Input[String]]]
    
    /**
      * The name of the [IAM User](https://www.terraform.io/docs/providers/aws/r/iam_user.html) to add to groups
      */
    val user: Input[String]
  }
  object UserGroupMembershipArgs {
    
    inline def apply(groups: Input[js.Array[Input[String]]], user: Input[String]): UserGroupMembershipArgs = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserGroupMembershipArgs]
    }
    
    extension [Self <: UserGroupMembershipArgs](x: Self) {
      
      inline def setGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      inline def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserGroupMembershipState extends StObject {
    
    /**
      * A list of [IAM Groups](https://www.terraform.io/docs/providers/aws/r/iam_group.html) to add the user to
      */
    val groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of the [IAM User](https://www.terraform.io/docs/providers/aws/r/iam_user.html) to add to groups
      */
    val user: js.UndefOr[Input[String]] = js.undefined
  }
  object UserGroupMembershipState {
    
    inline def apply(): UserGroupMembershipState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserGroupMembershipState]
    }
    
    extension [Self <: UserGroupMembershipState](x: Self) {
      
      inline def setGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      inline def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
