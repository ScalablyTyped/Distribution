package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.operatorMod.Operator
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findMod {
  
  @JSImport("rxjs/internal/operators/find", "FindValueOperator")
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
  
  @JSImport("rxjs/internal/operators/find", "FindValueSubscriber")
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
  
  @JSImport("rxjs/internal/operators/find", "find")
  @js.native
  def find[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, js.UndefOr[T]] = js.native
  @JSImport("rxjs/internal/operators/find", "find")
  @js.native
  def find[T](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: js.Any
  ): OperatorFunction[T, js.UndefOr[T]] = js.native
  @JSImport("rxjs/internal/operators/find", "find")
  @js.native
  def find_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, js.UndefOr[S]] = js.native
  @JSImport("rxjs/internal/operators/find", "find")
  @js.native
  def find_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    thisArg: js.Any
  ): OperatorFunction[T, js.UndefOr[S]] = js.native
}
