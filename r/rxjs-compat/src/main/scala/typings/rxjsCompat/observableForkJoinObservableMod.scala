package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.SubscribableOrPromise
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableForkJoinObservableMod {
  
  @JSImport("rxjs-compat/observable/ForkJoinObservable", "ForkJoinObservable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class ForkJoinObservable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
  }
  /* static members */
  object ForkJoinObservable {
    
    @JSImport("rxjs-compat/observable/ForkJoinObservable", "ForkJoinObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](sources: SubscribableOrPromise[T]*): Observable_[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Observable_[js.Array[T]]]
    inline def create[T](sources: js.Array[SubscribableOrPromise[T]]): Observable_[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable_[js.Array[T]]]
    inline def create[R](sources: js.Array[SubscribableOrPromise[Any]], project: js.Function1[/* repeated */ Any, R]): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
    inline def create[T, R](v1: SubscribableOrPromise[T], project: js.Function1[/* v1 */ T, R]): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
    inline def create[T, T2](v1: SubscribableOrPromise[T], v2: SubscribableOrPromise[T2]): Observable_[js.Tuple2[T, T2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Tuple2[T, T2]]]
    inline def create[T, T2, R](
      v1: SubscribableOrPromise[T],
      v2: SubscribableOrPromise[T2],
      project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
    ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
    inline def create[T, T2, T3](v1: SubscribableOrPromise[T], v2: SubscribableOrPromise[T2], v3: SubscribableOrPromise[T3]): Observable_[js.Tuple3[T, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Tuple3[T, T2, T3]]]
    inline def create[T, T2, T3, R](
      v1: SubscribableOrPromise[T],
      v2: SubscribableOrPromise[T2],
      v3: SubscribableOrPromise[T3],
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
    inline def create[T, T2, T3, T4](
      v1: SubscribableOrPromise[T],
      v2: SubscribableOrPromise[T2],
      v3: SubscribableOrPromise[T3],
      v4: SubscribableOrPromise[T4]
    ): Observable_[js.Tuple4[T, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Tuple4[T, T2, T3, T4]]]
    inline def create[T, T2, T3, T4, R](
      v1: SubscribableOrPromise[T],
      v2: SubscribableOrPromise[T2],
      v3: SubscribableOrPromise[T3],
      v4: SubscribableOrPromise[T4],
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
    inline def create[T, T2, T3, T4, T5](
      v1: SubscribableOrPromise[T],
      v2: SubscribableOrPromise[T2],
      v3: SubscribableOrPromise[T3],
      v4: SubscribableOrPromise[T4],
      v5: SubscribableOrPromise[T5]
    ): Observable_[js.Tuple5[T, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Tuple5[T, T2, T3, T4, T5]]]
    inline def create[T, T2, T3, T4, T5, R](
      v1: SubscribableOrPromise[T],
      v2: SubscribableOrPromise[T2],
      v3: SubscribableOrPromise[T3],
      v4: SubscribableOrPromise[T4],
      v5: SubscribableOrPromise[T5],
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
    inline def create[T, T2, T3, T4, T5, T6](
      v1: SubscribableOrPromise[T],
      v2: SubscribableOrPromise[T2],
      v3: SubscribableOrPromise[T3],
      v4: SubscribableOrPromise[T4],
      v5: SubscribableOrPromise[T5],
      v6: SubscribableOrPromise[T6]
    ): Observable_[js.Tuple6[T, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Tuple6[T, T2, T3, T4, T5, T6]]]
    inline def create[T, T2, T3, T4, T5, T6, R](
      v1: SubscribableOrPromise[T],
      v2: SubscribableOrPromise[T2],
      v3: SubscribableOrPromise[T3],
      v4: SubscribableOrPromise[T4],
      v5: SubscribableOrPromise[T5],
      v6: SubscribableOrPromise[T6],
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
    
    inline def create_R[R](sources: SubscribableOrPromise[Any]*): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Observable_[R]]
    inline def create_R[R](sources: js.Array[SubscribableOrPromise[Any]]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
    
    inline def create_TR[T, R](sources: js.Array[SubscribableOrPromise[T]], project: js.Function1[/* repeated */ T, R]): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(sources.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  }
}
