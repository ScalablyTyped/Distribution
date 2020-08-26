package typings.rrule.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rrule.rrule/dist/esm/src/rrulestr.RRuleStrOptions> */
@js.native
trait PartialRRuleStrOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var compatible: js.UndefOr[Boolean] = js.native
  var dtstart: js.UndefOr[Date | Null] = js.native
  var forceset: js.UndefOr[Boolean] = js.native
  var tzid: js.UndefOr[String | Null] = js.native
  var unfold: js.UndefOr[Boolean] = js.native
}

object PartialRRuleStrOptions {
  @scala.inline
  def apply(): PartialRRuleStrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRRuleStrOptions]
  }
  @scala.inline
  implicit class PartialRRuleStrOptionsOps[Self <: PartialRRuleStrOptions] (val x: Self) extends AnyVal {
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCompatible(value: Boolean): Self = this.set("compatible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatible: Self = this.set("compatible", js.undefined)
    @scala.inline
    def setDtstart(value: Date): Self = this.set("dtstart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtstart: Self = this.set("dtstart", js.undefined)
    @scala.inline
    def setDtstartNull: Self = this.set("dtstart", null)
    @scala.inline
    def setForceset(value: Boolean): Self = this.set("forceset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceset: Self = this.set("forceset", js.undefined)
    @scala.inline
    def setTzid(value: String): Self = this.set("tzid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTzid: Self = this.set("tzid", js.undefined)
    @scala.inline
    def setTzidNull: Self = this.set("tzid", null)
    @scala.inline
    def setUnfold(value: Boolean): Self = this.set("unfold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnfold: Self = this.set("unfold", js.undefined)
  }
  
}

