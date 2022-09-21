package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  def camera(camera: Camera, target: StringDictionary[Any], options: StringDictionary[Any]): Double
}
object Animation {
  
  inline def apply(camera: (Camera, StringDictionary[Any], StringDictionary[Any]) => Double): Animation = {
    val __obj = js.Dynamic.literal(camera = js.Any.fromFunction3(camera))
    __obj.asInstanceOf[Animation]
  }
  
  extension [Self <: Animation](x: Self) {
    
    inline def setCamera(value: (Camera, StringDictionary[Any], StringDictionary[Any]) => Double): Self = StObject.set(x, "camera", js.Any.fromFunction3(value))
  }
}
