package typings.sparkpost.sparkpostMod

import typings.sparkpost.Anon_TemplateidString
import typings.sparkpost.sparkpostStrings.Canceled
import typings.sparkpost.sparkpostStrings.Generating
import typings.sparkpost.sparkpostStrings.Success
import typings.sparkpost.sparkpostStrings.submitted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransmissionSummary extends js.Object {
  /** Name of the campaign */
  var campaign_id: String
  /** Content that will be used to construct a message */
  var content: Anon_TemplateidString
  /** Description of the transmission */
  var description: String
  /** ID of the transmission */
  var id: String
  /** State of the transmission */
  var state: submitted | Generating | Success | Canceled
}

object TransmissionSummary {
  @scala.inline
  def apply(
    campaign_id: String,
    content: Anon_TemplateidString,
    description: String,
    id: String,
    state: submitted | Generating | Success | Canceled
  ): TransmissionSummary = {
    val __obj = js.Dynamic.literal(campaign_id = campaign_id, content = content, description = description, id = id, state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransmissionSummary]
  }
}

