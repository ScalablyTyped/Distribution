package typings.reactNativeScreens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoingForward extends StObject {
  
  var closing: Value
  
  var goingForward: Value
  
  var progress: Value
}
object GoingForward {
  
  inline def apply(closing: Value, goingForward: Value, progress: Value): GoingForward = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], goingForward = goingForward.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoingForward]
  }
  
  extension [Self <: GoingForward](x: Self) {
    
    inline def setClosing(value: Value): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    inline def setGoingForward(value: Value): Self = StObject.set(x, "goingForward", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Value): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
