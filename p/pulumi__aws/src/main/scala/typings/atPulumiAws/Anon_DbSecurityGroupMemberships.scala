package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DbSecurityGroupMemberships extends js.Object {
  var dbSecurityGroupMemberships: js.UndefOr[js.Array[String]] = js.undefined
  var optionName: String
  var optionSettings: js.UndefOr[js.Array[Anon_Name]] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var vpcSecurityGroupMemberships: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_DbSecurityGroupMemberships {
  @scala.inline
  def apply(
    optionName: String,
    dbSecurityGroupMemberships: js.Array[String] = null,
    optionSettings: js.Array[Anon_Name] = null,
    port: Int | Double = null,
    version: String = null,
    vpcSecurityGroupMemberships: js.Array[String] = null
  ): Anon_DbSecurityGroupMemberships = {
    val __obj = js.Dynamic.literal(optionName = optionName)
    if (dbSecurityGroupMemberships != null) __obj.updateDynamic("dbSecurityGroupMemberships")(dbSecurityGroupMemberships)
    if (optionSettings != null) __obj.updateDynamic("optionSettings")(optionSettings)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    if (vpcSecurityGroupMemberships != null) __obj.updateDynamic("vpcSecurityGroupMemberships")(vpcSecurityGroupMemberships)
    __obj.asInstanceOf[Anon_DbSecurityGroupMemberships]
  }
}

