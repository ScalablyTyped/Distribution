package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionComplete extends StObject {
  
  var interactionComplete: String
  
  var interactionStart: String
}
object InteractionComplete {
  
  inline def apply(interactionComplete: String, interactionStart: String): InteractionComplete = {
    val __obj = js.Dynamic.literal(interactionComplete = interactionComplete.asInstanceOf[js.Any], interactionStart = interactionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionComplete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractionComplete] (val x: Self) extends AnyVal {
    
    inline def setInteractionComplete(value: String): Self = StObject.set(x, "interactionComplete", value.asInstanceOf[js.Any])
    
    inline def setInteractionStart(value: String): Self = StObject.set(x, "interactionStart", value.asInstanceOf[js.Any])
  }
}
