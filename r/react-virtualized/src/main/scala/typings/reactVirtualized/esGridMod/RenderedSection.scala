package typings.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderedSection extends js.Object {
  
  var columnOverscanStartIndex: Double = js.native
  
  var columnOverscanStopIndex: Double = js.native
  
  var columnStartIndex: Double = js.native
  
  var columnStopIndex: Double = js.native
  
  var rowOverscanStartIndex: Double = js.native
  
  var rowOverscanStopIndex: Double = js.native
  
  var rowStartIndex: Double = js.native
  
  var rowStopIndex: Double = js.native
}
object RenderedSection {
  
  @scala.inline
  def apply(
    columnOverscanStartIndex: Double,
    columnOverscanStopIndex: Double,
    columnStartIndex: Double,
    columnStopIndex: Double,
    rowOverscanStartIndex: Double,
    rowOverscanStopIndex: Double,
    rowStartIndex: Double,
    rowStopIndex: Double
  ): RenderedSection = {
    val __obj = js.Dynamic.literal(columnOverscanStartIndex = columnOverscanStartIndex.asInstanceOf[js.Any], columnOverscanStopIndex = columnOverscanStopIndex.asInstanceOf[js.Any], columnStartIndex = columnStartIndex.asInstanceOf[js.Any], columnStopIndex = columnStopIndex.asInstanceOf[js.Any], rowOverscanStartIndex = rowOverscanStartIndex.asInstanceOf[js.Any], rowOverscanStopIndex = rowOverscanStopIndex.asInstanceOf[js.Any], rowStartIndex = rowStartIndex.asInstanceOf[js.Any], rowStopIndex = rowStopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedSection]
  }
  
  @scala.inline
  implicit class RenderedSectionOps[Self <: RenderedSection] (val x: Self) extends AnyVal {
    
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
    def setColumnOverscanStartIndex(value: Double): Self = this.set("columnOverscanStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnOverscanStopIndex(value: Double): Self = this.set("columnOverscanStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStartIndex(value: Double): Self = this.set("columnStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStopIndex(value: Double): Self = this.set("columnStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowOverscanStartIndex(value: Double): Self = this.set("rowOverscanStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowOverscanStopIndex(value: Double): Self = this.set("rowOverscanStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStartIndex(value: Double): Self = this.set("rowStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStopIndex(value: Double): Self = this.set("rowStopIndex", value.asInstanceOf[js.Any])
  }
}
