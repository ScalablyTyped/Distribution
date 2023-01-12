package typings.stormReactDiagrams.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locked extends StObject {
  
  var locked: Boolean
}
object Locked {
  
  inline def apply(locked: Boolean): Locked = {
    val __obj = js.Dynamic.literal(locked = locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Locked] (val x: Self) extends AnyVal {
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
  }
}
