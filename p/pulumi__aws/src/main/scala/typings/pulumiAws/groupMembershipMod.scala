package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMembershipMod {
  
  @JSImport("@pulumi/aws/iam/groupMembership", "GroupMembership")
  @js.native
  class GroupMembership protected () extends CustomResource {
    /**
      * Create a GroupMembership resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupMembershipArgs) = this()
    def this(name: String, args: GroupMembershipArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The IAM Group name to attach the list of `users` to
      */
    val group: Output_[String] = js.native
    
    /**
      * The name to identify the Group Membership
      */
    val name: Output_[String] = js.native
    
    /**
      * A list of IAM User names to associate with the Group
      */
    val users: Output_[js.Array[String]] = js.native
  }
  /* static members */
  object GroupMembership {
    
    @JSImport("@pulumi/aws/iam/groupMembership", "GroupMembership")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing GroupMembership resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): GroupMembership = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[GroupMembership]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): GroupMembership = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GroupMembership]
    inline def get(name: String, id: Input[ID], state: GroupMembershipState): GroupMembership = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[GroupMembership]
    inline def get(name: String, id: Input[ID], state: GroupMembershipState, opts: CustomResourceOptions): GroupMembership = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GroupMembership]
    
    /**
      * Returns true if the given object is an instance of GroupMembership.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/groupMembership.GroupMembership */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iam/groupMembership.GroupMembership */ Boolean]
  }
  
  trait GroupMembershipArgs extends StObject {
    
    /**
      * The IAM Group name to attach the list of `users` to
      */
    val group: Input[String]
    
    /**
      * The name to identify the Group Membership
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of IAM User names to associate with the Group
      */
    val users: Input[js.Array[Input[String]]]
  }
  object GroupMembershipArgs {
    
    inline def apply(group: Input[String], users: Input[js.Array[Input[String]]]): GroupMembershipArgs = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupMembershipArgs]
    }
    
    extension [Self <: GroupMembershipArgs](x: Self) {
      
      inline def setGroup(value: Input[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUsers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: Input[String]*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  trait GroupMembershipState extends StObject {
    
    /**
      * The IAM Group name to attach the list of `users` to
      */
    val group: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name to identify the Group Membership
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of IAM User names to associate with the Group
      */
    val users: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object GroupMembershipState {
    
    inline def apply(): GroupMembershipState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupMembershipState]
    }
    
    extension [Self <: GroupMembershipState](x: Self) {
      
      inline def setGroup(value: Input[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUsers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
      
      inline def setUsersVarargs(value: Input[String]*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
}
