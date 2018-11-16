package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateTransmission extends js.Object {
  /**
           * Recipients to discreetly receive a carbon copy of the transmission
           *
           */
  var bcc: js.UndefOr[js.Array[Recipient]] = js.undefined
  /** Name of the campaign */
  var campaign_id: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Recipients to receive a carbon copy of the transmission
           *
           */
  var cc: js.UndefOr[js.Array[Recipient]] = js.undefined
  /** Content that will be used to construct a message */
  var content: InlineContent | sparkpostLib.Anon_TemplateidUsedrafttemplate | sparkpostLib.Anon_Emailrfc822
  /** Description of the transmission */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Transmission level metadata containing key/value pairs */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /** JSON object in which transmission options are defined */
  var options: js.UndefOr[TransmissionOptions] = js.undefined
  /** Inline recipient objects or object containing stored recipient list ID */
  var recipients: js.UndefOr[js.Array[Recipient] | sparkpostLib.Anon_Listid] = js.undefined
  /** SparkPost Enterprise API only: email to use for envelope FROM */
  var return_path: js.UndefOr[java.lang.String] = js.undefined
  /** Key/value pairs that are provided to the substitution engine */
  var substitution_data: js.UndefOr[js.Any] = js.undefined
}

