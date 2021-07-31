package typings.rsocketFlowable

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowableTakeOperatorMod {
  
  @JSImport("rsocket-flowable/FlowableTakeOperator", JSImport.Default)
  @js.native
  class default[T] protected ()
    extends StObject
       with FlowableTakeOperator[T] {
    def this(
      subscriber: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> */ js.Any,
      toTake: Double
    ) = this()
    
    /* CompleteClass */
    override def onComplete(): Unit = js.native
    
    /* CompleteClass */
    override def onError(error: Error): Unit = js.native
    
    /* CompleteClass */
    override def onNext(t: T): Unit = js.native
    
    /* CompleteClass */
    override def onSubscribe(
      subscription: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any
    ): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> * / any */ trait FlowableTakeOperator[T] extends StObject {
    
    def onComplete(): Unit
    
    def onError(error: Error): Unit
    
    def onNext(t: T): Unit
    
    def onSubscribe(
      subscription: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any
    ): Unit
  }
  object FlowableTakeOperator {
    
    @scala.inline
    def apply[T](
      onComplete: () => Unit,
      onError: Error => Unit,
      onNext: T => Unit,
      onSubscribe: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any => Unit
    ): FlowableTakeOperator[T] = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
      __obj.asInstanceOf[FlowableTakeOperator[T]]
    }
    
    @scala.inline
    implicit class FlowableTakeOperatorMutableBuilder[Self <: FlowableTakeOperator[?], T] (val x: Self & FlowableTakeOperator[T]) extends AnyVal {
      
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
