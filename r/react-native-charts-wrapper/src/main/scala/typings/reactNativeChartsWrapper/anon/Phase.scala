package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phase extends js.Object {
  
  var lineLength: Double = js.native
  
  var phase: js.UndefOr[Double] = js.native
  
  var spaceLength: Double = js.native
}
object Phase {
  
  @scala.inline
  def apply(lineLength: Double, spaceLength: Double): Phase = {
    val __obj = js.Dynamic.literal(lineLength = lineLength.asInstanceOf[js.Any], spaceLength = spaceLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase]
  }
  
  @scala.inline
  implicit class PhaseOps[Self <: Phase] (val x: Self) extends AnyVal {
    
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
    def setLineLength(value: Double): Self = this.set("lineLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceLength(value: Double): Self = this.set("spaceLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase(value: Double): Self = this.set("phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhase: Self = this.set("phase", js.undefined)
  }
}
