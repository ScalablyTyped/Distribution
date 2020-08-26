package typings.simpleIcons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleIcon extends js.Object {
  var hex: String = js.native
  var path: String = js.native
  var slug: String = js.native
  var source: String = js.native
  var svg: String = js.native
  var title: String = js.native
}

object SimpleIcon {
  @scala.inline
  def apply(hex: String, path: String, slug: String, source: String, svg: String, title: String): SimpleIcon = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleIcon]
  }
  @scala.inline
  implicit class SimpleIconOps[Self <: SimpleIcon] (val x: Self) extends AnyVal {
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
    def setHex(value: String): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvg(value: String): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

