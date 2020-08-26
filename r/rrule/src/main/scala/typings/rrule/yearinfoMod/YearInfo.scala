package typings.rrule.yearinfoMod

import typings.rrule.rruleNumbers.`365`
import typings.rrule.rruleNumbers.`366`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YearInfo extends js.Object {
  var mdaymask: js.Array[Double] = js.native
  var mmask: js.Array[Double] = js.native
  var mrange: js.Array[Double] = js.native
  var nextyearlen: `365` | `366` = js.native
  var nmdaymask: js.Array[Double] = js.native
  var wdaymask: js.Array[Double] = js.native
  var wnomask: js.Array[Double] | Null = js.native
  var yearlen: `365` | `366` = js.native
  var yearordinal: Double = js.native
  var yearweekday: Double = js.native
}

object YearInfo {
  @scala.inline
  def apply(
    mdaymask: js.Array[Double],
    mmask: js.Array[Double],
    mrange: js.Array[Double],
    nextyearlen: `365` | `366`,
    nmdaymask: js.Array[Double],
    wdaymask: js.Array[Double],
    yearlen: `365` | `366`,
    yearordinal: Double,
    yearweekday: Double
  ): YearInfo = {
    val __obj = js.Dynamic.literal(mdaymask = mdaymask.asInstanceOf[js.Any], mmask = mmask.asInstanceOf[js.Any], mrange = mrange.asInstanceOf[js.Any], nextyearlen = nextyearlen.asInstanceOf[js.Any], nmdaymask = nmdaymask.asInstanceOf[js.Any], wdaymask = wdaymask.asInstanceOf[js.Any], yearlen = yearlen.asInstanceOf[js.Any], yearordinal = yearordinal.asInstanceOf[js.Any], yearweekday = yearweekday.asInstanceOf[js.Any])
    __obj.asInstanceOf[YearInfo]
  }
  @scala.inline
  implicit class YearInfoOps[Self <: YearInfo] (val x: Self) extends AnyVal {
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
    def setMdaymaskVarargs(value: Double*): Self = this.set("mdaymask", js.Array(value :_*))
    @scala.inline
    def setMdaymask(value: js.Array[Double]): Self = this.set("mdaymask", value.asInstanceOf[js.Any])
    @scala.inline
    def setMmaskVarargs(value: Double*): Self = this.set("mmask", js.Array(value :_*))
    @scala.inline
    def setMmask(value: js.Array[Double]): Self = this.set("mmask", value.asInstanceOf[js.Any])
    @scala.inline
    def setMrangeVarargs(value: Double*): Self = this.set("mrange", js.Array(value :_*))
    @scala.inline
    def setMrange(value: js.Array[Double]): Self = this.set("mrange", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextyearlen(value: `365` | `366`): Self = this.set("nextyearlen", value.asInstanceOf[js.Any])
    @scala.inline
    def setNmdaymaskVarargs(value: Double*): Self = this.set("nmdaymask", js.Array(value :_*))
    @scala.inline
    def setNmdaymask(value: js.Array[Double]): Self = this.set("nmdaymask", value.asInstanceOf[js.Any])
    @scala.inline
    def setWdaymaskVarargs(value: Double*): Self = this.set("wdaymask", js.Array(value :_*))
    @scala.inline
    def setWdaymask(value: js.Array[Double]): Self = this.set("wdaymask", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearlen(value: `365` | `366`): Self = this.set("yearlen", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearordinal(value: Double): Self = this.set("yearordinal", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearweekday(value: Double): Self = this.set("yearweekday", value.asInstanceOf[js.Any])
    @scala.inline
    def setWnomaskVarargs(value: Double*): Self = this.set("wnomask", js.Array(value :_*))
    @scala.inline
    def setWnomask(value: js.Array[Double]): Self = this.set("wnomask", value.asInstanceOf[js.Any])
    @scala.inline
    def setWnomaskNull: Self = this.set("wnomask", null)
  }
  
}

