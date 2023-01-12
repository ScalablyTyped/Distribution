package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxPointers
  extends StObject
     with /* x */ StringDictionary[Any] {
  
  var maxPointers: js.UndefOr[Double] = js.undefined
  
  var minPointers: js.UndefOr[Double] = js.undefined
}
object MaxPointers {
  
  inline def apply(): MaxPointers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxPointers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxPointers] (val x: Self) extends AnyVal {
    
    inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
    
    inline def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
    
    inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
    
    inline def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
  }
}
