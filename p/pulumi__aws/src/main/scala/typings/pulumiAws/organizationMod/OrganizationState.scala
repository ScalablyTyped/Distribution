package typings.pulumiAws.organizationMod

import typings.pulumiAws.inputMod.organizations.OrganizationAccount
import typings.pulumiAws.inputMod.organizations.OrganizationNonMasterAccount
import typings.pulumiAws.inputMod.organizations.OrganizationRoot
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationState extends js.Object {
  
  /**
    * List of organization accounts including the master account. For a list excluding the master account, see the `nonMasterAccounts` attribute. All elements have these attributes:
    */
  val accounts: js.UndefOr[Input[js.Array[Input[OrganizationAccount]]]] = js.native
  
  /**
    * ARN of the root
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `featureSet` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
    */
  val awsServiceAccessPrincipals: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * List of Organizations policy types to enable in the Organization Root. Organization must have `featureSet` set to `ALL`. For additional information about valid policy types (e.g. `BACKUP_POLICY`, `SERVICE_CONTROL_POLICY`, and `TAG_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
    */
  val enabledPolicyTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Specify "ALL" (default) or "CONSOLIDATED_BILLING".
    */
  val featureSet: js.UndefOr[Input[String]] = js.native
  
  /**
    * ARN of the master account
    */
  val masterAccountArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Email address of the master account
    */
  val masterAccountEmail: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of the master account
    */
  val masterAccountId: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
    */
  val nonMasterAccounts: js.UndefOr[Input[js.Array[Input[OrganizationNonMasterAccount]]]] = js.native
  
  /**
    * List of organization roots. All elements have these attributes:
    */
  val roots: js.UndefOr[Input[js.Array[Input[OrganizationRoot]]]] = js.native
}
object OrganizationState {
  
  @scala.inline
  def apply(): OrganizationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationState]
  }
  
  @scala.inline
  implicit class OrganizationStateOps[Self <: OrganizationState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountsVarargs(value: Input[OrganizationAccount]*): Self = this.set("accounts", js.Array(value :_*))
    
    @scala.inline
    def setAccounts(value: Input[js.Array[Input[OrganizationAccount]]]): Self = this.set("accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccounts: Self = this.set("accounts", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAwsServiceAccessPrincipalsVarargs(value: Input[String]*): Self = this.set("awsServiceAccessPrincipals", js.Array(value :_*))
    
    @scala.inline
    def setAwsServiceAccessPrincipals(value: Input[js.Array[Input[String]]]): Self = this.set("awsServiceAccessPrincipals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsServiceAccessPrincipals: Self = this.set("awsServiceAccessPrincipals", js.undefined)
    
    @scala.inline
    def setEnabledPolicyTypesVarargs(value: Input[String]*): Self = this.set("enabledPolicyTypes", js.Array(value :_*))
    
    @scala.inline
    def setEnabledPolicyTypes(value: Input[js.Array[Input[String]]]): Self = this.set("enabledPolicyTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledPolicyTypes: Self = this.set("enabledPolicyTypes", js.undefined)
    
    @scala.inline
    def setFeatureSet(value: Input[String]): Self = this.set("featureSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureSet: Self = this.set("featureSet", js.undefined)
    
    @scala.inline
    def setMasterAccountArn(value: Input[String]): Self = this.set("masterAccountArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterAccountArn: Self = this.set("masterAccountArn", js.undefined)
    
    @scala.inline
    def setMasterAccountEmail(value: Input[String]): Self = this.set("masterAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterAccountEmail: Self = this.set("masterAccountEmail", js.undefined)
    
    @scala.inline
    def setMasterAccountId(value: Input[String]): Self = this.set("masterAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterAccountId: Self = this.set("masterAccountId", js.undefined)
    
    @scala.inline
    def setNonMasterAccountsVarargs(value: Input[OrganizationNonMasterAccount]*): Self = this.set("nonMasterAccounts", js.Array(value :_*))
    
    @scala.inline
    def setNonMasterAccounts(value: Input[js.Array[Input[OrganizationNonMasterAccount]]]): Self = this.set("nonMasterAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonMasterAccounts: Self = this.set("nonMasterAccounts", js.undefined)
    
    @scala.inline
    def setRootsVarargs(value: Input[OrganizationRoot]*): Self = this.set("roots", js.Array(value :_*))
    
    @scala.inline
    def setRoots(value: Input[js.Array[Input[OrganizationRoot]]]): Self = this.set("roots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoots: Self = this.set("roots", js.undefined)
  }
}
