package typings
package atPulumiAwsLib.guarddutyIPSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPSetArgs extends js.Object {
  /**
    * Specifies whether GuardDuty is to start using the uploaded IPSet.
    */
  val activate: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
    */
  val format: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The URI of the file that contains the IPSet.
    */
  val location: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The friendly name to identify the IPSet.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object IPSetArgs {
  @scala.inline
  def apply(
    activate: atPulumiPulumiLib.outputMod.Input[scala.Boolean],
    detectorId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    format: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    location: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): IPSetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activate")(activate.asInstanceOf[js.Any])
    __obj.updateDynamic("detectorId")(detectorId.asInstanceOf[js.Any])
    __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetArgs]
  }
}

