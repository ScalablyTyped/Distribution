package typings.pulumiAws.outputMod.rds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupOption extends js.Object {
  /**
    * A list of DB Security Groups for which the option is enabled.
    */
  var dbSecurityGroupMemberships: js.UndefOr[js.Array[String]] = js.native
  /**
    * The Name of the Option (e.g. MEMCACHED).
    */
  var optionName: String = js.native
  /**
    * A list of option settings to apply.
    */
  var optionSettings: js.UndefOr[js.Array[OptionGroupOptionOptionSetting]] = js.native
  /**
    * The Port number when connecting to the Option (e.g. 11211).
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * The version of the option (e.g. 13.1.0.0).
    */
  var version: js.UndefOr[String] = js.native
  /**
    * A list of VPC Security Groups for which the option is enabled.
    */
  var vpcSecurityGroupMemberships: js.UndefOr[js.Array[String]] = js.native
}

object OptionGroupOption {
  @scala.inline
  def apply(optionName: String): OptionGroupOption = {
    val __obj = js.Dynamic.literal(optionName = optionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroupOption]
  }
  @scala.inline
  implicit class OptionGroupOptionOps[Self <: OptionGroupOption] (val x: Self) extends AnyVal {
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
    def setOptionName(value: String): Self = this.set("optionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDbSecurityGroupMembershipsVarargs(value: String*): Self = this.set("dbSecurityGroupMemberships", js.Array(value :_*))
    @scala.inline
    def setDbSecurityGroupMemberships(value: js.Array[String]): Self = this.set("dbSecurityGroupMemberships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbSecurityGroupMemberships: Self = this.set("dbSecurityGroupMemberships", js.undefined)
    @scala.inline
    def setOptionSettingsVarargs(value: OptionGroupOptionOptionSetting*): Self = this.set("optionSettings", js.Array(value :_*))
    @scala.inline
    def setOptionSettings(value: js.Array[OptionGroupOptionOptionSetting]): Self = this.set("optionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionSettings: Self = this.set("optionSettings", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVpcSecurityGroupMembershipsVarargs(value: String*): Self = this.set("vpcSecurityGroupMemberships", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroupMemberships(value: js.Array[String]): Self = this.set("vpcSecurityGroupMemberships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroupMemberships: Self = this.set("vpcSecurityGroupMemberships", js.undefined)
  }
  
}

