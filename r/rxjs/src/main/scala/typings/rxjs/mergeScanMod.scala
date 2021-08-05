package typings.rxjs

import typings.rxjs.innerSubscribeMod.SimpleOuterSubscriber
import typings.rxjs.operatorMod.Operator
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.TeardownLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeScanMod {
  
  @JSImport("rxjs/internal/operators/mergeScan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/operators/mergeScan", "MergeScanOperator")
  @js.native
  class MergeScanOperator[T, R] protected ()
    extends StObject
       with Operator[T, R] {
    def this(
      accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
      seed: R,
      concurrent: Double
    ) = this()
    
    /* private */ var accumulator: js.Any = js.native
    
    /* CompleteClass */
    override def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
    
    /* private */ var concurrent: js.Any = js.native
    
    /* private */ var seed: js.Any = js.native
  }
  
  @JSImport("rxjs/internal/operators/mergeScan", "MergeScanSubscriber")
  @js.native
  class MergeScanSubscriber[T, R] protected () extends SimpleOuterSubscriber[T, R] {
    def this(
      destination: Subscriber[R],
      accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
      acc: R,
      concurrent: Double
    ) = this()
    
    /* private */ var _innerSub: js.Any = js.native
    
    /* protected */ def _next(value: js.Any): Unit = js.native
    
    /* private */ var acc: js.Any = js.native
    
    /* private */ var accumulator: js.Any = js.native
    
    /* private */ var active: js.Any = js.native
    
    /* private */ var buffer: js.Any = js.native
    
    /* private */ var concurrent: js.Any = js.native
    
    /* private */ var hasCompleted: js.Any = js.native
    
    /* private */ var hasValue: js.Any = js.native
    
    /* protected */ var index: Double = js.native
  }
  
  inline def mergeScan[T, R](
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
    seed: R
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeScan[T, R](
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
    seed: R,
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
}
