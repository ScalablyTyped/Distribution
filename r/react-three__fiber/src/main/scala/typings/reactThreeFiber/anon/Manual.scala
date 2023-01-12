package typings.reactThreeFiber.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Manual extends StObject {
  
  var manual: js.UndefOr[Boolean] = js.undefined
}
object Manual {
  
  inline def apply(): Manual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Manual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Manual] (val x: Self) extends AnyVal {
    
    inline def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
  }
}
