package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.subscriberMod.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liftMod {
  
  @JSImport("rxjs/dist/types/internal/util/lift", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasLift(source: Any): /* is rxjs.anon.Lift */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasLift")(source.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.anon.Lift */ Boolean]
  
  inline def operate[T, R](
    init: js.Function2[
      /* liftedSource */ Observable[T], 
      /* subscriber */ Subscriber[R], 
      js.Function0[Unit] | Unit
    ]
  ): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("operate")(init.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
}
