package typings.storybookAddonBackgrounds.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellAmount extends js.Object {
  
  var cellAmount: Double = js.native
  
  var cellSize: Double = js.native
  
  var opacity: Double = js.native
}
object CellAmount {
  
  @scala.inline
  def apply(cellAmount: Double, cellSize: Double, opacity: Double): CellAmount = {
    val __obj = js.Dynamic.literal(cellAmount = cellAmount.asInstanceOf[js.Any], cellSize = cellSize.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellAmount]
  }
  
  @scala.inline
  implicit class CellAmountOps[Self <: CellAmount] (val x: Self) extends AnyVal {
    
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
    def setCellAmount(value: Double): Self = this.set("cellAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellSize(value: Double): Self = this.set("cellSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
  }
}
