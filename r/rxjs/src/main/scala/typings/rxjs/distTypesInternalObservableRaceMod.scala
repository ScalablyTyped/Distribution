package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableRaceMod {
  
  @JSImport("rxjs/dist/types/internal/observable/race", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def race[T /* <: js.Array[Any] */](
    inputs: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>} */ js.Any
    ]
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(inputs.asInstanceOf[js.Any]).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ]]
  
  inline def raceInit[T](sources: js.Array[ObservableInput[T]]): js.Function1[/* subscriber */ Subscriber[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("raceInit")(sources.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* subscriber */ Subscriber[T], Unit]]
}
