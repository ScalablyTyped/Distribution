package typings.rxjs

import typings.rxjs.internalOperatorMod.Operator
import typings.rxjs.internalSubscriberMod.Subscriber
import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.internalTypesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/map", JSImport.Namespace)
@js.native
object internalOperatorsMapMod extends js.Object {
  @js.native
  class MapOperator[T, R] protected () extends Operator[T, R] {
    def this(project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: js.Any) = this()
    var project: js.Any = js.native
    var thisArg: js.Any = js.native
    /* CompleteClass */
    override def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
  }
  
  def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = js.native
  def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: js.Any): OperatorFunction[T, R] = js.native
}

