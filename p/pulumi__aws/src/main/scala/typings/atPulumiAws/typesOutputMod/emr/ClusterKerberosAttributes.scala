package typings.atPulumiAws.typesOutputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterKerberosAttributes extends js.Object {
  var adDomainJoinPassword: js.UndefOr[String] = js.native
  var adDomainJoinUser: js.UndefOr[String] = js.native
  var crossRealmTrustPrincipalPassword: js.UndefOr[String] = js.native
  var kdcAdminPassword: String = js.native
  var realm: String = js.native
}

object ClusterKerberosAttributes {
  @scala.inline
  def apply(
    kdcAdminPassword: String,
    realm: String,
    adDomainJoinPassword: String = null,
    adDomainJoinUser: String = null,
    crossRealmTrustPrincipalPassword: String = null
  ): ClusterKerberosAttributes = {
    val __obj = js.Dynamic.literal(kdcAdminPassword = kdcAdminPassword.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    if (adDomainJoinPassword != null) __obj.updateDynamic("adDomainJoinPassword")(adDomainJoinPassword.asInstanceOf[js.Any])
    if (adDomainJoinUser != null) __obj.updateDynamic("adDomainJoinUser")(adDomainJoinUser.asInstanceOf[js.Any])
    if (crossRealmTrustPrincipalPassword != null) __obj.updateDynamic("crossRealmTrustPrincipalPassword")(crossRealmTrustPrincipalPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterKerberosAttributes]
  }
}

