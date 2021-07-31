package typings.reactNativeFbsdk.mod

import typings.reactNativeFbsdk.reactNativeFbsdkStrings.f
import typings.reactNativeFbsdk.reactNativeFbsdkStrings.m
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserData extends StObject {
  
  var city: js.UndefOr[String] = js.undefined
  
  var country: js.UndefOr[String] = js.undefined
  
  var dateOfBirth: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var firstName: js.UndefOr[String] = js.undefined
  
  var gender: js.UndefOr[m | f] = js.undefined
  
  var lastName: js.UndefOr[String] = js.undefined
  
  var phone: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
  
  var zip: js.UndefOr[String] = js.undefined
}
object UserData {
  
  @scala.inline
  def apply(): UserData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserData]
  }
  
  @scala.inline
  implicit class UserDataMutableBuilder[Self <: UserData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setDateOfBirth(value: String): Self = StObject.set(x, "dateOfBirth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateOfBirthUndefined: Self = StObject.set(x, "dateOfBirth", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    @scala.inline
    def setGender(value: m | f): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
  }
}
