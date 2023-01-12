package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitterTapsType extends StObject {
  
  var splitter: Null | Double
  
  var timeoutId: Null | js.Object
}
object SplitterTapsType {
  
  inline def apply(): SplitterTapsType = {
    val __obj = js.Dynamic.literal(splitter = null, timeoutId = null)
    __obj.asInstanceOf[SplitterTapsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplitterTapsType] (val x: Self) extends AnyVal {
    
    inline def setSplitter(value: Double): Self = StObject.set(x, "splitter", value.asInstanceOf[js.Any])
    
    inline def setSplitterNull: Self = StObject.set(x, "splitter", null)
    
    inline def setTimeoutId(value: js.Object): Self = StObject.set(x, "timeoutId", value.asInstanceOf[js.Any])
    
    inline def setTimeoutIdNull: Self = StObject.set(x, "timeoutId", null)
  }
}
