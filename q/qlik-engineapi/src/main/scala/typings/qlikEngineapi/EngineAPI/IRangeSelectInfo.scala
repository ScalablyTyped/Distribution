package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RangeSelectInfo...
  */
@js.native
trait IRangeSelectInfo extends js.Object {
  
  /* ToCheck!
    qRangeLo    Lowest value in the range.    Double
    qRangeHi    Highest value in the range.    Double
    qMeasure    Label of the measure.    String
    */
  /**
    * Range of values.
    */
  var qRange: IRange = js.native
}
object IRangeSelectInfo {
  
  @scala.inline
  def apply(qRange: IRange): IRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qRange = qRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRangeSelectInfo]
  }
  
  @scala.inline
  implicit class IRangeSelectInfoOps[Self <: IRangeSelectInfo] (val x: Self) extends AnyVal {
    
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
    def setQRange(value: IRange): Self = this.set("qRange", value.asInstanceOf[js.Any])
  }
}
