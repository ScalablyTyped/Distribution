package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends js.Object {
  var body: String = js.native
  var bodyBorder: String = js.native
  var bodyContent: String = js.native
  var bodyContentBorder: String = js.native
  var header: String = js.native
  var headerBorder: String = js.native
  var label: String = js.native
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
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyBorder(value: String): Self = this.set("bodyBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyContent(value: String): Self = this.set("bodyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyContentBorder(value: String): Self = this.set("bodyContentBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderBorder(value: String): Self = this.set("headerBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

