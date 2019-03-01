package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdDomainJoinPassword extends js.Object {
  var adDomainJoinPassword: js.UndefOr[java.lang.String] = js.undefined
  var adDomainJoinUser: js.UndefOr[java.lang.String] = js.undefined
  var crossRealmTrustPrincipalPassword: js.UndefOr[java.lang.String] = js.undefined
  var kdcAdminPassword: java.lang.String
  var realm: java.lang.String
}

object Anon_AdDomainJoinPassword {
  @scala.inline
  def apply(
    kdcAdminPassword: java.lang.String,
    realm: java.lang.String,
    adDomainJoinPassword: java.lang.String = null,
    adDomainJoinUser: java.lang.String = null,
    crossRealmTrustPrincipalPassword: java.lang.String = null
  ): Anon_AdDomainJoinPassword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kdcAdminPassword")(kdcAdminPassword)
    __obj.updateDynamic("realm")(realm)
    if (adDomainJoinPassword != null) __obj.updateDynamic("adDomainJoinPassword")(adDomainJoinPassword)
    if (adDomainJoinUser != null) __obj.updateDynamic("adDomainJoinUser")(adDomainJoinUser)
    if (crossRealmTrustPrincipalPassword != null) __obj.updateDynamic("crossRealmTrustPrincipalPassword")(crossRealmTrustPrincipalPassword)
    __obj.asInstanceOf[Anon_AdDomainJoinPassword]
  }
}

