package typings.pulumiQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type AsyncQuerySource[TSource] = typings.std.Iterable[TSource] | typings.pulumiQuery.interfacesMod.AsyncIterable[TSource] | (js.Promise[
    typings.pulumiQuery.interfacesMod.AsyncIterable[TSource] | typings.std.Iterable[TSource]
  ])
  type Evaluator[TSource, TResult] = js.Function1[
    /* source */ typings.pulumiQuery.interfacesMod.AsyncIterableIterator[TSource], 
    js.Promise[TResult]
  ]
  type Operator[TSource, TResult] = js.Function1[
    /* source */ typings.pulumiQuery.interfacesMod.AsyncIterableIterator[TSource], 
    typings.pulumiQuery.interfacesMod.AsyncIterableIterator[TResult]
  ]
  type OrderKey = java.lang.String | scala.Double
}
