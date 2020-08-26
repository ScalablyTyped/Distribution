package typings.reactVis.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Links extends js.Object {
  var labels: js.UndefOr[CSSProperties] = js.native
  var links: js.UndefOr[CSSProperties] = js.native
  var rects: js.UndefOr[CSSProperties] = js.native
}

object Links {
  @scala.inline
  def apply(): Links = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Links]
  }
  @scala.inline
  implicit class LinksOps[Self <: Links] (val x: Self) extends AnyVal {
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
    def setLabels(value: CSSProperties): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLinks(value: CSSProperties): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    @scala.inline
    def setRects(value: CSSProperties): Self = this.set("rects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRects: Self = this.set("rects", js.undefined)
  }
  
}

