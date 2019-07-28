package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DbSecurityGroupMembershipsOptionName extends js.Object {
  var dbSecurityGroupMemberships: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var optionName: Input[String]
  var optionSettings: js.UndefOr[Input[js.Array[Input[Anon_NameValue]]]] = js.undefined
  var port: js.UndefOr[Input[Double]] = js.undefined
  var version: js.UndefOr[Input[String]] = js.undefined
  var vpcSecurityGroupMemberships: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object Anon_DbSecurityGroupMembershipsOptionName {
  @scala.inline
  def apply(
    optionName: Input[String],
    dbSecurityGroupMemberships: Input[js.Array[Input[String]]] = null,
    optionSettings: Input[js.Array[Input[Anon_NameValue]]] = null,
    port: Input[Double] = null,
    version: Input[String] = null,
    vpcSecurityGroupMemberships: Input[js.Array[Input[String]]] = null
  ): Anon_DbSecurityGroupMembershipsOptionName = {
    val __obj = js.Dynamic.literal(optionName = optionName.asInstanceOf[js.Any])
    if (dbSecurityGroupMemberships != null) __obj.updateDynamic("dbSecurityGroupMemberships")(dbSecurityGroupMemberships.asInstanceOf[js.Any])
    if (optionSettings != null) __obj.updateDynamic("optionSettings")(optionSettings.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (vpcSecurityGroupMemberships != null) __obj.updateDynamic("vpcSecurityGroupMemberships")(vpcSecurityGroupMemberships.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DbSecurityGroupMembershipsOptionName]
  }
}

