package typings.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideSession extends js.Object {
  def getClientData(paramName: String): String = js.native
  def getClientIP(): String = js.native
  def getCurrentApplicationId(): String = js.native
  def getLanguage(): String = js.native
  def getSessionToken(): String = js.native
  def getTimeZoneName(): String = js.native
  def getUrlOnStack(): String = js.native
  def isInteractive(): Boolean = js.native
  def isLoggedIn(): Boolean = js.native
  def putClientData(paramName: String, paramValue: String): Unit = js.native
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
    isInteractive: () => Boolean,
    isLoggedIn: () => Boolean,
    putClientData: (String, String) => Unit
  ): GlideSession = {
    val __obj = js.Dynamic.literal(getClientData = js.Any.fromFunction1(getClientData), getClientIP = js.Any.fromFunction0(getClientIP), getCurrentApplicationId = js.Any.fromFunction0(getCurrentApplicationId), getLanguage = js.Any.fromFunction0(getLanguage), getSessionToken = js.Any.fromFunction0(getSessionToken), getTimeZoneName = js.Any.fromFunction0(getTimeZoneName), getUrlOnStack = js.Any.fromFunction0(getUrlOnStack), isInteractive = js.Any.fromFunction0(isInteractive), isLoggedIn = js.Any.fromFunction0(isLoggedIn), putClientData = js.Any.fromFunction2(putClientData))
    __obj.asInstanceOf[GlideSession]
  }
  @scala.inline
  implicit class GlideSessionOps[Self <: GlideSession] (val x: Self) extends AnyVal {
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
    def setGetClientData(value: String => String): Self = this.set("getClientData", js.Any.fromFunction1(value))
    @scala.inline
    def setGetClientIP(value: () => String): Self = this.set("getClientIP", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCurrentApplicationId(value: () => String): Self = this.set("getCurrentApplicationId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLanguage(value: () => String): Self = this.set("getLanguage", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSessionToken(value: () => String): Self = this.set("getSessionToken", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTimeZoneName(value: () => String): Self = this.set("getTimeZoneName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUrlOnStack(value: () => String): Self = this.set("getUrlOnStack", js.Any.fromFunction0(value))
    @scala.inline
    def setIsInteractive(value: () => Boolean): Self = this.set("isInteractive", js.Any.fromFunction0(value))
    @scala.inline
    def setIsLoggedIn(value: () => Boolean): Self = this.set("isLoggedIn", js.Any.fromFunction0(value))
    @scala.inline
    def setPutClientData(value: (String, String) => Unit): Self = this.set("putClientData", js.Any.fromFunction2(value))
  }
  
}

