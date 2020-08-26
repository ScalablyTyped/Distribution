package typings.rrule.typesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedOptions extends Options {
  @JSName("byhour")
  var byhour_ParsedOptions: js.Array[Double] = js.native
  @JSName("byminute")
  var byminute_ParsedOptions: js.Array[Double] = js.native
  @JSName("bymonth")
  var bymonth_ParsedOptions: js.Array[Double] = js.native
  @JSName("bymonthday")
  var bymonthday_ParsedOptions: js.Array[Double] = js.native
  @JSName("bynmonthday")
  var bynmonthday_ParsedOptions: js.Array[Double] = js.native
  @JSName("bysecond")
  var bysecond_ParsedOptions: js.Array[Double] = js.native
  @JSName("bysetpos")
  var bysetpos_ParsedOptions: js.Array[Double] = js.native
  @JSName("byweekday")
  var byweekday_ParsedOptions: js.Array[Double] = js.native
  @JSName("byweekno")
  var byweekno_ParsedOptions: js.Array[Double] = js.native
  @JSName("byyearday")
  var byyearday_ParsedOptions: js.Array[Double] = js.native
  @JSName("dtstart")
  var dtstart_ParsedOptions: Date = js.native
  @JSName("wkst")
  var wkst_ParsedOptions: Double = js.native
}

object ParsedOptions {
  @scala.inline
  def apply(
    byhour: js.Array[Double],
    byminute: js.Array[Double],
    bymonth: js.Array[Double],
    bymonthday: js.Array[Double],
    bynmonthday: js.Array[Double],
    bysecond: js.Array[Double],
    bysetpos: js.Array[Double],
    byweekday: js.Array[Double],
    byweekno: js.Array[Double],
    byyearday: js.Array[Double],
    dtstart: Date,
    freq: Frequency,
    interval: Double,
    wkst: Double
  ): ParsedOptions = {
    val __obj = js.Dynamic.literal(byhour = byhour.asInstanceOf[js.Any], byminute = byminute.asInstanceOf[js.Any], bymonth = bymonth.asInstanceOf[js.Any], bymonthday = bymonthday.asInstanceOf[js.Any], bynmonthday = bynmonthday.asInstanceOf[js.Any], bysecond = bysecond.asInstanceOf[js.Any], bysetpos = bysetpos.asInstanceOf[js.Any], byweekday = byweekday.asInstanceOf[js.Any], byweekno = byweekno.asInstanceOf[js.Any], byyearday = byyearday.asInstanceOf[js.Any], dtstart = dtstart.asInstanceOf[js.Any], freq = freq.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], wkst = wkst.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedOptions]
  }
  @scala.inline
  implicit class ParsedOptionsOps[Self <: ParsedOptions] (val x: Self) extends AnyVal {
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
    def setByhourVarargs(value: Double*): Self = this.set("byhour", js.Array(value :_*))
    @scala.inline
    def setByhour(value: js.Array[Double]): Self = this.set("byhour", value.asInstanceOf[js.Any])
    @scala.inline
    def setByminuteVarargs(value: Double*): Self = this.set("byminute", js.Array(value :_*))
    @scala.inline
    def setByminute(value: js.Array[Double]): Self = this.set("byminute", value.asInstanceOf[js.Any])
    @scala.inline
    def setBymonthVarargs(value: Double*): Self = this.set("bymonth", js.Array(value :_*))
    @scala.inline
    def setBymonth(value: js.Array[Double]): Self = this.set("bymonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setBymonthdayVarargs(value: Double*): Self = this.set("bymonthday", js.Array(value :_*))
    @scala.inline
    def setBymonthday(value: js.Array[Double]): Self = this.set("bymonthday", value.asInstanceOf[js.Any])
    @scala.inline
    def setBynmonthdayVarargs(value: Double*): Self = this.set("bynmonthday", js.Array(value :_*))
    @scala.inline
    def setBynmonthday(value: js.Array[Double]): Self = this.set("bynmonthday", value.asInstanceOf[js.Any])
    @scala.inline
    def setBysecondVarargs(value: Double*): Self = this.set("bysecond", js.Array(value :_*))
    @scala.inline
    def setBysecond(value: js.Array[Double]): Self = this.set("bysecond", value.asInstanceOf[js.Any])
    @scala.inline
    def setBysetposVarargs(value: Double*): Self = this.set("bysetpos", js.Array(value :_*))
    @scala.inline
    def setBysetpos(value: js.Array[Double]): Self = this.set("bysetpos", value.asInstanceOf[js.Any])
    @scala.inline
    def setByweekdayVarargs(value: Double*): Self = this.set("byweekday", js.Array(value :_*))
    @scala.inline
    def setByweekday(value: js.Array[Double]): Self = this.set("byweekday", value.asInstanceOf[js.Any])
    @scala.inline
    def setByweeknoVarargs(value: Double*): Self = this.set("byweekno", js.Array(value :_*))
    @scala.inline
    def setByweekno(value: js.Array[Double]): Self = this.set("byweekno", value.asInstanceOf[js.Any])
    @scala.inline
    def setByyeardayVarargs(value: Double*): Self = this.set("byyearday", js.Array(value :_*))
    @scala.inline
    def setByyearday(value: js.Array[Double]): Self = this.set("byyearday", value.asInstanceOf[js.Any])
    @scala.inline
    def setDtstart(value: Date): Self = this.set("dtstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setWkst(value: Double): Self = this.set("wkst", value.asInstanceOf[js.Any])
  }
  
}

