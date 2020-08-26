package typings.reactVis.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreemapPoint extends AbstractSeriesPoint {
  var children: js.Array[TreemapPoint] = js.native
  var color: js.UndefOr[String | Double] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var size: Double = js.native
  var style: CSSProperties = js.native
  var title: String = js.native
}

object TreemapPoint {
  @scala.inline
  def apply(children: js.Array[TreemapPoint], size: Double, style: CSSProperties, title: String): TreemapPoint = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapPoint]
  }
  @scala.inline
  implicit class TreemapPointOps[Self <: TreemapPoint] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: TreemapPoint*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[TreemapPoint]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String | Double): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
  
}

