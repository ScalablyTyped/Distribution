package typings.reactMapGl.mod

import typings.reactMapGl.reactMapGlStrings.imperial
import typings.reactMapGl.reactMapGlStrings.metric
import typings.reactMapGl.reactMapGlStrings.nautical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleControlProps extends BaseControlProps {
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var unit: js.UndefOr[imperial | metric | nautical] = js.native
}
object ScaleControlProps {
  
  @scala.inline
  def apply(): ScaleControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleControlProps]
  }
  
  @scala.inline
  implicit class ScaleControlPropsOps[Self <: ScaleControlProps] (val x: Self) extends AnyVal {
    
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
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setUnit(value: imperial | metric | nautical): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
