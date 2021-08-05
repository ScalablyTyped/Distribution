package typings.servicenow.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideUser extends StObject {
  
  def getCompanyID(): String
  
  def getDisplayName(): String
  
  def getID(): String
  
  def getName(): String
  
  def getPreference(name: String): String
  
  def hasRole(role: String): Boolean
  
  def isMemberOf(group: String): Boolean
  
  def savePreference(name: String, value: String): Unit
}
object GlideUser {
  
  inline def apply(
    getCompanyID: () => String,
    getDisplayName: () => String,
    getID: () => String,
    getName: () => String,
    getPreference: String => String,
    hasRole: String => Boolean,
    isMemberOf: String => Boolean,
    savePreference: (String, String) => Unit
  ): GlideUser = {
    val __obj = js.Dynamic.literal(getCompanyID = js.Any.fromFunction0(getCompanyID), getDisplayName = js.Any.fromFunction0(getDisplayName), getID = js.Any.fromFunction0(getID), getName = js.Any.fromFunction0(getName), getPreference = js.Any.fromFunction1(getPreference), hasRole = js.Any.fromFunction1(hasRole), isMemberOf = js.Any.fromFunction1(isMemberOf), savePreference = js.Any.fromFunction2(savePreference))
    __obj.asInstanceOf[GlideUser]
  }
  
  extension [Self <: GlideUser](x: Self) {
    
    inline def setGetCompanyID(value: () => String): Self = StObject.set(x, "getCompanyID", js.Any.fromFunction0(value))
    
    inline def setGetDisplayName(value: () => String): Self = StObject.set(x, "getDisplayName", js.Any.fromFunction0(value))
    
    inline def setGetID(value: () => String): Self = StObject.set(x, "getID", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetPreference(value: String => String): Self = StObject.set(x, "getPreference", js.Any.fromFunction1(value))
    
    inline def setHasRole(value: String => Boolean): Self = StObject.set(x, "hasRole", js.Any.fromFunction1(value))
    
    inline def setIsMemberOf(value: String => Boolean): Self = StObject.set(x, "isMemberOf", js.Any.fromFunction1(value))
    
    inline def setSavePreference(value: (String, String) => Unit): Self = StObject.set(x, "savePreference", js.Any.fromFunction2(value))
  }
}
