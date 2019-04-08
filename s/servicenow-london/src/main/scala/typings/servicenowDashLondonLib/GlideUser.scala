package typings
package servicenowDashLondonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideUser extends js.Object {
  def getCompanyID(): java.lang.String
  def getDisplayName(): java.lang.String
  def getDomainID(): java.lang.String
  def getEmail(): java.lang.String
  def getFirstName(): java.lang.String
  def getID(): java.lang.String
  def getLastName(): java.lang.String
  def getName(): java.lang.String
  def getPreference(name: java.lang.String): java.lang.String
  def getRoles(): js.Array[java.lang.String]
  def getUserRoles(): js.Array[java.lang.String]
  def hasRole(role: java.lang.String): scala.Boolean
  def isMemberOf(group: java.lang.String): scala.Boolean
  def savePreference(name: java.lang.String, value: java.lang.String): scala.Unit
}

object GlideUser {
  @scala.inline
  def apply(
    getCompanyID: () => java.lang.String,
    getDisplayName: () => java.lang.String,
    getDomainID: () => java.lang.String,
    getEmail: () => java.lang.String,
    getFirstName: () => java.lang.String,
    getID: () => java.lang.String,
    getLastName: () => java.lang.String,
    getName: () => java.lang.String,
    getPreference: java.lang.String => java.lang.String,
    getRoles: () => js.Array[java.lang.String],
    getUserRoles: () => js.Array[java.lang.String],
    hasRole: java.lang.String => scala.Boolean,
    isMemberOf: java.lang.String => scala.Boolean,
    savePreference: (java.lang.String, java.lang.String) => scala.Unit
  ): GlideUser = {
    val __obj = js.Dynamic.literal(getCompanyID = js.Any.fromFunction0(getCompanyID), getDisplayName = js.Any.fromFunction0(getDisplayName), getDomainID = js.Any.fromFunction0(getDomainID), getEmail = js.Any.fromFunction0(getEmail), getFirstName = js.Any.fromFunction0(getFirstName), getID = js.Any.fromFunction0(getID), getLastName = js.Any.fromFunction0(getLastName), getName = js.Any.fromFunction0(getName), getPreference = js.Any.fromFunction1(getPreference), getRoles = js.Any.fromFunction0(getRoles), getUserRoles = js.Any.fromFunction0(getUserRoles), hasRole = js.Any.fromFunction1(hasRole), isMemberOf = js.Any.fromFunction1(isMemberOf), savePreference = js.Any.fromFunction2(savePreference))
  
    __obj.asInstanceOf[GlideUser]
  }
}

