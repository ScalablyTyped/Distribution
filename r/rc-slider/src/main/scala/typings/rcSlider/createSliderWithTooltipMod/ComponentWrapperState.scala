package typings.rcSlider.createSliderWithTooltipMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentWrapperState extends js.Object {
  
  var visibles: Record[Double, Boolean] = js.native
}
object ComponentWrapperState {
  
  @scala.inline
  def apply(visibles: Record[Double, Boolean]): ComponentWrapperState = {
    val __obj = js.Dynamic.literal(visibles = visibles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentWrapperState]
  }
  
  @scala.inline
  implicit class ComponentWrapperStateOps[Self <: ComponentWrapperState] (val x: Self) extends AnyVal {
    
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
    def setVisibles(value: Record[Double, Boolean]): Self = this.set("visibles", value.asInstanceOf[js.Any])
  }
}
