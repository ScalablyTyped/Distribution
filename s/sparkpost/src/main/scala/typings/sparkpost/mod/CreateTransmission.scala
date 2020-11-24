package typings.sparkpost.mod

import typings.sparkpost.anon.Emailrfc822
import typings.sparkpost.anon.Listid
import typings.sparkpost.anon.Templateid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTransmission extends js.Object {
  
  /**
    * Recipients to discreetly receive a carbon copy of the transmission
    *
    */
  var bcc: js.UndefOr[js.Array[Recipient]] = js.native
  
  /** Name of the campaign */
  var campaign_id: js.UndefOr[String] = js.native
  
  /**
    * Recipients to receive a carbon copy of the transmission
    *
    */
  var cc: js.UndefOr[js.Array[Recipient]] = js.native
  
  /** Content that will be used to construct a message */
  var content: InlineContent | Templateid | Emailrfc822 = js.native
  
  /** Description of the transmission */
  var description: js.UndefOr[String] = js.native
  
  /** Transmission level metadata containing key/value pairs */
  var metadata: js.UndefOr[js.Any] = js.native
  
  /** JSON object in which transmission options are defined */
  var options: js.UndefOr[TransmissionOptions] = js.native
  
  /** Inline recipient objects or object containing stored recipient list ID */
  var recipients: js.UndefOr[js.Array[Recipient] | Listid] = js.native
  
  /** SparkPost Enterprise API only: email to use for envelope FROM */
  var return_path: js.UndefOr[String] = js.native
  
  /** Key/value pairs that are provided to the substitution engine */
  var substitution_data: js.UndefOr[js.Any] = js.native
}
object CreateTransmission {
  
  @scala.inline
  def apply(content: InlineContent | Templateid | Emailrfc822): CreateTransmission = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransmission]
  }
  
  @scala.inline
  implicit class CreateTransmissionOps[Self <: CreateTransmission] (val x: Self) extends AnyVal {
    
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
    def setContent(value: InlineContent | Templateid | Emailrfc822): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBccVarargs(value: Recipient*): Self = this.set("bcc", js.Array(value :_*))
    
    @scala.inline
    def setBcc(value: js.Array[Recipient]): Self = this.set("bcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBcc: Self = this.set("bcc", js.undefined)
    
    @scala.inline
    def setCampaign_id(value: String): Self = this.set("campaign_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaign_id: Self = this.set("campaign_id", js.undefined)
    
    @scala.inline
    def setCcVarargs(value: Recipient*): Self = this.set("cc", js.Array(value :_*))
    
    @scala.inline
    def setCc(value: js.Array[Recipient]): Self = this.set("cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCc: Self = this.set("cc", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setOptions(value: TransmissionOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: Recipient*): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(value: js.Array[Recipient] | Listid): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
    
    @scala.inline
    def setReturn_path(value: String): Self = this.set("return_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_path: Self = this.set("return_path", js.undefined)
    
    @scala.inline
    def setSubstitution_data(value: js.Any): Self = this.set("substitution_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstitution_data: Self = this.set("substitution_data", js.undefined)
  }
}
