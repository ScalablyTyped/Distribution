package typings.psl.anon

import typings.psl.pslStrings.DOMAIN_TOO_LONG
import typings.psl.pslStrings.DOMAIN_TOO_SHORT
import typings.psl.pslStrings.LABEL_ENDS_WITH_DASH
import typings.psl.pslStrings.LABEL_INVALID_CHARS
import typings.psl.pslStrings.LABEL_STARTS_WITH_DASH
import typings.psl.pslStrings.LABEL_TOO_LONG
import typings.psl.pslStrings.LABEL_TOO_SHORT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: DOMAIN_TOO_SHORT | DOMAIN_TOO_LONG | LABEL_STARTS_WITH_DASH | LABEL_ENDS_WITH_DASH | LABEL_TOO_LONG | LABEL_TOO_SHORT | LABEL_INVALID_CHARS
  var message: String
}

object Code {
  @scala.inline
  def apply(
    code: DOMAIN_TOO_SHORT | DOMAIN_TOO_LONG | LABEL_STARTS_WITH_DASH | LABEL_ENDS_WITH_DASH | LABEL_TOO_LONG | LABEL_TOO_SHORT | LABEL_INVALID_CHARS,
    message: String
  ): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

