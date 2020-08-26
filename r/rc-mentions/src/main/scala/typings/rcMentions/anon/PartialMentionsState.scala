package typings.rcMentions.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rc-mentions.rc-mentions/es/Mentions.MentionsState> */
@js.native
trait PartialMentionsState extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.native
  var isFocus: js.UndefOr[Boolean] = js.native
  var measureLocation: js.UndefOr[Double] = js.native
  var measurePrefix: js.UndefOr[String] = js.native
  var measureText: js.UndefOr[String | Null] = js.native
  var measuring: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String] = js.native
}

object PartialMentionsState {
  @scala.inline
  def apply(): PartialMentionsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMentionsState]
  }
  @scala.inline
  implicit class PartialMentionsStateOps[Self <: PartialMentionsState] (val x: Self) extends AnyVal {
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
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    @scala.inline
    def setIsFocus(value: Boolean): Self = this.set("isFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFocus: Self = this.set("isFocus", js.undefined)
    @scala.inline
    def setMeasureLocation(value: Double): Self = this.set("measureLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasureLocation: Self = this.set("measureLocation", js.undefined)
    @scala.inline
    def setMeasurePrefix(value: String): Self = this.set("measurePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasurePrefix: Self = this.set("measurePrefix", js.undefined)
    @scala.inline
    def setMeasureText(value: String): Self = this.set("measureText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasureText: Self = this.set("measureText", js.undefined)
    @scala.inline
    def setMeasureTextNull: Self = this.set("measureText", null)
    @scala.inline
    def setMeasuring(value: Boolean): Self = this.set("measuring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasuring: Self = this.set("measuring", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

