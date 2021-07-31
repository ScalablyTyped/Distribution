package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  def camera(camera: Camera, target: StringDictionary[js.Any], options: StringDictionary[js.Any]): Double
}
object Animation {
  
  @scala.inline
  def apply(camera: (Camera, StringDictionary[js.Any], StringDictionary[js.Any]) => Double): Animation = {
    val __obj = js.Dynamic.literal(camera = js.Any.fromFunction3(camera))
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationMutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCamera(value: (Camera, StringDictionary[js.Any], StringDictionary[js.Any]) => Double): Self = StObject.set(x, "camera", js.Any.fromFunction3(value))
  }
}
