package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextPathProps extends TextSpecificProps {
  var href: js.UndefOr[String] = js.native
  var method: js.UndefOr[TextPathMethod] = js.native
  var midLine: js.UndefOr[TextPathMidLine] = js.native
  var spacing: js.UndefOr[TextPathSpacing] = js.native
  var startOffset: js.UndefOr[NumberProp] = js.native
  var xlinkHref: js.UndefOr[String] = js.native
}

object TextPathProps {
  @scala.inline
  def apply(): TextPathProps = {
    val __obj = js.Dynamic.literal()
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
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setMethod(value: TextPathMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMidLine(value: TextPathMidLine): Self = this.set("midLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMidLine: Self = this.set("midLine", js.undefined)
    @scala.inline
    def setSpacing(value: TextPathSpacing): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setStartOffset(value: NumberProp): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartOffset: Self = this.set("startOffset", js.undefined)
    @scala.inline
    def setXlinkHref(value: String): Self = this.set("xlinkHref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkHref: Self = this.set("xlinkHref", js.undefined)
  }
  
}

