package typings.rsocketFlowable

import typings.rsocketTypes.reactiveStreamTypesMod.ISubscriber
import typings.rsocketTypes.reactiveStreamTypesMod.ISubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowableRequestOperatorMod {
  
  @JSImport("rsocket-flowable/FlowableRequestOperator", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with FlowableRequestOperator[T] {
    def this(subscriber: ISubscriber[T], toRequest: Double) = this()
    
    /* CompleteClass */
    override def onComplete(): Unit = js.native
    
    /* CompleteClass */
    override def onError(error: js.Error): Unit = js.native
    
    /* CompleteClass */
    override def onNext(value: T): Unit = js.native
    
    /* CompleteClass */
    override def onSubscribe(subscription: ISubscription): Unit = js.native
  }
  
  trait FlowableRequestOperator[T]
    extends StObject
       with ISubscriber[T]
  object FlowableRequestOperator {
    
    inline def apply[T](
      onComplete: () => Unit,
      onError: js.Error => Unit,
      onNext: T => Unit,
      onSubscribe: ISubscription => Unit
    ): FlowableRequestOperator[T] = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
      __obj.asInstanceOf[FlowableRequestOperator[T]]
    }
  }
}
