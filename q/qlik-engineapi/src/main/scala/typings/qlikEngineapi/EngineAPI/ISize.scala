package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Size...
  */
@js.native
trait ISize extends js.Object {
  
  /**
    * Number of pixels on the x axis.
    */
  var qcx: Double = js.native
  
  /**
    * Number of pixels on the y axis.
    */
  var qcy: Double = js.native
}
object ISize {
  
  @scala.inline
  def apply(qcx: Double, qcy: Double): ISize = {
    val __obj = js.Dynamic.literal(qcx = qcx.asInstanceOf[js.Any], qcy = qcy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISize]
  }
  
  @scala.inline
  implicit class ISizeOps[Self <: ISize] (val x: Self) extends AnyVal {
    
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
    def setQcx(value: Double): Self = this.set("qcx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQcy(value: Double): Self = this.set("qcy", value.asInstanceOf[js.Any])
  }
}
