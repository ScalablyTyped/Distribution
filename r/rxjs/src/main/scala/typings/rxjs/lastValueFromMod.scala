package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lastValueFromMod {
  
  @JSImport("rxjs/dist/types/internal/lastValueFrom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lastValueFrom[T](source: Observable[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastValueFrom")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def lastValueFrom[T, D](source: Observable[T], config: LastValueFromConfig[D]): js.Promise[T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("lastValueFrom")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | D]]
  
  trait LastValueFromConfig[T] extends StObject {
    
    var defaultValue: T
  }
  object LastValueFromConfig {
    
    inline def apply[T](defaultValue: T): LastValueFromConfig[T] = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastValueFromConfig[T]]
    }
    
    extension [Self <: LastValueFromConfig[?], T](x: Self & LastValueFromConfig[T]) {
      
      inline def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    }
  }
}
