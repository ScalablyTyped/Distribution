package typings.rsocketFlowable

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowableRequestOperatorMod {
  
  @JSImport("rsocket-flowable/FlowableRequestOperator", JSImport.Default)
  @js.native
  class default[T] protected () extends FlowableRequestOperator[T] {
    def this(
      subscriber: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> */ js.Any,
      toRequest: Double
    ) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> * / any */ @js.native
  trait FlowableRequestOperator[T] extends StObject {
    
    def onComplete(): Unit = js.native
    
    def onError(error: Error): Unit = js.native
    
    def onNext(t: T): Unit = js.native
    
    def onSubscribe(
      subscription: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any
    ): Unit = js.native
  }
  object FlowableRequestOperator {
    
    @scala.inline
    def apply[T](
      onComplete: () => Unit,
      onError: Error => Unit,
      onNext: T => Unit,
      onSubscribe: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any => Unit
    ): FlowableRequestOperator[T] = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
      __obj.asInstanceOf[FlowableRequestOperator[T]]
    }
    
    @scala.inline
    implicit class FlowableRequestOperatorMutableBuilder[Self <: FlowableRequestOperator[_], T] (val x: Self with FlowableRequestOperator[T]) extends AnyVal {
      
      @scala.inline
      def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnError(value: Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNext(value: T => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubscribe(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any => Unit
      ): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction1(value))
    }
  }
}
