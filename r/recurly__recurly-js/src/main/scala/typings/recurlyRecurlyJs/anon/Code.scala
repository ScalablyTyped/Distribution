package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: String
  var symbol: String
}

object Code {
  @scala.inline
  def apply(code: String, symbol: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

