package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientListWithRecipients
  extends StObject
     with RecipientList {
  
  /** Array of recipient objects */
  var recipients: js.Array[Recipient]
}
object RecipientListWithRecipients {
  
  inline def apply(
    attributes: js.Any,
    description: String,
    id: String,
    name: String,
    recipients: js.Array[Recipient],
    total_accepted_recipients: Double
  ): RecipientListWithRecipients = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], total_accepted_recipients = total_accepted_recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientListWithRecipients]
  }
  
  extension [Self <: RecipientListWithRecipients](x: Self) {
    
    inline def setRecipients(value: js.Array[Recipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsVarargs(value: Recipient*): Self = StObject.set(x, "recipients", js.Array(value :_*))
  }
}
