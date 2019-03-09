package typings
package sendmailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeySelector extends js.Object {
  var keySelector: java.lang.String
  var privateKey: java.lang.String
}

object Anon_KeySelector {
  @scala.inline
  def apply(keySelector: java.lang.String, privateKey: java.lang.String): Anon_KeySelector = {
    val __obj = js.Dynamic.literal(keySelector = keySelector, privateKey = privateKey)
  
    __obj.asInstanceOf[Anon_KeySelector]
  }
}

