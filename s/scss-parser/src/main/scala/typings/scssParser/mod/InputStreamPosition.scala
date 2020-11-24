package typings.scssParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputStreamPosition extends js.Object {
  
  var column: Double = js.native
  
  var cursor: Double = js.native
  
  var line: Double = js.native
}
object InputStreamPosition {
  
  @scala.inline
  def apply(column: Double, cursor: Double, line: Double): InputStreamPosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputStreamPosition]
  }
  
  @scala.inline
  implicit class InputStreamPositionOps[Self <: InputStreamPosition] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor(value: Double): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
  }
}
