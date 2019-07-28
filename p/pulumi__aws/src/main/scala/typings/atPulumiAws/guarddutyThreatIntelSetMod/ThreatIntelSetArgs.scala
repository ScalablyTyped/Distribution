package typings.atPulumiAws.guarddutyThreatIntelSetMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatIntelSetArgs extends js.Object {
  /**
    * Specifies whether GuardDuty is to start using the uploaded ThreatIntelSet.
    */
  val activate: Input[Boolean]
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: Input[String]
  /**
    * The format of the file that contains the ThreatIntelSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
    */
  val format: Input[String]
  /**
    * The URI of the file that contains the ThreatIntelSet.
    */
  val location: Input[String]
  /**
    * The friendly name to identify the ThreatIntelSet.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object ThreatIntelSetArgs {
  @scala.inline
  def apply(
    activate: Input[Boolean],
    detectorId: Input[String],
    format: Input[String],
    location: Input[String],
    name: Input[String] = null
  ): ThreatIntelSetArgs = {
    val __obj = js.Dynamic.literal(activate = activate.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreatIntelSetArgs]
  }
}

