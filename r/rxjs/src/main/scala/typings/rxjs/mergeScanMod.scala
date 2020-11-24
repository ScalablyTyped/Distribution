package typings.rxjs

import typings.rxjs.innerSubscribeMod.SimpleOuterSubscriber
import typings.rxjs.operatorMod.Operator
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/mergeScan", JSImport.Namespace)
@js.native
object mergeScanMod extends js.Object {
  
  def mergeScan[T, R](
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
    seed: R
  ): OperatorFunction[T, R] = js.native
  def mergeScan[T, R](
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
    seed: R,
    concurrent: Double
  ): OperatorFunction[T, R] = js.native
  
  @js.native
  class MergeScanOperator[T, R] protected () extends Operator[T, R] {
    def this(
      accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
      seed: R,
      concurrent: Double
    ) = this()
    
    var accumulator: js.Any = js.native
    
    var concurrent: js.Any = js.native
    
    var seed: js.Any = js.native
  }
  
  @js.native
  class MergeScanSubscriber[T, R] protected () extends SimpleOuterSubscriber[T, R] {
    def this(
      destination: Subscriber[R],
      accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
      acc: R,
      concurrent: Double
    ) = this()
    
    var _innerSub: js.Any = js.native
    
    /* protected */ def _next(value: js.Any): Unit = js.native
    
    var acc: js.Any = js.native
    
    var accumulator: js.Any = js.native
    
    var active: js.Any = js.native
    
    var buffer: js.Any = js.native
    
    var concurrent: js.Any = js.native
    
    var hasCompleted: js.Any = js.native
    
    var hasValue: js.Any = js.native
    
    var index: Double = js.native
  }
}
