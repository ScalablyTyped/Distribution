package typings.riot.riotMod

import typings.riot.Anon_Riotid
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateError extends Error {
  var riotData: Anon_Riotid
}

object TemplateError {
  @scala.inline
  def apply(message: String, name: String, riotData: Anon_Riotid, stack: String = null): TemplateError = {
    val __obj = js.Dynamic.literal(message = message, name = name, riotData = riotData)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[TemplateError]
  }
}

