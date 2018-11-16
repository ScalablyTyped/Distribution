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

