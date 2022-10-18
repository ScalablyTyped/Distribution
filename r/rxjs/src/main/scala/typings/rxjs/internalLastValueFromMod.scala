package typings.rxjs

import typings.rxjs.distTypesInternalLastValueFromMod.LastValueFromConfig
import typings.rxjs.distTypesInternalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalLastValueFromMod {
  
  @JSImport("rxjs/internal/lastValueFrom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lastValueFrom[T](source: Observable[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastValueFrom")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def lastValueFrom[T, D](source: Observable[T], config: LastValueFromConfig[D]): js.Promise[T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("lastValueFrom")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | D]]
}
