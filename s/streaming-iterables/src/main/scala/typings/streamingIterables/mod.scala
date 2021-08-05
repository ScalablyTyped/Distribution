package typings.streamingIterables

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.AsyncIterableIterator
import typings.std.AsyncIterator
import typings.std.Generator
import typings.std.Iterable
import typings.std.Iterator
import typings.streamingIterables.anon.Fn0
import typings.streamingIterables.anon.FnCall
import typings.streamingIterables.anon.FnCallFuncIterable
import typings.streamingIterables.anon.FnCallStartIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("streaming-iterables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def batch(size: Double): CurriedBatchResult = ^.asInstanceOf[js.Dynamic].applyDynamic("batch")(size.asInstanceOf[js.Any]).asInstanceOf[CurriedBatchResult]
  inline def batch[T](size: Double, iterable: AsyncIterable[T]): UnwrapAnyIterableArray[AsyncIterable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("batch")(size.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[UnwrapAnyIterableArray[AsyncIterable[T]]]
  inline def batch[T](size: Double, iterable: Iterable[T]): UnwrapAnyIterableArray[Iterable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("batch")(size.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[UnwrapAnyIterableArray[Iterable[T]]]
  
  inline def buffer(size: Double): CurriedBufferResult = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(size.asInstanceOf[js.Any]).asInstanceOf[CurriedBufferResult]
  inline def buffer[T](size: Double, iterable: AsyncIterable[T]): UnwrapAnyIterable[AsyncIterable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(size.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[UnwrapAnyIterable[AsyncIterable[T]]]
  inline def buffer[T](size: Double, iterable: Iterable[T]): UnwrapAnyIterable[Iterable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(size.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[UnwrapAnyIterable[Iterable[T]]]
  
  inline def collect[T](iterable: AsyncIterable[T]): UnwrapToPromiseOrAsyncIterable[AsyncIterable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")(iterable.asInstanceOf[js.Any]).asInstanceOf[UnwrapToPromiseOrAsyncIterable[AsyncIterable[T]]]
  inline def collect[T](iterable: Iterable[T]): UnwrapToPromiseOrAsyncIterable[Iterable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("collect")(iterable.asInstanceOf[js.Any]).asInstanceOf[UnwrapToPromiseOrAsyncIterable[Iterable[T]]]
  
  inline def concat[I /* <: js.Array[Iterable[js.Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param iterables because its type I is not an array type */ iterables: I
  ): Iterable[UnArrayAnyIterable[I]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(iterables.asInstanceOf[js.Any]).asInstanceOf[Iterable[UnArrayAnyIterable[I]]]
  
  inline def concat_I_ArrayAnyIterableAny_AsyncIterable[I /* <: js.Array[AnyIterable[js.Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param iterables because its type I is not an array type */ iterables: I
  ): AsyncIterable[UnArrayAnyIterable[I]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(iterables.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[UnArrayAnyIterable[I]]]
  
  inline def consume[T](iterable: AsyncIterable[T]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("consume")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def consume[T](iterable: Iterable[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("consume")(iterable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def filter[T](filterFunc: js.Function1[/* data */ T, Boolean | js.Promise[Boolean]]): js.Function1[/* curriedIterable */ AnyIterable[js.Any], AsyncGenerator[js.Any, js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(filterFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* curriedIterable */ AnyIterable[js.Any], AsyncGenerator[js.Any, js.Any, js.Any]]]
  inline def filter[T](filterFunc: js.Function1[/* data */ T, Boolean | js.Promise[Boolean]], iterable: AnyIterable[T]): AsyncGenerator[T, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(filterFunc.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, js.Any, js.Any]]
  
  inline def filter_TS_T[T, S /* <: T */](filterFunc: js.Function1[/* data */ T, /* is S */ Boolean]): js.Function1[/* curriedIterable */ AnyIterable[T], AsyncGenerator[S, js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(filterFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* curriedIterable */ AnyIterable[T], AsyncGenerator[S, js.Any, js.Any]]]
  inline def filter_TS_T[T, S /* <: T */](filterFunc: js.Function1[/* data */ T, /* is S */ Boolean], iterable: AnyIterable[T]): AsyncGenerator[S, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(filterFunc.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[S, js.Any, js.Any]]
  
  inline def flatMap[T, B](func: js.Function1[/* data */ T, FlatMapValue[B]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[B, js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[B, js.Any, js.Any]]]
  inline def flatMap[T, B](func: js.Function1[/* data */ T, FlatMapValue[B]], iterable: AnyIterable[T]): AsyncGenerator[B, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(func.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[B, js.Any, js.Any]]
  
  inline def flatTransform[T, R](concurrency: Double): FnCall[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatTransform")(concurrency.asInstanceOf[js.Any]).asInstanceOf[FnCall[T, R]]
  inline def flatTransform[T, R](concurrency: Double, func: js.Function1[/* data */ T, FlatMapValue[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[R, js.Any, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatTransform")(concurrency.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[R, js.Any, js.Any]]]
  inline def flatTransform[T, R](concurrency: Double, func: js.Function1[/* data */ T, FlatMapValue[R]], iterable: AnyIterable[T]): AsyncGenerator[R, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatTransform")(concurrency.asInstanceOf[js.Any], func.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[R, js.Any, js.Any]]
  
  inline def flatten[B](iterable: AnyIterable[B | AnyIterable[B]]): AsyncIterableIterator[B] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(iterable.asInstanceOf[js.Any]).asInstanceOf[AsyncIterableIterator[B]]
  
  inline def fromStream[T](stream: ReadableStreamish): AsyncIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[T]]
  
  inline def getIterator[T](iterable: AsyncIterable[T]): (AsyncIterator[T, js.Any, Unit]) | (Iterator[T, js.Any, Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(iterable.asInstanceOf[js.Any]).asInstanceOf[(AsyncIterator[T, js.Any, Unit]) | (Iterator[T, js.Any, Unit])]
  inline def getIterator[T](iterable: AsyncIterator[T, js.Any, Unit]): AsyncIterator[T, js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(iterable.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[T, js.Any, Unit]]
  inline def getIterator[T](iterable: Iterable[T]): (AsyncIterator[T, js.Any, Unit]) | (Iterator[T, js.Any, Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(iterable.asInstanceOf[js.Any]).asInstanceOf[(AsyncIterator[T, js.Any, Unit]) | (Iterator[T, js.Any, Unit])]
  inline def getIterator[T](iterable: Iterator[T, js.Any, Unit]): Iterator[T, js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(iterable.asInstanceOf[js.Any]).asInstanceOf[Iterator[T, js.Any, Unit]]
  
  inline def getIterator_T_AsyncIterator[T](iterable: AsyncIterable[T]): AsyncIterator[T, js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(iterable.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[T, js.Any, Unit]]
  
  inline def getIterator_T_Iterator[T](iterable: Iterable[T]): Iterator[T, js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(iterable.asInstanceOf[js.Any]).asInstanceOf[Iterator[T, js.Any, Unit]]
  
  inline def map[T, B](func: js.Function1[/* data */ T, B | js.Promise[B]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[B, js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[B, js.Any, js.Any]]]
  inline def map[T, B](func: js.Function1[/* data */ T, B | js.Promise[B]], iterable: AnyIterable[T]): AsyncGenerator[B, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(func.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[B, js.Any, js.Any]]
  
  inline def merge[I /* <: js.Array[AnyIterable[js.Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param iterables because its type I is not an array type */ iterables: I
  ): AsyncIterable[UnArrayAnyIterable[I]] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(iterables.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[UnArrayAnyIterable[I]]]
  
  inline def parallelFlatMap[T, R](concurrency: Double): FnCallFuncIterable[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("parallelFlatMap")(concurrency.asInstanceOf[js.Any]).asInstanceOf[FnCallFuncIterable[T, R]]
  inline def parallelFlatMap[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[R, js.Any, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelFlatMap")(concurrency.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[R, js.Any, js.Any]]]
  inline def parallelFlatMap[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]], iterable: AnyIterable[T]): AsyncGenerator[R, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelFlatMap")(concurrency.asInstanceOf[js.Any], func.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[R, js.Any, js.Any]]
  
  inline def parallelMap[T, R](concurrency: Double): Fn0[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("parallelMap")(concurrency.asInstanceOf[js.Any]).asInstanceOf[Fn0[T, R]]
  inline def parallelMap[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncIterableIterator[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelMap")(concurrency.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* iterable */ AnyIterable[T], AsyncIterableIterator[R]]]
  inline def parallelMap[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]], iterable: AnyIterable[T]): AsyncIterableIterator[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelMap")(concurrency.asInstanceOf[js.Any], func.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[R]]
  
  inline def parallelMerge[I /* <: js.Array[AnyIterable[js.Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param iterables because its type I is not an array type */ iterables: I
  ): AsyncIterable[UnArrayAnyIterable[I]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parallelMerge")(iterables.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[UnArrayAnyIterable[I]]]
  
  inline def pipeline[T0](firstFn: js.Function0[T0]): T0 = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(firstFn.asInstanceOf[js.Any]).asInstanceOf[T0]
  inline def pipeline[T0, T1](a0: js.Function0[T0], a1: js.Function1[/* a */ T0, T1]): T1 = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any])).asInstanceOf[T1]
  inline def pipeline[T0, T1, T2](a0: js.Function0[T0], a1: js.Function1[/* a */ T0, T1], a2: js.Function1[/* a */ T1, T2]): T2 = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any])).asInstanceOf[T2]
  inline def pipeline[T0, T1, T2, T3](
    a0: js.Function0[T0],
    a1: js.Function1[/* a */ T0, T1],
    a2: js.Function1[/* a */ T1, T2],
    a3: js.Function1[/* a */ T2, T3]
  ): T3 = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any])).asInstanceOf[T3]
  inline def pipeline[T0, T1, T2, T3, T4](
    a0: js.Function0[T0],
    a1: js.Function1[/* a */ T0, T1],
    a2: js.Function1[/* a */ T1, T2],
    a3: js.Function1[/* a */ T2, T3],
    a4: js.Function1[/* a */ T3, T4]
  ): T4 = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any])).asInstanceOf[T4]
  inline def pipeline[T0, T1, T2, T3, T4, T5](
    a0: js.Function0[T0],
    a1: js.Function1[/* a */ T0, T1],
    a2: js.Function1[/* a */ T1, T2],
    a3: js.Function1[/* a */ T2, T3],
    a4: js.Function1[/* a */ T3, T4],
    a5: js.Function1[/* a */ T4, T5]
  ): T5 = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any])).asInstanceOf[T5]
  inline def pipeline[T0, T1, T2, T3, T4, T5, T6](
    a0: js.Function0[T0],
    a1: js.Function1[/* a */ T0, T1],
    a2: js.Function1[/* a */ T1, T2],
    a3: js.Function1[/* a */ T2, T3],
    a4: js.Function1[/* a */ T3, T4],
    a5: js.Function1[/* a */ T4, T5],
    a6: js.Function1[/* a */ T5, T6]
  ): T6 = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any], a6.asInstanceOf[js.Any])).asInstanceOf[T6]
  inline def pipeline[T0, T1, T2, T3, T4, T5, T6, T7](
    a0: js.Function0[T0],
    a1: js.Function1[/* a */ T0, T1],
    a2: js.Function1[/* a */ T1, T2],
    a3: js.Function1[/* a */ T2, T3],
    a4: js.Function1[/* a */ T3, T4],
    a5: js.Function1[/* a */ T4, T5],
    a6: js.Function1[/* a */ T5, T6],
    a7: js.Function1[/* a */ T6, T7]
  ): T7 = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any], a6.asInstanceOf[js.Any], a7.asInstanceOf[js.Any])).asInstanceOf[T7]
  inline def pipeline[T0, T1, T2, T3, T4, T5, T6, T7, T8](
    a0: js.Function0[T0],
    a1: js.Function1[/* a */ T0, T1],
    a2: js.Function1[/* a */ T1, T2],
    a3: js.Function1[/* a */ T2, T3],
    a4: js.Function1[/* a */ T3, T4],
    a5: js.Function1[/* a */ T4, T5],
    a6: js.Function1[/* a */ T5, T6],
    a7: js.Function1[/* a */ T6, T7],
    a8: js.Function1[/* a */ T7, T8]
  ): T8 = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any], a6.asInstanceOf[js.Any], a7.asInstanceOf[js.Any], a8.asInstanceOf[js.Any])).asInstanceOf[T8]
  inline def pipeline[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    a0: js.Function0[T0],
    a1: js.Function1[/* a */ T0, T1],
    a2: js.Function1[/* a */ T1, T2],
    a3: js.Function1[/* a */ T2, T3],
    a4: js.Function1[/* a */ T3, T4],
    a5: js.Function1[/* a */ T4, T5],
    a6: js.Function1[/* a */ T5, T6],
    a7: js.Function1[/* a */ T6, T7],
    a8: js.Function1[/* a */ T7, T8],
    a9: js.Function1[/* a */ T8, T9]
  ): T9 = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], a3.asInstanceOf[js.Any], a4.asInstanceOf[js.Any], a5.asInstanceOf[js.Any], a6.asInstanceOf[js.Any], a7.asInstanceOf[js.Any], a8.asInstanceOf[js.Any], a9.asInstanceOf[js.Any])).asInstanceOf[T9]
  
  inline def reduce[T, B](func: js.Function2[/* acc */ B, /* value */ T, B]): FnCallStartIterable[B, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(func.asInstanceOf[js.Any]).asInstanceOf[FnCallStartIterable[B, T]]
  inline def reduce[T, B](func: js.Function2[/* acc */ B, /* value */ T, B], start: B): js.Function1[/* iterable */ AnyIterable[T], js.Promise[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(func.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* iterable */ AnyIterable[T], js.Promise[B]]]
  inline def reduce[T, B](func: js.Function2[/* acc */ B, /* value */ T, B], start: B, iterable: AnyIterable[T]): js.Promise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(func.asInstanceOf[js.Any], start.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[js.Promise[B]]
  
  inline def take(count: Double): CurriedTakeResult = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(count.asInstanceOf[js.Any]).asInstanceOf[CurriedTakeResult]
  inline def take[T](count: Double, iterable: AsyncIterable[T]): UnwrapAnyIterable[AsyncIterable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(count.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[UnwrapAnyIterable[AsyncIterable[T]]]
  inline def take[T](count: Double, iterable: Iterable[T]): UnwrapAnyIterable[Iterable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(count.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[UnwrapAnyIterable[Iterable[T]]]
  
  inline def tap[T](func: js.Function1[/* data */ T, js.Any]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[T, js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[T, js.Any, js.Any]]]
  inline def tap[T](func: js.Function1[/* data */ T, js.Any], iterable: AnyIterable[T]): AsyncGenerator[T, js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(func.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, js.Any, js.Any]]
  
  inline def time(): CurriedTimeResult = ^.asInstanceOf[js.Dynamic].applyDynamic("time")().asInstanceOf[CurriedTimeResult]
  inline def time(config: TimeConfig): CurriedTimeResult = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(config.asInstanceOf[js.Any]).asInstanceOf[CurriedTimeResult]
  inline def time[T](config: TimeConfig, iterable: AsyncIterable[T]): UnwrapAnyIterable[AsyncIterable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("time")(config.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[UnwrapAnyIterable[AsyncIterable[T]]]
  inline def time[T](config: TimeConfig, iterable: Iterable[T]): UnwrapAnyIterable[Iterable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("time")(config.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[UnwrapAnyIterable[Iterable[T]]]
  
  inline def transform[T, R](concurrency: Double): Fn0[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(concurrency.asInstanceOf[js.Any]).asInstanceOf[Fn0[T, R]]
  inline def transform[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncIterableIterator[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(concurrency.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* iterable */ AnyIterable[T], AsyncIterableIterator[R]]]
  inline def transform[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]], iterable: AnyIterable[T]): AsyncIterableIterator[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(concurrency.asInstanceOf[js.Any], func.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[R]]
  
  inline def writeToStream(stream: WritableStreamish): js.Function1[/* iterable */ AnyIterable[js.Any], js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* iterable */ AnyIterable[js.Any], js.Promise[Unit]]]
  inline def writeToStream(stream: WritableStreamish, iterable: AnyIterable[js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(stream.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  type AnyIterable[T] = Iterable[T] | AsyncIterable[T]
  
  type CurriedBatchResult = js.Function1[
    /* curriedIterable */ AnyIterable[js.Any], 
    UnwrapAnyIterableArray[AnyIterable[js.Any]]
  ]
  
  type CurriedBufferResult = js.Function1[/* curriedIterable */ AnyIterable[js.Any], UnwrapAnyIterable[AnyIterable[js.Any]]]
  
  type CurriedTakeResult = js.Function1[/* curriedIterable */ AnyIterable[js.Any], UnwrapAnyIterable[AnyIterable[js.Any]]]
  
  type CurriedTimeResult = js.Function1[/* curriedIterable */ AnyIterable[js.Any], UnwrapAnyIterable[AnyIterable[js.Any]]]
  
  type FlatMapValue[B] = js.UndefOr[B | AnyIterable[B] | Null | (js.Promise[js.UndefOr[B | AnyIterable[B] | Null]])]
  
  type Iterableish[T] = Iterable[T] | (Iterator[T, js.Any, Unit]) | AsyncIterable[T] | (AsyncIterator[T, js.Any, Unit])
  
  trait ReadableStreamish extends StObject {
    
    var once: js.Any
    
    var read: js.Any
  }
  object ReadableStreamish {
    
    inline def apply(once: js.Any, read: js.Any): ReadableStreamish = {
      val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadableStreamish]
    }
    
    extension [Self <: ReadableStreamish](x: Self) {
      
      inline def setOnce(value: js.Any): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setRead(value: js.Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeConfig extends StObject {
    
    var progress: js.UndefOr[
        js.Function2[/* delta */ js.Tuple2[Double, Double], /* total */ js.Tuple2[Double, Double], js.Any]
      ] = js.undefined
    
    var total: js.UndefOr[js.Function1[/* time */ js.Tuple2[Double, Double], js.Any]] = js.undefined
  }
  object TimeConfig {
    
    inline def apply(): TimeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeConfig]
    }
    
    extension [Self <: TimeConfig](x: Self) {
      
      inline def setProgress(value: (/* delta */ js.Tuple2[Double, Double], /* total */ js.Tuple2[Double, Double]) => js.Any): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setTotal(value: /* time */ js.Tuple2[Double, Double] => js.Any): Self = StObject.set(x, "total", js.Any.fromFunction1(value))
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  type UnArrayAnyIterable[A /* <: js.Array[AnyIterable[js.Any]] */] = js.Any
  
  type UnwrapAnyIterable[M /* <: AnyIterable[js.Any] */] = AsyncIterable[js.Any] | Iterable[js.Any]
  
  type UnwrapAnyIterableArray[M /* <: AnyIterable[js.Any] */] = (AsyncGenerator[js.Array[js.Any], js.Any, js.Any]) | (Generator[js.Array[js.Any], js.Any, js.Any])
  
  type UnwrapToPromiseOrAsyncIterable[M /* <: AnyIterable[js.Any] */] = js.Promise[js.Array[js.Any]] | js.Array[js.Any]
  
  trait WritableStreamish extends StObject {
    
    var once: js.Any
    
    var removeListener: js.Any
    
    var write: js.Any
  }
  object WritableStreamish {
    
    inline def apply(once: js.Any, removeListener: js.Any, write: js.Any): WritableStreamish = {
      val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any], removeListener = removeListener.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[WritableStreamish]
    }
    
    extension [Self <: WritableStreamish](x: Self) {
      
      inline def setOnce(value: js.Any): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setRemoveListener(value: js.Any): Self = StObject.set(x, "removeListener", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: js.Any): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    }
  }
}
