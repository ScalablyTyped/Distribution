package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.REORDER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReorderImpact extends ImpactLocation {
  
  var destination: DraggableLocation = js.native
  
  var `type`: REORDER = js.native
}
object ReorderImpact {
  
  @scala.inline
  def apply(destination: DraggableLocation, `type`: REORDER): ReorderImpact = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReorderImpact]
  }
  
  @scala.inline
  implicit class ReorderImpactOps[Self <: ReorderImpact] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: DraggableLocation): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: REORDER): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
