package typings.sentryReplay.typesTypesReplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timeouts extends StObject {
  
  var maxSessionLife: Double
  
  var sessionIdleExpire: Double
  
  var sessionIdlePause: Double
}
object Timeouts {
  
  inline def apply(maxSessionLife: Double, sessionIdleExpire: Double, sessionIdlePause: Double): Timeouts = {
    val __obj = js.Dynamic.literal(maxSessionLife = maxSessionLife.asInstanceOf[js.Any], sessionIdleExpire = sessionIdleExpire.asInstanceOf[js.Any], sessionIdlePause = sessionIdlePause.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeouts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Timeouts] (val x: Self) extends AnyVal {
    
    inline def setMaxSessionLife(value: Double): Self = StObject.set(x, "maxSessionLife", value.asInstanceOf[js.Any])
    
    inline def setSessionIdleExpire(value: Double): Self = StObject.set(x, "sessionIdleExpire", value.asInstanceOf[js.Any])
    
    inline def setSessionIdlePause(value: Double): Self = StObject.set(x, "sessionIdlePause", value.asInstanceOf[js.Any])
  }
}
