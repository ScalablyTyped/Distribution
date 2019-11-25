package typings.soap.libHttpMod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachment extends js.Object {
  var body: ReadableStream
  var contentId: String
  var mimetype: String
  var name: String
}

object IAttachment {
  @scala.inline
  def apply(body: ReadableStream, contentId: String, mimetype: String, name: String): IAttachment = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contentId = contentId.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAttachment]
  }
}

