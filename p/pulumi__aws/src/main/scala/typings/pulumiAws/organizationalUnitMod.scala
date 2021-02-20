package typings.pulumiAws

import typings.pulumiAws.outputMod.organizations.OrganizationalUnitAccount
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing OrganizationalUnit resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/organizations/organizationalUnit", "OrganizationalUnit.get")
    @js.native
    def get(name: String, id: Input[ID]): OrganizationalUnit = js.native
    @JSImport("@pulumi/aws/organizations/organizationalUnit", "OrganizationalUnit.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): OrganizationalUnit = js.native
    @JSImport("@pulumi/aws/organizations/organizationalUnit", "OrganizationalUnit.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationalUnitState): OrganizationalUnit = js.native
    @JSImport("@pulumi/aws/organizations/organizationalUnit", "OrganizationalUnit.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationalUnitState, opts: CustomResourceOptions): OrganizationalUnit = js.native
    
    /**
      * Returns true if the given object is an instance of OrganizationalUnit.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/organizations/organizationalUnit", "OrganizationalUnit.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/organizationalUnit.OrganizationalUnit */ Boolean = js.native
  }
  
  @js.native
  trait OrganizationalUnitArgs extends StObject {
    
    /**
      * The name for the organizational unit
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * ID of the parent organizational unit, which may be the root
      */
    val parentId: Input[String] = js.native
  }
  object OrganizationalUnitArgs {
    
    @scala.inline
    def apply(parentId: Input[String]): OrganizationalUnitArgs = {
      val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationalUnitArgs]
    }
    
    @scala.inline
    implicit class OrganizationalUnitArgsMutableBuilder[Self <: OrganizationalUnitArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParentId(value: Input[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OrganizationalUnitState extends StObject {
    
    /**
      * List of child accounts for this Organizational Unit. Does not return account information for child Organizational Units. All elements have these attributes:
      */
    val accounts: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.organizations.OrganizationalUnitAccount]]
        ]
      ] = js.native
    
    /**
      * ARN of the organizational unit
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name for the organizational unit
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * ID of the parent organizational unit, which may be the root
      */
    val parentId: js.UndefOr[Input[String]] = js.native
  }
  object OrganizationalUnitState {
    
    @scala.inline
    def apply(): OrganizationalUnitState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationalUnitState]
    }
    
    @scala.inline
    implicit class OrganizationalUnitStateMutableBuilder[Self <: OrganizationalUnitState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccounts(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.organizations.OrganizationalUnitAccount]]
            ]
      ): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
      
      @scala.inline
      def setAccountsVarargs(value: Input[typings.pulumiAws.inputMod.organizations.OrganizationalUnitAccount]*): Self = StObject.set(x, "accounts", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParentId(value: Input[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    }
  }
}
