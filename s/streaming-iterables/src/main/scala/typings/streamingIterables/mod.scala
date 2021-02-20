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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("streaming-iterables", "batch")
  @js.native
  def batch(size: Double): CurriedBatchResult = js.native
  @JSImport("streaming-iterables", "batch")
  @js.native
  def batch[T](size: Double, iterable: AsyncIterable[T]): UnwrapAnyIterableArray[AsyncIterable[T]] = js.native
  @JSImport("streaming-iterables", "batch")
  @js.native
  def batch[T](size: Double, iterable: Iterable[T]): UnwrapAnyIterableArray[Iterable[T]] = js.native
  
  @JSImport("streaming-iterables", "buffer")
  @js.native
  def buffer(size: Double): CurriedBufferResult = js.native
  @JSImport("streaming-iterables", "buffer")
  @js.native
  def buffer[T](size: Double, iterable: AsyncIterable[T]): UnwrapAnyIterable[AsyncIterable[T]] = js.native
  @JSImport("streaming-iterables", "buffer")
  @js.native
  def buffer[T](size: Double, iterable: Iterable[T]): UnwrapAnyIterable[Iterable[T]] = js.native
  
  @JSImport("streaming-iterables", "collect")
  @js.native
  def collect[T](iterable: AsyncIterable[T]): UnwrapToPromiseOrAsyncIterable[AsyncIterable[T]] = js.native
  @JSImport("streaming-iterables", "collect")
  @js.native
  def collect[T](iterable: Iterable[T]): UnwrapToPromiseOrAsyncIterable[Iterable[T]] = js.native
  
  @JSImport("streaming-iterables", "concat")
  @js.native
  def concat[I /* <: js.Array[Iterable[_]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param iterables because its type I is not an array type */ iterables: I
  ): Iterable[UnArrayAnyIterable[I]] = js.native
  @JSImport("streaming-iterables", "concat")
  @js.native
  def concat_I_ArrayAnyIterableWildcard_AsyncIterable[I /* <: js.Array[AnyIterable[_]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param iterables because its type I is not an array type */ iterables: I
  ): AsyncIterable[UnArrayAnyIterable[I]] = js.native
  
  @JSImport("streaming-iterables", "consume")
  @js.native
  def consume[T](iterable: AsyncIterable[T]): js.Promise[Unit] = js.native
  @JSImport("streaming-iterables", "consume")
  @js.native
  def consume[T](iterable: Iterable[T]): Unit = js.native
  
  @JSImport("streaming-iterables", "filter")
  @js.native
  def filter[T](filterFunc: js.Function1[/* data */ T, Boolean | js.Promise[Boolean]]): js.Function1[/* curriedIterable */ AnyIterable[_], AsyncGenerator[_, _, _]] = js.native
  @JSImport("streaming-iterables", "filter")
  @js.native
  def filter[T](filterFunc: js.Function1[/* data */ T, Boolean | js.Promise[Boolean]], iterable: AnyIterable[T]): AsyncGenerator[T, _, _] = js.native
  @JSImport("streaming-iterables", "filter")
  @js.native
  def filter_TS_T[T, S /* <: T */](filterFunc: js.Function1[/* data */ T, /* is S */ Boolean]): js.Function1[/* curriedIterable */ AnyIterable[T], AsyncGenerator[S, _, _]] = js.native
  @JSImport("streaming-iterables", "filter")
  @js.native
  def filter_TS_T[T, S /* <: T */](filterFunc: js.Function1[/* data */ T, /* is S */ Boolean], iterable: AnyIterable[T]): AsyncGenerator[S, _, _] = js.native
  
  @JSImport("streaming-iterables", "flatMap")
  @js.native
  def flatMap[T, B](func: js.Function1[/* data */ T, FlatMapValue[B]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[B, _, _]] = js.native
  @JSImport("streaming-iterables", "flatMap")
  @js.native
  def flatMap[T, B](func: js.Function1[/* data */ T, FlatMapValue[B]], iterable: AnyIterable[T]): AsyncGenerator[B, _, _] = js.native
  
  @JSImport("streaming-iterables", "flatTransform")
  @js.native
  def flatTransform[T, R](concurrency: Double): FnCall[T, R] = js.native
  @JSImport("streaming-iterables", "flatTransform")
  @js.native
  def flatTransform[T, R](concurrency: Double, func: js.Function1[/* data */ T, FlatMapValue[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[R, _, _]] = js.native
  @JSImport("streaming-iterables", "flatTransform")
  @js.native
  def flatTransform[T, R](concurrency: Double, func: js.Function1[/* data */ T, FlatMapValue[R]], iterable: AnyIterable[T]): AsyncGenerator[R, _, _] = js.native
  
  @JSImport("streaming-iterables", "flatten")
  @js.native
  def flatten[B](iterable: AnyIterable[B | AnyIterable[B]]): AsyncIterableIterator[B] = js.native
  
  @JSImport("streaming-iterables", "fromStream")
  @js.native
  def fromStream[T](stream: ReadableStreamish): AsyncIterable[T] = js.native
  
  @JSImport("streaming-iterables", "getIterator")
  @js.native
  def getIterator[T](iterable: AsyncIterable[T]): (AsyncIterator[T, _, js.UndefOr[scala.Nothing]]) | (Iterator[T, _, js.UndefOr[scala.Nothing]]) = js.native
  @JSImport("streaming-iterables", "getIterator")
  @js.native
  def getIterator[T](iterable: AsyncIterator[T, _, js.UndefOr[scala.Nothing]]): AsyncIterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("streaming-iterables", "getIterator")
  @js.native
  def getIterator[T](iterable: Iterable[T]): (AsyncIterator[T, _, js.UndefOr[scala.Nothing]]) | (Iterator[T, _, js.UndefOr[scala.Nothing]]) = js.native
  @JSImport("streaming-iterables", "getIterator")
  @js.native
  def getIterator[T](iterable: Iterator[T, _, js.UndefOr[scala.Nothing]]): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("streaming-iterables", "getIterator")
  @js.native
  def getIterator_T_AsyncIterator[T](iterable: AsyncIterable[T]): AsyncIterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("streaming-iterables", "getIterator")
  @js.native
  def getIterator_T_Iterator[T](iterable: Iterable[T]): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  
  @JSImport("streaming-iterables", "map")
  @js.native
  def map[T, B](func: js.Function1[/* data */ T, B | js.Promise[B]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[B, _, _]] = js.native
  @JSImport("streaming-iterables", "map")
  @js.native
  def map[T, B](func: js.Function1[/* data */ T, B | js.Promise[B]], iterable: AnyIterable[T]): AsyncGenerator[B, _, _] = js.native
  
  @JSImport("streaming-iterables", "merge")
  @js.native
  def merge[I /* <: js.Array[AnyIterable[_]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param iterables because its type I is not an array type */ iterables: I
  ): AsyncIterable[UnArrayAnyIterable[I]] = js.native
  
  @JSImport("streaming-iterables", "parallelFlatMap")
  @js.native
  def parallelFlatMap[T, R](concurrency: Double): FnCallFuncIterable[T, R] = js.native
  @JSImport("streaming-iterables", "parallelFlatMap")
  @js.native
  def parallelFlatMap[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[R, _, _]] = js.native
  @JSImport("streaming-iterables", "parallelFlatMap")
  @js.native
  def parallelFlatMap[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]], iterable: AnyIterable[T]): AsyncGenerator[R, _, _] = js.native
  
  @JSImport("streaming-iterables", "parallelMap")
  @js.native
  def parallelMap[T, R](concurrency: Double): Fn0[T, R] = js.native
  @JSImport("streaming-iterables", "parallelMap")
  @js.native
  def parallelMap[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncIterableIterator[R]] = js.native
  @JSImport("streaming-iterables", "parallelMap")
  @js.native
  def parallelMap[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]], iterable: AnyIterable[T]): AsyncIterableIterator[R] = js.native
  
  @JSImport("streaming-iterables", "parallelMerge")
  @js.native
  def parallelMerge[I /* <: js.Array[AnyIterable[_]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param iterables because its type I is not an array type */ iterables: I
  ): AsyncIterable[UnArrayAnyIterable[I]] = js.native
  
  @JSImport("streaming-iterables", "pipeline")
  @js.native
  def pipeline[T0](firstFn: js.Function0[T0]): T0 = js.native
  @JSImport("streaming-iterables", "pipeline")
  @js.native
  def pipeline[T0, T1](a0: js.Function0[T0], a1: js.Function1[/* a */ T0, T1]): T1 = js.native
  @JSImport("streaming-iterables", "pipeline")
  @js.native
  def pipeline[T0, T1, T2](a0: js.Function0[T0], a1: js.Function1[/* a */ T0, T1], a2: js.Function1[/* a */ T1, T2]): T2 = js.native
  @JSImport("streaming-iterables", "pipeline")
  @js.native
  def pipeline[T0, T1, T2, T3](
    a0: js.Function0[T0],
    a1: js.Function1[/* a */ T0, T1],
    a2: js.Function1[/* a */ T1, T2],
    a3: js.Function1[/* a */ T2, T3]
  ): T3 = js.native
  @JSImport("streaming-iterables", "pipeline")
  @js.native
  def pipeline[T0, T1, T2, T3, T4](
    a0: js.Function0[T0],
    a1: js.Function1[/* a */ T0, T1],
    a2: js.Function1[/* a */ T1, T2],
    a3: js.Function1[/* a */ T2, T3],
    a4: js.Function1[/* a */ T3, T4]
  ): T4 = js.native
  @JSImport("streaming-iterables", "pipeline")
  @js.native
  def pipeline[T0, T1, T2, T3, T4, T5](
    a0: js.Function0[T0],
    a1: js.Function1[/* a */ T0, T1],
    a2: js.Function1[/* a */ T1, T2],
    a3: js.Function1[/* a */ T2, T3],
    a4: js.Function1[/* a */ T3, T4],
    a5: js.Function1[/* a */ T4, T5]
  ): T5 = js.native
  @JSImport("streaming-iterables", "pipeline")
  @js.native
  def pipeline[T0, T1, T2, T3, T4, T5, T6](
    a0: js.Function0[T0],
    a1: js.Function1[/* a */ T0, T1],
    a2: js.Function1[/* a */ T1, T2],
    a3: js.Function1[/* a */ T2, T3],
    a4: js.Function1[/* a */ T3, T4],
    a5: js.Function1[/* a */ T4, T5],
    a6: js.Function1[/* a */ T5, T6]
  ): T6 = js.native
  @JSImport("streaming-iterables", "pipeline")
  @js.native
  def pipeline[T0, T1, T2, T3, T4, T5, T6, T7](
    a0: js.Function0[T0],
    a1: js.Function1[/* a */ T0, T1],
    a2: js.Function1[/* a */ T1, T2],
    a3: js.Function1[/* a */ T2, T3],
    a4: js.Function1[/* a */ T3, T4],
    a5: js.Function1[/* a */ T4, T5],
    a6: js.Function1[/* a */ T5, T6],
    a7: js.Function1[/* a */ T6, T7]
  ): T7 = js.native
  @JSImport("streaming-iterables", "pipeline")
  @js.native
  def pipeline[T0, T1, T2, T3, T4, T5, T6, T7, T8](
    a0: js.Function0[T0],
    a1: js.Function1[/* a */ T0, T1],
    a2: js.Function1[/* a */ T1, T2],
    a3: js.Function1[/* a */ T2, T3],
    a4: js.Function1[/* a */ T3, T4],
    a5: js.Function1[/* a */ T4, T5],
    a6: js.Function1[/* a */ T5, T6],
    a7: js.Function1[/* a */ T6, T7],
    a8: js.Function1[/* a */ T7, T8]
  ): T8 = js.native
  @JSImport("streaming-iterables", "pipeline")
  @js.native
  def pipeline[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
  ): T9 = js.native
  
  @JSImport("streaming-iterables", "reduce")
  @js.native
  def reduce[T, B](func: js.Function2[/* acc */ B, /* value */ T, B]): FnCallStartIterable[B, T] = js.native
  @JSImport("streaming-iterables", "reduce")
  @js.native
  def reduce[T, B](func: js.Function2[/* acc */ B, /* value */ T, B], start: B): js.Function1[/* iterable */ AnyIterable[T], js.Promise[B]] = js.native
  @JSImport("streaming-iterables", "reduce")
  @js.native
  def reduce[T, B](func: js.Function2[/* acc */ B, /* value */ T, B], start: B, iterable: AnyIterable[T]): js.Promise[B] = js.native
  
  @JSImport("streaming-iterables", "take")
  @js.native
  def take(count: Double): CurriedTakeResult = js.native
  @JSImport("streaming-iterables", "take")
  @js.native
  def take[T](count: Double, iterable: AsyncIterable[T]): UnwrapAnyIterable[AsyncIterable[T]] = js.native
  @JSImport("streaming-iterables", "take")
  @js.native
  def take[T](count: Double, iterable: Iterable[T]): UnwrapAnyIterable[Iterable[T]] = js.native
  
  @JSImport("streaming-iterables", "tap")
  @js.native
  def tap[T](func: js.Function1[/* data */ T, _]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[T, _, _]] = js.native
  @JSImport("streaming-iterables", "tap")
  @js.native
  def tap[T](func: js.Function1[/* data */ T, _], iterable: AnyIterable[T]): AsyncGenerator[T, _, _] = js.native
  
  @JSImport("streaming-iterables", "time")
  @js.native
  def time(): CurriedTimeResult = js.native
  @JSImport("streaming-iterables", "time")
  @js.native
  def time(config: TimeConfig): CurriedTimeResult = js.native
  @JSImport("streaming-iterables", "time")
  @js.native
  def time[T](config: TimeConfig, iterable: AsyncIterable[T]): UnwrapAnyIterable[AsyncIterable[T]] = js.native
  @JSImport("streaming-iterables", "time")
  @js.native
  def time[T](config: TimeConfig, iterable: Iterable[T]): UnwrapAnyIterable[Iterable[T]] = js.native
  
  @JSImport("streaming-iterables", "transform")
  @js.native
  def transform[T, R](concurrency: Double): Fn0[T, R] = js.native
  @JSImport("streaming-iterables", "transform")
  @js.native
  def transform[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncIterableIterator[R]] = js.native
  @JSImport("streaming-iterables", "transform")
  @js.native
  def transform[T, R](concurrency: Double, func: js.Function1[/* data */ T, R | js.Promise[R]], iterable: AnyIterable[T]): AsyncIterableIterator[R] = js.native
  
  @JSImport("streaming-iterables", "writeToStream")
  @js.native
  def writeToStream(stream: WritableStreamish): js.Function1[/* iterable */ AnyIterable[_], js.Promise[Unit]] = js.native
  @JSImport("streaming-iterables", "writeToStream")
  @js.native
  def writeToStream(stream: WritableStreamish, iterable: AnyIterable[_]): js.Promise[Unit] = js.native
  
  type AnyIterable[T] = Iterable[T] | AsyncIterable[T]
  
  type CurriedBatchResult = js.Function1[
    /* curriedIterable */ AnyIterable[js.Any], 
    UnwrapAnyIterableArray[AnyIterable[js.Any]]
  ]
  
  type CurriedBufferResult = js.Function1[/* curriedIterable */ AnyIterable[js.Any], UnwrapAnyIterable[AnyIterable[js.Any]]]
  
  type CurriedTakeResult = js.Function1[/* curriedIterable */ AnyIterable[js.Any], UnwrapAnyIterable[AnyIterable[js.Any]]]
  
  type CurriedTimeResult = js.Function1[/* curriedIterable */ AnyIterable[js.Any], UnwrapAnyIterable[AnyIterable[js.Any]]]
  
  type FlatMapValue[B] = js.UndefOr[B | AnyIterable[B] | Null | (js.Promise[js.UndefOr[B | AnyIterable[B] | Null]])]
  
  type Iterableish[T] = Iterable[T] | (Iterator[T, js.Any, js.UndefOr[scala.Nothing]]) | AsyncIterable[T] | (AsyncIterator[T, js.Any, js.UndefOr[scala.Nothing]])
  
  @js.native
  trait ReadableStreamish extends StObject {
    
    var once: js.Any = js.native
    
    var read: js.Any = js.native
  }
  object ReadableStreamish {
    
    @scala.inline
    def apply(once: js.Any, read: js.Any): ReadableStreamish = {
      val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadableStreamish]
    }
    
    @scala.inline
    implicit class ReadableStreamishMutableBuilder[Self <: ReadableStreamish] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnce(value: js.Any): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: js.Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimeConfig extends StObject {
    
    var progress: js.UndefOr[
        js.Function2[/* delta */ js.Tuple2[Double, Double], /* total */ js.Tuple2[Double, Double], _]
      ] = js.native
    
    var total: js.UndefOr[js.Function1[/* time */ js.Tuple2[Double, Double], _]] = js.native
  }
  object TimeConfig {
    
    @scala.inline
    def apply(): TimeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeConfig]
    }
    
    @scala.inline
    implicit class TimeConfigMutableBuilder[Self <: TimeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProgress(value: (/* delta */ js.Tuple2[Double, Double], /* total */ js.Tuple2[Double, Double]) => _): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setTotal(value: /* time */ js.Tuple2[Double, Double] => _): Self = StObject.set(x, "total", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  type UnArrayAnyIterable[A /* <: js.Array[AnyIterable[_]] */] = js.Any
  
  type UnwrapAnyIterable[M /* <: AnyIterable[_] */] = AsyncIterable[js.Any] | Iterable[js.Any]
  
  type UnwrapAnyIterableArray[M /* <: AnyIterable[_] */] = (AsyncGenerator[js.Array[js.Any], js.Any, js.Any]) | (Generator[js.Array[js.Any], js.Any, js.Any])
  
  type UnwrapToPromiseOrAsyncIterable[M /* <: AnyIterable[_] */] = js.Promise[js.Array[js.Any]] | js.Array[js.Any]
  
  @js.native
  trait WritableStreamish extends StObject {
    
    var once: js.Any = js.native
    
    var removeListener: js.Any = js.native
    
    var write: js.Any = js.native
  }
  object WritableStreamish {
    
    @scala.inline
    def apply(once: js.Any, removeListener: js.Any, write: js.Any): WritableStreamish = {
      val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any], removeListener = removeListener.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[WritableStreamish]
    }
    
    @scala.inline
    implicit class WritableStreamishMutableBuilder[Self <: WritableStreamish] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnce(value: js.Any): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveListener(value: js.Any): Self = StObject.set(x, "removeListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrite(value: js.Any): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    }
  }
}
