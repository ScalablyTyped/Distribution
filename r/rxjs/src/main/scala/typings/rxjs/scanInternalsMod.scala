package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.rxjsBooleans.`true`
import typings.rxjs.subscriberMod.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scanInternalsMod {
  
  @JSImport("rxjs/dist/types/internal/operators/scanInternals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scanInternals[V, A, S](
    accumulator: js.Function3[/* acc */ V | A | S, /* value */ V, /* index */ Double, A],
    seed: S,
    hasSeed: Boolean,
    emitOnNext: Boolean
  ): js.Function2[/* source */ Observable[V], /* subscriber */ Subscriber[Any], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanInternals")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], hasSeed.asInstanceOf[js.Any], emitOnNext.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* source */ Observable[V], /* subscriber */ Subscriber[Any], Unit]]
  
  inline def scanInternals_true[V, A, S](
    accumulator: js.Function3[/* acc */ V | A | S, /* value */ V, /* index */ Double, A],
    seed: S,
    hasSeed: Boolean,
    emitOnNext: Boolean,
    emitBeforeComplete: `true`
  ): js.Function2[/* source */ Observable[V], /* subscriber */ Subscriber[Any], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanInternals")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], hasSeed.asInstanceOf[js.Any], emitOnNext.asInstanceOf[js.Any], emitBeforeComplete.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* source */ Observable[V], /* subscriber */ Subscriber[Any], Unit]]
}
