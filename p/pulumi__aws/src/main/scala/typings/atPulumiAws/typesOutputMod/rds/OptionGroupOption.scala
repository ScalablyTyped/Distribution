package typings.atPulumiAws.typesOutputMod.rds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionGroupOption extends js.Object {
  /**
    * A list of DB Security Groups for which the option is enabled.
    */
  var dbSecurityGroupMemberships: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The Name of the Option (e.g. MEMCACHED).
    */
  var optionName: String
  /**
    * A list of option settings to apply.
    */
  var optionSettings: js.UndefOr[js.Array[OptionGroupOptionOptionSetting]] = js.undefined
  /**
    * The Port number when connecting to the Option (e.g. 11211).
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * The version of the option (e.g. 13.1.0.0).
    */
  var version: js.UndefOr[String] = js.undefined
  /**
    * A list of VPC Security Groups for which the option is enabled.
    */
  var vpcSecurityGroupMemberships: js.UndefOr[js.Array[String]] = js.undefined
}

object OptionGroupOption {
  @scala.inline
  def apply(
    optionName: String,
    dbSecurityGroupMemberships: js.Array[String] = null,
    optionSettings: js.Array[OptionGroupOptionOptionSetting] = null,
    port: Int | Double = null,
    version: String = null,
    vpcSecurityGroupMemberships: js.Array[String] = null
  ): OptionGroupOption = {
    val __obj = js.Dynamic.literal(optionName = optionName)
    if (dbSecurityGroupMemberships != null) __obj.updateDynamic("dbSecurityGroupMemberships")(dbSecurityGroupMemberships)
    if (optionSettings != null) __obj.updateDynamic("optionSettings")(optionSettings)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    if (vpcSecurityGroupMemberships != null) __obj.updateDynamic("vpcSecurityGroupMemberships")(vpcSecurityGroupMemberships)
    __obj.asInstanceOf[OptionGroupOption]
  }
}

