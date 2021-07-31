package typings.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var position: String
  
  var right: Double
  
  var top: Double
}
object Position {
  
  @scala.inline
  def apply(position: String, right: Double, top: Double): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
