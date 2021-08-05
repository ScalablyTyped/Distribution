package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomShapes extends StObject {
  
  def init(sigma: Sigma): Unit
}
object CustomShapes {
  
  inline def apply(init: Sigma => Unit): CustomShapes = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[CustomShapes]
  }
  
  extension [Self <: CustomShapes](x: Self) {
    
    inline def setInit(value: Sigma => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
  }
}
