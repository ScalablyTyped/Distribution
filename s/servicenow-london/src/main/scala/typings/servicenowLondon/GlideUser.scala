package typings.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideUser extends js.Object {
  def getCompanyID(): String
  def getDisplayName(): String
  def getDomainID(): String
  def getEmail(): String
  def getFirstName(): String
  def getID(): String
  def getLastName(): String
  def getName(): String
  def getPreference(name: String): String
  def getRoles(): js.Array[String]
  def getUserRoles(): js.Array[String]
  def hasRole(role: String): Boolean
  def isMemberOf(group: String): Boolean
  def savePreference(name: String, value: String): Unit
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
}

