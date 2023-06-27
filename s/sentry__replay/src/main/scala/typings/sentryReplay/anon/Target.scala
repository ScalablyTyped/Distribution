package typings.sentryReplay.anon

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var target: EventTarget
}
object Target {
  
  inline def apply(target: EventTarget): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
