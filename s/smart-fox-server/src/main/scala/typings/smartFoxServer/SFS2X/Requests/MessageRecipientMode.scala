package typings.smartFoxServer.SFS2X.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageRecipientMode extends StObject {
  
  /** Returns the selected recipient mode. */
  var mode: Double
  
  /** Returns the moderator/administrator message target, according to the selected recipient mode. */
  var target: Any
}
object MessageRecipientMode {
  
  inline def apply(mode: Double, target: Any): MessageRecipientMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRecipientMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageRecipientMode] (val x: Self) extends AnyVal {
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
