package typings.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: String
  var content_id: String
  var disposition: String
  var filename: String
  var `type`: String
}

object Content {
  @scala.inline
  def apply(content: String, content_id: String, disposition: String, filename: String, `type`: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], content_id = content_id.asInstanceOf[js.Any], disposition = disposition.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

