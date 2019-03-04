package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transmission extends js.Object {
  /** Name of the campaign */
  var campaign_id: java.lang.String
  /** Content that will be used to construct a message */
  var content: InlineContent | sparkpostLib.Anon_Templateid | sparkpostLib.Anon_Emailrfc822
  /** Description of the transmission */
  var description: java.lang.String
  /** ID of the transmission */
  var id: java.lang.String
  /** Transmission level metadata containing key/value pairs */
  var metadata: js.Any
  /** Computed total number of failed messages */
  var num_failed_generation: scala.Double
  /** Computed total number of messages generated */
  var num_generated: scala.Double
  /** Number of recipients that failed input validation */
  var num_invalid_recipients: scala.Double
  /** JSON object in which transmission options are defined */
  var options: TransmissionOptions
  var rcpt_list_chunk_size: scala.Double
  var rcpt_list_total_chunks: scala.Double
  /** State of the transmission */
  var state: sparkpostLib.sparkpostLibStrings.submitted | sparkpostLib.sparkpostLibStrings.Generating | sparkpostLib.sparkpostLibStrings.Success | sparkpostLib.sparkpostLibStrings.Canceled
  /** Key/value pairs that are provided to the substitution engine */
  var substitution_data: js.Any
}

object Transmission {
  @scala.inline
  def apply(
    campaign_id: java.lang.String,
    content: InlineContent | sparkpostLib.Anon_Templateid | sparkpostLib.Anon_Emailrfc822,
    description: java.lang.String,
    id: java.lang.String,
    metadata: js.Any,
    num_failed_generation: scala.Double,
    num_generated: scala.Double,
    num_invalid_recipients: scala.Double,
    options: TransmissionOptions,
    rcpt_list_chunk_size: scala.Double,
    rcpt_list_total_chunks: scala.Double,
    state: sparkpostLib.sparkpostLibStrings.submitted | sparkpostLib.sparkpostLibStrings.Generating | sparkpostLib.sparkpostLibStrings.Success | sparkpostLib.sparkpostLibStrings.Canceled,
    substitution_data: js.Any
  ): Transmission = {
    val __obj = js.Dynamic.literal(campaign_id = campaign_id, content = content.asInstanceOf[js.Any], description = description, id = id, metadata = metadata, num_failed_generation = num_failed_generation, num_generated = num_generated, num_invalid_recipients = num_invalid_recipients, options = options, rcpt_list_chunk_size = rcpt_list_chunk_size, rcpt_list_total_chunks = rcpt_list_total_chunks, state = state.asInstanceOf[js.Any], substitution_data = substitution_data)
  
    __obj.asInstanceOf[Transmission]
  }
}

