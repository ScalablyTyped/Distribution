package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Range...
  */
@js.native
trait IRange extends js.Object {
  
  /**
    * Highest value in the range
    */
  var qMax: Double = js.native
  
  /**
    * If set to true, the range includes the highest value in the range of selections (Equals to ). [bn(50500)]
    * Example:
    *            The range is [1,10]. If qMinInclEq is set to true it means that 10 is included in the range of selections.
    */
  var qMaxInclEq: Boolean = js.native
  
  /**
    * Lowest value in the range
    */
  var qMin: Double = js.native
  
  /**
    * If set to true, the range includes the lowest value in the range of selections (Equals to ). [bn(50500)]
    * Example:
    *           The range is [1,10]. If qMinInclEq is set to true it means that 1 is included in the range of selections.
    */
  var qMinInclEq: Boolean = js.native
}
object IRange {
  
  @scala.inline
  def apply(qMax: Double, qMaxInclEq: Boolean, qMin: Double, qMinInclEq: Boolean): IRange = {
    val __obj = js.Dynamic.literal(qMax = qMax.asInstanceOf[js.Any], qMaxInclEq = qMaxInclEq.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any], qMinInclEq = qMinInclEq.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRange]
  }
  
  @scala.inline
  implicit class IRangeOps[Self <: IRange] (val x: Self) extends AnyVal {
    
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
    def setQMax(value: Double): Self = this.set("qMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMaxInclEq(value: Boolean): Self = this.set("qMaxInclEq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMin(value: Double): Self = this.set("qMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMinInclEq(value: Boolean): Self = this.set("qMinInclEq", value.asInstanceOf[js.Any])
  }
}
