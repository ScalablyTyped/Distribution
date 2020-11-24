package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSelectInfo extends js.Object {
  
  var qMeasure: String = js.native
  
  var qRangeHi: Double = js.native
  
  var qRangeLo: Double = js.native
}
object RangeSelectInfo {
  
  @scala.inline
  def apply(qMeasure: String, qRangeHi: Double, qRangeLo: Double): RangeSelectInfo = {
    val __obj = js.Dynamic.literal(qMeasure = qMeasure.asInstanceOf[js.Any], qRangeHi = qRangeHi.asInstanceOf[js.Any], qRangeLo = qRangeLo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectInfo]
  }
  
  @scala.inline
  implicit class RangeSelectInfoOps[Self <: RangeSelectInfo] (val x: Self) extends AnyVal {
    
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
    def setQMeasure(value: String): Self = this.set("qMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRangeHi(value: Double): Self = this.set("qRangeHi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRangeLo(value: Double): Self = this.set("qRangeLo", value.asInstanceOf[js.Any])
  }
}
