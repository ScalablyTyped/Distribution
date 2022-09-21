package typings.rsocketFlowable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowableTakeOperatorMod {
  
  @JSImport("rsocket-flowable/FlowableTakeOperator", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with FlowableTakeOperator[T] {
    def this(
      subscriber: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> */ Any,
      toTake: Double
    ) = this()
    
    /* CompleteClass */
    override def onComplete(): Unit = js.native
    
    /* CompleteClass */
    override def onError(error: js.Error): Unit = js.native
    
    /* CompleteClass */
    override def onNext(t: T): Unit = js.native
    
    /* CompleteClass */
    override def onSubscribe(
      subscription: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ Any
    ): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> * / any */ trait FlowableTakeOperator[T] extends StObject {
    
    def onComplete(): Unit
    
    def onError(error: js.Error): Unit
    
    def onNext(t: T): Unit
    
    def onSubscribe(
      subscription: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ Any
    ): Unit
  }
  object FlowableTakeOperator {
    
    inline def apply[T](
      onComplete: () => Unit,
      onError: js.Error => Unit,
      onNext: T => Unit,
      onSubscribe: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ Any => Unit
    ): FlowableTakeOperator[T] = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
      __obj.asInstanceOf[FlowableTakeOperator[T]]
    }
    
    extension [Self <: FlowableTakeOperator[?], T](x: Self & FlowableTakeOperator[T]) {
      
      inline def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      inline def setOnError(value: js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnNext(value: T => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
      
      inline def setOnSubscribe(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ Any => Unit
      ): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction1(value))
    }
  }
}
