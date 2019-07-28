package typings.servicenowDashLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideSession extends js.Object {
  def getClientData(paramName: String): String
  def getClientIP(): String
  def getCurrentApplicationId(): String
  def getLanguage(): String
  def getSessionToken(): String
  def getTimeZoneName(): String
  def getUrlOnStack(): String
  def isImpersonating(): Boolean
  def isInteractive(): Boolean
  def isLoggedIn(): Boolean
  def putClientData(paramName: String, paramValue: String): Unit
}

object GlideSession {
  @scala.inline
  def apply(
    getClientData: String => String,
    getClientIP: () => String,
    getCurrentApplicationId: () => String,
    getLanguage: () => String,
    getSessionToken: () => String,
    getTimeZoneName: () => String,
    getUrlOnStack: () => String,
    isImpersonating: () => Boolean,
    isInteractive: () => Boolean,
    isLoggedIn: () => Boolean,
    putClientData: (String, String) => Unit
  ): GlideSession = {
    val __obj = js.Dynamic.literal(getClientData = js.Any.fromFunction1(getClientData), getClientIP = js.Any.fromFunction0(getClientIP), getCurrentApplicationId = js.Any.fromFunction0(getCurrentApplicationId), getLanguage = js.Any.fromFunction0(getLanguage), getSessionToken = js.Any.fromFunction0(getSessionToken), getTimeZoneName = js.Any.fromFunction0(getTimeZoneName), getUrlOnStack = js.Any.fromFunction0(getUrlOnStack), isImpersonating = js.Any.fromFunction0(isImpersonating), isInteractive = js.Any.fromFunction0(isInteractive), isLoggedIn = js.Any.fromFunction0(isLoggedIn), putClientData = js.Any.fromFunction2(putClientData))
  
    __obj.asInstanceOf[GlideSession]
  }
}

