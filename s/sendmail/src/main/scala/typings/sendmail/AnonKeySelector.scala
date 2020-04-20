package typings.sendmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeySelector extends js.Object {
  var keySelector: String
  var privateKey: String
}

object AnonKeySelector {
  @scala.inline
  def apply(keySelector: String, privateKey: String): AnonKeySelector = {
    val __obj = js.Dynamic.literal(keySelector = keySelector.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeySelector]
  }
}

