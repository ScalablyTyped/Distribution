package typings.storybookComponents.spacedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpacedProps extends js.Object {
  
  var col: js.UndefOr[Double] = js.native
  
  var outer: js.UndefOr[Double | Boolean] = js.native
  
  var row: js.UndefOr[Double] = js.native
}
object SpacedProps {
  
  @scala.inline
  def apply(): SpacedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpacedProps]
  }
  
  @scala.inline
  implicit class SpacedPropsOps[Self <: SpacedProps] (val x: Self) extends AnyVal {
    
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
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCol: Self = this.set("col", js.undefined)
    
    @scala.inline
    def setOuter(value: Double | Boolean): Self = this.set("outer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuter: Self = this.set("outer", js.undefined)
    
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
  }
}
