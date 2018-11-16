package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GlideSession extends js.Object {
  def getClientData(paramName: java.lang.String): java.lang.String
  def getClientIP(): java.lang.String
  def getCurrentApplicationId(): java.lang.String
  def getLanguage(): java.lang.String
  def getSessionToken(): java.lang.String
  def getTimeZoneName(): java.lang.String
  def getUrlOnStack(): java.lang.String
  def isInteractive(): scala.Boolean
  def isLoggedIn(): scala.Boolean
  def putClientData(paramName: java.lang.String, paramValue: java.lang.String): scala.Unit
}

