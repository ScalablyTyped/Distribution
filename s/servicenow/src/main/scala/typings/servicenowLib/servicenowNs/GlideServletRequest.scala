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
    getContentType: js.Function0[java.lang.String],
    getHeader: js.Function1[java.lang.String, java.lang.String],
    getParameter: js.Function1[java.lang.String, java.lang.String],
    toString: js.Function0[java.lang.String],
    writeOutput: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): GlideServletRequest = {
    val __obj = js.Dynamic.literal(getContentType = getContentType, getHeader = getHeader, getParameter = getParameter, toString = toString, writeOutput = writeOutput)
  
    __obj.asInstanceOf[GlideServletRequest]
  }
}

