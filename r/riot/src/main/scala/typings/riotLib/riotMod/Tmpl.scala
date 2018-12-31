package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tmpl extends js.Object {
  var version: java.lang.String = js.native
  def apply(expression: java.lang.String): js.Any = js.native
  def apply(expression: java.lang.String, data: js.Any): js.Any = js.native
  /**
    * Utility hook function to catch all the errors swallowed by the riot template engine
    */
  def errorHandler(error: TemplateError): scala.Unit = js.native
}

