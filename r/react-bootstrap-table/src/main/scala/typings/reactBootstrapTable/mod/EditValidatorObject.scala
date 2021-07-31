package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.Msg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditValidatorObject extends StObject {
  
  /**
    * Boolean flag indicating whether the cell value is valid.
    */
  var isValid: Boolean
  
  /**
    * Notification object providing details on the validation result.
    */
  var notification: Msg
}
object EditValidatorObject {
  
  @scala.inline
  def apply(isValid: Boolean, notification: Msg): EditValidatorObject = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditValidatorObject]
  }
  
  @scala.inline
  implicit class EditValidatorObjectMutableBuilder[Self <: EditValidatorObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: Msg): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
  }
}
