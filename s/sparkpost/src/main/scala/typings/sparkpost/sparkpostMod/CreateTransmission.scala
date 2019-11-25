package typings.sparkpost.sparkpostMod

import typings.sparkpost.Anon_Emailrfc822
import typings.sparkpost.Anon_Listid
import typings.sparkpost.Anon_Templateid
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
  var campaign_id: js.UndefOr[String] = js.undefined
  /**
    * Recipients to receive a carbon copy of the transmission
    *
    */
  var cc: js.UndefOr[js.Array[Recipient]] = js.undefined
  /** Content that will be used to construct a message */
  var content: InlineContent | Anon_Templateid | Anon_Emailrfc822
  /** Description of the transmission */
  var description: js.UndefOr[String] = js.undefined
  /** Transmission level metadata containing key/value pairs */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /** JSON object in which transmission options are defined */
  var options: js.UndefOr[TransmissionOptions] = js.undefined
  /** Inline recipient objects or object containing stored recipient list ID */
  var recipients: js.UndefOr[js.Array[Recipient] | Anon_Listid] = js.undefined
  /** SparkPost Enterprise API only: email to use for envelope FROM */
  var return_path: js.UndefOr[String] = js.undefined
  /** Key/value pairs that are provided to the substitution engine */
  var substitution_data: js.UndefOr[js.Any] = js.undefined
}

object CreateTransmission {
  @scala.inline
  def apply(
    content: InlineContent | Anon_Templateid | Anon_Emailrfc822,
    bcc: js.Array[Recipient] = null,
    campaign_id: String = null,
    cc: js.Array[Recipient] = null,
    description: String = null,
    metadata: js.Any = null,
    options: TransmissionOptions = null,
    recipients: js.Array[Recipient] | Anon_Listid = null,
    return_path: String = null,
    substitution_data: js.Any = null
  ): CreateTransmission = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (campaign_id != null) __obj.updateDynamic("campaign_id")(campaign_id.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    if (return_path != null) __obj.updateDynamic("return_path")(return_path.asInstanceOf[js.Any])
    if (substitution_data != null) __obj.updateDynamic("substitution_data")(substitution_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransmission]
  }
}

