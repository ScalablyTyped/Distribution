package typings.reactPdf.pageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextItem extends js.Object {
  var dir: String = js.native
  var fontName: String = js.native
  var height: Double = js.native
  var str: String = js.native
  var transform: js.Array[Double] = js.native
  var width: Double = js.native
}

object TextItem {
  @scala.inline
  def apply(
    dir: String,
    fontName: String,
    height: Double,
    str: String,
    transform: js.Array[Double],
    width: Double
  ): TextItem = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextItem]
  }
  @scala.inline
  implicit class TextItemOps[Self <: TextItem] (val x: Self) extends AnyVal {
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
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontName(value: String): Self = this.set("fontName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setStr(value: String): Self = this.set("str", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformVarargs(value: Double*): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransform(value: js.Array[Double]): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

