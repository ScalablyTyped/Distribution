package typings.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideUser extends StObject {
  
  def getCompanyID(): String = js.native
  
  def getDisplayName(): String = js.native
  
  def getDomainID(): String = js.native
  
  def getEmail(): String = js.native
  
  def getFirstName(): String = js.native
  
  def getID(): String = js.native
  
  def getLastName(): String = js.native
  
  def getName(): String = js.native
  
  def getPreference(name: String): String = js.native
  
  def getRoles(): js.Array[String] = js.native
  
  def getUserRoles(): js.Array[String] = js.native
  
  def hasRole(role: String): Boolean = js.native
  
  def isMemberOf(group: String): Boolean = js.native
  
  def savePreference(name: String, value: String): Unit = js.native
}
object GlideUser {
  
  @scala.inline
  def apply(
    getCompanyID: () => String,
    getDisplayName: () => String,
    getDomainID: () => String,
    getEmail: () => String,
    getFirstName: () => String,
    getID: () => String,
    getLastName: () => String,
    getName: () => String,
    getPreference: String => String,
    getRoles: () => js.Array[String],
    getUserRoles: () => js.Array[String],
    hasRole: String => Boolean,
    isMemberOf: String => Boolean,
    savePreference: (String, String) => Unit
  ): GlideUser = {
    val __obj = js.Dynamic.literal(getCompanyID = js.Any.fromFunction0(getCompanyID), getDisplayName = js.Any.fromFunction0(getDisplayName), getDomainID = js.Any.fromFunction0(getDomainID), getEmail = js.Any.fromFunction0(getEmail), getFirstName = js.Any.fromFunction0(getFirstName), getID = js.Any.fromFunction0(getID), getLastName = js.Any.fromFunction0(getLastName), getName = js.Any.fromFunction0(getName), getPreference = js.Any.fromFunction1(getPreference), getRoles = js.Any.fromFunction0(getRoles), getUserRoles = js.Any.fromFunction0(getUserRoles), hasRole = js.Any.fromFunction1(hasRole), isMemberOf = js.Any.fromFunction1(isMemberOf), savePreference = js.Any.fromFunction2(savePreference))
    __obj.asInstanceOf[GlideUser]
  }
  
  @scala.inline
  implicit class GlideUserMutableBuilder[Self <: GlideUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCompanyID(value: () => String): Self = StObject.set(x, "getCompanyID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayName(value: () => String): Self = StObject.set(x, "getDisplayName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDomainID(value: () => String): Self = StObject.set(x, "getDomainID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEmail(value: () => String): Self = StObject.set(x, "getEmail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFirstName(value: () => String): Self = StObject.set(x, "getFirstName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetID(value: () => String): Self = StObject.set(x, "getID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLastName(value: () => String): Self = StObject.set(x, "getLastName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreference(value: String => String): Self = StObject.set(x, "getPreference", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRoles(value: () => js.Array[String]): Self = StObject.set(x, "getRoles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserRoles(value: () => js.Array[String]): Self = StObject.set(x, "getUserRoles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasRole(value: String => Boolean): Self = StObject.set(x, "hasRole", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsMemberOf(value: String => Boolean): Self = StObject.set(x, "isMemberOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSavePreference(value: (String, String) => Unit): Self = StObject.set(x, "savePreference", js.Any.fromFunction2(value))
  }
}
