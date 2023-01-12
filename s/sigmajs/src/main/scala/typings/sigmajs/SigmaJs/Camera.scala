package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typings.sigmajs.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Camera extends StObject {
  
  var angle: Double
  
  def cameraPosition(x: Double, y: Double): X
  
  def goTo(settings: StringDictionary[Any]): Unit
  
  def graphPosition(x: Double, y: Double): X
  
  var ratio: Double
  
  var readPrefix: String
  
  def settings(setting: String): Any
  
  var x: Double
  
  var y: Double
}
object Camera {
  
  inline def apply(
    angle: Double,
    cameraPosition: (Double, Double) => X,
    goTo: StringDictionary[Any] => Unit,
    graphPosition: (Double, Double) => X,
    ratio: Double,
    readPrefix: String,
    settings: String => Any,
    x: Double,
    y: Double
  ): Camera = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], cameraPosition = js.Any.fromFunction2(cameraPosition), goTo = js.Any.fromFunction1(goTo), graphPosition = js.Any.fromFunction2(graphPosition), ratio = ratio.asInstanceOf[js.Any], readPrefix = readPrefix.asInstanceOf[js.Any], settings = js.Any.fromFunction1(settings), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Camera] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setCameraPosition(value: (Double, Double) => X): Self = StObject.set(x, "cameraPosition", js.Any.fromFunction2(value))
    
    inline def setGoTo(value: StringDictionary[Any] => Unit): Self = StObject.set(x, "goTo", js.Any.fromFunction1(value))
    
    inline def setGraphPosition(value: (Double, Double) => X): Self = StObject.set(x, "graphPosition", js.Any.fromFunction2(value))
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setReadPrefix(value: String): Self = StObject.set(x, "readPrefix", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: String => Any): Self = StObject.set(x, "settings", js.Any.fromFunction1(value))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
