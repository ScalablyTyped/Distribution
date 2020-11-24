package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxContinuousRangeSelectInfo with extends of RangeSelectInfo
  */
@js.native
trait INxContinuousRangeSelectInfo extends IRangeSelectInfo {
  
  /**
    * Dimension index.
    */
  var qDimIx: Double = js.native
}
object INxContinuousRangeSelectInfo {
  
  @scala.inline
  def apply(qDimIx: Double, qRange: IRange): INxContinuousRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qDimIx = qDimIx.asInstanceOf[js.Any], qRange = qRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxContinuousRangeSelectInfo]
  }
  
  @scala.inline
  implicit class INxContinuousRangeSelectInfoOps[Self <: INxContinuousRangeSelectInfo] (val x: Self) extends AnyVal {
    
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
    def setQDimIx(value: Double): Self = this.set("qDimIx", value.asInstanceOf[js.Any])
  }
}
