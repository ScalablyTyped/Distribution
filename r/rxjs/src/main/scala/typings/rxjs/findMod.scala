package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.operatorMod.Operator
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/find", JSImport.Namespace)
@js.native
object findMod extends js.Object {
  @js.native
  class FindValueOperator[T] protected ()
    extends Operator[T, js.UndefOr[T | Double]] {
    def this(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
      source: Observable[T],
      yieldIndex: Boolean
    ) = this()
    def this(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
      source: Observable[T],
      yieldIndex: Boolean,
      thisArg: js.Any
    ) = this()
    var predicate: js.Any = js.native
    var source: js.Any = js.native
    var thisArg: js.Any = js.native
    var yieldIndex: js.Any = js.native
  }
  
  @js.native
  class FindValueSubscriber[T] protected () extends Subscriber[T] {
    def this(
      destination: Subscriber[T],
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
      source: Observable[T],
      yieldIndex: Boolean
    ) = this()
    def this(
      destination: Subscriber[T],
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
      source: Observable[T],
      yieldIndex: Boolean,
      thisArg: js.Any
    ) = this()
    var index: js.Any = js.native
    var notifyComplete: js.Any = js.native
    var predicate: js.Any = js.native
    var source: js.Any = js.native
    var thisArg: js.Any = js.native
    var yieldIndex: js.Any = js.native
  }
  
  def find[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, js.UndefOr[T]] = js.native
  def find[T](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: js.Any
  ): OperatorFunction[T, js.UndefOr[T]] = js.native
  @JSName("find")
  def find_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, js.UndefOr[S]] = js.native
  @JSName("find")
  def find_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    thisArg: js.Any
  ): OperatorFunction[T, js.UndefOr[S]] = js.native
}

