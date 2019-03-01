package typings
package atPulumiAwsLib.licensemanagerLicenseConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseConfigurationState extends js.Object {
  /**
    * Description of the license configuration.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Number of licenses managed by the license configuration.
    */
  val licenseCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Sets the number of available licenses as a hard limit.
    */
  val licenseCountHardLimit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
    */
  val licenseCountingType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Array of configured License Manager rules.
    */
  val licenseRules: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Name of the license configuration.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object LicenseConfigurationState {
  @scala.inline
  def apply(
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    licenseCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    licenseCountHardLimit: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    licenseCountingType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    licenseRules: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): LicenseConfigurationState = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (licenseCount != null) __obj.updateDynamic("licenseCount")(licenseCount.asInstanceOf[js.Any])
    if (licenseCountHardLimit != null) __obj.updateDynamic("licenseCountHardLimit")(licenseCountHardLimit.asInstanceOf[js.Any])
    if (licenseCountingType != null) __obj.updateDynamic("licenseCountingType")(licenseCountingType.asInstanceOf[js.Any])
    if (licenseRules != null) __obj.updateDynamic("licenseRules")(licenseRules.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseConfigurationState]
  }
}

