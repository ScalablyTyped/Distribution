package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdDomainJoinPasswordAdDomainJoinUser extends js.Object {
  var adDomainJoinPassword: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var adDomainJoinUser: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var crossRealmTrustPrincipalPassword: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var kdcAdminPassword: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var realm: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_AdDomainJoinPasswordAdDomainJoinUser {
  @scala.inline
  def apply(
    kdcAdminPassword: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    realm: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    adDomainJoinPassword: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    adDomainJoinUser: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    crossRealmTrustPrincipalPassword: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_AdDomainJoinPasswordAdDomainJoinUser = {
    val __obj = js.Dynamic.literal(kdcAdminPassword = kdcAdminPassword.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    if (adDomainJoinPassword != null) __obj.updateDynamic("adDomainJoinPassword")(adDomainJoinPassword.asInstanceOf[js.Any])
    if (adDomainJoinUser != null) __obj.updateDynamic("adDomainJoinUser")(adDomainJoinUser.asInstanceOf[js.Any])
    if (crossRealmTrustPrincipalPassword != null) __obj.updateDynamic("crossRealmTrustPrincipalPassword")(crossRealmTrustPrincipalPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdDomainJoinPasswordAdDomainJoinUser]
  }
}

