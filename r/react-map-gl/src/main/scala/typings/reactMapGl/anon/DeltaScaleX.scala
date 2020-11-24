package typings.reactMapGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeltaScaleX extends js.Object {
  
  var deltaScaleX: js.UndefOr[Double] = js.native
  
  var deltaScaleY: js.UndefOr[Double] = js.native
}
object DeltaScaleX {
  
  @scala.inline
  def apply(): DeltaScaleX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeltaScaleX]
  }
  
  @scala.inline
  implicit class DeltaScaleXOps[Self <: DeltaScaleX] (val x: Self) extends AnyVal {
    
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
    def setDeltaScaleX(value: Double): Self = this.set("deltaScaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaScaleX: Self = this.set("deltaScaleX", js.undefined)
    
    @scala.inline
    def setDeltaScaleY(value: Double): Self = this.set("deltaScaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaScaleY: Self = this.set("deltaScaleY", js.undefined)
  }
}
