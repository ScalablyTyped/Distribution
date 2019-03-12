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
    getClientData: java.lang.String => java.lang.String,
    getClientIP: () => java.lang.String,
    getCurrentApplicationId: () => java.lang.String,
    getLanguage: () => java.lang.String,
    getSessionToken: () => java.lang.String,
    getTimeZoneName: () => java.lang.String,
    getUrlOnStack: () => java.lang.String,
    isInteractive: () => scala.Boolean,
    isLoggedIn: () => scala.Boolean,
    putClientData: (java.lang.String, java.lang.String) => scala.Unit
  ): GlideSession = {
    val __obj = js.Dynamic.literal(getClientData = js.Any.fromFunction1(getClientData), getClientIP = js.Any.fromFunction0(getClientIP), getCurrentApplicationId = js.Any.fromFunction0(getCurrentApplicationId), getLanguage = js.Any.fromFunction0(getLanguage), getSessionToken = js.Any.fromFunction0(getSessionToken), getTimeZoneName = js.Any.fromFunction0(getTimeZoneName), getUrlOnStack = js.Any.fromFunction0(getUrlOnStack), isInteractive = js.Any.fromFunction0(isInteractive), isLoggedIn = js.Any.fromFunction0(isLoggedIn), putClientData = js.Any.fromFunction2(putClientData))
  
    __obj.asInstanceOf[GlideSession]
  }
}

