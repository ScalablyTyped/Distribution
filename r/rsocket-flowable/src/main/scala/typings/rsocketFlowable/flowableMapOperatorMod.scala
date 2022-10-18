package typings.rsocketFlowable

import typings.rsocketTypes.reactiveStreamTypesMod.ISubscriber
import typings.rsocketTypes.reactiveStreamTypesMod.ISubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowableMapOperatorMod {
  
  @JSImport("rsocket-flowable/FlowableMapOperator", JSImport.Default)
  @js.native
  open class default[T, R] protected ()
    extends StObject
       with FlowableMapOperator[T, R] {
    def this(subscriber: ISubscriber[R], fn: js.Function1[/* t */ T, R]) = this()
    
    /* CompleteClass */
    override def onComplete(): Unit = js.native
    
    /* CompleteClass */
    override def onError(error: js.Error): Unit = js.native
    
    /* CompleteClass */
    override def onNext(value: T): Unit = js.native
    
    /* CompleteClass */
    override def onSubscribe(subscription: ISubscription): Unit = js.native
  }
  
  trait FlowableMapOperator[T, R]
    extends StObject
       with ISubscriber[T]
  object FlowableMapOperator {
    
    inline def apply[T, R](
      onComplete: () => Unit,
      onError: js.Error => Unit,
      onNext: T => Unit,
      onSubscribe: ISubscription => Unit
    ): FlowableMapOperator[T, R] = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
      __obj.asInstanceOf[FlowableMapOperator[T, R]]
    }
  }
}
