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
  var content: InlineContent | sparkpostLib.Anon_Templateid | sparkpostLib.Anon_Emailrfc822
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

object CreateTransmission {
  @scala.inline
  def apply(
    content: InlineContent | sparkpostLib.Anon_Templateid | sparkpostLib.Anon_Emailrfc822,
    bcc: js.Array[Recipient] = null,
    campaign_id: java.lang.String = null,
    cc: js.Array[Recipient] = null,
    description: java.lang.String = null,
    metadata: js.Any = null,
    options: TransmissionOptions = null,
    recipients: js.Array[Recipient] | sparkpostLib.Anon_Listid = null,
    return_path: java.lang.String = null,
    substitution_data: js.Any = null
  ): CreateTransmission = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc)
    if (campaign_id != null) __obj.updateDynamic("campaign_id")(campaign_id)
    if (cc != null) __obj.updateDynamic("cc")(cc)
    if (description != null) __obj.updateDynamic("description")(description)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (options != null) __obj.updateDynamic("options")(options)
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    if (return_path != null) __obj.updateDynamic("return_path")(return_path)
    if (substitution_data != null) __obj.updateDynamic("substitution_data")(substitution_data)
    __obj.asInstanceOf[CreateTransmission]
  }
}

