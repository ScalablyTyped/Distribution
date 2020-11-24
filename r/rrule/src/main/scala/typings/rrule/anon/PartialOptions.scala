package typings.rrule.anon

import typings.rrule.typesMod.ByWeekday
import typings.rrule.typesMod.Frequency
import typings.rrule.weekdayMod.Weekday
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rrule.rrule/dist/esm/src/types.Options> */
@js.native
trait PartialOptions extends js.Object {
  
  var byeaster: js.UndefOr[Double | Null] = js.native
  
  var byhour: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  
  var byminute: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  
  var bymonth: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  
  var bymonthday: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  
  var bynmonthday: js.UndefOr[js.Array[Double] | Null] = js.native
  
  var bynweekday: js.UndefOr[js.Array[js.Array[Double]] | Null] = js.native
  
  var bysecond: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  
  var bysetpos: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  
  var byweekday: js.UndefOr[ByWeekday | js.Array[ByWeekday] | Null] = js.native
  
  var byweekno: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  
  var byyearday: js.UndefOr[Double | js.Array[Double] | Null] = js.native
  
  var count: js.UndefOr[Double | Null] = js.native
  
  var dtstart: js.UndefOr[Date | Null] = js.native
  
  var freq: js.UndefOr[Frequency] = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var tzid: js.UndefOr[String | Null] = js.native
  
  var until: js.UndefOr[Date | Null] = js.native
  
  var wkst: js.UndefOr[Weekday | Double | Null] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
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
    def setByeaster(value: Double): Self = this.set("byeaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByeaster: Self = this.set("byeaster", js.undefined)
    
    @scala.inline
    def setByeasterNull: Self = this.set("byeaster", null)
    
    @scala.inline
    def setByhourVarargs(value: Double*): Self = this.set("byhour", js.Array(value :_*))
    
    @scala.inline
    def setByhour(value: Double | js.Array[Double]): Self = this.set("byhour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByhour: Self = this.set("byhour", js.undefined)
    
    @scala.inline
    def setByhourNull: Self = this.set("byhour", null)
    
    @scala.inline
    def setByminuteVarargs(value: Double*): Self = this.set("byminute", js.Array(value :_*))
    
    @scala.inline
    def setByminute(value: Double | js.Array[Double]): Self = this.set("byminute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByminute: Self = this.set("byminute", js.undefined)
    
    @scala.inline
    def setByminuteNull: Self = this.set("byminute", null)
    
    @scala.inline
    def setBymonthVarargs(value: Double*): Self = this.set("bymonth", js.Array(value :_*))
    
    @scala.inline
    def setBymonth(value: Double | js.Array[Double]): Self = this.set("bymonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBymonth: Self = this.set("bymonth", js.undefined)
    
    @scala.inline
    def setBymonthNull: Self = this.set("bymonth", null)
    
    @scala.inline
    def setBymonthdayVarargs(value: Double*): Self = this.set("bymonthday", js.Array(value :_*))
    
    @scala.inline
    def setBymonthday(value: Double | js.Array[Double]): Self = this.set("bymonthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBymonthday: Self = this.set("bymonthday", js.undefined)
    
    @scala.inline
    def setBymonthdayNull: Self = this.set("bymonthday", null)
    
    @scala.inline
    def setBynmonthdayVarargs(value: Double*): Self = this.set("bynmonthday", js.Array(value :_*))
    
    @scala.inline
    def setBynmonthday(value: js.Array[Double]): Self = this.set("bynmonthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBynmonthday: Self = this.set("bynmonthday", js.undefined)
    
    @scala.inline
    def setBynmonthdayNull: Self = this.set("bynmonthday", null)
    
    @scala.inline
    def setBynweekdayVarargs(value: js.Array[Double]*): Self = this.set("bynweekday", js.Array(value :_*))
    
    @scala.inline
    def setBynweekday(value: js.Array[js.Array[Double]]): Self = this.set("bynweekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBynweekday: Self = this.set("bynweekday", js.undefined)
    
    @scala.inline
    def setBynweekdayNull: Self = this.set("bynweekday", null)
    
    @scala.inline
    def setBysecondVarargs(value: Double*): Self = this.set("bysecond", js.Array(value :_*))
    
    @scala.inline
    def setBysecond(value: Double | js.Array[Double]): Self = this.set("bysecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBysecond: Self = this.set("bysecond", js.undefined)
    
    @scala.inline
    def setBysecondNull: Self = this.set("bysecond", null)
    
    @scala.inline
    def setBysetposVarargs(value: Double*): Self = this.set("bysetpos", js.Array(value :_*))
    
    @scala.inline
    def setBysetpos(value: Double | js.Array[Double]): Self = this.set("bysetpos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBysetpos: Self = this.set("bysetpos", js.undefined)
    
    @scala.inline
    def setBysetposNull: Self = this.set("bysetpos", null)
    
    @scala.inline
    def setByweekdayVarargs(value: ByWeekday*): Self = this.set("byweekday", js.Array(value :_*))
    
    @scala.inline
    def setByweekday(value: ByWeekday | js.Array[ByWeekday]): Self = this.set("byweekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByweekday: Self = this.set("byweekday", js.undefined)
    
    @scala.inline
    def setByweekdayNull: Self = this.set("byweekday", null)
    
    @scala.inline
    def setByweeknoVarargs(value: Double*): Self = this.set("byweekno", js.Array(value :_*))
    
    @scala.inline
    def setByweekno(value: Double | js.Array[Double]): Self = this.set("byweekno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByweekno: Self = this.set("byweekno", js.undefined)
    
    @scala.inline
    def setByweeknoNull: Self = this.set("byweekno", null)
    
    @scala.inline
    def setByyeardayVarargs(value: Double*): Self = this.set("byyearday", js.Array(value :_*))
    
    @scala.inline
    def setByyearday(value: Double | js.Array[Double]): Self = this.set("byyearday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByyearday: Self = this.set("byyearday", js.undefined)
    
    @scala.inline
    def setByyeardayNull: Self = this.set("byyearday", null)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setCountNull: Self = this.set("count", null)
    
    @scala.inline
    def setDtstart(value: Date): Self = this.set("dtstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDtstart: Self = this.set("dtstart", js.undefined)
    
    @scala.inline
    def setDtstartNull: Self = this.set("dtstart", null)
    
    @scala.inline
    def setFreq(value: Frequency): Self = this.set("freq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreq: Self = this.set("freq", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setTzid(value: String): Self = this.set("tzid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTzid: Self = this.set("tzid", js.undefined)
    
    @scala.inline
    def setTzidNull: Self = this.set("tzid", null)
    
    @scala.inline
    def setUntil(value: Date): Self = this.set("until", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUntil: Self = this.set("until", js.undefined)
    
    @scala.inline
    def setUntilNull: Self = this.set("until", null)
    
    @scala.inline
    def setWkst(value: Weekday | Double): Self = this.set("wkst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWkst: Self = this.set("wkst", js.undefined)
    
    @scala.inline
    def setWkstNull: Self = this.set("wkst", null)
  }
}
