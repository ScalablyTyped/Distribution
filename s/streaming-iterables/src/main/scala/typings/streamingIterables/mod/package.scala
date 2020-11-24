package typings.streamingIterables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyIterable[T] = typings.std.Iterable[T] | typings.std.AsyncIterable[T]
  
  type CurriedBatchResult = js.Function1[
    /* curriedIterable */ typings.streamingIterables.mod.AnyIterable[js.Any], 
    typings.streamingIterables.mod.UnwrapAnyIterableArray[typings.streamingIterables.mod.AnyIterable[js.Any]]
  ]
  
  type CurriedBufferResult = js.Function1[
    /* curriedIterable */ typings.streamingIterables.mod.AnyIterable[js.Any], 
    typings.streamingIterables.mod.UnwrapAnyIterable[typings.streamingIterables.mod.AnyIterable[js.Any]]
  ]
  
  type CurriedTakeResult = js.Function1[
    /* curriedIterable */ typings.streamingIterables.mod.AnyIterable[js.Any], 
    typings.streamingIterables.mod.UnwrapAnyIterable[typings.streamingIterables.mod.AnyIterable[js.Any]]
  ]
  
  type CurriedTimeResult = js.Function1[
    /* curriedIterable */ typings.streamingIterables.mod.AnyIterable[js.Any], 
    typings.streamingIterables.mod.UnwrapAnyIterable[typings.streamingIterables.mod.AnyIterable[js.Any]]
  ]
  
  type FlatMapValue[B] = js.UndefOr[
    B | typings.streamingIterables.mod.AnyIterable[B] | scala.Null | (js.Promise[js.UndefOr[B | typings.streamingIterables.mod.AnyIterable[B] | scala.Null]])
  ]
  
  type Iterableish[T] = typings.std.Iterable[T] | (typings.std.Iterator[T, js.Any, js.UndefOr[scala.Nothing]]) | typings.std.AsyncIterable[T] | (typings.std.AsyncIterator[T, js.Any, js.UndefOr[scala.Nothing]])
  
  type UnArrayAnyIterable[A /* <: js.Array[typings.streamingIterables.mod.AnyIterable[_]] */] = js.Any
  
  type UnwrapAnyIterable[M /* <: typings.streamingIterables.mod.AnyIterable[_] */] = typings.std.AsyncIterable[js.Any] | typings.std.Iterable[js.Any]
  
  type UnwrapAnyIterableArray[M /* <: typings.streamingIterables.mod.AnyIterable[_] */] = (typings.std.AsyncGenerator[js.Array[js.Any], js.Any, js.Any]) | (typings.std.Generator[js.Array[js.Any], js.Any, js.Any])
  
  type UnwrapToPromiseOrAsyncIterable[M /* <: typings.streamingIterables.mod.AnyIterable[_] */] = js.Promise[js.Array[js.Any]] | js.Array[js.Any]
}
