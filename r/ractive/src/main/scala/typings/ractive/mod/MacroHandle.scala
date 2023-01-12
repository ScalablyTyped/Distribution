package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacroHandle extends StObject {
  
  var invalidate: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var render: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var teardown: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var update: js.UndefOr[js.Function1[/* attributes */ ValueMap, Unit]] = js.undefined
}
object MacroHandle {
  
  inline def apply(): MacroHandle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacroHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MacroHandle] (val x: Self) extends AnyVal {
    
    inline def setInvalidate(value: () => Unit): Self = StObject.set(x, "invalidate", js.Any.fromFunction0(value))
    
    inline def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
    
    inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setTeardown(value: () => Unit): Self = StObject.set(x, "teardown", js.Any.fromFunction0(value))
    
    inline def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
    
    inline def setUpdate(value: /* attributes */ ValueMap => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
