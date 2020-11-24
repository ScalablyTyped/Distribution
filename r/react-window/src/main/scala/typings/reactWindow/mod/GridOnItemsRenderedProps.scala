package typings.reactWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridOnItemsRenderedProps extends js.Object {
  
  var overscanColumnStartIndex: Double = js.native
  
  var overscanColumnStopIndex: Double = js.native
  
  var overscanRowStartIndex: Double = js.native
  
  var overscanRowStopIndex: Double = js.native
  
  var visibleColumnStartIndex: Double = js.native
  
  var visibleColumnStopIndex: Double = js.native
  
  var visibleRowStartIndex: Double = js.native
  
  var visibleRowStopIndex: Double = js.native
}
object GridOnItemsRenderedProps {
  
  @scala.inline
  def apply(
    overscanColumnStartIndex: Double,
    overscanColumnStopIndex: Double,
    overscanRowStartIndex: Double,
    overscanRowStopIndex: Double,
    visibleColumnStartIndex: Double,
    visibleColumnStopIndex: Double,
    visibleRowStartIndex: Double,
    visibleRowStopIndex: Double
  ): GridOnItemsRenderedProps = {
    val __obj = js.Dynamic.literal(overscanColumnStartIndex = overscanColumnStartIndex.asInstanceOf[js.Any], overscanColumnStopIndex = overscanColumnStopIndex.asInstanceOf[js.Any], overscanRowStartIndex = overscanRowStartIndex.asInstanceOf[js.Any], overscanRowStopIndex = overscanRowStopIndex.asInstanceOf[js.Any], visibleColumnStartIndex = visibleColumnStartIndex.asInstanceOf[js.Any], visibleColumnStopIndex = visibleColumnStopIndex.asInstanceOf[js.Any], visibleRowStartIndex = visibleRowStartIndex.asInstanceOf[js.Any], visibleRowStopIndex = visibleRowStopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOnItemsRenderedProps]
  }
  
  @scala.inline
  implicit class GridOnItemsRenderedPropsOps[Self <: GridOnItemsRenderedProps] (val x: Self) extends AnyVal {
    
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
    def setOverscanColumnStartIndex(value: Double): Self = this.set("overscanColumnStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanColumnStopIndex(value: Double): Self = this.set("overscanColumnStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanRowStartIndex(value: Double): Self = this.set("overscanRowStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanRowStopIndex(value: Double): Self = this.set("overscanRowStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleColumnStartIndex(value: Double): Self = this.set("visibleColumnStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleColumnStopIndex(value: Double): Self = this.set("visibleColumnStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRowStartIndex(value: Double): Self = this.set("visibleRowStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRowStopIndex(value: Double): Self = this.set("visibleRowStopIndex", value.asInstanceOf[js.Any])
  }
}
