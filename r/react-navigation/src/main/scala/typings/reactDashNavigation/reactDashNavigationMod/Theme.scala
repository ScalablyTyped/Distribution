package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var body: String
  var bodyBorder: String
  var bodyContent: String
  var bodyContentBorder: String
  var header: String
  var headerBorder: String
  var label: String
}

object Theme {
  @scala.inline
  def apply(
    body: String,
    bodyBorder: String,
    bodyContent: String,
    bodyContentBorder: String,
    header: String,
    headerBorder: String,
    label: String
  ): Theme = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], bodyBorder = bodyBorder.asInstanceOf[js.Any], bodyContent = bodyContent.asInstanceOf[js.Any], bodyContentBorder = bodyContentBorder.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerBorder = headerBorder.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Theme]
  }
}

