package typings.pulumiAws.iPSetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPSetArgs extends js.Object {
  /**
    * Specifies whether GuardDuty is to start using the uploaded IPSet.
    */
  val activate: Input[Boolean] = js.native
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: Input[String] = js.native
  /**
    * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
    */
  val format: Input[String] = js.native
  /**
    * The URI of the file that contains the IPSet.
    */
  val location: Input[String] = js.native
  /**
    * The friendly name to identify the IPSet.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object IPSetArgs {
  @scala.inline
  def apply(
    activate: Input[Boolean],
    detectorId: Input[String],
    format: Input[String],
    location: Input[String],
    name: Input[String] = null
  ): IPSetArgs = {
    val __obj = js.Dynamic.literal(activate = activate.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetArgs]
  }
}

