package typings.sparkpost.mod

import typings.sparkpost.anon.TemplateidString
import typings.sparkpost.sparkpostStrings.Canceled
import typings.sparkpost.sparkpostStrings.Generating
import typings.sparkpost.sparkpostStrings.Success
import typings.sparkpost.sparkpostStrings.submitted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransmissionSummary extends StObject {
  
  /** Name of the campaign */
  var campaign_id: String
  
  /** Content that will be used to construct a message */
  var content: TemplateidString
  
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
    content: TemplateidString,
    description: String,
    id: String,
    state: submitted | Generating | Success | Canceled
  ): TransmissionSummary = {
    val __obj = js.Dynamic.literal(campaign_id = campaign_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransmissionSummary]
  }
  
  @scala.inline
  implicit class TransmissionSummaryMutableBuilder[Self <: TransmissionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaign_id(value: String): Self = StObject.set(x, "campaign_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: TemplateidString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: submitted | Generating | Success | Canceled): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
