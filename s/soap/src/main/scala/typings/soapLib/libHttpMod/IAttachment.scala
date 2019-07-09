package typings
package soapLib.libHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachment extends js.Object {
  var body: nodeLib.NodeJSNs.ReadableStream
  var contentId: java.lang.String
  var mimetype: java.lang.String
  var name: java.lang.String
}

object IAttachment {
  @scala.inline
  def apply(
    body: nodeLib.NodeJSNs.ReadableStream,
    contentId: java.lang.String,
    mimetype: java.lang.String,
    name: java.lang.String
  ): IAttachment = {
    val __obj = js.Dynamic.literal(body = body, contentId = contentId, mimetype = mimetype, name = name)
  
    __obj.asInstanceOf[IAttachment]
  }
}

