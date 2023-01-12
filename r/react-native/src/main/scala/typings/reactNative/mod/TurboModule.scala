package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TurboModule extends StObject {
  
  var getConstants: js.UndefOr[js.Function0[js.Object]] = js.undefined
}
object TurboModule {
  
  inline def apply(): TurboModule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TurboModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TurboModule] (val x: Self) extends AnyVal {
    
    inline def setGetConstants(value: () => js.Object): Self = StObject.set(x, "getConstants", js.Any.fromFunction0(value))
    
    inline def setGetConstantsUndefined: Self = StObject.set(x, "getConstants", js.undefined)
  }
}
