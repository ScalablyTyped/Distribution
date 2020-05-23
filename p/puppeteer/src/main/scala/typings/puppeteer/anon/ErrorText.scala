package typings.puppeteer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorText extends js.Object {
  var errorText: String
}

object ErrorText {
  @scala.inline
  def apply(errorText: String): ErrorText = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorText]
  }
}

