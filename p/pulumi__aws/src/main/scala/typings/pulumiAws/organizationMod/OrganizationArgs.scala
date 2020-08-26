package typings.pulumiAws.organizationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationArgs extends js.Object {
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
}

object OrganizationArgs {
  @scala.inline
  def apply(): OrganizationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationArgs]
  }
  @scala.inline
  implicit class OrganizationArgsOps[Self <: OrganizationArgs] (val x: Self) extends AnyVal {
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
  }
  
}

