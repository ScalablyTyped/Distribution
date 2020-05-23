package typings.sendmail.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeySelector extends js.Object {
  var keySelector: String
  var privateKey: String
}

object KeySelector {
  @scala.inline
  def apply(keySelector: String, privateKey: String): KeySelector = {
    val __obj = js.Dynamic.literal(keySelector = keySelector.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySelector]
  }
}

