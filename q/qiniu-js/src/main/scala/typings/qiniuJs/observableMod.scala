package typings.qiniuJs

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableMod {
  
  @JSImport("qiniu-js/esm/utils/observable", "Observable")
  @js.native
  open class Observable[T, E, C] protected ()
    extends StObject
       with ISubscribable[T, E, C] {
    def this(_subscribe: js.Function1[/* subscriber */ Subscriber[T, E, C], TeardownLogic]) = this()
    
    /* private */ var _subscribe: Any = js.native
    
    def subscribe(next: js.Function1[/* value */ T, Unit], error: Null, complete: js.Function1[/* res */ C, Unit]): Subscription = js.native
    def subscribe(next: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function1[/* res */ C, Unit]): Subscription = js.native
    def subscribe(next: Null, error: js.Function1[/* error */ E, Unit]): Subscription = js.native
    def subscribe(next: Null, error: js.Function1[/* error */ E, Unit], complete: js.Function1[/* res */ C, Unit]): Subscription = js.native
    def subscribe(next: Null, error: Null, complete: js.Function1[/* res */ C, Unit]): Subscription = js.native
    def subscribe(next: Null, error: Unit, complete: js.Function1[/* res */ C, Unit]): Subscription = js.native
    def subscribe(next: Unit, error: js.Function1[/* error */ E, Unit], complete: js.Function1[/* res */ C, Unit]): Subscription = js.native
    def subscribe(next: Unit, error: Null, complete: js.Function1[/* res */ C, Unit]): Subscription = js.native
    def subscribe(next: Unit, error: Unit, complete: js.Function1[/* res */ C, Unit]): Subscription = js.native
  }
  
  @JSImport("qiniu-js/esm/utils/observable", "Subscriber")
  @js.native
  open class Subscriber[T, E, C] ()
    extends StObject
       with Subscription
       with IObserver[T, E, C] {
    def this(observerOrNext: js.Function1[/* value */ T, Unit]) = this()
    def this(observerOrNext: PartialObserver[T, E, C]) = this()
    def this(observerOrNext: js.Function1[/* value */ T, Unit], error: js.Function1[/* err */ E, Unit]) = this()
    def this(observerOrNext: Null, error: js.Function1[/* err */ E, Unit]) = this()
    def this(observerOrNext: Unit, error: js.Function1[/* err */ E, Unit]) = this()
    def this(observerOrNext: PartialObserver[T, E, C], error: js.Function1[/* err */ E, Unit]) = this()
    def this(
      observerOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* err */ E, Unit],
      complete: js.Function1[/* res */ C, Unit]
    ) = this()
    def this(
      observerOrNext: js.Function1[/* value */ T, Unit],
      error: Null,
      complete: js.Function1[/* res */ C, Unit]
    ) = this()
    def this(
      observerOrNext: js.Function1[/* value */ T, Unit],
      error: Unit,
      complete: js.Function1[/* res */ C, Unit]
    ) = this()
    def this(
      observerOrNext: Null,
      error: js.Function1[/* err */ E, Unit],
      complete: js.Function1[/* res */ C, Unit]
    ) = this()
    def this(observerOrNext: Null, error: Null, complete: js.Function1[/* res */ C, Unit]) = this()
    def this(observerOrNext: Null, error: Unit, complete: js.Function1[/* res */ C, Unit]) = this()
    def this(
      observerOrNext: Unit,
      error: js.Function1[/* err */ E, Unit],
      complete: js.Function1[/* res */ C, Unit]
    ) = this()
    def this(observerOrNext: Unit, error: Null, complete: js.Function1[/* res */ C, Unit]) = this()
    def this(observerOrNext: Unit, error: Unit, complete: js.Function1[/* res */ C, Unit]) = this()
    def this(
      observerOrNext: PartialObserver[T, E, C],
      error: js.Function1[/* err */ E, Unit],
      complete: js.Function1[/* res */ C, Unit]
    ) = this()
    def this(observerOrNext: PartialObserver[T, E, C], error: Null, complete: js.Function1[/* res */ C, Unit]) = this()
    def this(observerOrNext: PartialObserver[T, E, C], error: Unit, complete: js.Function1[/* res */ C, Unit]) = this()
    
    /** 清理 subscription 持有的资源 */
    /* private */ /* CompleteClass */
    var _unsubscribe: Any = js.native
    
    /** 添加一个 tear down 在该 Subscription 的 unsubscribe() 期间调用 */
    /* CompleteClass */
    override def add(teardown: TeardownLogic): Unit = js.native
    
    /* CompleteClass */
    override val closed: Boolean = js.native
    
    /** 用来接收 Observable 中的 complete 类型通知 */
    /* CompleteClass */
    override def complete(res: C): Unit = js.native
    
    /* protected */ var destination: Partial[IObserver[T, E, C]] = js.native
    
    /** 用来接收 Observable 中的 error 类型通知 */
    /* CompleteClass */
    override def error(err: E): Unit = js.native
    
    /* protected */ var isStopped: Boolean = js.native
    
    /** 用来接收 Observable 中的 next 类型通知 */
    /* CompleteClass */
    override def next(value: T): Unit = js.native
    
    /** 取消 observer 的订阅 */
    /* CompleteClass */
    override def unsubscribe(): Unit = js.native
  }
  
  trait CompletionObserver[T, E, C]
    extends StObject
       with PartialObserver[T, E, C] {
    
    def complete(res: C): Unit
    
    var error: js.UndefOr[js.Function1[/* err */ E, Unit]] = js.undefined
    
    var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  }
  object CompletionObserver {
    
    inline def apply[T, E, C](complete: C => Unit): CompletionObserver[T, E, C] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
      __obj.asInstanceOf[CompletionObserver[T, E, C]]
    }
    
    extension [Self <: CompletionObserver[?, ?, ?], T, E, C](x: Self & (CompletionObserver[T, E, C])) {
      
      inline def setComplete(value: C => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      inline def setError(value: /* err */ E => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: /* value */ T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  trait ErrorObserver[T, E, C]
    extends StObject
       with PartialObserver[T, E, C] {
    
    var complete: js.UndefOr[js.Function1[/* res */ C, Unit]] = js.undefined
    
    def error(err: E): Unit
    
    var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  }
  object ErrorObserver {
    
    inline def apply[T, E, C](error: E => Unit): ErrorObserver[T, E, C] = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
      __obj.asInstanceOf[ErrorObserver[T, E, C]]
    }
    
    extension [Self <: ErrorObserver[?, ?, ?], T, E, C](x: Self & (ErrorObserver[T, E, C])) {
      
      inline def setComplete(value: /* res */ C => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: E => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: /* value */ T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  trait IObserver[T, E, C] extends StObject {
    
    /** 用来接收 Observable 中的 complete 类型通知 */
    def complete(res: C): Unit
    
    /** 用来接收 Observable 中的 error 类型通知 */
    def error(err: E): Unit
    
    /** 用来接收 Observable 中的 next 类型通知 */
    def next(value: T): Unit
  }
  object IObserver {
    
    inline def apply[T, E, C](complete: C => Unit, error: E => Unit, next: T => Unit): IObserver[T, E, C] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[IObserver[T, E, C]]
    }
    
    extension [Self <: IObserver[?, ?, ?], T, E, C](x: Self & (IObserver[T, E, C])) {
      
      inline def setComplete(value: C => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      inline def setError(value: E => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ISubscribable[T, E, C] extends StObject {
    
    def subscribe(): IUnsubscribable = js.native
    def subscribe(observer: js.Function1[/* value */ T, Unit]): IUnsubscribable = js.native
    def subscribe(observer: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ Any, Unit]): IUnsubscribable = js.native
    def subscribe(
      observer: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* error */ Any, Unit],
      complete: js.Function0[Unit]
    ): IUnsubscribable = js.native
    def subscribe(observer: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): IUnsubscribable = js.native
    def subscribe(observer: Unit, error: js.Function1[/* error */ Any, Unit]): IUnsubscribable = js.native
    def subscribe(observer: Unit, error: js.Function1[/* error */ Any, Unit], complete: js.Function0[Unit]): IUnsubscribable = js.native
    def subscribe(observer: Unit, error: Unit, complete: js.Function0[Unit]): IUnsubscribable = js.native
    def subscribe(observer: PartialObserver[T, E, C]): IUnsubscribable = js.native
    def subscribe(observer: PartialObserver[T, E, C], error: js.Function1[/* error */ Any, Unit]): IUnsubscribable = js.native
    def subscribe(
      observer: PartialObserver[T, E, C],
      error: js.Function1[/* error */ Any, Unit],
      complete: js.Function0[Unit]
    ): IUnsubscribable = js.native
    def subscribe(observer: PartialObserver[T, E, C], error: Unit, complete: js.Function0[Unit]): IUnsubscribable = js.native
  }
  
  trait ISubscriptionLike
    extends StObject
       with IUnsubscribable {
    
    val closed: Boolean
  }
  object ISubscriptionLike {
    
    inline def apply(closed: Boolean, unsubscribe: () => Unit): ISubscriptionLike = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[ISubscriptionLike]
    }
    
    extension [Self <: ISubscriptionLike](x: Self) {
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    }
  }
  
  trait IUnsubscribable extends StObject {
    
    /** 取消 observer 的订阅 */
    def unsubscribe(): Unit
  }
  object IUnsubscribable {
    
    inline def apply(unsubscribe: () => Unit): IUnsubscribable = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[IUnsubscribable]
    }
    
    extension [Self <: IUnsubscribable](x: Self) {
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  trait NextObserver[T, E, C]
    extends StObject
       with PartialObserver[T, E, C] {
    
    var complete: js.UndefOr[js.Function1[/* res */ C, Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* err */ E, Unit]] = js.undefined
    
    def next(value: T): Unit
  }
  object NextObserver {
    
    inline def apply[T, E, C](next: T => Unit): NextObserver[T, E, C] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[NextObserver[T, E, C]]
    }
    
    extension [Self <: NextObserver[?, ?, ?], T, E, C](x: Self & (NextObserver[T, E, C])) {
      
      inline def setComplete(value: /* res */ C => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* err */ E => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.qiniuJs.observableMod.NextObserver[T, E, C]
    - typings.qiniuJs.observableMod.ErrorObserver[T, E, C]
    - typings.qiniuJs.observableMod.CompletionObserver[T, E, C]
  */
  trait PartialObserver[T, E, C] extends StObject
  object PartialObserver {
    
    inline def CompletionObserver[T, E, C](complete: C => Unit): typings.qiniuJs.observableMod.CompletionObserver[T, E, C] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
      __obj.asInstanceOf[typings.qiniuJs.observableMod.CompletionObserver[T, E, C]]
    }
    
    inline def ErrorObserver[T, E, C](error: E => Unit): typings.qiniuJs.observableMod.ErrorObserver[T, E, C] = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
      __obj.asInstanceOf[typings.qiniuJs.observableMod.ErrorObserver[T, E, C]]
    }
    
    inline def NextObserver[T, E, C](next: T => Unit): typings.qiniuJs.observableMod.NextObserver[T, E, C] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[typings.qiniuJs.observableMod.NextObserver[T, E, C]]
    }
  }
  
  /** 表示可清理的资源，比如 Observable 的执行 */
  trait Subscription
    extends StObject
       with ISubscriptionLike {
    
    /** 清理 subscription 持有的资源 */
    /* private */ var _unsubscribe: Any
    
    /** 添加一个 tear down 在该 Subscription 的 unsubscribe() 期间调用 */
    def add(teardown: TeardownLogic): Unit
  }
  object Subscription {
    
    inline def apply(_unsubscribe: Any, add: TeardownLogic => Unit, closed: Boolean, unsubscribe: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(_unsubscribe = _unsubscribe.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), closed = closed.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setAdd(value: TeardownLogic => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def set_unsubscribe(value: Any): Self = StObject.set(x, "_unsubscribe", value.asInstanceOf[js.Any])
    }
  }
  
  type TeardownLogic = js.Function0[Unit]
}
