package typings.servicenowLondon.snWs

import typings.servicenowLondon.anon.Get
import typings.servicenowLondon.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SOAPResponseV2 extends js.Object {
  def getAllHeaders(): js.Array[Name] = js.native
  def getBody(): String = js.native
  def getCookies(): Get = js.native
  def getErrorCode(): Double = js.native
  def getErrorMessage(): String = js.native
  def getHeader(name: String): String = js.native
  def getHeaders(): js.Object = js.native
  def getStatusCode(): Double = js.native
  def haveError(): Boolean = js.native
  def waitForResponse(timeoutSecs: Double): Unit = js.native
}

object SOAPResponseV2 {
  @scala.inline
  def apply(
    getAllHeaders: () => js.Array[Name],
    getBody: () => String,
    getCookies: () => Get,
    getErrorCode: () => Double,
    getErrorMessage: () => String,
    getHeader: String => String,
    getHeaders: () => js.Object,
    getStatusCode: () => Double,
    haveError: () => Boolean,
    waitForResponse: Double => Unit
  ): SOAPResponseV2 = {
    val __obj = js.Dynamic.literal(getAllHeaders = js.Any.fromFunction0(getAllHeaders), getBody = js.Any.fromFunction0(getBody), getCookies = js.Any.fromFunction0(getCookies), getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction0(getHeaders), getStatusCode = js.Any.fromFunction0(getStatusCode), haveError = js.Any.fromFunction0(haveError), waitForResponse = js.Any.fromFunction1(waitForResponse))
    __obj.asInstanceOf[SOAPResponseV2]
  }
  @scala.inline
  implicit class SOAPResponseV2Ops[Self <: SOAPResponseV2] (val x: Self) extends AnyVal {
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
    def setGetAllHeaders(value: () => js.Array[Name]): Self = this.set("getAllHeaders", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBody(value: () => String): Self = this.set("getBody", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCookies(value: () => Get): Self = this.set("getCookies", js.Any.fromFunction0(value))
    @scala.inline
    def setGetErrorCode(value: () => Double): Self = this.set("getErrorCode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetErrorMessage(value: () => String): Self = this.set("getErrorMessage", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHeader(value: String => String): Self = this.set("getHeader", js.Any.fromFunction1(value))
    @scala.inline
    def setGetHeaders(value: () => js.Object): Self = this.set("getHeaders", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStatusCode(value: () => Double): Self = this.set("getStatusCode", js.Any.fromFunction0(value))
    @scala.inline
    def setHaveError(value: () => Boolean): Self = this.set("haveError", js.Any.fromFunction0(value))
    @scala.inline
    def setWaitForResponse(value: Double => Unit): Self = this.set("waitForResponse", js.Any.fromFunction1(value))
  }
  
}

