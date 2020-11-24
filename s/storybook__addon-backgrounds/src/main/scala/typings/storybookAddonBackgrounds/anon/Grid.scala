package typings.storybookAddonBackgrounds.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grid extends js.Object {
  
  var grid: CellAmount = js.native
  
  var values: js.Array[Name] = js.native
}
object Grid {
  
  @scala.inline
  def apply(grid: CellAmount, values: js.Array[Name]): Grid = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grid]
  }
  
  @scala.inline
  implicit class GridOps[Self <: Grid] (val x: Self) extends AnyVal {
    
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
    def setGrid(value: CellAmount): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Name*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[Name]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
