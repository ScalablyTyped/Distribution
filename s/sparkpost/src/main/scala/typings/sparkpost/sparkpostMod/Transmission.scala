package typings.sparkpost.sparkpostMod

import typings.sparkpost.Anon_Emailrfc822
import typings.sparkpost.Anon_Templateid
import typings.sparkpost.sparkpostStrings.Canceled
import typings.sparkpost.sparkpostStrings.Generating
import typings.sparkpost.sparkpostStrings.Success
import typings.sparkpost.sparkpostStrings.submitted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transmission extends js.Object {
  /** Name of the campaign */
  var campaign_id: String
  /** Content that will be used to construct a message */
  var content: InlineContent | Anon_Templateid | Anon_Emailrfc822
  /** Description of the transmission */
  var description: String
  /** ID of the transmission */
  var id: String
  /** Transmission level metadata containing key/value pairs */
  var metadata: js.Any
  /** Computed total number of failed messages */
  var num_failed_generation: Double
  /** Computed total number of messages generated */
  var num_generated: Double
  /** Number of recipients that failed input validation */
  var num_invalid_recipients: Double
  /** JSON object in which transmission options are defined */
  var options: TransmissionOptions
  var rcpt_list_chunk_size: Double
  var rcpt_list_total_chunks: Double
  /** State of the transmission */
  var state: submitted | Generating | Success | Canceled
  /** Key/value pairs that are provided to the substitution engine */
  var substitution_data: js.Any
}

object Transmission {
  @scala.inline
  def apply(
    campaign_id: String,
    content: InlineContent | Anon_Templateid | Anon_Emailrfc822,
    description: String,
    id: String,
    metadata: js.Any,
    num_failed_generation: Double,
    num_generated: Double,
    num_invalid_recipients: Double,
    options: TransmissionOptions,
    rcpt_list_chunk_size: Double,
    rcpt_list_total_chunks: Double,
    state: submitted | Generating | Success | Canceled,
    substitution_data: js.Any
  ): Transmission = {
    val __obj = js.Dynamic.literal(campaign_id = campaign_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], num_failed_generation = num_failed_generation.asInstanceOf[js.Any], num_generated = num_generated.asInstanceOf[js.Any], num_invalid_recipients = num_invalid_recipients.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rcpt_list_chunk_size = rcpt_list_chunk_size.asInstanceOf[js.Any], rcpt_list_total_chunks = rcpt_list_total_chunks.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], substitution_data = substitution_data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Transmission]
  }
}

