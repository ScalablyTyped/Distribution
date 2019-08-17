package typings.atPulumiQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  import typings.std.Iterable

  type AsyncQuerySource[TSource] = Iterable[TSource] | AsyncIterable[TSource] | (js.Promise[AsyncIterable[TSource] | Iterable[TSource]])
  type Evaluator[TSource, TResult] = js.Function1[/* source */ AsyncIterableIterator[TSource], js.Promise[TResult]]
  type Operator[TSource, TResult] = js.Function1[/* source */ AsyncIterableIterator[TSource], AsyncIterableIterator[TResult]]
  type OrderKey = String | Double
}
