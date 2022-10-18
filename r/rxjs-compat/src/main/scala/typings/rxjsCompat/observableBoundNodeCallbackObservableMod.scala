package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableBoundNodeCallbackObservableMod {
  
  @JSImport("rxjs-compat/observable/BoundNodeCallbackObservable", "BoundNodeCallbackObservable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class BoundNodeCallbackObservable[T] () extends Observable_[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
  }
  /* static members */
  object BoundNodeCallbackObservable {
    
    @JSImport("rxjs-compat/observable/BoundNodeCallbackObservable", "BoundNodeCallbackObservable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](callbackFunc: js.Function): js.Function1[/* repeated */ Any, Observable_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Observable_[T]]]
    inline def create[R](callbackFunc: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ R, Any], Any]): js.Function0[Observable_[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Observable_[R]]]
    inline def create[R](
      callbackFunc: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ R, Any], Any],
      selector: Unit
    ): js.Function0[Observable_[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable_[R]]]
    inline def create[R](
      callbackFunc: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ R, Any], Any],
      selector: Unit,
      scheduler: SchedulerLike
    ): js.Function0[Observable_[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable_[R]]]
    inline def create[T](callbackFunc: js.Function, selector: js.Function1[/* repeated */ Any, T]): js.Function1[/* repeated */ Any, Observable_[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable_[T]]]
    inline def create[T](callbackFunc: js.Function, selector: js.Function1[/* repeated */ Any, T], scheduler: SchedulerLike): js.Function1[/* repeated */ Any, Observable_[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable_[T]]]
    inline def create[T](callbackFunc: js.Function, selector: Unit): js.Function1[/* repeated */ Any, Observable_[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable_[T]]]
    inline def create[T](callbackFunc: js.Function, selector: Unit, scheduler: SchedulerLike): js.Function1[/* repeated */ Any, Observable_[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Observable_[T]]]
    inline def create[T, R](
      callbackFunc: js.Function2[/* v1 */ T, /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], Any]
    ): js.Function1[/* v1 */ T, Observable_[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v1 */ T, Observable_[R]]]
    inline def create[T, R](
      callbackFunc: js.Function2[/* v1 */ T, /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], Any],
      selector: Unit
    ): js.Function1[/* v1 */ T, Observable_[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v1 */ T, Observable_[R]]]
    inline def create[T, R](
      callbackFunc: js.Function2[/* v1 */ T, /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], Any],
      selector: Unit,
      scheduler: SchedulerLike
    ): js.Function1[/* v1 */ T, Observable_[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v1 */ T, Observable_[R]]]
    inline def create[T, T2, R](
      callbackFunc: js.Function3[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ]
    ): js.Function2[/* v1 */ T, /* v2 */ T2, Observable_[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* v1 */ T, /* v2 */ T2, Observable_[R]]]
    inline def create[T, T2, R](
      callbackFunc: js.Function3[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ],
      selector: Unit
    ): js.Function2[/* v1 */ T, /* v2 */ T2, Observable_[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* v1 */ T, /* v2 */ T2, Observable_[R]]]
    inline def create[T, T2, R](
      callbackFunc: js.Function3[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ],
      selector: Unit,
      scheduler: SchedulerLike
    ): js.Function2[/* v1 */ T, /* v2 */ T2, Observable_[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* v1 */ T, /* v2 */ T2, Observable_[R]]]
    inline def create[T, T2, T3, R](
      callbackFunc: js.Function4[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ]
    ): js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, Observable_[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, Observable_[R]]]
    inline def create[T, T2, T3, R](
      callbackFunc: js.Function4[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ],
      selector: Unit
    ): js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, Observable_[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, Observable_[R]]]
    inline def create[T, T2, T3, R](
      callbackFunc: js.Function4[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ],
      selector: Unit,
      scheduler: SchedulerLike
    ): js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, Observable_[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, Observable_[R]]]
    inline def create[T, T2, T3, T4, R](
      callbackFunc: js.Function5[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ]
    ): js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, Observable_[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, Observable_[R]]]
    inline def create[T, T2, T3, T4, R](
      callbackFunc: js.Function5[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ],
      selector: Unit
    ): js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, Observable_[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, Observable_[R]]]
    inline def create[T, T2, T3, T4, R](
      callbackFunc: js.Function5[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ],
      selector: Unit,
      scheduler: SchedulerLike
    ): js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, Observable_[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, Observable_[R]]]
    inline def create[T, T2, T3, T4, T5, R](
      callbackFunc: js.Function6[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ]
    ): js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, Observable_[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, Observable_[R]]]
    inline def create[T, T2, T3, T4, T5, R](
      callbackFunc: js.Function6[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ],
      selector: Unit
    ): js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, Observable_[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, Observable_[R]]]
    inline def create[T, T2, T3, T4, T5, R](
      callbackFunc: js.Function6[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ],
      selector: Unit,
      scheduler: SchedulerLike
    ): js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, Observable_[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, Observable_[R]]]
    inline def create[T, T2, T3, T4, T5, T6, R](
      callbackFunc: js.Function7[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* v6 */ T6, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ]
    ): js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, Observable_[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, Observable_[R]]]
    inline def create[T, T2, T3, T4, T5, T6, R](
      callbackFunc: js.Function7[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* v6 */ T6, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ],
      selector: Unit
    ): js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, Observable_[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, Observable_[R]]]
    inline def create[T, T2, T3, T4, T5, T6, R](
      callbackFunc: js.Function7[
          /* v1 */ T, 
          /* v2 */ T2, 
          /* v3 */ T3, 
          /* v4 */ T4, 
          /* v5 */ T5, 
          /* v6 */ T6, 
          /* callback */ js.Function2[/* err */ Any, /* result */ R, Any], 
          Any
        ],
      selector: Unit,
      scheduler: SchedulerLike
    ): js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, Observable_[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(callbackFunc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, Observable_[R]]]
  }
}
