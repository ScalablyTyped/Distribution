package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://developer.salesforce.com/docs/atlas.en-us.platform_connect.meta/platform_connect/user_object.htm
trait User extends StObject {
  
  val accessibilityModeEnabled: Boolean
  
  val currencyISOCode: String
  
  val email: String
  
  val firstName: String
  
  val fullName: String
  
  val isDefaultNetwork: Boolean
  
  val language: String
  
  val lastName: String
  
  val locale: String
  
  val networkId: String
  
  val profileId: String
  
  val profilePhotoUrl: String
  
  val profileThumbnailUrl: String
  
  val roleId: String | Null
  
  val siteUrl: String
  
  val siteUrlPrefix: String
  
  val timeZone: String
  
  val userId: String
  
  val userName: String
  
  val userType: UserType
}
object User {
  
  inline def apply(
    accessibilityModeEnabled: Boolean,
    currencyISOCode: String,
    email: String,
    firstName: String,
    fullName: String,
    isDefaultNetwork: Boolean,
    language: String,
    lastName: String,
    locale: String,
    networkId: String,
    profileId: String,
    profilePhotoUrl: String,
    profileThumbnailUrl: String,
    siteUrl: String,
    siteUrlPrefix: String,
    timeZone: String,
    userId: String,
    userName: String,
    userType: UserType
  ): User = {
    val __obj = js.Dynamic.literal(accessibilityModeEnabled = accessibilityModeEnabled.asInstanceOf[js.Any], currencyISOCode = currencyISOCode.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], isDefaultNetwork = isDefaultNetwork.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], networkId = networkId.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any], profilePhotoUrl = profilePhotoUrl.asInstanceOf[js.Any], profileThumbnailUrl = profileThumbnailUrl.asInstanceOf[js.Any], siteUrl = siteUrl.asInstanceOf[js.Any], siteUrlPrefix = siteUrlPrefix.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userType = userType.asInstanceOf[js.Any], roleId = null)
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityModeEnabled(value: Boolean): Self = StObject.set(x, "accessibilityModeEnabled", value.asInstanceOf[js.Any])
    
    inline def setCurrencyISOCode(value: String): Self = StObject.set(x, "currencyISOCode", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultNetwork(value: Boolean): Self = StObject.set(x, "isDefaultNetwork", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setNetworkId(value: String): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfilePhotoUrl(value: String): Self = StObject.set(x, "profilePhotoUrl", value.asInstanceOf[js.Any])
    
    inline def setProfileThumbnailUrl(value: String): Self = StObject.set(x, "profileThumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
    
    inline def setRoleIdNull: Self = StObject.set(x, "roleId", null)
    
    inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteUrlPrefix(value: String): Self = StObject.set(x, "siteUrlPrefix", value.asInstanceOf[js.Any])
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserType(value: UserType): Self = StObject.set(x, "userType", value.asInstanceOf[js.Any])
  }
}
