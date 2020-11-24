package typings.sparkpost.mod

import typings.sparkpost.anon.Emailrfc822
import typings.sparkpost.anon.Templateid
import typings.sparkpost.sparkpostStrings.Canceled
import typings.sparkpost.sparkpostStrings.Generating
import typings.sparkpost.sparkpostStrings.Success
import typings.sparkpost.sparkpostStrings.submitted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transmission extends js.Object {
  
  /** Name of the campaign */
  var campaign_id: String = js.native
  
  /** Content that will be used to construct a message */
  var content: InlineContent | Templateid | Emailrfc822 = js.native
  
  /** Description of the transmission */
  var description: String = js.native
  
  /** ID of the transmission */
  var id: String = js.native
  
  /** Transmission level metadata containing key/value pairs */
  var metadata: js.Any = js.native
  
  /** Computed total number of failed messages */
  var num_failed_generation: Double = js.native
  
  /** Computed total number of messages generated */
  var num_generated: Double = js.native
  
  /** Number of recipients that failed input validation */
  var num_invalid_recipients: Double = js.native
  
  /** JSON object in which transmission options are defined */
  var options: TransmissionOptions = js.native
  
  var rcpt_list_chunk_size: Double = js.native
  
  var rcpt_list_total_chunks: Double = js.native
  
  /** State of the transmission */
  var state: submitted | Generating | Success | Canceled = js.native
  
  /** Key/value pairs that are provided to the substitution engine */
  var substitution_data: js.Any = js.native
}
object Transmission {
  
  @scala.inline
  def apply(
    campaign_id: String,
    content: InlineContent | Templateid | Emailrfc822,
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
  
  @scala.inline
  implicit class TransmissionOps[Self <: Transmission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCampaign_id(value: String): Self = this.set("campaign_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: InlineContent | Templateid | Emailrfc822): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_failed_generation(value: Double): Self = this.set("num_failed_generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_generated(value: Double): Self = this.set("num_generated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_invalid_recipients(value: Double): Self = this.set("num_invalid_recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: TransmissionOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRcpt_list_chunk_size(value: Double): Self = this.set("rcpt_list_chunk_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRcpt_list_total_chunks(value: Double): Self = this.set("rcpt_list_total_chunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: submitted | Generating | Success | Canceled): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitution_data(value: js.Any): Self = this.set("substitution_data", value.asInstanceOf[js.Any])
  }
}
