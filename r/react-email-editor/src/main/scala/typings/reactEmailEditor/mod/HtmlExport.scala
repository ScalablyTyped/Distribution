package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlExport extends js.Object {
  val design: Design = js.native
  val html: String = js.native
}

object HtmlExport {
  @scala.inline
  def apply(design: Design, html: String): HtmlExport = {
    val __obj = js.Dynamic.literal(design = design.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlExport]
  }
  @scala.inline
  implicit class HtmlExportOps[Self <: HtmlExport] (val x: Self) extends AnyVal {
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
    def setDesign(value: Design): Self = this.set("design", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
  }
  
}

