package typings.pulumiAws

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiAws.iamMod.Role
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rolePolicyMod {
  
  @JSImport("@pulumi/aws/iam/rolePolicy", "RolePolicy")
  @js.native
  class RolePolicy protected () extends CustomResource {
    /**
      * Create a RolePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RolePolicyArgs) = this()
    def this(name: String, args: RolePolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the role policy. If omitted, this provider will
      * assign a random, unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: Output_[String] = js.native
    
    /**
      * The IAM role to attach to the policy.
      */
    val role: Output_[String] = js.native
  }
  /* static members */
  object RolePolicy {
    
    @JSImport("@pulumi/aws/iam/rolePolicy", "RolePolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RolePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): RolePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RolePolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RolePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RolePolicy]
    inline def get(name: String, id: Input[ID], state: RolePolicyState): RolePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RolePolicy]
    inline def get(name: String, id: Input[ID], state: RolePolicyState, opts: CustomResourceOptions): RolePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RolePolicy]
    
    /**
      * Returns true if the given object is an instance of RolePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/rolePolicy.RolePolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iam/rolePolicy.RolePolicy */ Boolean]
  }
  
  trait RolePolicyArgs extends StObject {
    
    /**
      * The name of the role policy. If omitted, this provider will
      * assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: Input[String | PolicyDocument]
    
    /**
      * The IAM role to attach to the policy.
      */
    val role: Input[String | Role]
  }
  object RolePolicyArgs {
    
    inline def apply(policy: Input[String | PolicyDocument], role: Input[String | Role]): RolePolicyArgs = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[RolePolicyArgs]
    }
    
    extension [Self <: RolePolicyArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setRole(value: Input[String | Role]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  trait RolePolicyState extends StObject {
    
    /**
      * The name of the role policy. If omitted, this provider will
      * assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
    
    /**
      * The IAM role to attach to the policy.
      */
    val role: js.UndefOr[Input[String | Role]] = js.undefined
  }
  object RolePolicyState {
    
    inline def apply(): RolePolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RolePolicyState]
    }
    
    extension [Self <: RolePolicyState](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setRole(value: Input[String | Role]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
}
