package typings.riot.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tmpl extends js.Object {
  var version: String = js.native
  def apply(expression: String): js.Any = js.native
  def apply(expression: String, data: js.Any): js.Any = js.native
  /**
    * Utility hook function to catch all the errors swallowed by the riot template engine
    */
  def errorHandler(error: TemplateError): Unit = js.native
}

