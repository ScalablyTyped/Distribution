package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideUser extends js.Object {
  def getCompanyID(): java.lang.String
  def getDisplayName(): java.lang.String
  def getID(): java.lang.String
  def getName(): java.lang.String
  def getPreference(name: java.lang.String): java.lang.String
  def hasRole(role: java.lang.String): scala.Boolean
  def isMemberOf(group: java.lang.String): scala.Boolean
  def savePreference(name: java.lang.String, value: java.lang.String): scala.Unit
}

object GlideUser {
  @scala.inline
  def apply(
    getCompanyID: js.Function0[java.lang.String],
    getDisplayName: js.Function0[java.lang.String],
    getID: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getPreference: js.Function1[java.lang.String, java.lang.String],
    hasRole: js.Function1[java.lang.String, scala.Boolean],
    isMemberOf: js.Function1[java.lang.String, scala.Boolean],
    savePreference: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): GlideUser = {
    val __obj = js.Dynamic.literal(getCompanyID = getCompanyID, getDisplayName = getDisplayName, getID = getID, getName = getName, getPreference = getPreference, hasRole = hasRole, isMemberOf = isMemberOf, savePreference = savePreference)
  
    __obj.asInstanceOf[GlideUser]
  }
}

