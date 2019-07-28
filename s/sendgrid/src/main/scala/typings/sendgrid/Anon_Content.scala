package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: String
  var content_id: String
  var disposition: String
  var filename: String
  var `type`: String
}

object Anon_Content {
  @scala.inline
  def apply(content: String, content_id: String, disposition: String, filename: String, `type`: String): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content, content_id = content_id, disposition = disposition, filename = filename)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Content]
  }
}

