package typings.atPulumiAws.typesInputMod.emr

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterKerberosAttributes extends js.Object {
  var adDomainJoinPassword: js.UndefOr[Input[String]] = js.native
  var adDomainJoinUser: js.UndefOr[Input[String]] = js.native
  var crossRealmTrustPrincipalPassword: js.UndefOr[Input[String]] = js.native
  var kdcAdminPassword: Input[String] = js.native
  var realm: Input[String] = js.native
}

object ClusterKerberosAttributes {
  @scala.inline
  def apply(
    kdcAdminPassword: Input[String],
    realm: Input[String],
    adDomainJoinPassword: Input[String] = null,
    adDomainJoinUser: Input[String] = null,
    crossRealmTrustPrincipalPassword: Input[String] = null
  ): ClusterKerberosAttributes = {
    val __obj = js.Dynamic.literal(kdcAdminPassword = kdcAdminPassword.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    if (adDomainJoinPassword != null) __obj.updateDynamic("adDomainJoinPassword")(adDomainJoinPassword.asInstanceOf[js.Any])
    if (adDomainJoinUser != null) __obj.updateDynamic("adDomainJoinUser")(adDomainJoinUser.asInstanceOf[js.Any])
    if (crossRealmTrustPrincipalPassword != null) __obj.updateDynamic("crossRealmTrustPrincipalPassword")(crossRealmTrustPrincipalPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterKerberosAttributes]
  }
}

