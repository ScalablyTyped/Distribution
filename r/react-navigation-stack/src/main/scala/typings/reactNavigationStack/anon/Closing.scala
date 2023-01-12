package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closing extends StObject {
  
  var closing: Boolean
}
object Closing {
  
  inline def apply(closing: Boolean): Closing = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Closing] (val x: Self) extends AnyVal {
    
    inline def setClosing(value: Boolean): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
  }
}
