package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateError
  extends stdLib.Error {
  var riotData: riotLib.Anon_Riotid
}

object TemplateError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    riotData: riotLib.Anon_Riotid,
    stack: java.lang.String = null
  ): TemplateError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("riotData")(riotData)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[TemplateError]
  }
}

