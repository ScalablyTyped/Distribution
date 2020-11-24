package typings.sparkpost.mod

import typings.sparkpost.anon.TemplateidString
import typings.sparkpost.sparkpostStrings.Canceled
import typings.sparkpost.sparkpostStrings.Generating
import typings.sparkpost.sparkpostStrings.Success
import typings.sparkpost.sparkpostStrings.submitted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransmissionSummary extends js.Object {
  
  /** Name of the campaign */
  var campaign_id: String = js.native
  
  /** Content that will be used to construct a message */
  var content: TemplateidString = js.native
  
  /** Description of the transmission */
  var description: String = js.native
  
  /** ID of the transmission */
  var id: String = js.native
  
  /** State of the transmission */
  var state: submitted | Generating | Success | Canceled = js.native
}
object TransmissionSummary {
  
  @scala.inline
  def apply(
    campaign_id: String,
    content: TemplateidString,
    description: String,
    id: String,
    state: submitted | Generating | Success | Canceled
  ): TransmissionSummary = {
    val __obj = js.Dynamic.literal(campaign_id = campaign_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransmissionSummary]
  }
  
  @scala.inline
  implicit class TransmissionSummaryOps[Self <: TransmissionSummary] (val x: Self) extends AnyVal {
    
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
    def setContent(value: TemplateidString): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: submitted | Generating | Success | Canceled): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
