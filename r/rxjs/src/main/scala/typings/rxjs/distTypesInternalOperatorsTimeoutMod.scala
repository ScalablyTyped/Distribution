package typings.rxjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.rxjs.anon.With
import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.rxjsStrings.`with`
import typings.std.Error
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsTimeoutMod {
  
  @JSImport("rxjs/dist/types/internal/operators/timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TimeoutError[T, M]
    extends StObject
       with Error {
    
    /**
      * The information provided to the error by the timeout
      * operation that created the error. Will be `null` if
      * used directly in non-RxJS code with an empty constructor.
      * (Note that using this constructor directly is not recommended,
      * you should create your own errors)
      */
    var info: (TimeoutInfo[T, M]) | Null
  }
  object TimeoutError {
    
    @JSImport("rxjs/dist/types/internal/operators/timeout", "TimeoutError")
    @js.native
    val ^ : TimeoutErrorCtor = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeoutError[?, ?], T, M] (val x: Self & (TimeoutError[T, M])) extends AnyVal {
      
      inline def setInfo(value: TimeoutInfo[T, M]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoNull: Self = StObject.set(x, "info", null)
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/dist/types/internal/operators/timeout", "TimeoutError")
  @js.native
  /**
    * @deprecated Internal implementation detail. Do not construct error instances.
    * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
    */
  open class TimeoutErrorCls[T, M] ()
    extends StObject
       with TimeoutError[T, M] {
    def this(info: TimeoutInfo[T, M]) = this()
    
    /**
      * The information provided to the error by the timeout
      * operation that created the error. Will be `null` if
      * used directly in non-RxJS code with an empty constructor.
      * (Note that using this constructor directly is not recommended,
      * you should create your own errors)
      */
    /* CompleteClass */
    var info: (TimeoutInfo[T, M]) | Null = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def timeout[T](each: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(each.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def timeout[T](each: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(each.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def timeout[T](first: js.Date): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(first.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def timeout[T](first: js.Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(first.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def timeout[T, O /* <: ObservableInput[Any] */, M](config: (TimeoutConfig[T, O, M]) & (With[T, M, O])): OperatorFunction[T, T | ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(config.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ObservedValueOf[O]]]
  
  inline def timeout_with[T, M](config: Omit[TimeoutConfig[T, Any, M], `with`]): OperatorFunction[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(config.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T]]
  
  trait TimeoutConfig[T, O /* <: ObservableInput[Any] */, M] extends StObject {
    
    /**
      * The time allowed between values from the source before timeout is triggered.
      */
    var each: js.UndefOr[Double] = js.undefined
    
    /**
      * The relative time as a `number` in milliseconds, or a specific time as a `Date` object,
      * by which the first value must arrive from the source before timeout is triggered.
      */
    var first: js.UndefOr[Double | js.Date] = js.undefined
    
    /**
      * Optional additional metadata you can provide to code that handles
      * the timeout, will be provided through the {@link TimeoutError}.
      * This can be used to help identify the source of a timeout or pass along
      * other information related to the timeout.
      */
    var meta: js.UndefOr[M] = js.undefined
    
    /**
      * The scheduler to use with time-related operations within this operator. Defaults to {@link asyncScheduler}
      */
    var scheduler: js.UndefOr[SchedulerLike] = js.undefined
    
    /**
      * A factory used to create observable to switch to when timeout occurs. Provides
      * a {@link TimeoutInfo} about the source observable's emissions and what delay or
      * exact time triggered the timeout.
      */
    var `with`: js.UndefOr[js.Function1[/* info */ TimeoutInfo[T, M], O]] = js.undefined
  }
  object TimeoutConfig {
    
    inline def apply[T, O /* <: ObservableInput[Any] */, M](): TimeoutConfig[T, O, M] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeoutConfig[T, O, M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeoutConfig[?, ?, ?], T, O /* <: ObservableInput[Any] */, M] (val x: Self & (TimeoutConfig[T, O, M])) extends AnyVal {
      
      inline def setEach(value: Double): Self = StObject.set(x, "each", value.asInstanceOf[js.Any])
      
      inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      inline def setFirst(value: Double | js.Date): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setMeta(value: M): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setScheduler(value: SchedulerLike): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
      
      inline def setWith(value: /* info */ TimeoutInfo[T, M] => O): Self = StObject.set(x, "with", js.Any.fromFunction1(value))
      
      inline def setWithUndefined: Self = StObject.set(x, "with", js.undefined)
    }
  }
  
  @js.native
  trait TimeoutErrorCtor
    extends StObject
       with /**
    * @deprecated Internal implementation detail. Do not construct error instances.
    * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
    */
  Instantiable0[TimeoutError[js.Object, js.Object]]
       with Instantiable1[/* info */ TimeoutInfo[js.Object, js.Object], TimeoutError[js.Object, js.Object]]
  
  trait TimeoutInfo[T, M] extends StObject {
    
    /** The last message seen */
    val lastValue: T | Null
    
    /** Optional metadata that was provided to the timeout configuration. */
    val meta: M
    
    /** The number of messages seen before the timeout */
    val seen: Double
  }
  object TimeoutInfo {
    
    inline def apply[T, M](meta: M, seen: Double): TimeoutInfo[T, M] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], lastValue = null)
      __obj.asInstanceOf[TimeoutInfo[T, M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeoutInfo[?, ?], T, M] (val x: Self & (TimeoutInfo[T, M])) extends AnyVal {
      
      inline def setLastValue(value: T): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
      
      inline def setLastValueNull: Self = StObject.set(x, "lastValue", null)
      
      inline def setMeta(value: M): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setSeen(value: Double): Self = StObject.set(x, "seen", value.asInstanceOf[js.Any])
    }
  }
}
