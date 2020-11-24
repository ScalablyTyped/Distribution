package typings.rsocketFlowable

import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-flowable/Flowable", JSImport.Namespace)
@js.native
object flowableMod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> * / any */ @js.native
  trait Flowable[T] extends js.Object {
    
    def lift[R](
      onSubscribeLift: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<R> */ /* subscriber */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> */ _
        ]
    ): Flowable[R] = js.native
    
    def map[R](fn: js.Function1[/* data */ T, R]): Flowable[R] = js.native
    
    def subscribe(): Unit = js.native
    def subscribe(subscriberOrCallback: js.Function1[/* a */ T, Unit]): Unit = js.native
    def subscribe(
      subscriberOrCallback: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> */ _
        ]
    ): Unit = js.native
    
    def take(toTake: Double): Flowable[T] = js.native
  }
  
  @js.native
  class default[T] protected () extends Flowable[T] {
    def this(source: Source[T]) = this()
    def this(source: Source[T], max: Double) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def error(error: Error): Flowable[scala.Nothing] = js.native
    
    def just[U](values: U*): Flowable[U] = js.native
    
    def never(): Flowable[scala.Nothing] = js.native
  }
  
  type Source[T] = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> */ /* subscriber */ js.Any, 
    Unit
  ]
}
