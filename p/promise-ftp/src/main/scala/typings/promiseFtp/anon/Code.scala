package typings.promiseFtp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: Double
  var text: String
}

object Code {
  @scala.inline
  def apply(code: Double, text: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

