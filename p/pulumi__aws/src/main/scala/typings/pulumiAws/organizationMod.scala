package typings.pulumiAws

import typings.pulumiAws.outputMod.organizations.OrganizationAccount
import typings.pulumiAws.outputMod.organizations.OrganizationNonMasterAccount
import typings.pulumiAws.outputMod.organizations.OrganizationRoot
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationMod {
  
  @JSImport("@pulumi/aws/organizations/organization", "Organization")
  @js.native
  class Organization protected () extends CustomResource {
    /**
      * Create a Organization resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: OrganizationArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: OrganizationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * List of organization accounts including the master account. For a list excluding the master account, see the `nonMasterAccounts` attribute. All elements have these attributes:
      */
    val accounts: Output_[js.Array[OrganizationAccount]] = js.native
    
    /**
      * ARN of the root
      */
    val arn: Output_[String] = js.native
    
    /**
      * List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `featureSet` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
      */
    val awsServiceAccessPrincipals: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * List of Organizations policy types to enable in the Organization Root. Organization must have `featureSet` set to `ALL`. For additional information about valid policy types (e.g. `BACKUP_POLICY`, `SERVICE_CONTROL_POLICY`, and `TAG_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
      */
    val enabledPolicyTypes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Specify "ALL" (default) or "CONSOLIDATED_BILLING".
      */
    val featureSet: Output_[js.UndefOr[String]] = js.native
    
    /**
      * ARN of the master account
      */
    val masterAccountArn: Output_[String] = js.native
    
    /**
      * Email address of the master account
      */
    val masterAccountEmail: Output_[String] = js.native
    
    /**
      * Identifier of the master account
      */
    val masterAccountId: Output_[String] = js.native
    
    /**
      * List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
      */
    val nonMasterAccounts: Output_[js.Array[OrganizationNonMasterAccount]] = js.native
    
    /**
      * List of organization roots. All elements have these attributes:
      */
    val roots: Output_[js.Array[OrganizationRoot]] = js.native
  }
  /* static members */
  object Organization {
    
    @JSImport("@pulumi/aws/organizations/organization", "Organization")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Organization resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Organization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Organization]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Organization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Organization]
    inline def get(name: String, id: Input[ID], state: OrganizationState): Organization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Organization]
    inline def get(name: String, id: Input[ID], state: OrganizationState, opts: CustomResourceOptions): Organization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Organization]
    
    /**
      * Returns true if the given object is an instance of Organization.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/organization.Organization */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/organizations/organization.Organization */ Boolean]
  }
  
  trait OrganizationArgs extends StObject {
    
    /**
      * List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `featureSet` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
      */
    val awsServiceAccessPrincipals: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * List of Organizations policy types to enable in the Organization Root. Organization must have `featureSet` set to `ALL`. For additional information about valid policy types (e.g. `BACKUP_POLICY`, `SERVICE_CONTROL_POLICY`, and `TAG_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
      */
    val enabledPolicyTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Specify "ALL" (default) or "CONSOLIDATED_BILLING".
      */
    val featureSet: js.UndefOr[Input[String]] = js.undefined
  }
  object OrganizationArgs {
    
    inline def apply(): OrganizationArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationArgs]
    }
    
    extension [Self <: OrganizationArgs](x: Self) {
      
      inline def setAwsServiceAccessPrincipals(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "awsServiceAccessPrincipals", value.asInstanceOf[js.Any])
      
      inline def setAwsServiceAccessPrincipalsUndefined: Self = StObject.set(x, "awsServiceAccessPrincipals", js.undefined)
      
      inline def setAwsServiceAccessPrincipalsVarargs(value: Input[String]*): Self = StObject.set(x, "awsServiceAccessPrincipals", js.Array(value :_*))
      
      inline def setEnabledPolicyTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "enabledPolicyTypes", value.asInstanceOf[js.Any])
      
      inline def setEnabledPolicyTypesUndefined: Self = StObject.set(x, "enabledPolicyTypes", js.undefined)
      
      inline def setEnabledPolicyTypesVarargs(value: Input[String]*): Self = StObject.set(x, "enabledPolicyTypes", js.Array(value :_*))
      
      inline def setFeatureSet(value: Input[String]): Self = StObject.set(x, "featureSet", value.asInstanceOf[js.Any])
      
      inline def setFeatureSetUndefined: Self = StObject.set(x, "featureSet", js.undefined)
    }
  }
  
  trait OrganizationState extends StObject {
    
    /**
      * List of organization accounts including the master account. For a list excluding the master account, see the `nonMasterAccounts` attribute. All elements have these attributes:
      */
    val accounts: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.organizations.OrganizationAccount]]]
      ] = js.undefined
    
    /**
      * ARN of the root
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `featureSet` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
      */
    val awsServiceAccessPrincipals: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * List of Organizations policy types to enable in the Organization Root. Organization must have `featureSet` set to `ALL`. For additional information about valid policy types (e.g. `BACKUP_POLICY`, `SERVICE_CONTROL_POLICY`, and `TAG_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
      */
    val enabledPolicyTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Specify "ALL" (default) or "CONSOLIDATED_BILLING".
      */
    val featureSet: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ARN of the master account
      */
    val masterAccountArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Email address of the master account
      */
    val masterAccountEmail: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of the master account
      */
    val masterAccountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
      */
    val nonMasterAccounts: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.organizations.OrganizationNonMasterAccount]]
        ]
      ] = js.undefined
    
    /**
      * List of organization roots. All elements have these attributes:
      */
    val roots: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.organizations.OrganizationRoot]]]
      ] = js.undefined
  }
  object OrganizationState {
    
    inline def apply(): OrganizationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationState]
    }
    
    extension [Self <: OrganizationState](x: Self) {
      
      inline def setAccounts(value: Input[js.Array[Input[typings.pulumiAws.inputMod.organizations.OrganizationAccount]]]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
      
      inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
      
      inline def setAccountsVarargs(value: Input[typings.pulumiAws.inputMod.organizations.OrganizationAccount]*): Self = StObject.set(x, "accounts", js.Array(value :_*))
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAwsServiceAccessPrincipals(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "awsServiceAccessPrincipals", value.asInstanceOf[js.Any])
      
      inline def setAwsServiceAccessPrincipalsUndefined: Self = StObject.set(x, "awsServiceAccessPrincipals", js.undefined)
      
      inline def setAwsServiceAccessPrincipalsVarargs(value: Input[String]*): Self = StObject.set(x, "awsServiceAccessPrincipals", js.Array(value :_*))
      
      inline def setEnabledPolicyTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "enabledPolicyTypes", value.asInstanceOf[js.Any])
      
      inline def setEnabledPolicyTypesUndefined: Self = StObject.set(x, "enabledPolicyTypes", js.undefined)
      
      inline def setEnabledPolicyTypesVarargs(value: Input[String]*): Self = StObject.set(x, "enabledPolicyTypes", js.Array(value :_*))
      
      inline def setFeatureSet(value: Input[String]): Self = StObject.set(x, "featureSet", value.asInstanceOf[js.Any])
      
      inline def setFeatureSetUndefined: Self = StObject.set(x, "featureSet", js.undefined)
      
      inline def setMasterAccountArn(value: Input[String]): Self = StObject.set(x, "masterAccountArn", value.asInstanceOf[js.Any])
      
      inline def setMasterAccountArnUndefined: Self = StObject.set(x, "masterAccountArn", js.undefined)
      
      inline def setMasterAccountEmail(value: Input[String]): Self = StObject.set(x, "masterAccountEmail", value.asInstanceOf[js.Any])
      
      inline def setMasterAccountEmailUndefined: Self = StObject.set(x, "masterAccountEmail", js.undefined)
      
      inline def setMasterAccountId(value: Input[String]): Self = StObject.set(x, "masterAccountId", value.asInstanceOf[js.Any])
      
      inline def setMasterAccountIdUndefined: Self = StObject.set(x, "masterAccountId", js.undefined)
      
      inline def setNonMasterAccounts(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.organizations.OrganizationNonMasterAccount]]
            ]
      ): Self = StObject.set(x, "nonMasterAccounts", value.asInstanceOf[js.Any])
      
      inline def setNonMasterAccountsUndefined: Self = StObject.set(x, "nonMasterAccounts", js.undefined)
      
      inline def setNonMasterAccountsVarargs(value: Input[typings.pulumiAws.inputMod.organizations.OrganizationNonMasterAccount]*): Self = StObject.set(x, "nonMasterAccounts", js.Array(value :_*))
      
      inline def setRoots(value: Input[js.Array[Input[typings.pulumiAws.inputMod.organizations.OrganizationRoot]]]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsUndefined: Self = StObject.set(x, "roots", js.undefined)
      
      inline def setRootsVarargs(value: Input[typings.pulumiAws.inputMod.organizations.OrganizationRoot]*): Self = StObject.set(x, "roots", js.Array(value :_*))
    }
  }
}
