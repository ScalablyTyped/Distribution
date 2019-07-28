package typings.serializeDashError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(code: String = null, message: String = null, name: String = null, stack: String = null): Anon_Code = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (message != null) __obj.updateDynamic("message")(message)
    if (name != null) __obj.updateDynamic("name")(name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[Anon_Code]
  }
}

