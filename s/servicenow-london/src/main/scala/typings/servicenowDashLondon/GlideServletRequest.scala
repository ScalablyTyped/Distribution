package typings.servicenowDashLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideServletRequest extends js.Object {
  def getContentType(): String
  def getHeader(name: String): String
  def getHeaderNames(): String
  def getHeaders(name: String): String
  def getParameter(name: String): String
  def getParameterNames(): String
  def getQueryString(): String
  def writeOutput(mimeType: String, output: String): Unit
}

object GlideServletRequest {
  @scala.inline
  def apply(
    getContentType: () => String,
    getHeader: String => String,
    getHeaderNames: () => String,
    getHeaders: String => String,
    getParameter: String => String,
    getParameterNames: () => String,
    getQueryString: () => String,
    writeOutput: (String, String) => Unit
  ): GlideServletRequest = {
    val __obj = js.Dynamic.literal(getContentType = js.Any.fromFunction0(getContentType), getHeader = js.Any.fromFunction1(getHeader), getHeaderNames = js.Any.fromFunction0(getHeaderNames), getHeaders = js.Any.fromFunction1(getHeaders), getParameter = js.Any.fromFunction1(getParameter), getParameterNames = js.Any.fromFunction0(getParameterNames), getQueryString = js.Any.fromFunction0(getQueryString), writeOutput = js.Any.fromFunction2(writeOutput))
  
    __obj.asInstanceOf[GlideServletRequest]
  }
}

