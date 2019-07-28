package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdDomainJoinPasswordAdDomainJoinUser extends js.Object {
  var adDomainJoinPassword: js.UndefOr[Input[String]] = js.undefined
  var adDomainJoinUser: js.UndefOr[Input[String]] = js.undefined
  var crossRealmTrustPrincipalPassword: js.UndefOr[Input[String]] = js.undefined
  var kdcAdminPassword: Input[String]
  var realm: Input[String]
}

object Anon_AdDomainJoinPasswordAdDomainJoinUser {
  @scala.inline
  def apply(
    kdcAdminPassword: Input[String],
    realm: Input[String],
    adDomainJoinPassword: Input[String] = null,
    adDomainJoinUser: Input[String] = null,
    crossRealmTrustPrincipalPassword: Input[String] = null
  ): Anon_AdDomainJoinPasswordAdDomainJoinUser = {
    val __obj = js.Dynamic.literal(kdcAdminPassword = kdcAdminPassword.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    if (adDomainJoinPassword != null) __obj.updateDynamic("adDomainJoinPassword")(adDomainJoinPassword.asInstanceOf[js.Any])
    if (adDomainJoinUser != null) __obj.updateDynamic("adDomainJoinUser")(adDomainJoinUser.asInstanceOf[js.Any])
    if (crossRealmTrustPrincipalPassword != null) __obj.updateDynamic("crossRealmTrustPrincipalPassword")(crossRealmTrustPrincipalPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdDomainJoinPasswordAdDomainJoinUser]
  }
}

