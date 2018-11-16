package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Transmission extends js.Object {
  /** Name of the campaign */
  var campaign_id: java.lang.String
  /** Content that will be used to construct a message */
  var content: InlineContent | sparkpostLib.Anon_TemplateidUsedrafttemplate | sparkpostLib.Anon_Emailrfc822
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

