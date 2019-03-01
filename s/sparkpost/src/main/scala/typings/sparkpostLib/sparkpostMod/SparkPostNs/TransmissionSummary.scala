package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransmissionSummary extends js.Object {
  /** Name of the campaign */
  var campaign_id: java.lang.String
  /** Content that will be used to construct a message */
  var content: sparkpostLib.Anon_TemplateidString
  /** Description of the transmission */
  var description: java.lang.String
  /** ID of the transmission */
  var id: java.lang.String
  /** State of the transmission */
  var state: sparkpostLib.sparkpostLibStrings.submitted | sparkpostLib.sparkpostLibStrings.Generating | sparkpostLib.sparkpostLibStrings.Success | sparkpostLib.sparkpostLibStrings.Canceled
}

object TransmissionSummary {
  @scala.inline
  def apply(
    campaign_id: java.lang.String,
    content: sparkpostLib.Anon_TemplateidString,
    description: java.lang.String,
    id: java.lang.String,
    state: sparkpostLib.sparkpostLibStrings.submitted | sparkpostLib.sparkpostLibStrings.Generating | sparkpostLib.sparkpostLibStrings.Success | sparkpostLib.sparkpostLibStrings.Canceled
  ): TransmissionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("campaign_id")(campaign_id)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransmissionSummary]
  }
}

