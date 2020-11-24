package typings.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideUser extends js.Object {
  
  def getCompanyID(): String = js.native
  
  def getDisplayName(): String = js.native
  
  def getID(): String = js.native
  
  def getName(): String = js.native
  
  def getPreference(name: String): String = js.native
  
  def hasRole(role: String): Boolean = js.native
  
  def isMemberOf(group: String): Boolean = js.native
  
  def savePreference(name: String, value: String): Unit = js.native
}
object GlideUser {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GlideUserOps[Self <: GlideUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetCompanyID(value: () => String): Self = this.set("getCompanyID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayName(value: () => String): Self = this.set("getDisplayName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetID(value: () => String): Self = this.set("getID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreference(value: String => String): Self = this.set("getPreference", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasRole(value: String => Boolean): Self = this.set("hasRole", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsMemberOf(value: String => Boolean): Self = this.set("isMemberOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSavePreference(value: (String, String) => Unit): Self = this.set("savePreference", js.Any.fromFunction2(value))
  }
}
