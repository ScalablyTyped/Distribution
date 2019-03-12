package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideServletRequest extends js.Object {
  def getContentType(): java.lang.String
  def getHeader(name: java.lang.String): java.lang.String
  def getParameter(name: java.lang.String): java.lang.String
  def writeOutput(mimeType: java.lang.String, output: java.lang.String): scala.Unit
}

object GlideServletRequest {
  @scala.inline
  def apply(
    getContentType: () => java.lang.String,
    getHeader: java.lang.String => java.lang.String,
    getParameter: java.lang.String => java.lang.String,
    toString: () => java.lang.String,
    writeOutput: (java.lang.String, java.lang.String) => scala.Unit
  ): GlideServletRequest = {
    val __obj = js.Dynamic.literal(getContentType = js.Any.fromFunction0(getContentType), getHeader = js.Any.fromFunction1(getHeader), getParameter = js.Any.fromFunction1(getParameter), toString = js.Any.fromFunction0(toString), writeOutput = js.Any.fromFunction2(writeOutput))
  
    __obj.asInstanceOf[GlideServletRequest]
  }
}

