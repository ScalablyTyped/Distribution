package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CandleStickValue extends js.Object {
  
  var close: Double = js.native
  
  var marker: js.UndefOr[String] = js.native
  
  var open: Double = js.native
  
  var shadowH: Double = js.native
  
  var shadowL: Double = js.native
  
  var x: js.UndefOr[Double] = js.native
}
object CandleStickValue {
  
  @scala.inline
  def apply(close: Double, open: Double, shadowH: Double, shadowL: Double): CandleStickValue = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], shadowH = shadowH.asInstanceOf[js.Any], shadowL = shadowL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandleStickValue]
  }
  
  @scala.inline
  implicit class CandleStickValueOps[Self <: CandleStickValue] (val x: Self) extends AnyVal {
    
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
    def setClose(value: Double): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Double): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowH(value: Double): Self = this.set("shadowH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowL(value: Double): Self = this.set("shadowL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
  }
}
