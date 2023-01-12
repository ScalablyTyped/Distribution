package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalFirstValueFromMod {
  
  @JSImport("rxjs/dist/types/internal/firstValueFrom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def firstValueFrom[T](source: Observable[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("firstValueFrom")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def firstValueFrom[T, D](source: Observable[T], config: FirstValueFromConfig[D]): js.Promise[T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("firstValueFrom")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | D]]
  
  trait FirstValueFromConfig[T] extends StObject {
    
    var defaultValue: T
  }
  object FirstValueFromConfig {
    
    inline def apply[T](defaultValue: T): FirstValueFromConfig[T] = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirstValueFromConfig[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirstValueFromConfig[?], T] (val x: Self & FirstValueFromConfig[T]) extends AnyVal {
      
      inline def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    }
  }
}
