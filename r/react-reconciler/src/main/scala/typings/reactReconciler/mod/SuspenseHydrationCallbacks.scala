package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspenseHydrationCallbacks[SuspenseInstance] extends StObject {
  
  var onDeleted: js.UndefOr[js.Function1[/* suspenseInstance */ SuspenseInstance, Unit]] = js.undefined
  
  var onHydrated: js.UndefOr[js.Function1[/* suspenseInstance */ SuspenseInstance, Unit]] = js.undefined
}
object SuspenseHydrationCallbacks {
  
  inline def apply[SuspenseInstance](): SuspenseHydrationCallbacks[SuspenseInstance] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspenseHydrationCallbacks[SuspenseInstance]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuspenseHydrationCallbacks[?], SuspenseInstance] (val x: Self & SuspenseHydrationCallbacks[SuspenseInstance]) extends AnyVal {
    
    inline def setOnDeleted(value: /* suspenseInstance */ SuspenseInstance => Unit): Self = StObject.set(x, "onDeleted", js.Any.fromFunction1(value))
    
    inline def setOnDeletedUndefined: Self = StObject.set(x, "onDeleted", js.undefined)
    
    inline def setOnHydrated(value: /* suspenseInstance */ SuspenseInstance => Unit): Self = StObject.set(x, "onHydrated", js.Any.fromFunction1(value))
    
    inline def setOnHydratedUndefined: Self = StObject.set(x, "onHydrated", js.undefined)
  }
}
