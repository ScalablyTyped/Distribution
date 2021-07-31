package typings.rxjs

import typings.rxjs.innerSubscribeMod.SimpleOuterSubscriber
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distinctMod {
  
  @JSImport("rxjs/internal/operators/distinct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/operators/distinct", "DistinctSubscriber")
  @js.native
  class DistinctSubscriber[T, K] protected () extends SimpleOuterSubscriber[T, T] {
    def this(destination: Subscriber[T]) = this()
    def this(destination: Subscriber[T], keySelector: js.Function1[/* value */ T, K]) = this()
    def this(
      destination: Subscriber[T],
      keySelector: js.Function1[/* value */ T, K],
      flushes: Observable[js.Any]
    ) = this()
    def this(destination: Subscriber[T], keySelector: Unit, flushes: Observable[js.Any]) = this()
    
    var _finalizeNext: js.Any = js.native
    
    var _useKeySelector: js.Any = js.native
    
    var keySelector: js.Any = js.native
    
    def notifyNext(): Unit = js.native
    
    var values: js.Any = js.native
  }
  
  @scala.inline
  def distinct[T, K](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def distinct[T, K](keySelector: js.Function1[/* value */ T, K], flushes: Observable[js.Any]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any], flushes.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def distinct[T, K](keySelector: Unit, flushes: Observable[js.Any]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any], flushes.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
}
