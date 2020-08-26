package typings.sharepoint.anon

import typings.sharepoint.SP.JsGrid.IStyleType.Splitter
import typings.sharepoint.SP.JsGrid.IStyleType.SplitterHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dra extends js.Object {
  var dra: Splitter = js.native
  var dragHandle: SplitterHandle = js.native
  var hover: Splitter = js.native
  var hoverHandle: SplitterHandle = js.native
  var normal: Splitter = js.native
  var normalHandle: SplitterHandle = js.native
}

object Dra {
  @scala.inline
  def apply(
    dra: Splitter,
    dragHandle: SplitterHandle,
    hover: Splitter,
    hoverHandle: SplitterHandle,
    normal: Splitter,
    normalHandle: SplitterHandle
  ): Dra = {
    val __obj = js.Dynamic.literal(dra = dra.asInstanceOf[js.Any], dragHandle = dragHandle.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], hoverHandle = hoverHandle.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalHandle = normalHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dra]
  }
  @scala.inline
  implicit class DraOps[Self <: Dra] (val x: Self) extends AnyVal {
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
    def setDra(value: Splitter): Self = this.set("dra", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragHandle(value: SplitterHandle): Self = this.set("dragHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def setHover(value: Splitter): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverHandle(value: SplitterHandle): Self = this.set("hoverHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormal(value: Splitter): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalHandle(value: SplitterHandle): Self = this.set("normalHandle", value.asInstanceOf[js.Any])
  }
  
}

