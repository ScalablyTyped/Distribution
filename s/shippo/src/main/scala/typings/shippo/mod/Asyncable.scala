package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asyncable extends StObject {
  
  var async: js.UndefOr[Boolean] = js.undefined
}
object Asyncable {
  
  inline def apply(): Asyncable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asyncable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Asyncable] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
  }
}
