package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRecipientList extends StObject {
  
  /** Recipient list attribute object */
  var attributes: js.UndefOr[js.Any] = js.undefined
  
  /** Detailed description of the recipient list */
  var description: js.UndefOr[String] = js.undefined
  
  /** Short, unique, recipient list identifier */
  var id: js.UndefOr[String] = js.undefined
  
  /** Short, pretty/readable recipient list display name, not required to be unique */
  var name: js.UndefOr[String] = js.undefined
  
  /** Array of recipient objects */
  var recipients: js.Array[Recipient]
}
object UpdateRecipientList {
  
  @scala.inline
  def apply(recipients: js.Array[Recipient]): UpdateRecipientList = {
    val __obj = js.Dynamic.literal(recipients = recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecipientList]
  }
  
  @scala.inline
  implicit class UpdateRecipientListMutableBuilder[Self <: UpdateRecipientList] (val x: Self) extends AnyVal {
    
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
    def setRecipients(value: js.Array[Recipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsVarargs(value: Recipient*): Self = StObject.set(x, "recipients", js.Array(value :_*))
  }
}
