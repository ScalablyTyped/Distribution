package typings
package servicenowDashLondonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideServletResponse extends js.Object {
  def setContentType(`type`: java.lang.String): scala.Unit
  def setHeader(name: java.lang.String, value: java.lang.String): scala.Unit
  def setStatus(value: scala.Double): scala.Unit
}

object GlideServletResponse {
  @scala.inline
  def apply(
    setContentType: java.lang.String => scala.Unit,
    setHeader: (java.lang.String, java.lang.String) => scala.Unit,
    setStatus: scala.Double => scala.Unit
  ): GlideServletResponse = {
    val __obj = js.Dynamic.literal(setContentType = js.Any.fromFunction1(setContentType), setHeader = js.Any.fromFunction2(setHeader), setStatus = js.Any.fromFunction1(setStatus))
  
    __obj.asInstanceOf[GlideServletResponse]
  }
}

