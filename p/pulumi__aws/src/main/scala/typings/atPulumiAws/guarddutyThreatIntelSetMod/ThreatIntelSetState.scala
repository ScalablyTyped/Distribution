package typings.atPulumiAws.guarddutyThreatIntelSetMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatIntelSetState extends js.Object {
  /**
    * Specifies whether GuardDuty is to start using the uploaded ThreatIntelSet.
    */
  val activate: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The format of the file that contains the ThreatIntelSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
    */
  val format: js.UndefOr[Input[String]] = js.undefined
  /**
    * The URI of the file that contains the ThreatIntelSet.
    */
  val location: js.UndefOr[Input[String]] = js.undefined
  /**
    * The friendly name to identify the ThreatIntelSet.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object ThreatIntelSetState {
  @scala.inline
  def apply(
    activate: Input[Boolean] = null,
    detectorId: Input[String] = null,
    format: Input[String] = null,
    location: Input[String] = null,
    name: Input[String] = null
  ): ThreatIntelSetState = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate.asInstanceOf[js.Any])
    if (detectorId != null) __obj.updateDynamic("detectorId")(detectorId.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreatIntelSetState]
  }
}

