package typings
package sendmailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.Any
  var filename: java.lang.String
  var `type`: java.lang.String
}

object Anon_Content {
  @scala.inline
  def apply(content: js.Any, filename: java.lang.String, `type`: java.lang.String): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content, filename = filename)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Content]
  }
}

