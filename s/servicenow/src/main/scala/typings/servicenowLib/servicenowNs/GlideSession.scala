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

object GlideSession {
  @scala.inline
  def apply(
    getClientData: js.Function1[java.lang.String, java.lang.String],
    getClientIP: js.Function0[java.lang.String],
    getCurrentApplicationId: js.Function0[java.lang.String],
    getLanguage: js.Function0[java.lang.String],
    getSessionToken: js.Function0[java.lang.String],
    getTimeZoneName: js.Function0[java.lang.String],
    getUrlOnStack: js.Function0[java.lang.String],
    isInteractive: js.Function0[scala.Boolean],
    isLoggedIn: js.Function0[scala.Boolean],
    putClientData: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): GlideSession = {
    val __obj = js.Dynamic.literal(getClientData = getClientData, getClientIP = getClientIP, getCurrentApplicationId = getCurrentApplicationId, getLanguage = getLanguage, getSessionToken = getSessionToken, getTimeZoneName = getTimeZoneName, getUrlOnStack = getUrlOnStack, isInteractive = isInteractive, isLoggedIn = isLoggedIn, putClientData = putClientData)
  
    __obj.asInstanceOf[GlideSession]
  }
}

