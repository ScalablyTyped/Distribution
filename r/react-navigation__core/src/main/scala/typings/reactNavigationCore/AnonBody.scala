package typings.reactNavigationCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: String
  var bodyBorder: String
  var bodyContent: String
  var header: String
  var headerBorder: String
  var label: String
}

object AnonBody {
  @scala.inline
  def apply(
    body: String,
    bodyBorder: String,
    bodyContent: String,
    header: String,
    headerBorder: String,
    label: String
  ): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], bodyBorder = bodyBorder.asInstanceOf[js.Any], bodyContent = bodyContent.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerBorder = headerBorder.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody]
  }
}

