package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Department extends StObject {
  
  var Department: String = js.native
  
  var Email: String = js.native
  
  var MobilePhone: String = js.native
  
  var Title: String = js.native
}
object Department {
  
  @scala.inline
  def apply(Department: String, Email: String, MobilePhone: String, Title: String): Department = {
    val __obj = js.Dynamic.literal(Department = Department.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], MobilePhone = MobilePhone.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Department]
  }
  
  @scala.inline
  implicit class DepartmentMutableBuilder[Self <: Department] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepartment(value: String): Self = StObject.set(x, "Department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobilePhone(value: String): Self = StObject.set(x, "MobilePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
