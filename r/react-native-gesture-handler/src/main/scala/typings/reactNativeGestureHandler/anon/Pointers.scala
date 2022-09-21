package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pointers extends StObject {
  
  var pointers: js.UndefOr[Double] = js.undefined
}
object Pointers {
  
  inline def apply(): Pointers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pointers]
  }
  
  extension [Self <: Pointers](x: Self) {
    
    inline def setPointers(value: Double): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
    
    inline def setPointersUndefined: Self = StObject.set(x, "pointers", js.undefined)
  }
}
