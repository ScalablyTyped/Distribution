package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdDomainJoinPassword extends js.Object {
  var adDomainJoinPassword: js.UndefOr[String] = js.undefined
  var adDomainJoinUser: js.UndefOr[String] = js.undefined
  var crossRealmTrustPrincipalPassword: js.UndefOr[String] = js.undefined
  var kdcAdminPassword: String
  var realm: String
}

object Anon_AdDomainJoinPassword {
  @scala.inline
  def apply(
    kdcAdminPassword: String,
    realm: String,
    adDomainJoinPassword: String = null,
    adDomainJoinUser: String = null,
    crossRealmTrustPrincipalPassword: String = null
  ): Anon_AdDomainJoinPassword = {
    val __obj = js.Dynamic.literal(kdcAdminPassword = kdcAdminPassword, realm = realm)
    if (adDomainJoinPassword != null) __obj.updateDynamic("adDomainJoinPassword")(adDomainJoinPassword)
    if (adDomainJoinUser != null) __obj.updateDynamic("adDomainJoinUser")(adDomainJoinUser)
    if (crossRealmTrustPrincipalPassword != null) __obj.updateDynamic("crossRealmTrustPrincipalPassword")(crossRealmTrustPrincipalPassword)
    __obj.asInstanceOf[Anon_AdDomainJoinPassword]
  }
}

