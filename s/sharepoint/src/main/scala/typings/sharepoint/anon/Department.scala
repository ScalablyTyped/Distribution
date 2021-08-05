package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Department extends StObject {
  
  var Department: String
  
  var Email: String
  
  var MobilePhone: String
  
  var Title: String
}
object Department {
  
  inline def apply(Department: String, Email: String, MobilePhone: String, Title: String): Department = {
    val __obj = js.Dynamic.literal(Department = Department.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], MobilePhone = MobilePhone.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Department]
  }
  
  extension [Self <: Department](x: Self) {
    
    inline def setDepartment(value: String): Self = StObject.set(x, "Department", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setMobilePhone(value: String): Self = StObject.set(x, "MobilePhone", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
