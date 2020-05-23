package typings.std.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Holds useful CSS-related methods. No object with this interface are implemented: it contains only static methods and therefore is a utilitarian interface. */
@JSGlobal("CSS")
@js.native
object CSS extends js.Object {
  def escape(ident: java.lang.String): java.lang.String = js.native
  def supports(conditionText: java.lang.String): scala.Boolean = js.native
  def supports(property: java.lang.String, value: java.lang.String): scala.Boolean = js.native
}

