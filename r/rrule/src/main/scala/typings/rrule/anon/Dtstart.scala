package typings.rrule.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dtstart extends js.Object {
  
  var dtstart: js.UndefOr[Date | Null] = js.native
  
  var exdatevals: js.Array[Date] = js.native
  
  var exrulevals: js.Array[PartialOptions] = js.native
  
  var rdatevals: js.Array[Date] = js.native
  
  var rrulevals: js.Array[PartialOptions] = js.native
  
  var tzid: js.UndefOr[String | Null] = js.native
}
object Dtstart {
  
  @scala.inline
  def apply(
    exdatevals: js.Array[Date],
    exrulevals: js.Array[PartialOptions],
    rdatevals: js.Array[Date],
    rrulevals: js.Array[PartialOptions]
  ): Dtstart = {
    val __obj = js.Dynamic.literal(exdatevals = exdatevals.asInstanceOf[js.Any], exrulevals = exrulevals.asInstanceOf[js.Any], rdatevals = rdatevals.asInstanceOf[js.Any], rrulevals = rrulevals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dtstart]
  }
  
  @scala.inline
  implicit class DtstartOps[Self <: Dtstart] (val x: Self) extends AnyVal {
    
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
    def setExdatevalsVarargs(value: Date*): Self = this.set("exdatevals", js.Array(value :_*))
    
    @scala.inline
    def setExdatevals(value: js.Array[Date]): Self = this.set("exdatevals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExrulevalsVarargs(value: PartialOptions*): Self = this.set("exrulevals", js.Array(value :_*))
    
    @scala.inline
    def setExrulevals(value: js.Array[PartialOptions]): Self = this.set("exrulevals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdatevalsVarargs(value: Date*): Self = this.set("rdatevals", js.Array(value :_*))
    
    @scala.inline
    def setRdatevals(value: js.Array[Date]): Self = this.set("rdatevals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRrulevalsVarargs(value: PartialOptions*): Self = this.set("rrulevals", js.Array(value :_*))
    
    @scala.inline
    def setRrulevals(value: js.Array[PartialOptions]): Self = this.set("rrulevals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtstart(value: Date): Self = this.set("dtstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDtstart: Self = this.set("dtstart", js.undefined)
    
    @scala.inline
    def setDtstartNull: Self = this.set("dtstart", null)
    
    @scala.inline
    def setTzid(value: String): Self = this.set("tzid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTzid: Self = this.set("tzid", js.undefined)
    
    @scala.inline
    def setTzidNull: Self = this.set("tzid", null)
  }
}
