package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollDifference extends js.Object {
  
  // The actual displacement as a result of a scroll is in the opposite
  // direction to the scroll itself. When scrolling down items are displaced
  // upwards. This value is the negated version of the 'value'
  var displacement: Position = js.native
  
  var value: Position = js.native
}
object ScrollDifference {
  
  @scala.inline
  def apply(displacement: Position, value: Position): ScrollDifference = {
    val __obj = js.Dynamic.literal(displacement = displacement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollDifference]
  }
  
  @scala.inline
  implicit class ScrollDifferenceOps[Self <: ScrollDifference] (val x: Self) extends AnyVal {
    
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
    def setDisplacement(value: Position): Self = this.set("displacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Position): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
