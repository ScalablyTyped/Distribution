package typings.seen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inertia extends StObject {
  
  var inertia: Boolean
}
object Inertia {
  
  inline def apply(inertia: Boolean): Inertia = {
    val __obj = js.Dynamic.literal(inertia = inertia.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inertia]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inertia] (val x: Self) extends AnyVal {
    
    inline def setInertia(value: Boolean): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
  }
}
