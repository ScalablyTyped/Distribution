package typings.pulumiAws.iPSetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPSetState extends js.Object {
  /**
    * Specifies whether GuardDuty is to start using the uploaded IPSet.
    */
  val activate: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: js.UndefOr[Input[String]] = js.native
  /**
    * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
    */
  val format: js.UndefOr[Input[String]] = js.native
  /**
    * The URI of the file that contains the IPSet.
    */
  val location: js.UndefOr[Input[String]] = js.native
  /**
    * The friendly name to identify the IPSet.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object IPSetState {
  @scala.inline
  def apply(
    activate: Input[Boolean] = null,
    detectorId: Input[String] = null,
    format: Input[String] = null,
    location: Input[String] = null,
    name: Input[String] = null
  ): IPSetState = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate.asInstanceOf[js.Any])
    if (detectorId != null) __obj.updateDynamic("detectorId")(detectorId.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetState]
  }
}

