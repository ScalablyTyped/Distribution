package typings.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideServletRequest extends js.Object {
  def getContentType(): String
  def getHeader(name: String): String
  def getParameter(name: String): String
  def writeOutput(mimeType: String, output: String): Unit
}

object GlideServletRequest {
  @scala.inline
  def apply(
    getContentType: () => String,
    getHeader: String => String,
    getParameter: String => String,
    writeOutput: (String, String) => Unit
  ): GlideServletRequest = {
    val __obj = js.Dynamic.literal(getContentType = js.Any.fromFunction0(getContentType), getHeader = js.Any.fromFunction1(getHeader), getParameter = js.Any.fromFunction1(getParameter), writeOutput = js.Any.fromFunction2(writeOutput))
  
    __obj.asInstanceOf[GlideServletRequest]
  }
}

