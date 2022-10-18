package typings.rxjs

import typings.rxjs.distTypesInternalFirstValueFromMod.FirstValueFromConfig
import typings.rxjs.distTypesInternalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalFirstValueFromMod {
  
  @JSImport("rxjs/internal/firstValueFrom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def firstValueFrom[T](source: Observable[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("firstValueFrom")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def firstValueFrom[T, D](source: Observable[T], config: FirstValueFromConfig[D]): js.Promise[T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("firstValueFrom")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | D]]
}
