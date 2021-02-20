package typings.reactVirtualized.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexRange extends StObject {
  
  var startIndex: Double = js.native
  
  var stopIndex: Double = js.native
}
object IndexRange {
  
  @scala.inline
  def apply(startIndex: Double, stopIndex: Double): IndexRange = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any], stopIndex = stopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexRange]
  }
  
  @scala.inline
  implicit class IndexRangeMutableBuilder[Self <: IndexRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopIndex(value: Double): Self = StObject.set(x, "stopIndex", value.asInstanceOf[js.Any])
  }
}
