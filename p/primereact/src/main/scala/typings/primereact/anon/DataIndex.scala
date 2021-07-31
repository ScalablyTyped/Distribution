package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataIndex extends StObject {
  
  var data: js.Any
  
  var index: Double
  
  var originalEvent: typings.std.Event
}
object DataIndex {
  
  @scala.inline
  def apply(data: js.Any, index: Double, originalEvent: typings.std.Event): DataIndex = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndex]
  }
  
  @scala.inline
  implicit class DataIndexMutableBuilder[Self <: DataIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
