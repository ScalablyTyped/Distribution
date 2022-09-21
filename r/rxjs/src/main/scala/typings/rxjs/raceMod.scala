package typings.rxjs

import org.scalablytyped.runtime.TopLevel
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.subscriberMod.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object raceMod {
  
  @JSImport("rxjs/dist/types/internal/observable/race", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def race[T /* <: js.Array[Any] */](
    inputs: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>}
    */ typings.rxjs.rxjsStrings.race & TopLevel[T]
    ]
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(inputs.asInstanceOf[js.Any]).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ]]
  
  inline def raceInit[T](sources: js.Array[ObservableInput[T]]): js.Function1[/* subscriber */ Subscriber[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("raceInit")(sources.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* subscriber */ Subscriber[T], Unit]]
}
