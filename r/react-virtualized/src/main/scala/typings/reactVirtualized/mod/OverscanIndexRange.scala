package typings.reactVirtualized.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverscanIndexRange extends StObject {
  
  var overscanStartIndex: Double = js.native
  
  var overscanStopIndex: Double = js.native
}
object OverscanIndexRange {
  
  @scala.inline
  def apply(overscanStartIndex: Double, overscanStopIndex: Double): OverscanIndexRange = {
    val __obj = js.Dynamic.literal(overscanStartIndex = overscanStartIndex.asInstanceOf[js.Any], overscanStopIndex = overscanStopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverscanIndexRange]
  }
  
  @scala.inline
  implicit class OverscanIndexRangeMutableBuilder[Self <: OverscanIndexRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverscanStartIndex(value: Double): Self = StObject.set(x, "overscanStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanStopIndex(value: Double): Self = StObject.set(x, "overscanStopIndex", value.asInstanceOf[js.Any])
  }
}
