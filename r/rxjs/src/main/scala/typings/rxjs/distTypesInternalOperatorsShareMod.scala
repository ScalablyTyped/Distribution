package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.SubjectLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsShareMod {
  
  @JSImport("rxjs/dist/types/internal/operators/share", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def share[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def share[T](options: ShareConfig[T]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")(options.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  trait ShareConfig[T] extends StObject {
    
    /**
      * The factory used to create the subject that will connect the source observable to
      * multicast consumers.
      */
    var connector: js.UndefOr[js.Function0[SubjectLike[T]]] = js.undefined
    
    /**
      * If true, the resulting observable will reset internal state on completion from source and return to a "cold" state. This
      * allows the resulting observable to be "repeated" after it is done.
      * If false, when the source completes, it will push the completion through the connecting subject, and the subject
      * will remain the connecting subject, meaning the resulting observable will not go "cold" again, and subsequent repeats
      * or resubscriptions will resubscribe to that same subject.
      * It is also possible to pass a notifier factory returning an observable instead which grants more fine-grained
      * control over how and when the reset should happen. This allows behaviors like conditional or delayed resets.
      */
    var resetOnComplete: js.UndefOr[Boolean | js.Function0[Observable[Any]]] = js.undefined
    
    /**
      * If true, the resulting observable will reset internal state on error from source and return to a "cold" state. This
      * allows the resulting observable to be "retried" in the event of an error.
      * If false, when an error comes from the source it will push the error into the connecting subject, and the subject
      * will remain the connecting subject, meaning the resulting observable will not go "cold" again, and subsequent retries
      * or resubscriptions will resubscribe to that same subject. In all cases, RxJS subjects will emit the same error again, however
      * {@link ReplaySubject} will also push its buffered values before pushing the error.
      * It is also possible to pass a notifier factory returning an observable instead which grants more fine-grained
      * control over how and when the reset should happen. This allows behaviors like conditional or delayed resets.
      */
    var resetOnError: js.UndefOr[Boolean | (js.Function1[/* error */ Any, Observable[Any]])] = js.undefined
    
    /**
      * If true, when the number of subscribers to the resulting observable reaches zero due to those subscribers unsubscribing, the
      * internal state will be reset and the resulting observable will return to a "cold" state. This means that the next
      * time the resulting observable is subscribed to, a new subject will be created and the source will be subscribed to
      * again.
      * If false, when the number of subscribers to the resulting observable reaches zero due to unsubscription, the subject
      * will remain connected to the source, and new subscriptions to the result will be connected through that same subject.
      * It is also possible to pass a notifier factory returning an observable instead which grants more fine-grained
      * control over how and when the reset should happen. This allows behaviors like conditional or delayed resets.
      */
    var resetOnRefCountZero: js.UndefOr[Boolean | js.Function0[Observable[Any]]] = js.undefined
  }
  object ShareConfig {
    
    inline def apply[T](): ShareConfig[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShareConfig[T]]
    }
    
    extension [Self <: ShareConfig[?], T](x: Self & ShareConfig[T]) {
      
      inline def setConnector(value: () => SubjectLike[T]): Self = StObject.set(x, "connector", js.Any.fromFunction0(value))
      
      inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
      
      inline def setResetOnComplete(value: Boolean | js.Function0[Observable[Any]]): Self = StObject.set(x, "resetOnComplete", value.asInstanceOf[js.Any])
      
      inline def setResetOnCompleteFunction0(value: () => Observable[Any]): Self = StObject.set(x, "resetOnComplete", js.Any.fromFunction0(value))
      
      inline def setResetOnCompleteUndefined: Self = StObject.set(x, "resetOnComplete", js.undefined)
      
      inline def setResetOnError(value: Boolean | (js.Function1[/* error */ Any, Observable[Any]])): Self = StObject.set(x, "resetOnError", value.asInstanceOf[js.Any])
      
      inline def setResetOnErrorFunction1(value: /* error */ Any => Observable[Any]): Self = StObject.set(x, "resetOnError", js.Any.fromFunction1(value))
      
      inline def setResetOnErrorUndefined: Self = StObject.set(x, "resetOnError", js.undefined)
      
      inline def setResetOnRefCountZero(value: Boolean | js.Function0[Observable[Any]]): Self = StObject.set(x, "resetOnRefCountZero", value.asInstanceOf[js.Any])
      
      inline def setResetOnRefCountZeroFunction0(value: () => Observable[Any]): Self = StObject.set(x, "resetOnRefCountZero", js.Any.fromFunction0(value))
      
      inline def setResetOnRefCountZeroUndefined: Self = StObject.set(x, "resetOnRefCountZero", js.undefined)
    }
  }
}
