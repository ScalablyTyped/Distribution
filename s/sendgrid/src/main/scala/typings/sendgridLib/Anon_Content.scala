package typings
package sendgridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: java.lang.String
  var content_id: java.lang.String
  var disposition: java.lang.String
  var filename: java.lang.String
  var `type`: java.lang.String
}

object Anon_Content {
  @scala.inline
  def apply(
    content: java.lang.String,
    content_id: java.lang.String,
    disposition: java.lang.String,
    filename: java.lang.String,
    `type`: java.lang.String
  ): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content, content_id = content_id, disposition = disposition, filename = filename)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Content]
  }
}

