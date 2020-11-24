package typings.reactStonecutter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layout_ extends js.Object {
  
  /**
    * height of the entire grid
    */
  var gridHeight: Double = js.native
  
  /**
    * width of the entire grid
    */
  var gridWidth: Double = js.native
  
  /**
    * an Array of [x, y] coordinate pairs like this: [[0, 0], [20, 0], [0, 30]]
    */
  var positions: js.Array[Coordinates] = js.native
}
object Layout_ {
  
  @scala.inline
  def apply(gridHeight: Double, gridWidth: Double, positions: js.Array[Coordinates]): Layout_ = {
    val __obj = js.Dynamic.literal(gridHeight = gridHeight.asInstanceOf[js.Any], gridWidth = gridWidth.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout_]
  }
  
  @scala.inline
  implicit class Layout_Ops[Self <: Layout_] (val x: Self) extends AnyVal {
    
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
    def setGridHeight(value: Double): Self = this.set("gridHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridWidth(value: Double): Self = this.set("gridWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsVarargs(value: Coordinates*): Self = this.set("positions", js.Array(value :_*))
    
    @scala.inline
    def setPositions(value: js.Array[Coordinates]): Self = this.set("positions", value.asInstanceOf[js.Any])
  }
}
