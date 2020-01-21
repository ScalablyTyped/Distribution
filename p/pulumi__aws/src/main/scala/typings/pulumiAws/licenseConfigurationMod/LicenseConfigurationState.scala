package typings.pulumiAws.licenseConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseConfigurationState extends js.Object {
  /**
    * Description of the license configuration.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Number of licenses managed by the license configuration.
    */
  val licenseCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Sets the number of available licenses as a hard limit.
    */
  val licenseCountHardLimit: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
    */
  val licenseCountingType: js.UndefOr[Input[String]] = js.native
  /**
    * Array of configured License Manager rules.
    */
  val licenseRules: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Name of the license configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object LicenseConfigurationState {
  @scala.inline
  def apply(
    description: Input[String] = null,
    licenseCount: Input[Double] = null,
    licenseCountHardLimit: Input[Boolean] = null,
    licenseCountingType: Input[String] = null,
    licenseRules: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
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

