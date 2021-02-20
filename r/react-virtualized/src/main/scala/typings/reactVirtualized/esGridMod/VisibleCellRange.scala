package typings.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisibleCellRange extends StObject {
  
  var start: Double = js.native
  
  var stop: Double = js.native
}
object VisibleCellRange {
  
  @scala.inline
  def apply(start: Double, stop: Double): VisibleCellRange = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleCellRange]
  }
  
  @scala.inline
  implicit class VisibleCellRangeMutableBuilder[Self <: VisibleCellRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
