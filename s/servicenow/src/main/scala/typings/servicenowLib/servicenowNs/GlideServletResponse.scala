package typings
package servicenowLib.servicenowNs

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
    setContentType: js.Function1[java.lang.String, scala.Unit],
    setHeader: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setStatus: js.Function1[scala.Double, scala.Unit]
  ): GlideServletResponse = {
    val __obj = js.Dynamic.literal(setContentType = setContentType, setHeader = setHeader, setStatus = setStatus)
  
    __obj.asInstanceOf[GlideServletResponse]
  }
}

