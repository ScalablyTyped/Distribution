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

