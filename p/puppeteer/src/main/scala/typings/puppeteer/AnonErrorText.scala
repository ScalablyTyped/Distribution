package typings.puppeteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorText extends js.Object {
  var errorText: String
}

object AnonErrorText {
  @scala.inline
  def apply(errorText: String): AnonErrorText = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorText]
  }
}

