package typings.rrule.typesMod

import typings.rrule.weekdayMod.Weekday
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var byeaster: Double | Null = js.native
  var byhour: Double | js.Array[Double] | Null = js.native
  var byminute: Double | js.Array[Double] | Null = js.native
  var bymonth: Double | js.Array[Double] | Null = js.native
  var bymonthday: Double | js.Array[Double] | Null = js.native
  var bynmonthday: js.Array[Double] | Null = js.native
  var bynweekday: js.Array[js.Array[Double]] | Null = js.native
  var bysecond: Double | js.Array[Double] | Null = js.native
  var bysetpos: Double | js.Array[Double] | Null = js.native
  var byweekday: ByWeekday | js.Array[ByWeekday] | Null = js.native
  var byweekno: Double | js.Array[Double] | Null = js.native
  var byyearday: Double | js.Array[Double] | Null = js.native
  var count: Double | Null = js.native
  var dtstart: Date | Null = js.native
  var freq: Frequency = js.native
  var interval: Double = js.native
  var tzid: String | Null = js.native
  var until: Date | Null = js.native
  var wkst: Weekday | Double | Null = js.native
}

object Options {
  @scala.inline
  def apply(freq: Frequency, interval: Double): Options = {
    val __obj = js.Dynamic.literal(freq = freq.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFreq(value: Frequency): Self = this.set("freq", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setByeaster(value: Double): Self = this.set("byeaster", value.asInstanceOf[js.Any])
    @scala.inline
    def setByeasterNull: Self = this.set("byeaster", null)
    @scala.inline
    def setByhourVarargs(value: Double*): Self = this.set("byhour", js.Array(value :_*))
    @scala.inline
    def setByhour(value: Double | js.Array[Double]): Self = this.set("byhour", value.asInstanceOf[js.Any])
    @scala.inline
    def setByhourNull: Self = this.set("byhour", null)
    @scala.inline
    def setByminuteVarargs(value: Double*): Self = this.set("byminute", js.Array(value :_*))
    @scala.inline
    def setByminute(value: Double | js.Array[Double]): Self = this.set("byminute", value.asInstanceOf[js.Any])
    @scala.inline
    def setByminuteNull: Self = this.set("byminute", null)
    @scala.inline
    def setBymonthVarargs(value: Double*): Self = this.set("bymonth", js.Array(value :_*))
    @scala.inline
    def setBymonth(value: Double | js.Array[Double]): Self = this.set("bymonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setBymonthNull: Self = this.set("bymonth", null)
    @scala.inline
    def setBymonthdayVarargs(value: Double*): Self = this.set("bymonthday", js.Array(value :_*))
    @scala.inline
    def setBymonthday(value: Double | js.Array[Double]): Self = this.set("bymonthday", value.asInstanceOf[js.Any])
    @scala.inline
    def setBymonthdayNull: Self = this.set("bymonthday", null)
    @scala.inline
    def setBynmonthdayVarargs(value: Double*): Self = this.set("bynmonthday", js.Array(value :_*))
    @scala.inline
    def setBynmonthday(value: js.Array[Double]): Self = this.set("bynmonthday", value.asInstanceOf[js.Any])
    @scala.inline
    def setBynmonthdayNull: Self = this.set("bynmonthday", null)
    @scala.inline
    def setBynweekdayVarargs(value: js.Array[Double]*): Self = this.set("bynweekday", js.Array(value :_*))
    @scala.inline
    def setBynweekday(value: js.Array[js.Array[Double]]): Self = this.set("bynweekday", value.asInstanceOf[js.Any])
    @scala.inline
    def setBynweekdayNull: Self = this.set("bynweekday", null)
    @scala.inline
    def setBysecondVarargs(value: Double*): Self = this.set("bysecond", js.Array(value :_*))
    @scala.inline
    def setBysecond(value: Double | js.Array[Double]): Self = this.set("bysecond", value.asInstanceOf[js.Any])
    @scala.inline
    def setBysecondNull: Self = this.set("bysecond", null)
    @scala.inline
    def setBysetposVarargs(value: Double*): Self = this.set("bysetpos", js.Array(value :_*))
    @scala.inline
    def setBysetpos(value: Double | js.Array[Double]): Self = this.set("bysetpos", value.asInstanceOf[js.Any])
    @scala.inline
    def setBysetposNull: Self = this.set("bysetpos", null)
    @scala.inline
    def setByweekdayVarargs(value: ByWeekday*): Self = this.set("byweekday", js.Array(value :_*))
    @scala.inline
    def setByweekday(value: ByWeekday | js.Array[ByWeekday]): Self = this.set("byweekday", value.asInstanceOf[js.Any])
    @scala.inline
    def setByweekdayNull: Self = this.set("byweekday", null)
    @scala.inline
    def setByweeknoVarargs(value: Double*): Self = this.set("byweekno", js.Array(value :_*))
    @scala.inline
    def setByweekno(value: Double | js.Array[Double]): Self = this.set("byweekno", value.asInstanceOf[js.Any])
    @scala.inline
    def setByweeknoNull: Self = this.set("byweekno", null)
    @scala.inline
    def setByyeardayVarargs(value: Double*): Self = this.set("byyearday", js.Array(value :_*))
    @scala.inline
    def setByyearday(value: Double | js.Array[Double]): Self = this.set("byyearday", value.asInstanceOf[js.Any])
    @scala.inline
    def setByyeardayNull: Self = this.set("byyearday", null)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountNull: Self = this.set("count", null)
    @scala.inline
    def setDtstart(value: Date): Self = this.set("dtstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setDtstartNull: Self = this.set("dtstart", null)
    @scala.inline
    def setTzid(value: String): Self = this.set("tzid", value.asInstanceOf[js.Any])
    @scala.inline
    def setTzidNull: Self = this.set("tzid", null)
    @scala.inline
    def setUntil(value: Date): Self = this.set("until", value.asInstanceOf[js.Any])
    @scala.inline
    def setUntilNull: Self = this.set("until", null)
    @scala.inline
    def setWkst(value: Weekday | Double): Self = this.set("wkst", value.asInstanceOf[js.Any])
    @scala.inline
    def setWkstNull: Self = this.set("wkst", null)
  }
  
}

