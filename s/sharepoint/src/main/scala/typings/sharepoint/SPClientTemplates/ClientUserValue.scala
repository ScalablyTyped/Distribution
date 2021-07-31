package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientUserValue extends StObject {
  
  var department: String
  
  var displayStr: String
  
  var email: String
  
  var jobTitle: String
  
  var lookupId: Double
  
  var lookupValue: String
  
  var picture: String
  
  var sip: String
  
  var title: String
}
object ClientUserValue {
  
  @scala.inline
  def apply(
    department: String,
    displayStr: String,
    email: String,
    jobTitle: String,
    lookupId: Double,
    lookupValue: String,
    picture: String,
    sip: String,
    title: String
  ): ClientUserValue = {
    val __obj = js.Dynamic.literal(department = department.asInstanceOf[js.Any], displayStr = displayStr.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], jobTitle = jobTitle.asInstanceOf[js.Any], lookupId = lookupId.asInstanceOf[js.Any], lookupValue = lookupValue.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sip = sip.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientUserValue]
  }
  
  @scala.inline
  implicit class ClientUserValueMutableBuilder[Self <: ClientUserValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayStr(value: String): Self = StObject.set(x, "displayStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTitle(value: String): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupId(value: Double): Self = StObject.set(x, "lookupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupValue(value: String): Self = StObject.set(x, "lookupValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSip(value: String): Self = StObject.set(x, "sip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
