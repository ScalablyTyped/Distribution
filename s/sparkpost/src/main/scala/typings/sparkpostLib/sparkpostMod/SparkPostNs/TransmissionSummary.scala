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

