package typings.sparkpost.mod

import typings.sparkpost.anon.Emailrfc822
import typings.sparkpost.anon.Listid
import typings.sparkpost.anon.Templateid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransmission extends StObject {
  
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
  var content: InlineContent | Templateid | Emailrfc822
  
  /** Description of the transmission */
  var description: js.UndefOr[String] = js.undefined
  
  /** Transmission level metadata containing key/value pairs */
  var metadata: js.UndefOr[js.Any] = js.undefined
  
  /** JSON object in which transmission options are defined */
  var options: js.UndefOr[TransmissionOptions] = js.undefined
  
  /** Inline recipient objects or object containing stored recipient list ID */
  var recipients: js.UndefOr[js.Array[Recipient] | Listid] = js.undefined
  
  /** SparkPost Enterprise API only: email to use for envelope FROM */
  var return_path: js.UndefOr[String] = js.undefined
  
  /** Key/value pairs that are provided to the substitution engine */
  var substitution_data: js.UndefOr[js.Any] = js.undefined
}
object CreateTransmission {
  
  @scala.inline
  def apply(content: InlineContent | Templateid | Emailrfc822): CreateTransmission = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransmission]
  }
  
  @scala.inline
  implicit class CreateTransmissionMutableBuilder[Self <: CreateTransmission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBcc(value: js.Array[Recipient]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
    
    @scala.inline
    def setBccVarargs(value: Recipient*): Self = StObject.set(x, "bcc", js.Array(value :_*))
    
    @scala.inline
    def setCampaign_id(value: String): Self = StObject.set(x, "campaign_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaign_idUndefined: Self = StObject.set(x, "campaign_id", js.undefined)
    
    @scala.inline
    def setCc(value: js.Array[Recipient]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
    
    @scala.inline
    def setCcVarargs(value: Recipient*): Self = StObject.set(x, "cc", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: InlineContent | Templateid | Emailrfc822): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setOptions(value: TransmissionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setRecipients(value: js.Array[Recipient] | Listid): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: Recipient*): Self = StObject.set(x, "recipients", js.Array(value :_*))
    
    @scala.inline
    def setReturn_path(value: String): Self = StObject.set(x, "return_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_pathUndefined: Self = StObject.set(x, "return_path", js.undefined)
    
    @scala.inline
    def setSubstitution_data(value: js.Any): Self = StObject.set(x, "substitution_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitution_dataUndefined: Self = StObject.set(x, "substitution_data", js.undefined)
  }
}
