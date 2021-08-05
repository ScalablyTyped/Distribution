package typings.pulumiAws

import typings.pulumiAws.outputMod.organizations.OrganizationalUnitAccount
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationalUnitMod {
  
  @JSImport("@pulumi/aws/organizations/organizationalUnit", "OrganizationalUnit")
  @js.native
  class OrganizationalUnit protected () extends CustomResource {
    /**
      * Create a OrganizationalUnit resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationalUnitArgs) = this()
    def this(name: String, args: OrganizationalUnitArgs, opts: CustomResourceOptions) = this()
    
    /**
      * List of child accounts for this Organizational Unit. Does not return account information for child Organizational Units. All elements have these attributes:
      */
    val accounts: Output_[js.Array[OrganizationalUnitAccount]] = js.native
    
    /**
      * ARN of the organizational unit
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name for the organizational unit
      */
    val name: Output_[String] = js.native
    
    /**
      * ID of the parent organizational unit, which may be the root
      */
    val parentId: Output_[String] = js.native
  }
  /* static members */
  object OrganizationalUnit {
    
    @JSImport("@pulumi/aws/organizations/organizationalUnit", "OrganizationalUnit")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing OrganizationalUnit resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): OrganizationalUnit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[OrganizationalUnit]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): OrganizationalUnit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[OrganizationalUnit]
    inline def get(name: String, id: Input[ID], state: OrganizationalUnitState): OrganizationalUnit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[OrganizationalUnit]
    inline def get(name: String, id: Input[ID], state: OrganizationalUnitState, opts: CustomResourceOptions): OrganizationalUnit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[OrganizationalUnit]
    
    /**
      * Returns true if the given object is an instance of OrganizationalUnit.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/organizationalUnit.OrganizationalUnit */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/organizations/organizationalUnit.OrganizationalUnit */ Boolean]
  }
  
  trait OrganizationalUnitArgs extends StObject {
    
    /**
      * The name for the organizational unit
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ID of the parent organizational unit, which may be the root
      */
    val parentId: Input[String]
  }
  object OrganizationalUnitArgs {
    
    inline def apply(parentId: Input[String]): OrganizationalUnitArgs = {
      val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationalUnitArgs]
    }
    
    extension [Self <: OrganizationalUnitArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParentId(value: Input[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  trait OrganizationalUnitState extends StObject {
    
    /**
      * List of child accounts for this Organizational Unit. Does not return account information for child Organizational Units. All elements have these attributes:
      */
    val accounts: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.organizations.OrganizationalUnitAccount]]
        ]
      ] = js.undefined
    
    /**
      * ARN of the organizational unit
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name for the organizational unit
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ID of the parent organizational unit, which may be the root
      */
    val parentId: js.UndefOr[Input[String]] = js.undefined
  }
  object OrganizationalUnitState {
    
    inline def apply(): OrganizationalUnitState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationalUnitState]
    }
    
    extension [Self <: OrganizationalUnitState](x: Self) {
      
      inline def setAccounts(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.organizations.OrganizationalUnitAccount]]
            ]
      ): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
      
      inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
      
      inline def setAccountsVarargs(value: Input[typings.pulumiAws.inputMod.organizations.OrganizationalUnitAccount]*): Self = StObject.set(x, "accounts", js.Array(value :_*))
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParentId(value: Input[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    }
  }
}
