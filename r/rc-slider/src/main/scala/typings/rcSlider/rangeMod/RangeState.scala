package typings.rcSlider.rangeMod

import typings.rcSlider.interfaceMod.GenericSliderState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeState extends GenericSliderState {
  
  var bounds: js.Array[Double] = js.native
  
  var handle: Double | Null = js.native
  
  var recent: Double = js.native
}
object RangeState {
  
  @scala.inline
  def apply(bounds: js.Array[Double], recent: Double): RangeState = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], recent = recent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeState]
  }
  
  @scala.inline
  implicit class RangeStateOps[Self <: RangeState] (val x: Self) extends AnyVal {
    
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
    def setBoundsVarargs(value: Double*): Self = this.set("bounds", js.Array(value :_*))
    
    @scala.inline
    def setBounds(value: js.Array[Double]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecent(value: Double): Self = this.set("recent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: Double): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleNull: Self = this.set("handle", null)
  }
}
