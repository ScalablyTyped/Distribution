package typings.sendmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeySelector extends js.Object {
  var keySelector: String
  var privateKey: String
}

object Anon_KeySelector {
  @scala.inline
  def apply(keySelector: String, privateKey: String): Anon_KeySelector = {
    val __obj = js.Dynamic.literal(keySelector = keySelector.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeySelector]
  }
}

