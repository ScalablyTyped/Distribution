package typings.reactBeautifulDnd.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TryGetLockOptions extends StObject {
  
  var sourceEvent: js.UndefOr[Event] = js.undefined
}
object TryGetLockOptions {
  
  inline def apply(): TryGetLockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TryGetLockOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TryGetLockOptions] (val x: Self) extends AnyVal {
    
    inline def setSourceEvent(value: Event): Self = StObject.set(x, "sourceEvent", value.asInstanceOf[js.Any])
    
    inline def setSourceEventUndefined: Self = StObject.set(x, "sourceEvent", js.undefined)
  }
}
