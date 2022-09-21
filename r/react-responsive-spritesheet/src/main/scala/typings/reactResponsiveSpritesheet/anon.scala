package typings.reactResponsiveSpritesheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Callback extends StObject {
    
    def callback(): Unit
    
    var frame: Double
  }
  object Callback {
    
    inline def apply(callback: () => Unit, frame: Double): Callback = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), frame = frame.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    extension [Self <: Callback](x: Self) {
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setFrame(value: Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    }
  }
}
