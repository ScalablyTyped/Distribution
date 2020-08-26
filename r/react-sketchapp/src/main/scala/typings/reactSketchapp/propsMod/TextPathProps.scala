package typings.reactSketchapp.propsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextPathProps extends TextSpecificProps {
  var href: String = js.native
  var method: js.UndefOr[Method] = js.native
  var midLine: js.UndefOr[MidLine] = js.native
  var side: js.UndefOr[Side] = js.native
  var spacing: js.UndefOr[Spacing] = js.native
  var startOffset: js.UndefOr[StartOffset] = js.native
}

object TextPathProps {
  @scala.inline
  def apply(href: String): TextPathProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPathProps]
  }
  @scala.inline
  implicit class TextPathPropsOps[Self <: TextPathProps] (val x: Self) extends AnyVal {
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: Method): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMidLine(value: MidLine): Self = this.set("midLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMidLine: Self = this.set("midLine", js.undefined)
    @scala.inline
    def setSide(value: Side): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    @scala.inline
    def setSpacing(value: Spacing): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setStartOffset(value: StartOffset): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartOffset: Self = this.set("startOffset", js.undefined)
  }
  
}

