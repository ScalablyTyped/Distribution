package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Joystick extends StObject {
  
  def getPosition(axisID: Double): Double
  
  def isPressed(buttonID: Double): Boolean
  
  val name: String
  
  val numAxes: Double
  
  val numButtons: Double
}
object Joystick {
  
  inline def apply(
    getPosition: Double => Double,
    isPressed: Double => Boolean,
    name: String,
    numAxes: Double,
    numButtons: Double
  ): Joystick = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction1(getPosition), isPressed = js.Any.fromFunction1(isPressed), name = name.asInstanceOf[js.Any], numAxes = numAxes.asInstanceOf[js.Any], numButtons = numButtons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Joystick]
  }
  
  extension [Self <: Joystick](x: Self) {
    
    inline def setGetPosition(value: Double => Double): Self = StObject.set(x, "getPosition", js.Any.fromFunction1(value))
    
    inline def setIsPressed(value: Double => Boolean): Self = StObject.set(x, "isPressed", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumAxes(value: Double): Self = StObject.set(x, "numAxes", value.asInstanceOf[js.Any])
    
    inline def setNumButtons(value: Double): Self = StObject.set(x, "numButtons", value.asInstanceOf[js.Any])
  }
}
