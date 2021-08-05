package typings.rsocketFlowable

import typings.std.Error
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowableMod {
  
  @JSImport("rsocket-flowable/Flowable", JSImport.Default)
  @js.native
  class default[T] protected ()
    extends StObject
       with Flowable[T] {
    def this(source: Source[T]) = this()
    def this(source: Source[T], max: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rsocket-flowable/Flowable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(error: Error): Flowable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(error.asInstanceOf[js.Any]).asInstanceOf[Flowable[scala.Nothing]]
    
    inline def just[U](values: U*): Flowable[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("just")(values.asInstanceOf[js.Any]).asInstanceOf[Flowable[U]]
    
    inline def never(): Flowable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Flowable[scala.Nothing]]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> * / any */ @js.native
  trait Flowable[T] extends StObject {
    
    def lift[R](
      onSubscribeLift: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<R> */ /* subscriber */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> */ js.Any
        ]
    ): Flowable[R] = js.native
    
    def map[R](fn: js.Function1[/* data */ T, R]): Flowable[R] = js.native
    
    def subscribe(): Unit = js.native
    def subscribe(subscriberOrCallback: js.Function1[/* a */ T, Unit]): Unit = js.native
    def subscribe(
      subscriberOrCallback: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> */ js.Any
        ]
    ): Unit = js.native
    
    def take(toTake: Double): Flowable[T] = js.native
  }
  
  type Source[T] = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> */ /* subscriber */ js.Any, 
    Unit
  ]
}
