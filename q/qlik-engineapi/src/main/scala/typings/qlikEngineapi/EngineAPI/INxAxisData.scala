package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxAxisData...
  */
@js.native
trait INxAxisData extends js.Object {
  
  /**
    * List of Axis data.
    */
  var qAxis: js.Array[INxAxisTicks] = js.native
}
object INxAxisData {
  
  @scala.inline
  def apply(qAxis: js.Array[INxAxisTicks]): INxAxisData = {
    val __obj = js.Dynamic.literal(qAxis = qAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAxisData]
  }
  
  @scala.inline
  implicit class INxAxisDataOps[Self <: INxAxisData] (val x: Self) extends AnyVal {
    
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
    def setQAxisVarargs(value: INxAxisTicks*): Self = this.set("qAxis", js.Array(value :_*))
    
    @scala.inline
    def setQAxis(value: js.Array[INxAxisTicks]): Self = this.set("qAxis", value.asInstanceOf[js.Any])
  }
}
