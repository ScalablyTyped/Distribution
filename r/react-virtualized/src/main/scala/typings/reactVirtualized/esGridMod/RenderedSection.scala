package typings.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderedSection extends StObject {
  
  var columnOverscanStartIndex: Double
  
  var columnOverscanStopIndex: Double
  
  var columnStartIndex: Double
  
  var columnStopIndex: Double
  
  var rowOverscanStartIndex: Double
  
  var rowOverscanStopIndex: Double
  
  var rowStartIndex: Double
  
  var rowStopIndex: Double
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
  implicit class RenderedSectionMutableBuilder[Self <: RenderedSection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnOverscanStartIndex(value: Double): Self = StObject.set(x, "columnOverscanStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnOverscanStopIndex(value: Double): Self = StObject.set(x, "columnOverscanStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStartIndex(value: Double): Self = StObject.set(x, "columnStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStopIndex(value: Double): Self = StObject.set(x, "columnStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowOverscanStartIndex(value: Double): Self = StObject.set(x, "rowOverscanStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowOverscanStopIndex(value: Double): Self = StObject.set(x, "rowOverscanStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStartIndex(value: Double): Self = StObject.set(x, "rowStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStopIndex(value: Double): Self = StObject.set(x, "rowStopIndex", value.asInstanceOf[js.Any])
  }
}
