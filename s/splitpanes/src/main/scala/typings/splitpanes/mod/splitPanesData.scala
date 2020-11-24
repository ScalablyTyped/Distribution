package typings.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait splitPanesData extends js.Object {
  
  var container: containerTypes = js.native
  
  var panes: js.Array[_] = js.native
  
  var slotsCopy: String = js.native
  
  var slotsCount: Double = js.native
  
  // Detect double click on touch devices.
  var splitterTaps: splitterTapsTypes = js.native
  
  var splitters: js.Array[_] = js.native
  
  var touch: touchTypes = js.native
  
  var vnodes: js.Array[_] = js.native
}
object splitPanesData {
  
  @scala.inline
  def apply(
    container: containerTypes,
    panes: js.Array[_],
    slotsCopy: String,
    slotsCount: Double,
    splitterTaps: splitterTapsTypes,
    splitters: js.Array[_],
    touch: touchTypes,
    vnodes: js.Array[_]
  ): splitPanesData = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], panes = panes.asInstanceOf[js.Any], slotsCopy = slotsCopy.asInstanceOf[js.Any], slotsCount = slotsCount.asInstanceOf[js.Any], splitterTaps = splitterTaps.asInstanceOf[js.Any], splitters = splitters.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], vnodes = vnodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[splitPanesData]
  }
  
  @scala.inline
  implicit class splitPanesDataOps[Self <: splitPanesData] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: containerTypes): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanesVarargs(value: js.Any*): Self = this.set("panes", js.Array(value :_*))
    
    @scala.inline
    def setPanes(value: js.Array[_]): Self = this.set("panes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotsCopy(value: String): Self = this.set("slotsCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotsCount(value: Double): Self = this.set("slotsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitterTaps(value: splitterTapsTypes): Self = this.set("splitterTaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplittersVarargs(value: js.Any*): Self = this.set("splitters", js.Array(value :_*))
    
    @scala.inline
    def setSplitters(value: js.Array[_]): Self = this.set("splitters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouch(value: touchTypes): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVnodesVarargs(value: js.Any*): Self = this.set("vnodes", js.Array(value :_*))
    
    @scala.inline
    def setVnodes(value: js.Array[_]): Self = this.set("vnodes", value.asInstanceOf[js.Any])
  }
}
