package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeLibrary extends StObject {
  
  def enumerate(): Any
}
object ShapeLibrary {
  
  inline def apply(enumerate: () => Any): ShapeLibrary = {
    val __obj = js.Dynamic.literal(enumerate = js.Any.fromFunction0(enumerate))
    __obj.asInstanceOf[ShapeLibrary]
  }
  
  extension [Self <: ShapeLibrary](x: Self) {
    
    inline def setEnumerate(value: () => Any): Self = StObject.set(x, "enumerate", js.Any.fromFunction0(value))
  }
}
