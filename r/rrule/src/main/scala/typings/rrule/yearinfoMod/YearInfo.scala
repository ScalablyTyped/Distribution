package typings.rrule.yearinfoMod

import typings.rrule.rruleNumbers.`365`
import typings.rrule.rruleNumbers.`366`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YearInfo extends js.Object {
  var mdaymask: js.Array[Double]
  var mmask: js.Array[Double]
  var mrange: js.Array[Double]
  var nextyearlen: `365` | `366`
  var nmdaymask: js.Array[Double]
  var wdaymask: js.Array[Double]
  var wnomask: js.Array[Double] | Null
  var yearlen: `365` | `366`
  var yearordinal: Double
  var yearweekday: Double
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
    yearweekday: Double,
    wnomask: js.Array[Double] = null
  ): YearInfo = {
    val __obj = js.Dynamic.literal(mdaymask = mdaymask.asInstanceOf[js.Any], mmask = mmask.asInstanceOf[js.Any], mrange = mrange.asInstanceOf[js.Any], nextyearlen = nextyearlen.asInstanceOf[js.Any], nmdaymask = nmdaymask.asInstanceOf[js.Any], wdaymask = wdaymask.asInstanceOf[js.Any], yearlen = yearlen.asInstanceOf[js.Any], yearordinal = yearordinal.asInstanceOf[js.Any], yearweekday = yearweekday.asInstanceOf[js.Any])
    if (wnomask != null) __obj.updateDynamic("wnomask")(wnomask.asInstanceOf[js.Any])
    __obj.asInstanceOf[YearInfo]
  }
}

