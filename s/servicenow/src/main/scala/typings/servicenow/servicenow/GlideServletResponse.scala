package typings.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideServletResponse extends js.Object {
  def setContentType(`type`: String): Unit
  def setHeader(name: String, value: String): Unit
  def setStatus(value: Double): Unit
}

object GlideServletResponse {
  @scala.inline
  def apply(setContentType: String => Unit, setHeader: (String, String) => Unit, setStatus: Double => Unit): GlideServletResponse = {
    val __obj = js.Dynamic.literal(setContentType = js.Any.fromFunction1(setContentType), setHeader = js.Any.fromFunction2(setHeader), setStatus = js.Any.fromFunction1(setStatus))
    __obj.asInstanceOf[GlideServletResponse]
  }
}

