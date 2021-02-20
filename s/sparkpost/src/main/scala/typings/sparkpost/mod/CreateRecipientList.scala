package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRecipientList extends StObject {
  
  /** Recipient list attribute object */
  var attributes: js.UndefOr[js.Any] = js.native
  
  /** Detailed description of the recipient list */
  var description: js.UndefOr[String] = js.native
  
  /** Short, unique, recipient list identifier */
  var id: js.UndefOr[String] = js.native
  
  /** Short, pretty/readable recipient list display name, not required to be unique */
  var name: js.UndefOr[String] = js.native
  
  /** limit the number of recipient errors returned. */
  var num_rcpt_errors: js.UndefOr[Double] = js.native
  
  /** Array of recipient objects */
  var recipients: js.Array[Recipient] = js.native
}
object CreateRecipientList {
  
  @scala.inline
  def apply(recipients: js.Array[Recipient]): CreateRecipientList = {
    val __obj = js.Dynamic.literal(recipients = recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecipientList]
  }
  
  @scala.inline
  implicit class CreateRecipientListMutableBuilder[Self <: CreateRecipientList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNum_rcpt_errors(value: Double): Self = StObject.set(x, "num_rcpt_errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_rcpt_errorsUndefined: Self = StObject.set(x, "num_rcpt_errors", js.undefined)
    
    @scala.inline
    def setRecipients(value: js.Array[Recipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsVarargs(value: Recipient*): Self = StObject.set(x, "recipients", js.Array(value :_*))
  }
}
